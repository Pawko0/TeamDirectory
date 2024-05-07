package project.teamDirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.teamDirectory.dao.PlayerRepository;
import project.teamDirectory.entity.Player;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;


    //constructor injection
    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> findAll() {
        return playerRepository.findAllByOrderByNumberAsc();
    }

    @Override
    public Player findById(int id) {

        Optional<Player> playerOptional = playerRepository.findById(id);

        Player player = null;

        if (playerOptional.isPresent()) {
            player = playerOptional.get();
        } else {
            throw new RuntimeException("Did not find player with this id: " + id);
        }

        return player;
    }

    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deleteById(int id) {
        playerRepository.deleteById(id);
    }
}
