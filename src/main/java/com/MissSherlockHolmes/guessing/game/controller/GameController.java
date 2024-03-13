package com.MissSherlockHolmes.guessing.game.controller;

import com.MissSherlockHolmes.guessing.game.model.Game;
import com.MissSherlockHolmes.guessing.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/game")
    public String startGame() {
        Game game = gameService.createNewGame();
        return game.getGameId();
    }

    @GetMapping("/game/{gameId}/guess/{number}")
    public String guess(@PathVariable String gameId, @PathVariable int number) {
        return gameService.guessNumber(gameId, number);
    }

    @PostMapping("/name")
    public String fullName(@RequestBody Map<String, String> request) {
        return "fullName: " + request.get("firstName") + " " + request.get("lastName");
    }
}
