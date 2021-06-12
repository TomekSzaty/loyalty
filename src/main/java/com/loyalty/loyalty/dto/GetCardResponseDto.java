package com.loyalty.loyalty.dto;

import lombok.Value;

import java.util.List;

@Value
public class GetCardResponseDto {

    List<CardDto> cards;
}
