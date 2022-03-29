package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.User;
import com.example.warehousedatarest.entity.Warehouse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "userProjection", types = User.class)
public interface UserProjection {

    Integer getId();

    @Value("#{target.firstName}")
    String getFirstName();

    @Value("#{target.lastName}")
    String getLastName();

    @Value("#{target.phoneNumber}")
    String getPhoneNumber();

    @Value("#{target.password}")
    String getPassword();

    @Value("#{target.warehouse}")
    Warehouse getWarehouse();

    @Value("#{target.active}")
    boolean isActive();
}
