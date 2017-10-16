package com.lwj.sell.dao;

import com.lwj.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
