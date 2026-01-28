package advancedConcepts.projects.tictactoe.controller;

import advancedConcepts.projects.tictactoe.model.*;

import java.util.List;

public class GameController {

    public Game createNewGame(int dimension, List<Player> players) {
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void displayBoard(Game game) {

    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public Game updateGameStatus(Game game, GameStatus status) {
        game.setGameStatus(status);
        return game;
    }

    public Move executeMove(Game game, Player player) {
        return null;
    }

    public Player checkWinner(Game game, Move move) {
        return null;
    }

    public Board undoMove(Game game, Move move) {
        return null;
    }

    public void replayGame(Game game) {

    }




}
