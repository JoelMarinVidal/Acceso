package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Players;
import service.PlayersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/nba")
public class PlayersRestController {
    
    @Autowired
    private PlayersService playersService;

    @GetMapping("/players")
    public List<Players> getAllPlayers(){
        return playersService.findAll();
    }
}
