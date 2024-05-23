package com.anurag.footinfo.controller;

import com.anurag.footinfo.entity.Player;
import com.anurag.footinfo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("save/player")
    public Player savePlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @GetMapping("get/players")
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("get/player/{playerId}")
    public Player getPlayer(@PathVariable Integer playerId) {
        return playerService.getPlayer(playerId);
    }

    @DeleteMapping("delete/player/{playerId}")
    public void deletePlayer(@PathVariable Integer playerId) {
        playerService.deletePlayer(playerId);
    }

    @PutMapping("update/player")
    public Player updatePlayer(@RequestBody Player player) {     
        return playerService.updatePlayer(player);
    }
}
