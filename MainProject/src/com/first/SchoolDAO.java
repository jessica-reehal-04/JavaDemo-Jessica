package com.first;

import java.util.Optional;

import com.second.School;

@FunctionalInterface
public interface SchoolDAO 
{
	public void showData(Optional<School> school);

}
