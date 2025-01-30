package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TeamsDao;
import entity.Teams;

@Service
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

    @Override
    public Teams findById(String id) {
        return teamsDao.findById(id).orElse(null);
    }

}
