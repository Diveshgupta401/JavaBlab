package com.brigelab_daytwo;

public class resverswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 232, reversed = 132;
		    
		    System.out.println("Original Number: " + num);

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
	}
	}
}
