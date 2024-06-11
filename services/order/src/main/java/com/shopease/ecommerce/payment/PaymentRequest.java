package com.shopease.ecommerce.payment;

import com.shopease.ecommerce.customer.CustomerResponse;
import com.shopease.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}