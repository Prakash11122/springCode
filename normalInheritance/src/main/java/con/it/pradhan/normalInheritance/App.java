package con.it.pradhan.normalInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Emp bean = context.getBean("emp", Emp.class);
//        bean.getId();
        Emp e1 = (Emp) context.getBean("emp");
        e1.getEmpInfo();
        
        Salary s1 = (Salary) context.getBean("salary");
        s1.getSalaryInfo();
    }
}
