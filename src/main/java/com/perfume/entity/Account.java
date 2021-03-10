package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_ID;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String activated;

    @ManyToMany(mappedBy = "accounts")
    private List<Role> roles;

}
