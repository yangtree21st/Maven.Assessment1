package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        return getString(handSign, PAPER, SCISSOR, ROCK);
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        return getString(handSign, SCISSOR, ROCK, PAPER);
    }

    private String getString(String handSign, String scissor, String rock, String paper) {
        String lMove = "";

        if (handSign == ROCK) {
             lMove = scissor;
        } else if (handSign == PAPER) {
            lMove = rock;
        } else if (handSign == SCISSOR) {
            lMove = paper;
        }
        return lMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (getLosingMove(handSignOfPlayer1) == handSignOfPlayer2) {
            winner = handSignOfPlayer1;
        } else {
            winner = handSignOfPlayer2;
        }
        return winner;
    }
    }

