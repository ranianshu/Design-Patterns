package designpatterns.factory;

import designpatterns.factory.components.button.AndroidButton;
import designpatterns.factory.components.dropdown.AndroidDropDown;
import designpatterns.factory.components.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{

	@Override
	public AndroidButton createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public AndroidMenu createMenu() {
		// TODO Auto-generated method stub
		return new AndroidMenu();
	}

	@Override
	public AndroidDropDown createDropDown() {
		// TODO Auto-generated method stub
		return new AndroidDropDown();
	}

}
