package Java_Basic.com;

public class Area {
	
	 //instance area
	static int a=20;
//static area static stuff access
	//non static area not static access
	public static void main(String[] args) {
		int b=30;
		//static area
		System.out.println();
		Area area= new Area();
		area.add();
	
	}
	
	public void add() {
	 this.a=a;
	 System.out.println(a);
	}

}
