package com.tnsif.intro;

public class MyClass {

	public static void main(String[] args){
		int []score = {281, 344, 265, 272, 236, 324, 287};
		
		//write the logic to implement the solution
		int sum =0;
		for(int i=0;i<score.length;i++){
		   sum = sum + score[i];
		   }
		 int avg = sum/score.length;
	   int aa = 0;
	   int ba =0;
	   int ea =0;
	   for(int i=0;i<score.length;i++){
	    if(score[i]>avg ){
	     aa++;
	     }
	    else if(score[i]==avg){
	     ea++;
	     }
	     else{
	     ba++;
	     }
	     }
	     System.out.println("The average score of the team is "+avg+" runs");
	     System.out.println("No. of matches having a score above average is "+aa);
	     System.out.println("No. of matches having a score equal to average is "+ea);
	     System.out.println("No. of matches having score below average is "+ba);

	 
	}
}
