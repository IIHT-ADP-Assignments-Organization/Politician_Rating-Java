package com.politicalRating.common;

public class FieldsCannotBeEmpty extends Exception {

	public static  String message="fields cannot be empty";


	public FieldsCannotBeEmpty()
	{
		
	}
	public FieldsCannotBeEmpty(String message)
	{
		this.message=message;
	}

	
}
