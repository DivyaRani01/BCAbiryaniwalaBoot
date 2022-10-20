package com.BCAbiryaniWalaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.BCAbiryaniWalaModel.biryani;
import com.BCAbiryaniWalaRepo.BiryaniRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//annotation that provide business functionalities that performs some service
@Service
public class biryaniService {
	@Autowired
	private BiryaniRepo repo;
	
	//adding biryani
	public String addBiryani(biryani b1) {
		
		repo.save(b1);
		return "Biryani added";
		
	}
	
	//adding list of  biryanis
	public String addAllBiryani(List<biryani> blist) {
		repo.saveAll(blist);
		
		return "All biryanis added successfully";
	}
	
	//retriving all biryani
	public List<biryani> getAllBiryani(){
		
		List<biryani> allbiryani=new ArrayList<>();		
		
		repo.findAll().forEach(allbiryani::add);
		return allbiryani;
		
	}
	//retrive biryani by id
	public Optional<biryani> getBiryaniById(int id) {
		return repo.findById(id);
	}
	//retrive biryani by type
	public List<biryani> getBiryaniByType(String btype){
		
		return repo.findByBiryaniType(btype);
		
	}
	//retrive biryani within range
	public List<biryani> getBiryaniByRange(int bprice){
		return repo.findByBiryaniPrice(bprice);
	}
	//to delete biryabi
	public String removeBiryani(int id) {
		this.repo.deleteById(id);
		return "Biryani Deleted.";
	}
	
	
	

}
