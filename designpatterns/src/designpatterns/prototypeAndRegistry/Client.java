package designpatterns.prototypeAndRegistry;

public class Client {

	public static void main(String[] args) {
		
		StudentRegistry studentRegistry = new StudentRegistry();
		fillStudentRegistry(studentRegistry);
		
		Student st = studentRegistry.get("Apr21 batch").copy();
		st.setName("Anshu");
		st.setAge(25);
		st.setPsp(80);
		
		Student intelligentStudent = studentRegistry.get("apr21Intelligent").copy();
		intelligentStudent.setName("Ujjwal");
		intelligentStudent.setAge(29);
		intelligentStudent.setPsp(90);
		

	}

	private static void fillStudentRegistry(StudentRegistry registry) {
		Student aprStudent = new Student();
		aprStudent.setBatchName("Apr21 batch");
		aprStudent.setBatchPsp(70);
		
		registry.register("apr21", aprStudent);
		
		IntelligentStudent aprIntelliStudent = new IntelligentStudent();
		aprIntelliStudent.setBatchName("apr21Intelligent");
		aprIntelliStudent.setBatchPsp(90);
		
		registry.register("apr21Intelligent", aprIntelliStudent);
		
	}

}
