package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef{
	WebDriver driver;
	static String string;
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shano\\eclipse-workspace\\DataEntryJob\\drivers\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
			
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) throws InterruptedException {
		WebElement loginOpt = driver.findElement(By.xpath("//strong[text()='Login']"));
		loginOpt.click();
		
		WebElement dUser = driver.findElement(By.name("user_name"));
		dUser.sendKeys(string);
		
		WebElement dPass = driver.findElement(By.name("password"));
		dPass.sendKeys(string2);
		
		WebElement dSumbit = driver.findElement(By.name("login"));
		dSumbit.click();
		
		WebElement earnMoney =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
		earnMoney.click();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement earnMoney2 =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
		earnMoney2.click();
		
		WebElement onlineDataEntry = driver.findElement(By.xpath("(//img[@alt='START EARNING NOW'])[1]"));
		onlineDataEntry.click();
	  
	}

	@Then("Data entry page")
	public void data_entry_page() throws InterruptedException {
		

		
		
///////// FORM 1  //////////////////	
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement fName1 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[1]"));
		fName1.sendKeys("Personal Loan EMI");
		WebElement fValue1 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[1]"));
		WebElement b1 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[1]/td[2]"));
		String s2 =  b1.getText();
		fValue1.sendKeys(s2);
		
		
		WebElement fName2 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[2]"));
		fName2.sendKeys("Loan Interest Rate");
		WebElement fValue2 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[2]"));
		WebElement b2 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[2]/td[2]"));
		String s4 =  b2.getText();
		fValue2.sendKeys(s4);
		
		
		WebElement fName3 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[3]"));
		fName3.sendKeys("Car Loan EMI");
		WebElement fValue3 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[3]"));
		WebElement b3 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[3]/td[2]"));
		String s6 =  b3.getText();
		fValue3.sendKeys(s6);
		
		
		WebElement fName4 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[4]"));
		fName4.sendKeys("Mortgage Loan");
		WebElement fValue4 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[4]"));
		WebElement b4 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[4]/td[2]"));
		String s8 =  b4.getText();
		fValue4.sendKeys(s8);
		
		
		WebElement fName5 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[5]"));
		fName5.sendKeys("Education Loan");
		WebElement fValue5 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[5]"));
		WebElement b5 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[5]/td[2]"));
		String s10 =  b5.getText();
		fValue5.sendKeys(s10);
		
		
		WebElement fName6 = driver.findElement(By.xpath("(//input[@name='fieldname[2312][]'])[6]"));
		fName6.sendKeys("Personal Loan");
		WebElement fValue6 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2312][]'])[6]"));
		WebElement b6 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[1]/table[1]/tbody/tr[6]/td[2]"));
		String s12 =  b6.getText();
		fValue6.sendKeys(s12);
		
		WebElement next =  driver.findElement(By.xpath("//input[@value='Next']"));
		next.click();
		
		
		
/////////////////////  FORM  2  ////////////////////////////////////////////////	


		
		Thread.sleep(2000);
		
		
		WebElement fName11 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[1]"));
		
		fName11.sendKeys("Service Cost");
		WebElement fValue11 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[1]"));
		WebElement b7 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[1]/td[2]"));
		String s14 =  b7.getText();
		fValue11.sendKeys(s14);
		
		WebElement fName12 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[2]"));
		
		fName12.sendKeys("Air Conditioner");
		WebElement fValue12 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[2]"));
		WebElement b8 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[2]/td[2]"));
		String s16 =  b8.getText();
		fValue12.sendKeys(s16);
		
		
		WebElement fName13 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[3]"));
		
		fName13.sendKeys("TransmissionType");
		WebElement fValue13 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[3]"));
		WebElement b9 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[3]/td[2]"));
		String s18 =  b9.getText();
		fValue13.sendKeys(s18);
		
		
		WebElement fName14 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[4]"));
		
		fName14.sendKeys("google maps");
		WebElement fValue14 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[4]"));
		WebElement b10 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[4]/td[2]"));
		String s20 =  b10.getText();
		fValue14.sendKeys(s20);
		
		
		WebElement fName15 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[5]"));
		
		fName15.sendKeys("Car Pricing");
		WebElement fValue15 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[5]"));
		WebElement b11 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[5]/td[2]"));
		String s22 =  b11.getText();
		fValue15.sendKeys(s22);
		
		
		WebElement fName16 = driver.findElement(By.xpath("(//input[@name='fieldname[2313][]'])[6]"));
		
		fName16.sendKeys("Fuel Tank Capacity");
		WebElement fValue16 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2313][]'])[6]"));
		WebElement b12 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[2]/table[1]/tbody/tr[6]/td[2]"));
		String s24 =  b12.getText();
		fValue16.sendKeys(s24);
		
		WebElement next2 =  driver.findElement(By.xpath("//input[@value='Next']"));
		next2.click();
		
		
///////////////////  FORM 3  ////////////////////////////////////
		
Thread.sleep(2000);
		
WebElement fName21 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[1]"));

fName21.sendKeys("Experience");
WebElement fValue21 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[1]"));
WebElement b21 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[1]/td[2]"));
String z221 = b21.getText();
fValue21.sendKeys(z221);

WebElement fName22 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[2]"));

fName22.sendKeys("Designation");
WebElement fValue22 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[2]"));
WebElement b22 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[2]/td[2]"));
String z222 = b22.getText();
fValue22.sendKeys(z222);

WebElement fName23 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[3]"));

fName23.sendKeys("Salary");
WebElement fValue23 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[3]"));
WebElement b23 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[3]/td[2]"));
String z223 = b23.getText();
fValue23.sendKeys(z223);

WebElement fName24 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[4]"));

fName24.sendKeys("Nationality");
WebElement fValue24 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[4]"));
WebElement b24 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[4]/td[2]"));
String z224 = b24.getText();
fValue24.sendKeys(z224);

WebElement fName25 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[5]"));

fName25.sendKeys("Role");
WebElement fValue25 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[5]"));
WebElement b25 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[5]/td[2]"));
String z225 = b25.getText();
fValue25.sendKeys(z225);

WebElement fName26 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[6]"));

fName26.sendKeys("Job Timings");
WebElement fValue26 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[6]"));
WebElement b26 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[6]/td[2]"));
String z226 = b26.getText();
fValue26.sendKeys(z226);

WebElement fName27 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[7]"));

fName27.sendKeys("Address Proof");
WebElement fValue27 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[7]"));
WebElement b27 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[7]/td[2]"));
String z227 = b27.getText();
fValue27.sendKeys(z227);

WebElement fName28 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[8]"));

fName28.sendKeys("Job Type");
WebElement fValue28 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[8]"));
WebElement b28 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[8]/td[2]"));
String z228 = b28.getText();
fValue28.sendKeys(z228);

WebElement fName29 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[9]"));

fName29.sendKeys("Higher Secondary Score (%)");
WebElement fValue29 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[9]"));
WebElement b29 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[9]/td[2]"));
String z229 = b29.getText();
fValue29.sendKeys(z229);

WebElement fName30 = driver.findElement(By.xpath("(//input[@name='fieldname[2314][]'])[10]"));

fName30.sendKeys("Sector");
WebElement fValue30 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2314][]'])[10]"));
WebElement b30 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[3]/table[1]/tbody/tr[10]/td[2]"));
String z230 = b30.getText();
fValue30.sendKeys(z230);	

		WebElement next3 =  driver.findElement(By.xpath("//input[@value='Next']"));
		next3.click();
		
		
//////////////////////////// FORM 4 ////////////////////////////////////////////////////////
		
		Thread.sleep(2000);


		WebElement fName31 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[1]"));
		
		fName31.sendKeys("Title Loan");
		WebElement fValue31 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[1]"));
		WebElement b31 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[1]/td[2]"));
		String z231 = b31.getText();
		fValue31.sendKeys(z231);
		
		WebElement fName32 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[2]"));
		
		fName32.sendKeys("Mortgage Loan");
		WebElement fValue32 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[2]"));
		WebElement b32 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[2]/td[2]"));
		String z232 = b32.getText();
		fValue32.sendKeys(z232);
		
		WebElement fName33 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[3]"));
		
		fName33.sendKeys("Home Loan EMI");
		WebElement fValue33 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[3]"));
		WebElement b33 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[3]/td[2]"));
		String z233 = b33.getText();
		fValue33.sendKeys(z233);
		
		WebElement fName34 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[4]"));
		
		fName34.sendKeys("Gold Loan");
		WebElement fValue34 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[4]"));
		WebElement b34 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[4]/td[2]"));
		String z234 = b34.getText();
		fValue34.sendKeys(z234);
		
		WebElement fName35 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[5]"));
		
		fName35.sendKeys("Personal Loan Eligibility");
		WebElement fValue35 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[5]"));
		WebElement b35 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[5]/td[2]"));
		String z235 = b35.getText();
		fValue35.sendKeys(z235);
		
		WebElement fName36 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[6]"));
		
		fName36.sendKeys("Car Loan");
		WebElement fValue36 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[6]"));
		WebElement b36 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[6]/td[2]"));
		String z236 = b36.getText();
		fValue36.sendKeys(z236);
		
		WebElement fName37 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[7]"));
		
		fName37.sendKeys("Business Loan");
		WebElement fValue37 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[7]"));
		WebElement b37 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[7]/td[2]"));
		String z237 = b37.getText();
		fValue37.sendKeys(z237);
		
		WebElement fName38 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[8]"));
		
		fName38.sendKeys("Car Loan Eligibility");
		WebElement fValue38 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[8]"));
		WebElement b38 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[8]/td[2]"));
		String z238 = b38.getText();
		fValue38.sendKeys(z238);
		
		WebElement fName39 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[9]"));
		
		fName39.sendKeys("Education Loan");
		WebElement fValue39 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[9]"));
		WebElement b39 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[9]/td[2]"));
		String z239 = b39.getText();
		fValue39.sendKeys(z239);
		
		WebElement fName40 = driver.findElement(By.xpath("(//input[@name='fieldname[2315][]'])[10]"));
		
		fName40.sendKeys("Two Wheeler Loan");
		WebElement fValue40 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2315][]'])[10]"));
		WebElement b40 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[4]/table[1]/tbody/tr[10]/td[2]"));
		String z240 = b40.getText();
		fValue40.sendKeys(z240);
		

		
		WebElement next4 =  driver.findElement(By.xpath("//input[@value='Next']"));
		next4.click();


////////////////////////////FORM 5////////////////////////////////////////////////////////
		
 Thread.sleep(3000);
		
WebElement fName41 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[1]"));

fName41.sendKeys("Crop Insurance");
WebElement fValue41 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[1]"));
WebElement b41 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[1]/td[2]"));
String z241 = b41.getText();
fValue41.sendKeys(z241);

WebElement fName42 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[2]"));

fName42.sendKeys("Lic Term Insurance");
WebElement fValue42 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[2]"));
WebElement b42 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[2]/td[2]"));
String z242 = b42.getText();
fValue42.sendKeys(z242);

WebElement fName43 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[3]"));

fName43.sendKeys("Mobile Insurance");
WebElement fValue43 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[3]"));
WebElement b43 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[3]/td[2]"));
String z243 = b43.getText();
fValue43.sendKeys(z243);

WebElement fName44 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[4]"));

fName44.sendKeys("Travel Insurance");
WebElement fValue44 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[4]"));
WebElement b44 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[4]/td[2]"));
String z244 = b44.getText();
fValue44.sendKeys(z244);

WebElement fName45 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[5]"));

fName45.sendKeys("Business Travel Insurance");
WebElement fValue45 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[5]"));
WebElement b45 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[5]/td[2]"));
String z245 = b45.getText();
fValue45.sendKeys(z245);

WebElement fName46 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[6]"));

fName46.sendKeys("Life Insurance");
WebElement fValue46 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[6]"));
WebElement b46 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[6]/td[2]"));
String z246 = b46.getText();
fValue46.sendKeys(z246);

WebElement fName47 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[7]"));

fName47.sendKeys("Term Insurance Plans");
WebElement fValue47 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[7]"));
WebElement b47 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[7]/td[2]"));
String z247 = b47.getText();
fValue47.sendKeys(z247);

WebElement fName48 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[8]"));

fName48.sendKeys("Car Insurance");
WebElement fValue48 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[8]"));
WebElement b48 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[8]/td[2]"));
String z248 = b48.getText();
fValue48.sendKeys(z248);

WebElement fName49 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[9]"));

fName49.sendKeys("Two Wheeler Insurance");
WebElement fValue49 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[9]"));
WebElement b49 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[9]/td[2]"));
String z249 = b49.getText();
fValue49.sendKeys(z249);

WebElement fName50 = driver.findElement(By.xpath("(//input[@name='fieldname[2316][]'])[10]"));

fName50.sendKeys("General Insurance");
WebElement fValue50 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2316][]'])[10]"));
WebElement b50 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[5]/table[1]/tbody/tr[10]/td[2]"));
String z250 = b50.getText();
fValue50.sendKeys(z250);

		
		WebElement next5 =  driver.findElement(By.xpath("//input[@value='Next']"));
		next5.click();

		
////////////////////////////FORM 6////////////////////////////////////////////////////////
		
Thread.sleep(3000);
		
WebElement fName51 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[1]"));

fName51.sendKeys("data1");
WebElement fValue51 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[1]"));
WebElement b51 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[1]/td[2]"));
String z251 = b51.getText();
fValue51.sendKeys(z251);

WebElement fName52 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[2]"));

fName52.sendKeys("data2");
WebElement fValue52 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[2]"));
WebElement b52 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[2]/td[2]"));
String z252 = b52.getText();
fValue52.sendKeys(z252);

WebElement fName53 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[3]"));

fName53.sendKeys("data3");
WebElement fValue53 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[3]"));
WebElement b53 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[3]/td[2]"));
String z253 = b53.getText();
fValue53.sendKeys(z253);

WebElement fName54 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[4]"));

fName54.sendKeys("data4");
WebElement fValue54 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[4]"));
WebElement b54 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[4]/td[2]"));
String z254 = b54.getText();
fValue54.sendKeys(z254);

WebElement fName55 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[5]"));

fName55.sendKeys("data5");
WebElement fValue55 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[5]"));
WebElement b55 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[5]/td[2]"));
String z255 = b55.getText();
fValue55.sendKeys(z255);

WebElement fName56 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[6]"));
fName56.sendKeys("data6");
WebElement fValue56 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[6]"));
WebElement b56 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[6]/td[2]"));
String z256 = b56.getText();
fValue56.sendKeys(z256);

WebElement fName57 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[7]"));

fName57.sendKeys("data7");
WebElement fValue57 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[7]"));
WebElement b57 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[7]/td[2]"));
String z257 = b57.getText();
fValue57.sendKeys(z257);

WebElement fName58 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[8]"));

fName58.sendKeys("data8");
WebElement fValue58 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[8]"));
WebElement b58 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[8]/td[2]"));
String z258 = b58.getText();
fValue58.sendKeys(z258);

WebElement fName59 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[9]"));

fName59.sendKeys("data9");
WebElement fValue59 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[9]"));
WebElement b59 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[9]/td[2]"));
String z259 = b59.getText();
fValue59.sendKeys(z259);

WebElement fName60 = driver.findElement(By.xpath("(//input[@name='fieldname[2317][]'])[10]"));

fName60.sendKeys("data10");
WebElement fValue60 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2317][]'])[10]"));
WebElement b60 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[6]/table[1]/tbody/tr[10]/td[2]"));
String z260 = b60.getText();
fValue60.sendKeys(z260);

		
		WebElement next6 =  driver.findElement(By.xpath("//input[@value='Next']"));
		next6.click();
		
		
//////////////////////////FORM 7////////////////////////////////////////////////////////
		
Thread.sleep(3000);
		
WebElement fName61 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[1]"));

fName61.sendKeys("Credit Limit");
WebElement fValue61 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[1]"));
WebElement b61 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[1]/td[2]"));
String z261 = b61.getText();
fValue61.sendKeys(z261);

WebElement fName62 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[2]"));

fName62.sendKeys("Axis Bank Credit Card");
WebElement fValue62 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[2]"));
WebElement b62 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[2]/td[2]"));
String z262 = b62.getText();
fValue62.sendKeys(z262);

WebElement fName63 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[3]"));

fName63.sendKeys("Credit Risk");
WebElement fValue63 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[3]"));
WebElement b63 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[3]/td[2]"));
String z263 = b63.getText();
fValue63.sendKeys(z263);

WebElement fName64 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[4]"));

fName64.sendKeys("Payment Mode");
WebElement fValue64 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[4]"));
WebElement b64 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[4]/td[2]"));
String z264 = b64.getText();
fValue64.sendKeys(z264);

WebElement fName65 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[5]"));

fName65.sendKeys("CITI Credit Card");
WebElement fValue65 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[5]"));
WebElement b65 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[5]/td[2]"));
String z265 = b65.getText();
fValue65.sendKeys(z265);

WebElement fName66 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[6]"));

fName66.sendKeys("SBI Credit Card");
WebElement fValue66 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[6]"));
WebElement b66 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[6]/td[2]"));
String z266 = b66.getText();
fValue66.sendKeys(z266);

WebElement fName67 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[7]"));

fName67.sendKeys("Home Credit");
WebElement fValue67 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[7]"));
WebElement b67 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[7]/td[2]"));
String z267 = b67.getText();
fValue67.sendKeys(z267);

WebElement fName68 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[8]"));

fName68.sendKeys("Credit Score");
WebElement fValue68 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[8]"));
WebElement b68 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[8]/td[2]"));
String z268 = b68.getText();
fValue68.sendKeys(z268);

WebElement fName69 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[9]"));

fName69.sendKeys("City");
WebElement fValue69 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[9]"));
WebElement b69 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[9]/td[2]"));
String z269 = b69.getText();
fValue69.sendKeys(z269);

WebElement fName270 = driver.findElement(By.xpath("(//input[@name='fieldname[2318][]'])[10]"));

fName270.sendKeys("Reward Points");
WebElement fValue270 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2318][]'])[10]"));
WebElement b70 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[7]/table[1]/tbody/tr[10]/td[2]"));
String z2270 = b70.getText();
fValue270.sendKeys(z2270);

WebElement next7 =  driver.findElement(By.xpath("//input[@value='Next']"));
next7.click();

////////////////////////FORM 8////////////////////////////////////////////////////////


Thread.sleep(2000);
WebElement fName71 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[1]"));

fName71.sendKeys("data1");
WebElement fValue71 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[1]"));
WebElement b71 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[1]/td[2]"));
String z271 = b71.getText();
fValue71.sendKeys(z271);

WebElement fName72 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[2]"));

fName72.sendKeys("data2");
WebElement fValue72 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[2]"));
WebElement b72 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[2]/td[2]"));
String z272 = b72.getText();
fValue72.sendKeys(z272);

WebElement fName73 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[3]"));

fName73.sendKeys("data3");
WebElement fValue73 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[3]"));
WebElement b73 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[3]/td[2]"));
String z273 = b73.getText();
fValue73.sendKeys(z273);

WebElement fName74 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[4]"));

fName74.sendKeys("data4");
WebElement fValue74 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[4]"));
WebElement b74 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[4]/td[2]"));
String z274 = b74.getText();
fValue74.sendKeys(z274);

WebElement fName75 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[5]"));

fName75.sendKeys("data5");
WebElement fValue75 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[5]"));
WebElement b75 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[5]/td[2]"));
String z275 = b75.getText();
fValue75.sendKeys(z275);

WebElement fName76 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[6]"));

fName76.sendKeys("data6");
WebElement fValue76 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[6]"));
WebElement b76 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[6]/td[2]"));
String z276 = b76.getText();
fValue76.sendKeys(z276);

WebElement fName77 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[7]"));

fName77.sendKeys("data7");
WebElement fValue77 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[7]"));
WebElement b77 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[7]/td[2]"));
String z277 = b77.getText();
fValue77.sendKeys(z277);

WebElement fName78 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[8]"));

fName78.sendKeys("data8");
WebElement fValue78 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[8]"));
WebElement b78 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[8]/td[2]"));
String z278 = b78.getText();
fValue78.sendKeys(z278);

WebElement fName79 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[9]"));

fName79.sendKeys("data9");
WebElement fValue79 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[9]"));
WebElement b79 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[9]/td[2]"));
String z279 = b79.getText();
fValue79.sendKeys(z279);

WebElement fName80 = driver.findElement(By.xpath("(//input[@name='fieldname[2319][]'])[10]"));

fName80.sendKeys("data10");
WebElement fValue80 = driver.findElement(By.xpath("(//input[@name='fieldvalue[2319][]'])[10]"));
WebElement b80 = driver.findElement(By.xpath("//*[@id=\"testform\"]/fieldset[8]/table[1]/tbody/tr[10]/td[2]"));
String z280 = b80.getText();
fValue80.sendKeys(z280);
		
		WebElement submit =  driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		
		
	
}
	

	@Then("Close the Browser")
	public void close_the_Browser() {
System.out.println(string+ " Task Completed");
		
		driver.close();
	   
	}

	
	
	
}