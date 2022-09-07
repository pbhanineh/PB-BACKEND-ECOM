package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

//Entity ==> Product
//PrimaryKey Long
@CrossOrigin("http://localhost:4200") // specify the localhost that will do the action on
                                      //our spring boot api
public interface ProductRepository extends JpaRepository<Product,Long> {
    // findByCategoryId is a query method match by category id using the param "id:
    // ie select from product where category_id = "id"
    //spring Data Rest automatically exposes endpoint:
    //http://localhost:8080/api/products/search/findByCategoryId?id=2
    //Page<Product> findBySku(@Param("sku") String sku, Pageable pageable);
    Page<Product> findByCategoryId(@Param("id")Long id,Pageable pageable);
    //find by name : containing = select * from product p where p.name LIKE CONCAT ('%':name '%')
    Page<Product> findByNameContaining(@Param("name") String name ,Pageable pageable);
}
