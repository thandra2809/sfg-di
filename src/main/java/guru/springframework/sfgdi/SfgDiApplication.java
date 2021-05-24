package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SfgDiApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        String greeting = controller.sayHello();
        System.out.println("This is Greeting from controller" + greeting);

    }

}
