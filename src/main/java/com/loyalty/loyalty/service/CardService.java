package com.loyalty.loyalty.service;

import com.loyalty.loyalty.dto.CardDto;
import com.loyalty.loyalty.dto.GetCardResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardService {

    private List<CardDto> cards = List.of(
            new CardDto(1, "1234567890", 1000),
            new CardDto(1, "85469246", 100),
            new CardDto(2, "564875321", 0)
    );
    public GetCardResponseDto getCards(int customerId) {
        return new GetCardResponseDto(cards.stream()
        .filter(c ->c.getCustomerId() == customerId)
        .collect(Collectors.toList()));
    }
}
