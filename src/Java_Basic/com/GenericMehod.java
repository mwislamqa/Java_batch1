package Java_Basic.com;

public class GenericMehod{
	
	//create generic method in java T = Object
	//we can declear class level GenericMehod<T> also
	// we we can send any type data.
	public <T> T food(T name){
		return name;
	}
	//
	public <E> E varity(E name){
		return name;
	}

	public static void main(String[] args) {
		GenericMehod gm= new GenericMehod();
		int fruitCount= gm.food(10);
		String foodName=gm.food("apple");
		Double foodF=gm.food(10.5);
		boolean b=gm.food(true);
		int variteam=gm.varity(19);
		
		
		

	}

}
