package freeman.main.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eumier.service.DemoService;

public class Springtext {

	public static void main(String[] args) {
		
		//启动Spring容器
				ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-context.xml");
				//获取service组件
				DemoService service = (DemoService) context.getBean("demoService");
				//以普通的方式调用UserService对象的三个方法
				service.test();
			

	}

}
