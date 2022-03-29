package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Category;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "categoryProjection", types = Category.class)
public interface CategoryProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.parent}")
    Category getParent();

    @Value("#{target.active}")
    boolean isActive();

}
