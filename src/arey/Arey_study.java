package arey;

import java.util.Arrays;

public class Arey_study {

	public static void main(String[] args) 
	{
		
		
		
		//declaration
		String institute[] =new String[5];
		
		//initialization
		 institute[0]="velocity ";
		 institute[1]="corprate ";
		 institute[2]="Training ";
		 institute[3]="institute ";
		 
		 //usage
		 System.out.println(institute[0]);
		 System.out.println(institute[1]);
		 System.out.println(institute[2]);
		 System.out.println(institute[3]);
		 System.out.println("==============");
		 
		 
		 
		 for(int i=0;i<=3;i++)
		 {
			 System.out.println(institute[i]);
			 
		 }
		 
		 //declearation
		 char grade[]=new char[6];
		 
		 //intilization
		 grade[0]='A';
		 grade[1]='C';
		 grade[2]='B';
		 grade[3]='D';
		 grade[4]='E';
		 grade[5]='F';
		 
		 //usage
		 
	 for(int i=0;i<=5;i++)
	 {
		 System.out.println(grade[i]);
		 }
		 
		 System.out.println("=============");
		 //now after use of this for loop with length method
		 //we do not have any problem of size change of array
		 //if we change the size,their is no exception array out of bond error
		 
		 
		 for(int i=0;i<=grade.length-1;i++)
		 {
			 System.out.println(grade[i]); 
		 }
		 
		 System.out.println("==========");
		 
		 Arrays.sort(grade);
		 
		 for(int i=0;i<=grade.length-1;i++)
		 {
			 System.out.println(grade[i]);
		 }
		 
		 System.out.println("===========");
		 
		 for (int i=grade.length-1;i>=0;i--)
		 {
			 System.out.println(grade[i]);
		 }
		
	}

}
 