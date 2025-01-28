package service;

import java.util.List;

import entity.Players;

public interface PlayersService {
    public List<Players> findAll();
    public Players save(Players player);
}
