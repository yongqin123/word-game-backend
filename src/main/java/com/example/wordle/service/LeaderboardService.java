package com.example.wordle.service;

import com.example.wordle.model.Leaderboard;
import com.example.wordle.repo.LeaderboardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {
    private final LeaderboardRepo leaderboardRepo;

    @Autowired
    public LeaderboardService(LeaderboardRepo leaderboardRepo) {
        this.leaderboardRepo = leaderboardRepo;
    }

    public Leaderboard addLeaderboard(Leaderboard leaderboard) {

        return leaderboardRepo.save(leaderboard);
    }

    public List<Leaderboard> findAllLeaderBoard() {
        return leaderboardRepo.findAll();
    }
}
