package com.selenium.mainclass;

import com.selenium.testcase.base.TestBaseclass;
import com.selenium.testcase.test.Homepage;
import com.selenium.testcase.test.Navigatetoports;

public class Application {

	public static void main(String[] args) {
	
		TestBaseclass t= new TestBaseclass();
		Homepage h= new Homepage();
		Navigatetoports n =new Navigatetoports();
		t.setup();
		h.homePageTest();
		n.navigatetoport();
		n.searchforport("Honolulu");

	}

}
