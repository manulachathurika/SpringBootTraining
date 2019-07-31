package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.DAO.TrainingDAO;
import com.training.springboot.entities.Region;

@Service
public class TrainingAPIServiceImpl implements TrainingAPIService {

	@Autowired
	private TrainingDAO trainingDAO;

	@Override
	public List<Region> getAllRegions() {
		return trainingDAO.getAllRegions();
	}

}
