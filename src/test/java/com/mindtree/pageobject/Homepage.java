package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class Homepage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public Homepage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickSearchicon() {
		log = loggerUtil.createLog("Homepage.java");
		//helper.actionClick(HomePageUI.searchicon);
		log.debug("Search icon clicked");	
	}

	
	public  void enterItem() {
		String string = helper.properties.getProperty("Item");
		//helper.sendText(HomePageUI.searchbox, string);
		log.debug("Entered item "+string+" in search box");
		
	}
	
	public void clickSearchbutton() {
		//helper.clickButton(HomePageUI.searchbutton);
		log.debug("Search button clicked");;
		
	}


	
}



