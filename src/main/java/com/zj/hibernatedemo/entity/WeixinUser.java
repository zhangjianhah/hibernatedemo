package com.zj.hibernatedemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "zj_weixin_user")
public class WeixinUser extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weixin_user_id")
    private Long wxid;
    @Column(name = "open_id")
    private String openId;
    @Column(name = "nick_name")
    private String nickname;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
