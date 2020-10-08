package com.chrisssf.poolcomp.poolcomp.repositories;

import com.chrisssf.poolcomp.poolcomp.models.Comp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompRepository extends JpaRepository<Comp, Long> {
}
