package designpatterns.builder;

public class Student {
	
	private String name;
	private int age;
	private double psp;
	private String universityName;
	private String batch;
	private Long id;
	private int gradYear;
	private String phoneNumber; 
	
	static Builder getBuilder() {
		return new Builder();
	}
	
	private Student(Builder builder) throws Exception{
		
		//validation
		
		if(builder.getGradYear() < 2000) {
			throw new Exception("validation failed");
		}
		
		//set the values
		this.name = builder.getName();
		this.age = builder.getAge();
		this.psp = builder.getPsp();
		this.universityName = builder.getUniversityName();
		this.batch = builder.getBatch();
		this.id = builder.getId();
		this.gradYear = builder.getGradYear();
		this.phoneNumber = builder.getPhoneNumber();
		
	}
	
	public static class Builder {
		
		private String name;
		private int age;
		private double psp;
		private String universityName;
		private String batch;
		private Long id;
		private int gradYear;
		private String phoneNumber;
		
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public int getAge() {
			return age;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public double getPsp() {
			return psp;
		}
		public Builder setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		public String getUniversityName() {
			return universityName;
		}
		public Builder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}
		public String getBatch() {
			return batch;
		}
		public Builder setBatch(String batch) {
			this.batch = batch;
			return this;
		}
		public Long getId() {
			return id;
		}
		public Builder setId(Long id) {
			this.id = id;
			return this;
		}
		public int getGradYear() {
			return gradYear;
		}
		public Builder setGradYear(int gradYear) {
			this.gradYear = gradYear;
			return this;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Student build() throws Exception {
			return new Student(this);
		}

	}

}
