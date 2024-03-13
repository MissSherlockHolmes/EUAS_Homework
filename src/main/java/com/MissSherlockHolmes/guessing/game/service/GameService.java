package com.MissSherlockHolmes.guessing.game.service;

import com.MissSherlockHolmes.guessing.game.model.Game;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameService {
    private final Map<String, Game> games = new HashMap<>();

    public Game createNewGame() {
        Game game = new Game();
        games.put(game.getGameId(), game);
        return game;
    }

    public String guessNumber(String gameId, int guess) {
        Game game = games.get(gameId);
        game.incrementAttempts();
        if (guess < game.getTargetNumber()) {
            return "Nr is bigger";
        } else if (guess > game.getTargetNumber()) {
            return "Nr is smaller";
        } else {
            return "Correct, it took you " + game.getAttempts() + " times";
        }
    }
}

