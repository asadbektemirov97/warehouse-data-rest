package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Supplier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "supplierProjection", types = Supplier.class)
public interface SupplierProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.phoneNumber}")
    String getPhoneNumber();

    @Value("#{target.active}")
    boolean isActive();

}
