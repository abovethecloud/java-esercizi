package tests;

import utils.IntegerStack;

public class IntegerStackTest{

	public static void main(String[] args){

		IntegerStack stack = new IntegerStack(3);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		boolean verifica1 = stack.push(6);
		System.out.println("Verifica1: "+verifica1+"==false");
		//System.out.println("Verifica1 "+stack.push(6)+"==false");

		System.out.println("Pop "+stack.pop());
		System.out.println("Pop "+stack.pop());
		System.out.println("Pop "+stack.pop());
		System.out.println("Verifica2: "+stack.pop()+"==0");

	}
}
