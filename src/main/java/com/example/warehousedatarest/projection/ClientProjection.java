package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "clientProjection", types = Client.class)
public interface ClientProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.phoneNumber}")
    String getPhoneNumber();

    @Value("#{target.active}")
    boolean isActive();

}
