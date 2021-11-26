package org.sample;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parametertesting extends libglobal{
@BeforeClass	
private void tc01() {
	getDriver();
launchbrowser("https://www.facebook.com/");
}

@Parameters({"username"})
@Test
private void tc02(@Optional("harish@gmail.com")String s) {
	WebElement textuser = xpath("//*[@id=\"email\"]");
textsender(textuser,s);
}
@Parameters({"password"})
@Test
private void tc021(@Optional("harish")String s1) {

	WebElement textpass= id("pass");
	textsender(textpass,s1);



}}
