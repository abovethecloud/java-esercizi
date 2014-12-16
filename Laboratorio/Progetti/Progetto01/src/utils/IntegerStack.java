package utils;

public class IntegerStack{

	private int counter;//=0
	private int[] values;//=null

	public IntegerStack(int size){
		this.values=new int[size];
	}

	public boolean push(int value){
		if(counter<values.length){
			values[counter]=value;
			counter++;
			return true;		
		}
		return false;
	}

	public int pop(){
		if(counter>0){
			counter--;				
			return values[counter];	
		}else{
			return 0;
		}
	}
}
