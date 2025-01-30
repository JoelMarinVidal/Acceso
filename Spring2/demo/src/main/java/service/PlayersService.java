package service;

import java.util.List;
import java.util.Optional;

import entity.Players;

public interface PlayersService {
    public List<Players> findAll();
    public Players save(Players player);
    public Optional<Players> findById(Integer id);
}
