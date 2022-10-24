package com.api_data_dynamic;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CallPojo {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		Random rn= new Random();
		ObjectMapper obj= new ObjectMapper();
		DataPojo pojo=obj.readValue(
		new File("C:\\EclipseWork space\\batch1\\Java_Batch1\\src\\com\\api_data_dynamic\\Payload\\create.json"), DataPojo.class);
	System.out.println(pojo.getName());
	pojo.setName("md islam");
	String pojoObject=obj.writeValueAsString(pojo);
	System.out.println(pojoObject);
	}

}
