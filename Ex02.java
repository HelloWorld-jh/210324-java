package week01.Day2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��������
		int integer=0, number, sum=0;
		double average=0;
		final int  MAX=1000;
		
		//�Է�
		//ó��
	    Scanner sc = new Scanner(System.in);
		while( integer < MAX) {
		      integer= integer +1 ;
		      number = sc.nextInt();
		      sum = sum + number;
             
			}
		average = sum/MAX;
	
 
	//���
    
	System.out.println(average);
	}
}
