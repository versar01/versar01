package com;
import java.math.BigDecimal;
import java.math.BigInteger;


public class TestBigDecimal{



public TestBigDecimal(){
	BigDecimal big = new BigDecimal(123.002123);

	System.out.println(big.toString());

	BigDecimal crValue1 = new BigDecimal((double) 20.00);
	BigDecimal crValue2 = new BigDecimal((double) 5.25);
	
	crValue2 = (crValue1.divide(crValue2, BigDecimal.ROUND_HALF_UP)).multiply(new BigDecimal((double)100.0));
	
//	BigDecimal crValue3 = new BigDecimal((double) 0.00);
//	BigDecimal crValue4 = new BigDecimal((double) 0.00);
//	BigDecimal crValue5 = new BigDecimal((double) 0.00);
//	
//	crValue5 = new BigDecimal((double)100.0);
//		
//	crValue3 = crValue1.divide(crValue2, BigDecimal.ROUND_HALF_UP);
//
//	crValue4  = crValue3.multiply(crValue5);

	System.out.println("AFTER DIVIDE CR VALUE: " + crValue2);

}

public static void main(String[] args){
	new TestBigDecimal();
}


}