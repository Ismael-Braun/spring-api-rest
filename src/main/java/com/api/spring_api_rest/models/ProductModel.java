package com.api.spring_api_rest.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUCT")
public class ProductModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "quantity")
    private BigDecimal quantity;

    public ProductModel() {}

    public ProductModel(long id, String name, BigDecimal value, BigDecimal quantity)
    {
        this.id = id;
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public long getId(){ return this.id; }
    public String getName(){ return this.name; }
    public BigDecimal getValue(){ return this.value; }
    public BigDecimal getQuantity(){ return this.quantity; }
}
