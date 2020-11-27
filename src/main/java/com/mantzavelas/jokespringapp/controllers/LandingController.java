package com.mantzavelas.jokespringapp.controllers;

import com.mantzavelas.jokespringapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LandingController {

    private final JokeService jokeService;

    public LandingController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getJoke() {
        return jokeService.getRandomJoke();
    }
}
