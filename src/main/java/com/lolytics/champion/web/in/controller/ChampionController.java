package com.lolytics.champion.web.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public class ChampionController {

    @GetMapping("/all")
    public List<ChampionResponse> findAll() {
        return List.of(new ChampionResponse(1L, "Ahri", "Mague", "Medium"),
                new ChampionResponse(2L, "Aatrox", "Bruiser", "High"),
                new ChampionResponse(3L, "Alistar", "Support", "Lower"));
    }

}
