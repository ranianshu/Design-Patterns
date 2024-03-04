package designpatterns.factory;

public class Flutter {
	
	public void setTheme() {
		System.out.println("setting theme for flutter");
	}
	
	public void refreshRate() {
		System.out.println("setting refresh rate for flutter");
	}
	
	public UIFactory createUIFactory(String platform) {
		if(platform.equals("Android")) {
			return new AndroidUIFactory();
		}else if(platform.equals("Ios")) {
			return new IosUIFactory();
		}
		return null;
	}

}
