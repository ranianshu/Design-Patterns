package designpatterns.prototypeAndRegistry;

public class IntelligentStudent extends Student{
	
	private int iq;
	
	public IntelligentStudent() {
		
	}
	
	public IntelligentStudent(IntelligentStudent other) {
		super(other);
		this.iq = other.iq;
	}
	
	@Override
	public Student copy() {
		IntelligentStudent st = new IntelligentStudent(this);
		return st;
	}

}
