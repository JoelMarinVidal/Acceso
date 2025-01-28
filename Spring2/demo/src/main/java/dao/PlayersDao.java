package dao;

import org.springframework.data.repository.CrudRepository;

import entity.Players;

public interface PlayersDao extends CrudRepository<Players, Integer>{
    
}
