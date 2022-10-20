package com.BCAbiryaniWalaRepo;

import java.util.List;

import com.BCAbiryaniWalaModel.biryani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BiryaniRepo extends JpaRepository<biryani,Integer> {

	List<biryani> findByBiryaniType(String btype);
	@Query(value="select * from biryani where biryani_price< ?1", nativeQuery=true)
	
	List<biryani> findByBiryaniPrice(int bprice);
	
}
