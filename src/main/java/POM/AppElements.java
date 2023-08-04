package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppElements {
    AndroidDriver driver;
    public  AppElements(AndroidDriver driver){
        this.driver=driver;
    }
    By Click = By.xpath("//*[@text='Make Payment']");
    By Number =By.xpath("//*[@id='phoneTextField']");
    By Name =By.xpath("//*[@id='nameTextField']");
    By Amount =By.xpath("//*[@id='amountTextField']");
    By Country =By.xpath("//*[@id='countryTextField']");
    By Payment =By.xpath("//*[@text='Send Payment']");
    By Mortgage=By.xpath("//*[@text='Mortgage Request']");
    By FirstName= By.xpath("//*[@id='nameTextField']");
    By LastName= By.xpath("//*[@id='lastNameTextField']");
    By ages= By.xpath("//*[@id='ageTextField']");
    By Adress=By.xpath("//*[@id='addressOneTextField']");
    By Adresss = By.xpath("//*[@id='addressTwoTextField']");
    By Countries = By.xpath("//*[@id='countryTextField']");
    By Next = By.xpath("//*[@text='Next']");
    By Loan = By.xpath("//*[@text='Home']");
    By Years = By.xpath("//*[@text='1']");
    By job = By.xpath("//*[@text='Private Job']");
    By income =By.xpath("//*[@text='500000']");
    By Save = By.xpath("//*[@text='Save']");
    By ExpenseReport=By.xpath("//*[@text='Expense Report']");
    By Add = By.xpath("//*[@text='Add']");
    By Back = By.xpath("//*[@text='Back']");
    By logout =By.xpath("//*[@text='Logout']");
    public void inputField(String username,String passWord) throws InterruptedException {
        Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='OK']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Username']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(username);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(passWord);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Login']")).click();
        }
        public void MakePayment() throws InterruptedException {
            driver.findElement(Click).click();
            //driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
            Thread.sleep(1000);
        }
        public void PhoneNumber(String n) throws InterruptedException {
            Thread.sleep(1000);
            driver.findElement(Number).click();
            Thread.sleep(1000);
            driver.findElement(Number).sendKeys(n);
        }
         public void Receiver(String n) throws InterruptedException {
            Thread.sleep(1000);
            driver.findElement(Name).click();
            Thread.sleep(1000);
            driver.findElement(Name).sendKeys(n);
        }
        public void Amount(String n) throws InterruptedException {
            Thread.sleep(1000);
            driver.findElement(Amount).click();
            Thread.sleep(1000);
            driver.findElement(Amount).sendKeys(n);
        }
        public void Where(String n) throws InterruptedException {
        Thread.sleep(1000);
            driver.findElement(Country).click();
                Thread.sleep(1000);
            driver.findElement(Country).sendKeys(n);
        }
        public void SendPayment() throws InterruptedException {
            Thread.sleep(1000);
            driver.findElement(Payment).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Yes']")).click();
        }
        public void Mortgage()throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(Mortgage).click();
        }
        public void Names(String F,String L) throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(FirstName).click();
            Thread.sleep(1000);;
            driver.findElement(FirstName).sendKeys(F);
            Thread.sleep(1000);
            driver.findElement(LastName).click();
            Thread.sleep(1000);
            driver.findElement(LastName).sendKeys(L);
        }
        public void Age(String n) throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(ages).click();
            driver.findElement(ages).sendKeys(n);
        }
        public void Address(String a,String b) throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(Adress).click();
            driver.findElement(Adress).sendKeys(a);
            Thread.sleep(1000);
            driver.findElement(Adresss).click();
            driver.findElement(Adresss).sendKeys(b);
        }
        public void Cntrs(String c) throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(Countries).click();
            driver.findElement(Countries).sendKeys(c);
            Thread.sleep(1000);
            driver.findElement(Next).click();
            Thread.sleep(1000);
        }
        public void info() throws InterruptedException{
        Thread.sleep(1000);
            driver.findElement(Loan).click();
                Thread.sleep(1000);
            driver.findElement(Years).click();
            //scroll code
                Thread.sleep(1000);
            driver.findElement(job).click();
                Thread.sleep(1000);
            driver.findElement(income).click();

        }
        public void save(){
            driver.findElement(Save).click();
        }
        public void Expense()throws InterruptedException{
        Thread.sleep(1000);
            driver.findElement(ExpenseReport).click();

        }
        public void ADDandBack()throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(Add).click();
            Thread.sleep(1000);
            driver.findElement(Back).click();
        }
        public void Logout()throws InterruptedException{
            Thread.sleep(1000);
            driver.findElement(logout).click();
        }
}
