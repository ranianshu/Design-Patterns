package designpatterns.builder;

import designpatterns.builder.Student.Builder;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Builder builder = Student.getBuilder();
		builder.setName("Anshu");
		builder.setAge(25);
		builder.setBatch("2023 Java Morining");
		builder.setGradYear(2017);
		
		//Student st = new Student(builder);
		
		Student st1 = Student.getBuilder()
				.setName("Anshu")
				.setAge(25)
				.setBatch("2013 Java Morning")
				.setGradYear(2017)
				.build();

	}

}
