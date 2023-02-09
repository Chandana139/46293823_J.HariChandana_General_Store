package org.example;

import org.testng.annotations.Test;


public class Problem2_Test extends BaseTest{
	@Test
	public void testcase() {
		POM_Problem2 p=new POM_Problem2();
		p.country_name().click();
		p.country1_name().click();
		p.name1("Chandana");
		p.gender1().click();
		p.login1().click();
		p.Add_to_cart1().click();
		p.cart1().click();
		p.checkbox1().click();
		p.search1().click();
	}

}
