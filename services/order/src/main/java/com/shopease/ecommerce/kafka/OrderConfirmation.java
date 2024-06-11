package com.shopease.ecommerce.kafka;

import com.shopease.ecommerce.customer.CustomerResponse;
import com.shopease.ecommerce.order.PaymentMethod;
import com.shopease.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}