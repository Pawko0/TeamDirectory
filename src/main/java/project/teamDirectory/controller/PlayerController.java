package project.teamDirectory.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.teamDirectory.entity.Player;
import project.teamDirectory.service.PlayerService;

import java.util.List;

@Controller
@RequestMapping("/team")
public class PlayerController {
    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/list")
    public String listPlayers(Model model){
        List<Player> players = playerService.findAll();

        model.addAttribute("players", players);

        return "players/list-team";
    }
}
