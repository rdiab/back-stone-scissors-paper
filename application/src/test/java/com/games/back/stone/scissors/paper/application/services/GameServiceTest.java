package com.games.back.stone.scissors.paper.application.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.games.back.stone.scissors.paper.domain.GameResult;
import com.games.back.stone.scissors.paper.domain.MoveEnum;
import com.games.back.stone.scissors.paper.domain.ResultEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class GameServiceTest {

  @InjectMocks
  GameService gameService;

  @Test
  void testUserWinsWithStone() {
    var userHasWon = false;
    GameResult result = GameResult.builder().build();

    while (!userHasWon) {
      result = gameService.playGame(MoveEnum.STONE);
      if (!result.getResult().equals(ResultEnum.WIN)) {
        return;
      }
      userHasWon = true;
    }

    assertEquals(MoveEnum.STONE, result.getUserMove());
    assertEquals(MoveEnum.SCISSORS, result.getComputerMove());
    assertEquals(ResultEnum.WIN, result.getResult());
  }

  @Test
  void testUserWinsWithPaper() {
    var userHasWon = false;
    GameResult result = GameResult.builder().build();

    while (!userHasWon) {
      result = gameService.playGame(MoveEnum.PAPER);
      if (!result.getResult().equals(ResultEnum.WIN)) {
        return;
      }
      userHasWon = true;
    }

    assertEquals(MoveEnum.PAPER, result.getUserMove());
    assertEquals(MoveEnum.STONE, result.getComputerMove());
    assertEquals(ResultEnum.WIN, result.getResult());
  }

  @Test
  void testUserWinsWithScissors() {
    var userHasWon = false;
    GameResult result = GameResult.builder().build();

    while (!userHasWon) {
      result = gameService.playGame(MoveEnum.SCISSORS);
      if (!result.getResult().equals(ResultEnum.WIN)) {
        return;
      }
      userHasWon = true;
    }

    assertEquals(MoveEnum.SCISSORS, result.getUserMove());
    assertEquals(MoveEnum.PAPER, result.getComputerMove());
    assertEquals(ResultEnum.WIN, result.getResult());
  }

  @Test
  void testUserLoseWithStone() {
    var userHasLose = false;
    GameResult result = GameResult.builder().build();

    while (!userHasLose) {
      result = gameService.playGame(MoveEnum.STONE);
      if (!result.getResult().equals(ResultEnum.LOSE)) {
        return;
      }
      userHasLose = true;
    }

    assertEquals(MoveEnum.STONE, result.getUserMove());
    assertEquals(MoveEnum.PAPER, result.getComputerMove());
    assertEquals(ResultEnum.LOSE, result.getResult());
  }

  @Test
  void testUserLoseWithPaper() {
    var userHasLose = false;
    GameResult result = GameResult.builder().build();

    while (!userHasLose) {
      result = gameService.playGame(MoveEnum.PAPER);
      if (!result.getResult().equals(ResultEnum.LOSE)) {
        return;
      }
      userHasLose = true;
    }

    assertEquals(MoveEnum.PAPER, result.getUserMove());
    assertEquals(MoveEnum.SCISSORS, result.getComputerMove());
    assertEquals(ResultEnum.LOSE, result.getResult());
  }

  @Test
  void testUserLoseWithScissors() {
    var userHasLose = false;
    GameResult result = GameResult.builder().build();

    while (!userHasLose) {
      result = gameService.playGame(MoveEnum.SCISSORS);
      if (!result.getResult().equals(ResultEnum.LOSE)) {
        return;
      }
      userHasLose = true;
    }

    assertEquals(MoveEnum.SCISSORS, result.getUserMove());
    assertEquals(MoveEnum.STONE, result.getComputerMove());
    assertEquals(ResultEnum.LOSE, result.getResult());
  }
}
