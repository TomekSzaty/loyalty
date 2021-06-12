package com.loyalty.loyalty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {
    private int customerId;
    private String  cardNumber;
    private int points;
}
