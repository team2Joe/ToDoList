package com.javalec.base;

public class EvenOdd {
	
	
	public EvenOdd(){
		
	}
	
	
	public String evenOdd(int sum) {
		int checkNum = sum % 2;
		String str = "";
		
		if (checkNum == 0) {
			str = "짝수";
		}else {
			str ="홀수";
		}
		return str;
	}
	
	
	

}
