package com.games.back.stone.scissors.paper.driving.controllers.mappers;

import com.games.back.stone.scissors.paper.domain.GameResult;
import com.games.back.stone.scissors.paper.domain.MoveEnum;
import com.games.back.stone.scissors.paper.driving.controllers.models.GameResultDTO;
import com.games.back.stone.scissors.paper.driving.controllers.models.MoveEnumDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameMapper {
  MoveEnum toMoveEnum(MoveEnumDTO moveEnumDTO);

  GameResultDTO toGameResultDTO(GameResult gameResult);
}
