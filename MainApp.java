package Spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		String location="/configure/config.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(location);
		
		System.out.println("----------|| Greeting Display CLass ||-----------");
		GreetingDisplay GD=(GreetingDisplay)ctx.getBean("GD");
		GD.Show();
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("----------|| Student CLass ||-----------");
		Student STD= (Student) ctx.getBean("STD");
		STD.Show();
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("----------|| Collage CLass ||-----------");
		Collage CLG=(Collage) ctx.getBean("CLG");
		CLG.Show();
		System.out.println("----------------------------------------------------------------------");
	}

}
