    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SalesForceLoginUsingDatabaseTesting {

		public static void main(String[] args) throws SQLException {
			
			String host="localhost";
			String port="3306";
			
			Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/userinfo", "root", "shahin123");//database name salesforce and password
			
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery("select * from userinfo where username='shahinsayyed66@gmail.com'");//salesforce table name userinfo
			
			while(rs.next())
			{
				System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com/?locale=in");
				driver.manage().window().maximize();
				driver.getTitle();
				
				driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//*[@id='username']")).sendKeys(rs.getString("username"));
				
				driver.findElement(By.xpath("//*[@id='password']")).sendKeys(rs.getString("password"));
				
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				
				System.out.println(rs.getString("username"));
				
				System.out.println(rs.getString("password"));
				driver.close();
			}
			
			
		}

	}
