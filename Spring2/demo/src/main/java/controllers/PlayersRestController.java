package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import entity.Players;
import entity.Stats;
import entity.StatsId;
import service.PlayersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/nba")
public class PlayersRestController {

    @Autowired
    private PlayersService playersService;

    @GetMapping("/players")
    public List<Players> getAllPlayers() {
        return playersService.findAll();
    }

    @PostMapping("/players")
    public Players savePlayer(@RequestBody Players player) {
        return playersService.save(player);
    }

    @GetMapping("/players/{id}")
    public Players getPlayerById(@PathVariable Integer id) {
        return playersService.findById(id);
    }

    @DeleteMapping("/players/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        playersService.deleteById(id);
    }

    @PutMapping("/players/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Players update(@RequestBody Players p, @PathVariable int id) {
        Players currentPlayers = playersService.findById(id);
        currentPlayers.setHeight("1254");
        currentPlayers.setOrigin("Español");
        currentPlayers.setName("Lunes");
        currentPlayers.setPosition("CF");
        currentPlayers.setSalary(11000);
        currentPlayers.setWeight(1454);
        playersService.save(currentPlayers);
        return currentPlayers;
    }

    @GetMapping("/players/{id}/stats")
    public Set<Stats> getPlayerStats(@PathVariable Integer id) {
        Players player = playersService.findById(id);

        if (player != null) {
            return player.getStatses();
        }
        return null;
    }

    @PostMapping("/players/{id}/stats")
    public Stats newPlayerStats(@PathVariable Integer id, @RequestBody Stats newStat) {
        Players player = playersService.findById(id);

        if (player != null) {
            if (player.getStatses() == null) {
                player.setStatses(new HashSet<Stats>());
            }
            newStat.setPlayers(player); 
            player.getStatses().add(newStat); 
            playersService.save(player); 
            return newStat;
        }
        return null;
    }

}
