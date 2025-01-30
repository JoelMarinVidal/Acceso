package dao;

import org.springframework.data.repository.CrudRepository;

import entity.Teams;

public interface TeamsDao extends CrudRepository<Teams, String>{
    
}
