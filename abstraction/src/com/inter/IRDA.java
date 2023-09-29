package com.inter;

import com.models.Insurance;

public interface IRDA 
{
	void buyPolicy(Insurance in);
	void claimPolicy(String insuranceType);
}
