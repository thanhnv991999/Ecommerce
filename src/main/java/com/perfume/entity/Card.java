package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Card {
    @Id
    private int card_Number;
    private String bank;
    private double amount;

}
