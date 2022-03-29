package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Currency;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "currencyProjection", types = Currency.class)
public interface CurrencyProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.active}")
    boolean isActive();

}
