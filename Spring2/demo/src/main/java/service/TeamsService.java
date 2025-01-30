package service;

import java.util.List;

import entity.Teams;

public interface TeamsService {
    public void delete(Teams team);
    public List<Teams> findAll();
}
