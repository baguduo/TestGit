package com.mxl.factory;
import com.mxl.interfaces.*;
import com.mxl.models.*;

public class BeingFactory {
	
	public  Being  getBeing(String str) {
		
		if(str.equals("dog")){
			return new Dog();
		}
		else{
			return new Cat();
		}
	}

}
