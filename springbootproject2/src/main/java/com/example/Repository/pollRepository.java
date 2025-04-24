package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.pollDTO;
@Repository
public interface pollRepository extends JpaRepository<pollDTO, Long> {

}
