package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Role {
    @Id
    private int role_ID;
    private String role_Name;

    @ManyToMany
    @JoinTable(name = "Role_Account",joinColumns = @JoinColumn(name = "role_ID"),
            inverseJoinColumns = @JoinColumn(name = "account_ID"))
    private List<Account> accounts;

}
