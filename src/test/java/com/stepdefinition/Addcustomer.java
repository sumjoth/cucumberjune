package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcustomer {
	static WebDriver driver;

	@Given("The user should be in telecom homepage")
	public void the_user_should_be_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\Company\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		// driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given-1");

	}

	@Given("The user should click add customer")
	public void the_user_should_click_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given-2");

	}
//Scenario Based
	/*
	 * @When("The user provide valid details") public void
	 * the_user_provide_valid_details() {
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys("ganesh");
	 * driver.findElement(By.id("lname")).sendKeys("j");
	 * driver.findElement(By.id("email")).sendKeys("ganesh@gmail.com");
	 * driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
	 * .sendKeys("Chennai");
	 * driver.findElement(By.id("telephoneno")).sendKeys("6563461");
	 * driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 * 
	 * }
	 */
//one dimensional list
	/*
	 * @When("The user provide valid details") public void
	 * the_user_provide_valid_details(io.cucumber.datatable.DataTable onedlist) {
	 * System.out.println("When-1"); List<String> l = onedlist.asList(String.class);
	 * System.out.println(l);
	 * 
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(l.get(0));
	 * driver.findElement(By.id("lname")).sendKeys(l.get(1));
	 * driver.findElement(By.id("email")).sendKeys(l.get(2));
	 * driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
	 * .sendKeys(l.get(3));
	 * driver.findElement(By.id("telephoneno")).sendKeys(l.get(4));
	 * driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 * 
	 * }
	 */
	//one dimensional map
	/*
	 * @When("The user provide valid details") public void
	 * the_user_provide_valid_details(io.cucumber.datatable.DataTable onedmap) {
	 * Map<String, String> m = onedmap.asMap(String.class, String.class);
	 * System.out.println(m);
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(m.get("fname"));
	 * driver.findElement(By.id("lname")).sendKeys(m.get("lname"));
	 * driver.findElement(By.id("email")).sendKeys(m.get("mail"));
	 * driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
	 * .sendKeys(m.get("address"));
	 * driver.findElement(By.id("telephoneno")).sendKeys(m.get("phone"));
	 * driver.findElement(By.xpath("//input[@value='Submit']")).click(); }
	 */
	////two dimensional list
	/*
	 * @When("The user provide valid details") public void
	 * the_user_provide_valid_details(io.cucumber.datatable.DataTable twodlist) {
	 * List<List<String>> a = twodlist.asLists(String.class); System.out.println(a);
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(a.get(0).get(1));
	 * driver.findElement(By.id("lname")).sendKeys(a.get(1).get(1));
	 * driver.findElement(By.id("email")).sendKeys(a.get(2).get(2));
	 * driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
	 * .sendKeys(a.get(3).get(3));
	 * driver.findElement(By.id("telephoneno")).sendKeys(a.get(0).get(4));
	 * driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 * 
	 * }
	 */
	////one dimensional map
	@When("The user provide valid details")
	public void the_user_provide_valid_details(io.cucumber.datatable.DataTable cus) {
		System.out.println("when-1");
		List<Map<String, String>> as = cus.asMaps(String.class, String.class);
		System.out.println(as);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(as.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(as.get(0).get("lname"));
		driver.findElement(By.id("email")).sendKeys(as.get(0).get("mail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
				.sendKeys(as.get(0).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(as.get(0).get("phone"));
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

	@Then("The user should generate customer ID")
	public void the_user_should_generate_customer_ID() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());

	}

}
