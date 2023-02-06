package com.example.query;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Features {
	String id;
	String name;
	String description;
	String status;
	
	
	public Features(String id,String name,String description,String status){
		this.id=id;
		this.name=name;
		this.description=description;
		this.status=status;
	}
	public Features(String id){
		this.id=id;
		this.name=id;
		this.description=id+"description: Hi WayFair Team! We are getting data from subgraph!!!--"+id;
		this.status=id+"status:Success";
	}
}
