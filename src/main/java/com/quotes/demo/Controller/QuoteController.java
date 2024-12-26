package com.quotes.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.quotes.demo.QuoteService;
import com.quotes.demo.Model.Quote;

@RestController
@CrossOrigin(origins = "${app.cors.allowed-origins}", 
             methods = {RequestMethod.GET},
             maxAge = 3600)
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/api/quotes/random")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }
}
