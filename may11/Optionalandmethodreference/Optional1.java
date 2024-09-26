package com.may11.Optionalandmethodreference;

import java.util.Optional;

public class Optional1 
{
	public static void main(String[] args)
	{
		Optional<Object> ofNullable = Optional.ofNullable(null);
		Object orElse = ofNullable.orElse("jhhk");
		System.out.println(orElse);
		
		Optional<Object> of = Optional.of("heloo");
	    Object orElse2 = of.orElse("");
		System.out.println(orElse2);

		
	}

}





















