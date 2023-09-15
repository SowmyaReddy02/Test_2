package org.example;

import org.example.daoImpl.EmpDaoImpl;
import org.example.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        EmpDaoImpl empDaoImpl = (EmpDaoImpl) applicationContext.getBean("employeeDaoImpl");
        int choice=0;
        do {
            System.out.println("Please enter your choice:\n1: Create new record\n2: Read all records\n3: Upadte\n4. Delete\n5. Exit");
            Scanner scanner = new Scanner(System.in);
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter EmpId, Name, Salary, CompanyID");
                    Employee emp = new Employee(scanner.nextInt(),scanner.next(),scanner.nextDouble(), scanner.nextInt());
                    empDaoImpl.insert(emp);
                    System.out.println("Record Inserted");
                    break;

                case 2:{
                    empDaoImpl.read();
                    break;
                }
                case 3:{
                    System.out.println("Enter EmpId");
                    empDaoImpl.update(scanner.nextInt());
                    System.out.println("Record Updated");
                    break;
                }
                case 4:{
                    System.out.println("Enter EmpId");
                    empDaoImpl.delete(scanner.nextInt());
                    System.out.println("Record deleted");
                    break;
                }
            }
        }while (choice!=5);
    }
}