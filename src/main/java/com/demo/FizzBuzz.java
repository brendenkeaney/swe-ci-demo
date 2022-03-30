package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
	if (num % 3 == 0){
		return "fizz";
	}
	    else if (num % 5 == 0){
	    return "buzz";
	    }
	    
	    String s = Integer.toString(num);
	 
      return s;
	}
	
	String processNumbers (int[] numList)
	{
    	String string =""; 
      String s ="";
      for (int i =0; i < numList.length; i++) {
        if(((numList[i] % 5) == 0) && ((numList[i] % 3) == 0)){
          s = "fizzbuzz";

        } else if ((numList[i] % 5) == 0){
           s = "buzz";

         } else if ((numList[i] % 3 ) ==0 ){
           s = "fizz";

         }else {
           s = processNumber(numList[i]);
         }
        string +=s;
      }
    return string;
    
	}

}
