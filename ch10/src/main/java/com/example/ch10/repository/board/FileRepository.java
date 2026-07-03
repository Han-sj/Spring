package com.example.ch10.repository.board;

import com.example.ch10.entity.board.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Integer> {







}
