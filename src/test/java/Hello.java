

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hello {
        //hard assertion
        @Test
       public void N1(){
            int a=3+4;
            Assert.assertEquals(7,a);

            boolean c= false;
            Assert.assertFalse(c);

        }
        //soft assertion
	@Test
	public void calculation() {
        SoftAssert softAssert = new SoftAssert();

		int a=50, b=30;
		int sum = a+b;
		softAssert.assertEquals(sum, 80);

		int sub = a-b;
		softAssert.assertEquals(sub, 30);

		int mul = a*b;
		softAssert.assertEquals(mul, 150);
		System.out.println("20th line");
		softAssert.assertAll();

    }
}







