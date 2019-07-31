package com.training.springboot.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springboot.entities.Region;

@Repository
public class TrainingDAOImpl implements TrainingDAO {

	@Override
	public List<Region> getAllRegions() {
		
		List<Region> regionList = new ArrayList<Region>();
		
		regionList.add(new Region(1, "North"));
		regionList.add(new Region(2, "East"));
		regionList.add(new Region(3, "West"));
		regionList.add(new Region(4, "South"));
		
		return regionList;
	}

}
