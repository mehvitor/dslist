package com.vitortelles.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitortelles.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
