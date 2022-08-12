public class Test {
	int x,y;  
	Test(int x, int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) { 
		Test t=new Test(2, 5);
		System.out.println(t.x+t.y);
	}  
}
