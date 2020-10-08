package com.chrisssf.poolcomp.poolcomp.repositories;

import com.chrisssf.poolcomp.poolcomp.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
