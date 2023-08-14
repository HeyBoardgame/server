package com.yeoboge.server.repository;

import com.yeoboge.server.domain.entity.MechanismOfBoardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanismOfBoardGameRepository extends JpaRepository<MechanismOfBoardGame, Long> {
}
