package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import entity.Players;
import entity.Teams;
import service.TeamsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/nba")
public class TeamsRestController {
    @Autowired
    TeamsService teamsService;

    @GetMapping("/teams")
    public List<Teams> getAllTeams() {
        return teamsService.findAll();
    }

    

    /*@DeleteMapping("/teams/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Teams team = 
    }*/
}
