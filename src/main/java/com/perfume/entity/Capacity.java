package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Capacity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int capacity_ID;
    private int ml;

    @ManyToMany
    @JoinTable(name = "Perfume_Capecity",joinColumns = @JoinColumn(name = "capacity_ID"),
            inverseJoinColumns = @JoinColumn(name = "perfume_ID"))
    private List<Perfume> perfumes;
}
