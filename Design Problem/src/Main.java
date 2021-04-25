
public class Main {
	public static void main(String[] args){
		Student p1= new Student(1111, "aa");
		Student p2= new Student(2222,"bb");
		Attendence c1= new Attendence();
		
		c1.Swipe(p1,1111);
		c1.Swipe(p2,2222);
		
		//see how many students have attended the class
		System.out.println(c1.getsize());
		
		//see who attended the class
		System.out.println(c1);
	}
}
