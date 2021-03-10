package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "sexgroups")
public class SexGroup {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "sex")
    private List<Perfume> perfumes;
}
