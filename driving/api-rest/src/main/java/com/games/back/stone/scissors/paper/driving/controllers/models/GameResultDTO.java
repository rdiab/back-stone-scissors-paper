package com.games.back.stone.scissors.paper.driving.controllers.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GameResultDTO {
  private MoveEnumDTO userMove;
  private MoveEnumDTO computerMove;
  private ResultEnumDTO result;
}
