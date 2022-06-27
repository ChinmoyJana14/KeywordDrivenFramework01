import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class Execution {
		
		@BeforeSuite
		public void setExcel() {
		String path = System.getProperty("user.dir")+"\\TestData\\SeleniumKeyword.xlsx";
		ExcelUtility.SetExcel(path, 0);
		}
		
		@Test
		public void SC_01(Method method) {
			System.out.println("Current Scenario Started :"+ method.getName());
		}

}                                                                    
                           
                                                                                                  