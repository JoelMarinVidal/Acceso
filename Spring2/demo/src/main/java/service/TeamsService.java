package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Teams;

public interface TeamsService {
    public void delete(Teams team);
    public List<Teams> findAll();
    public Teams findById(String id);
    public Teams save(Teams team);
}
