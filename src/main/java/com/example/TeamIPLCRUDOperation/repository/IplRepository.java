package com.example.TeamIPLCRUDOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TeamIPLCRUDOperation.entity.IplTeam;

@Repository
public interface IplRepository extends JpaRepository<IplTeam, Integer> {

}
