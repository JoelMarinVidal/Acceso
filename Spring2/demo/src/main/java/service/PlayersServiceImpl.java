package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PlayersDao;
import entity.Players;

@Service
public class PlayersServiceImpl implements PlayersService{
    @Autowired
    private PlayersDao playersDao;

    @Override
    public List<Players> findAll() {
        return (List<Players>)playersDao.findAll();
    }

    
}
