package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
public class Sex {
    @Id
    private int id;
    private String group;

    @OneToMany(mappedBy = "sex")
    private List<Perfume> perfumes;
}
