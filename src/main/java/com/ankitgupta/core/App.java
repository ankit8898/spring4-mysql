package com.ankitgupta.core;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ankitgupta.customer.dao.CustomerDAO;
import com.ankitgupta.customer.model.Customer;

public class App
{
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "Spring-Module.xml");

    CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        //Customer customer = new Customer(34, "Ankit",28);
        //customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(34);
        System.out.println(customer1);
  }
}
