package Java_Basic.com;

public class InheriChail1 extends InheriParent{
	
	public void food() {
		//super.food();
		System.out.println("child food");
	}

	public void apple() {
		System.out.println("child1 apple method");
	}
	
	public void dounts() {
		System.out.println("chaild donuts method");
	}
	
	public static void main(String[] args) {
		InheriChail1 ch= new InheriChail1();
		
		ch.food();
		InheriParent ch1= new InheriChail1();
		ch1.color();
		ch1.food();
	
	}
}
