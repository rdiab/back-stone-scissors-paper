package com.games.back.stone.scissors.paper.application.ports.driving;

import com.games.back.stone.scissors.paper.domain.GameResult;
import com.games.back.stone.scissors.paper.domain.MoveEnum;

public interface GameServicePort {
  GameResult playGame(MoveEnum userMove);
}
