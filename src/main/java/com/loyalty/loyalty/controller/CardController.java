package com.loyalty.loyalty.controller;

import com.loyalty.loyalty.dto.GetCardResponseDto;
import com.loyalty.loyalty.service.CardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/cards")
@RefreshScope
public class CardController {

    private final CardService cardService;

//    @Value("${application.allow-get-cards}")
//    private boolean isGetCardsAllowed;



    @GetMapping
    public GetCardResponseDto getCards(@RequestParam int customerId) {
        /*if (!isGetCardsAllowed) {
            log.info("Get carts called, but service window is active");
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Service window");
        }*/
        return cardService.getCards(customerId);
    }
}
