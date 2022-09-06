package org.base;


	

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	//import org.apache.poi.ss.usermodel.Cell;
	//import org.apache.poi.ss.usermodel.Row;
	//import org.apache.poi.ss.usermodel.Sheet;
	//import org.apache.poi.ss.usermodel.Workbook;
	//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		public static WebDriver driver;
		// public static WebDriver getDriver() {
		// return driver;
		// }

		public static WebDriver browserLaunch(String bname) {
			switch (bname) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("invalid browsername");
				break;
			}
			return driver;

			
		}
			
			

//		public static WebDriver chromeBrowser() {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			return driver;
//		}
	//
//		public static WebDriver edgeBrowser() {
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//			return driver();
//		}

		public static void urllaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}

		public static void implicitlyWait(int a) {
			driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		}

		public static void sendKeys(WebElement e, String value) {
			e.sendKeys(value);
		}

		public static void click(WebElement e) {
			e.click();
		}

		public static void clear(WebElement e) {
			e.clear();
		}

		public static void quit() {
			driver.quit();
		}

		public static void close() {
			driver.close();
		}

		public static void switchTo() {
			driver.switchTo();
		}

		public static void moveToElement(WebElement tar) {
			Actions a = new Actions(driver());
			a.moveToElement(tar).perform();
		}
		public static void dragAndDrop(WebElement src,WebElement tar) {
			Actions a = new Actions(driver());
			a.dragAndDrop(src,tar).perform();
		}
		public static void contextClick(WebElement tar) {
			Actions a = new Actions(driver());
			a.contextClick(tar);
		}
		public static void doubleClick(WebElement tar) {
			Actions a = new Actions(driver());
			a.doubleClick(tar);
		}
		public static void selectByIndex(WebElement e,int index)
		{
			Select s=new Select(e);
			s.selectByIndex(index);
			
		}
		public static void selectByValue(WebElement e,String i)
		{
			Select s=new Select(e);
			s.selectByValue(i);
			
		}
		public static void selectByVisibleText(WebElement e,String st)
		{
			Select s=new Select(e);
			s.selectByVisibleText(st);
			
		}
		public static String getAttribute(WebElement e)
		{
			String attribute=e.getAttribute("value");
			return attribute;
		}
		public static String getText(WebElement e)
		{
			String text=e.getText();
			return text;
		}
		
		

		public static WebDriver driver() {
			return driver;
		}

		public static void driver(WebDriver driver) {
			BaseClass.driver = driver;
		}

	//public static String dataRead1(String filename,String sheet,int row,int column)throws IOException {
//			File f=new File("C:\\Users\\Bala Murali\\eclipse-workspace\\Maven_july\\src\\test\\resources\\Excel\\"+filename+".xlsx");
//			FileInputStream st=new FileInputStream(f);
//			Workbook w=new XSSFWorkbook(st);
//			Sheet s=w.getSheet("Sheet");
//		Row r = s.getRow(row);
//		Cell cell = r.getCell(column);
//		//System.out.println(cell);
//		 int type = cell.getCellType();
//		String value=null;
//		return value;
////		return sheet;
	//}
	public static String getTitle()
	{
	 String title = driver.getTitle();
	return title;
	}
			
	public static String getCurrentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static void executeScript(String s,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',"+s+")",e);
	}
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",e);
	}
	public static void scrollUp( WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",e);
		}
	public static void click1( WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click1",e);
		}
	public static boolean waitUrl(long sec,String partialUrl)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		return w.until(ExpectedConditions.urlContains("privacy")) ;
		
	}
	public static void takeScreenshot(String imagename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\Screenshots" +imagename+".png");
		FileUtils.copyFile(src, des);
	}

	public void assertTrue(String s, boolean contains) {
		assertTrue("s",contains);
		
	}
	public void assertequals(String string1, String s, String string2) {
		// TODO Auto-generated method stub
		assertequals("string1",s,"string2");
	}




		


	}




