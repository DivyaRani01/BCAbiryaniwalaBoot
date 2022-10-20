package com.BCAbiryaniWalaModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class biryani {
	@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniPrice;
	private String biryaniDesc;
	
}
