package com.anurag.footinfo.service;

import com.anurag.footinfo.entity.Player;
import com.anurag.footinfo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepo;

    public Player savePlayer(Player player) {
        return playerRepo.save(player);
    }

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        playerRepo.findAll().forEach(players::add);
        return players;
    }

    public Player getPlayer(Integer playerId) {
        return playerRepo.findById(playerId).orElseThrow();
    }

    public void deletePlayer(Integer playerId) {
        playerRepo.deleteById(playerId);
    }

    public Player updatePlayer(Player player) {
        playerRepo.findById(player.getPlayerId()).orElseThrow();
        return playerRepo.save(player);
    }
}
