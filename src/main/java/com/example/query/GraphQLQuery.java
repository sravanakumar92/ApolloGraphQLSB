package com.example.query;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class GraphQLQuery {
	
	@QueryMapping
	public HelloGraph sayHello() {
		HelloGraph obj= new HelloGraph();
		obj.setFirst("HI Team!!!");
		obj.setSecond("This is pilot project");
		obj.setThird("trying federation of node graph and SpringBoot graph");
		obj.setFourth(200);
		Features feat = new Features("am-2","am-1","am-1 desc","Success");
		obj.setFeature(feat);
		return obj;
	}
	
	@QueryMapping
	public Features features(@Argument String id) {
		Features feat = new Features(id,id,id+" desc","Success");
		return feat;
	}

}
