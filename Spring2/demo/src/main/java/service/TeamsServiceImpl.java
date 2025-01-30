package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TeamsDao;
import entity.Teams;

public class TeamsServiceImpl implements TeamsService {
    @Autowired
    private TeamsDao teamsDao;

    @Override
    public void delete(Teams team) {
        teamsDao.delete(team);
    }

    @Override
    public List<Teams> findAll() {
        return (List<Teams>) teamsDao.findAll();
    }

}
