package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter

public class Order_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "perfume_ID")
    private Perfume perfume;

}
