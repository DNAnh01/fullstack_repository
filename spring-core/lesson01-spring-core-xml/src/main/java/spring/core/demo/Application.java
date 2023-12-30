package spring.core.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.bean.Item;
import spring.core.bean.ItemGroup;
import spring.core.service.ClientService;

public class Application {
	private static final String contextPath = "spring-beans.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(contextPath);

		ClientService clientServiceX = context.getBean("clientF", ClientService.class);
		
		
		
		// khi nào application context close thì cái bean đó ms destroy
		System.out.println("----------1111");
		String[] beanNames = context.getBeanDefinitionNames();

		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

		
		System.out.println("----------");
		ItemGroup igA = context.getBean("igA", ItemGroup.class);
		
		ItemGroup igC = context.getBean("igC", ItemGroup.class);
		Item itemA = context.getBean("itemA", Item.class);
		ClientService clientService = context.getBean("clientA", ClientService.class);
		
		System.out.println("igA: " + igA);
		
		System.out.println("igC: " + igC);
		System.out.println("itemA" + itemA);
		
		clientService.clientInfo();
		
		
		System.out.println("----------");
		ItemGroup igB1 = context.getBean("igB", ItemGroup.class);
		igB1.setName("Item Group XYZ");
		System.out.println("igB1: " + igB1);
		
		ItemGroup igB2 = context.getBean("igB", ItemGroup.class);
		System.out.println("igB2: " + igB2); 
		
		
		// destroy beans
		context.close();
	}
}