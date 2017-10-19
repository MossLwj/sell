package com.lwj.sell.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品类目表实体
 * Created By lwj
 * 2017/10/18 0018 13:29
 */
@Entity
@Data
@DynamicUpdate
public class ProductCategory {

    /**类目id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名称*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
