package com.fuwei.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fuwei.spring.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    Category c;
 
    @Test
    public void test(){
        System.out.println(c.getName());
    }
	
	
/*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }*/

	/*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
 
        Product p = (Product) context.getBean("p");
 
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());
    }*/
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
