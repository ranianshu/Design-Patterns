package designpatterns.prototypeAndRegistry;

public class Student implements Prototype<Student>{
	
	private String name;
	private int age;
	private String batchName;
	private double psp;
	private double batchPsp;
	
	public Student() {
		
	}
	
	public Student(Student other) {
		this.name = other.name;
		this.age = other.age;
		this.batchName = other.batchName;
		this.psp = other.psp;
		this.batchPsp = other.batchPsp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public double getPsp() {
		return psp;
	}

	public void setPsp(double psp) {
		this.psp = psp;
	}

	public double getBatchPsp() {
		return batchPsp;
	}

	public void setBatchPsp(double batchPsp) {
		this.batchPsp = batchPsp;
	}


	@Override
	public Student copy() {
		Student st = new Student(this);
		
		return st;
	}

}
