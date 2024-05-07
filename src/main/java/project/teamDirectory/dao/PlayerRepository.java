package project.teamDirectory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.teamDirectory.entity.Player;

import java.util.List;


public interface PlayerRepository extends JpaRepository<Player, Integer> {

    public List<Player> findAllByOrderByNumberAsc();
}
