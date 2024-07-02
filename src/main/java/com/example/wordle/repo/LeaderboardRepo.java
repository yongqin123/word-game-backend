package com.example.wordle.repo;

import com.example.wordle.model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepo extends JpaRepository<Leaderboard, Integer> {

}
