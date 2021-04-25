import java.util.HashSet;
import java.util.Set;

public class Attendence {
	private Set<String> Attended;
	private Student p;
	private int size=0;
	
	public Attendence(Student...Attended) {
		this.Attended=new HashSet<String>();
	}
	
	public String toString() {
		return String.format("Attended students are %s",this.Attended);
	}
	
	public void Swipe(Student p, int ID) {
		Attended.add(p.getname(ID));
		size++;
	}
	
	public int getsize() {
		return size;
	}
	
	public boolean contains(String str) {
		if(Attended.contains(str)) {
			return true;
		}
		return false;
	}
	
	
}
