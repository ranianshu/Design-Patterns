package designpatterns.factory;

import designpatterns.factory.components.button.IosButton;
import designpatterns.factory.components.dropdown.IosDropDown;
import designpatterns.factory.components.menu.IosMenu;


public class IosUIFactory implements UIFactory{

	@Override
	public IosButton createButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IosMenu createMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IosDropDown createDropDown() {
		// TODO Auto-generated method stub
		return null;
	}

}
