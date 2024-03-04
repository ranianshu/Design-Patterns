package designpatterns.factory;

import designpatterns.factory.components.button.Button;

public class Client {

	public static void main(String[] args) {
		
		Flutter flutter = new Flutter();
		UIFactory factory = flutter.createUIFactory("Android");
		
		Button button = factory.createButton();
		button.sayHi();

	}

}
