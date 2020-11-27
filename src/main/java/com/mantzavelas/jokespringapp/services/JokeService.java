package com.mantzavelas.jokespringapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChuckNorrisQuotes quotes;

    public JokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
