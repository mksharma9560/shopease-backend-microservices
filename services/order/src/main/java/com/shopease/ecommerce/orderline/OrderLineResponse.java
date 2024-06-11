package com.shopease.ecommerce.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }