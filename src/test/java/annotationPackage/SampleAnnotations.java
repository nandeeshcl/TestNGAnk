package annotationPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleAnnotations {
	
	
  @Test
  public void testAnnotation() {
	  
	  System.out.println("This is Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is afterMethod");
  }

}
