package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Warehouse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "warehouseProjection", types = Warehouse.class)
public interface WarehouseProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
