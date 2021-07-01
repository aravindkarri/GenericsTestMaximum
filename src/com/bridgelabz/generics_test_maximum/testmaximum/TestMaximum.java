package com.bridgelabz.generics_test_maximum.testmaximum;

public class TestMaximum<T extends Comparable<T>>
{

	private T[] myArray;
	public TestMaximum(T[] myArray)
	{
		super();
		this.myArray=myArray;
	}
	public static void main(String[] args) 
	{
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		TestMaximum<Integer>printIntegerArray = new TestMaximum<>(intArray);
		printIntegerArray.sortElements();
		TestMaximum<Double> printDoubleArray = new TestMaximum<>(doubleArray);
		printDoubleArray.sortElements();
		TestMaximum<Character> printCharacterArray = new TestMaximum<>(charArray);
		printCharacterArray.sortElements();
		
	}
	private T[] sortElements() {
		int n = myArray.length;
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(myArray[j].compareTo(myArray[j+1])>0)
				{
					swapElements(j,myArray);
				}
			}
		}
		return myArray;
	}
	private void swapElements(int j, T[] myArray2) {
		T temp = myArray[j];
		myArray[j] = myArray[j+1];
		myArray[j+1] = temp;
		
	}

}
