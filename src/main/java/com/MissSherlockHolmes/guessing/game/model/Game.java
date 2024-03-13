package com.MissSherlockHolmes.guessing.game.model;

import java.util.UUID;

public class Game {
    private final String gameId;
    private final int targetNumber;
    private int attempts;

    public Game() {
        this.gameId = UUID.randomUUID().toString();
        this.targetNumber = (int) (Math.random() * 100) + 1;
        this.attempts = 0;
    }

    public String getGameId() {
        return gameId;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void incrementAttempts() {
        this.attempts++;
    }
}

