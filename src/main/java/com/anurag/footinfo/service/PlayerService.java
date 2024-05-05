package com.anurag.footinfo.service;

import com.anurag.footinfo.entity.Player;
import com.anurag.footinfo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepo;

    public Player savePlayer(Player player) {
        return playerRepo.save(player);
    }
}
