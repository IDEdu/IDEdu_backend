package com.umc.idedu.repository;

import com.umc.idedu.entity.Temp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempRepository extends JpaRepository<Temp, Long> {
}
