package com.bridgelabz.generics_test_maximum.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		
		Integer number1 = 2;
		Integer number2 = 3;
		Integer number3 = 5;
		
		Float num1 = 2.5f;
		Float num2 = 3.1f;
		Float num3 = 1.19f;
		
		String name1 = "Apple";
		String name2 = "Peach";
		String name3 = "Banana";
		
		Integer maxInt = testMax(number1,number2,number3);
		System.out.println("Maximum integer is : "+maxInt);
		Float maxFloat = testMax(num1,num2,num3);
		System.out.println("Maximum float is : "+maxFloat);
		String maxString = testMax(name1,name2,name3);
		System.out.println("Maximum String is : "+maxString);

	}

	public static <T extends Comparable<T>> T testMax(T x,T y ,T z) {
		
		T maximum= x;
		if(y.compareTo(maximum) > 0 )
		{
			maximum = y;
		}
		if(z.compareTo(maximum) > 0 )
		{
			maximum = z;
		}
		return maximum;
	}
}