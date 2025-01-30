package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PlayersDao;
import entity.Players;

@Service
public class PlayersServiceImpl implements PlayersService {
    @Autowired
    private PlayersDao playersDao;

    @Override
    public List<Players> findAll() {
        return (List<Players>) playersDao.findAll();
    }

    @Override
    public Players save(Players player) {
        return playersDao.save(player);
    }

    @Override
    public Players findById(Integer id) {
        return playersDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        playersDao.deleteById(id);
    }

}
