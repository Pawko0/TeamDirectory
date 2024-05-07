package project.teamDirectory.service;

import project.teamDirectory.entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    Player findById(int id);

    Player save(Player player);

    void deleteById(int id);
}
