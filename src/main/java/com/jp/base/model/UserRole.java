package com.jp.base.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Author: Jerzy Plocha on 02/07/16.
 */
@Entity
@Data
@EqualsAndHashCode(exclude = "id")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer userRoleId;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String role;
}
