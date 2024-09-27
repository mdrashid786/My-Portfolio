package com.example.MyPortfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyPortfolio.beans.GetInTouch;

@Repository
public interface GetInTouchRepository extends JpaRepository<GetInTouch, Long>{

}
