package com.zj.hibernatedemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 映射数据库的表，字段名与成员变量名一致时，可以省略不写
 */
@Data
@Entity
@Table(name = "zj_user")
public class User extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long uid;
    @Column(name = "account")
    private String account;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "real_name")
    private String realName;
    @ManyToOne
    @JoinColumn(name = "depart_id")
    private Depart depart;

}
