package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginecom extends BaseClass {
	public Loginecom(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//form[@role='search']")
private WebElement search;
@FindBy(xpath="//button[@type='button']")
private WebElement btnsearch;
}
