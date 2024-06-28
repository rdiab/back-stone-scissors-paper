package com.games.back.stone.scissors.paper.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GameResult {
  private MoveEnum userMove;
  private MoveEnum computerMove;
  private ResultEnum result;
}
