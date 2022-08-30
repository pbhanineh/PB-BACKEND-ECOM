package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for the mapping with database
    @Column(name ="id")// name if the coloumn in database for every variable crated
    private Long id;

    @ManyToOne //child so many to one
    @JoinColumn(name ="category_id",nullable = false)//refernce teh category_id in the table
    private ProductCategory category;// same name as the mappedBy in ProductCategory.java
    @Column(name ="sku")
    private String sku;

    @Column(name ="name")
    private String name;

    @Column(name ="description")
    private String description;

    @Column(name ="unit_price")
    private BigDecimal unitPrice;

    @Column(name ="image_url")
    private String imageUrl;

    @Column(name ="active")
    private Boolean active;

    @Column(name ="units_in_stock")
    private int unitsInStock;

    @Column(name ="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name ="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;




}
