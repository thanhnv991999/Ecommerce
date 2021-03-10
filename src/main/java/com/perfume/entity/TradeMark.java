package com.perfume.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "TradeMarks")
public class TradeMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tradeMark_ID;
    private String tradeMarkName;

    @OneToMany(mappedBy = "tradeMark")
    private List<Perfume> perfumes;
}
