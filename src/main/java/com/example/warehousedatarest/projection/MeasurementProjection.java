package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Measurement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "measurementProjection", types = Measurement.class)
public interface MeasurementProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
