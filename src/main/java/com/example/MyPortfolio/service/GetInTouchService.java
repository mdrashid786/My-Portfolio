package com.example.MyPortfolio.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyPortfolio.beans.GetInTouch;
import com.example.MyPortfolio.repository.GetInTouchRepository;

@Service
public class GetInTouchService {
	
	@Autowired
	private GetInTouchRepository getInTouchRepository;

	public List<GetInTouch> getAllGetInTouch() {
		return getInTouchRepository.findAll();
	}

	public void saveGetInTouch(@Valid GetInTouch getInTouch) {
		getInTouchRepository.save(getInTouch);
	}

}
