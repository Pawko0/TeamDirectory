package project.teamDirectory.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import project.teamDirectory.entity.Player;
import project.teamDirectory.service.PlayerService;

import java.util.List;

@Controller
@RequestMapping("/team")
public class PlayerController {
    private PlayerService playerService;

    @Value("${positions}")
    private List<String> positions;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @InitBinder
    public void init(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @GetMapping("/list")
    public String listPlayers(Model model) {
        List<Player> players = playerService.findAll();

        model.addAttribute("players", players);

        return "team/list-team";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        Player player = new Player();

        model.addAttribute("player", player);
        model.addAttribute("positions", positions);


        return "team/player-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("playerId") int playerId, Model model) {

        Player player = playerService.findById(playerId);

        model.addAttribute("player", player);
        model.addAttribute("positions", positions);

        return "team/player-form";
    }

    @PostMapping("/save")
    public String savePlayer(@Validated @ModelAttribute("player") Player player, BindingResult bindingResult, Model model) {

        model.addAttribute("positions", positions);

        if (bindingResult.hasErrors()) {
            return "team/player-form";
        } else {
            playerService.save(player);

            return "redirect:/team/list";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("playerId") int id) {

        playerService.deleteById(id);

        return "redirect:/team/list";
    }
}
