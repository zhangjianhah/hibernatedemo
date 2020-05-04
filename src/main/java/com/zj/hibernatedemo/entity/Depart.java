package com.zj.hibernatedemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "zj_depart")
public class Depart extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depart_id")
    private Long did;
    @Column(name = "depart_name")
    private String name;
}
