package calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Calculator myBean= (Calculator) context.getBean("calculatorId");
        System.out.println("Add :"+myBean.add(2,3));
        System.out.println("Add :"+myBean.subtract(6,3));
        System.out.println("Use Constructor Args:");
        System.out.println("Pass String");
        CalculatorImpl myBean2= (CalculatorImpl) context.getBean("calculatorId2");
        System.out.println("Add :"+myBean2.getMsg());
        System.out.println("Pass int");
        CalculatorImpl myBean3= (CalculatorImpl) context.getBean("calculatorId3");
        System.out.println("Add :"+myBean3.getNum());
        System.out.println("Pass double");
        CalculatorImpl myBean4= (CalculatorImpl) context.getBean("calculatorId4");
        System.out.println("Add :"+myBean4.getNums());
        System.out.println("Type Double");
        CalculatorImpl myBean5= (CalculatorImpl) context.getBean("calculatorId5");
        System.out.println("Add :"+myBean5.getNum());
        System.out.println("Index ");
        CalculatorImpl myBean6= (CalculatorImpl) context.getBean("calculatorId6");
        System.out.println("Add :"+myBean6.getMsg());
        System.out.println("Factory Method");
        CalculatorImpl myBean7= (CalculatorImpl) context.getBean("calculatorId7");
        System.out.println("Add :"+CalculatorImpl.getInstance());
        System.out.println("Factory Bean");
        CalculatorImpl myBean8= (CalculatorImpl) context.getBean("calculatorId8");
        System.out.println("Add :"+myBean8.addObject());
        System.out.println("Constructor Based Injection");
        DaoServiceImpl daoService= (DaoServiceImpl) context.getBean("Dao");
        System.out.println(daoService);
        System.out.println("Setter Based Injection");
        DaoServiceImpl daoService2= (DaoServiceImpl) context.getBean("Dao2");
        System.out.println(daoService2.getProductDao());
        System.out.println("Circular Dependency");
        ClassA a= (ClassA) context.getBean("a");
        a.doSomeThing();
        System.out.println("P NameSpace");
        CalculatorImpl b= (CalculatorImpl) context.getBean("b2");
        System.out.println(b.getMsg());
        System.out.println("List");
        CalculatorImpl parent= (CalculatorImpl) context.getBean("parent");
        System.out.println(parent.getAdmin());

    }
}
