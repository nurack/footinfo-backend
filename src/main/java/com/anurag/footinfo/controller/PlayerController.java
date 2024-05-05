package com.anurag.footinfo.controller;

import com.anurag.footinfo.entity.Player;
import com.anurag.footinfo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("save/player")
    public Player savePlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }
}
