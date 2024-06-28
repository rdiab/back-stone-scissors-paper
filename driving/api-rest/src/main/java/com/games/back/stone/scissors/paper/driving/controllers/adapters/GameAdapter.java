package com.games.back.stone.scissors.paper.driving.controllers.adapters;

import com.games.back.stone.scissors.paper.application.ports.driving.GameServicePort;
import com.games.back.stone.scissors.paper.driving.controllers.mappers.GameMapper;
import com.games.back.stone.scissors.paper.driving.controllers.models.GameRequestDTO;
import com.games.back.stone.scissors.paper.driving.controllers.models.GameResultDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/game/stone-scissors-paper/")
public class GameAdapter {
  private final GameServicePort gameServicePort;
  private final GameMapper gameMapper;

  @PostMapping("/play")
  public GameResultDTO playGame(@RequestBody GameRequestDTO gameRequest) {
    var userMove = gameMapper.toMoveEnum(gameRequest.getUserMove());
    log.info("Game request done. User move: {}", userMove);
    var gameResult = gameServicePort.playGame(userMove);
    log.info("Game result => {}", gameResult.toString());
    return gameMapper.toGameResultDTO(gameResult);
  }
}
