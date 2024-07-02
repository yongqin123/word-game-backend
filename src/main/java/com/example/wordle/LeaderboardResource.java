package com.example.wordle;


import com.example.wordle.model.Leaderboard;
import com.example.wordle.service.LeaderboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
@CrossOrigin(
    origins = {
        "http://localhost:4200","http://localhost:4200/add"
        },
        methods = {
        RequestMethod.OPTIONS,
        RequestMethod.GET,
        RequestMethod.PUT,
        RequestMethod.DELETE,
        RequestMethod.POST
        })
public class LeaderboardResource {
    private final LeaderboardService leaderboardService;

    public LeaderboardResource(LeaderboardService leaderboardService) {
        this.leaderboardService = leaderboardService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Leaderboard>> getAllLeaderboard() {
        List<Leaderboard> leaderboards = leaderboardService.findAllLeaderBoard();
        return new ResponseEntity<>(leaderboards, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Leaderboard> addLeaderboard(@RequestBody Leaderboard leaderboard) {
        leaderboardService.addLeaderboard(leaderboard);
        return  new ResponseEntity<>(leaderboard, HttpStatus.CREATED);
    }
}
