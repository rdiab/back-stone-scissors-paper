package com.games.back.stone.scissors.paper.application;

import com.games.back.stone.scissors.paper.application.ports.driving.GameServicePort;
import com.games.back.stone.scissors.paper.domain.GameResult;
import com.games.back.stone.scissors.paper.domain.MoveEnum;
import com.games.back.stone.scissors.paper.domain.ResultEnum;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService implements GameServicePort {
  private final Random random = new Random();

  @Override
  public GameResult playGame(MoveEnum userMove) {
    MoveEnum computerMove = getRandomMove();
    ResultEnum result = determineResult(userMove, computerMove);

    GameResult gameResult = new GameResult();
    gameResult.setUserMove(userMove);
    gameResult.setComputerMove(computerMove);
    gameResult.setResult(result);

    return gameResult;
  }

  private MoveEnum getRandomMove() {
    MoveEnum[] moves = MoveEnum.values();
    return moves[random.nextInt(moves.length)];
  }

  private ResultEnum determineResult(MoveEnum userMove, MoveEnum computerMove) {
    if (userMove == computerMove) {
      return ResultEnum.DRAW;
    }

    switch (userMove) {
      case STONE -> {
        return computerMove == MoveEnum.PAPER ? ResultEnum.LOSE : ResultEnum.WIN;
      }
      case PAPER -> {
        return computerMove == MoveEnum.SCISSORS ? ResultEnum.LOSE : ResultEnum.WIN;
      }
      case SCISSORS -> {
        return computerMove == MoveEnum.STONE ? ResultEnum.LOSE : ResultEnum.WIN;
      }
      default -> {
        return ResultEnum.DRAW; // This line will never be reached
      }
    }
  }
}
