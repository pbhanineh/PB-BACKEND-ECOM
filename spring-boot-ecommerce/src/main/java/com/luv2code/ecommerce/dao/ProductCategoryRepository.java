package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//create the Json Name ==> productCategory and the path /product-category
@CrossOrigin("http://localhost:4200") // specify the localhost that will do the action on
//our springboot api
@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
