package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "Perfumes")
public class Perfume {
    @Id
    private String perfume_ID;
    private String incense_Group;
    private String incense_Retention;
    private String origin;
    private String style;
    private String description;
    private double discount;
    private int viewCount;
    private double price;
    private String image;
    private int quantity;


    @OneToMany(mappedBy = "perfume")
    private List<Order_Details> order_details;

    @ManyToOne
    @JoinColumn(name = "tradeMark_ID")
    private TradeMark tradeMark;


    @ManyToOne
    @JoinColumn(name = "sex_ID")
    private SexGroup sex;

    @ManyToMany(mappedBy = "perfumes")
    private List<Capacity> capacities;

}
