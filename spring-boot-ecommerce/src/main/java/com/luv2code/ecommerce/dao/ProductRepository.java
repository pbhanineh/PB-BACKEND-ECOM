package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

//Entity ==> Product
//PrimaryKey Long
@CrossOrigin("http://localhost:4200") // specify the localhost that will do the action on
                                      //our springboot api
public interface ProductRepository extends JpaRepository<Product,Long> {
}
