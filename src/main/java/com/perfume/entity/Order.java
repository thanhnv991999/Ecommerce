package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order {
    @Id
    private String order_ID;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date orderDate;
    private String address;
    private double total;
    private String description;
    private boolean status;

    @OneToMany(mappedBy = "order")
    private List<Order_Details> order_details;

}
