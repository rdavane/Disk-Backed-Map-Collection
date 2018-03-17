/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul.main;

import com.rahul.dao.Employee;
import com.rahul.diskbackedmap.DBMap;
import java.util.Scanner;

/**
 *
 * @author HRtech
 */
public class DBMapMain {

    public static void main(String[] args) {
        int choice, key, capacity;
        String id, name, password;
        key = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Maximum Size of Map on Heap");
            capacity = sc.nextInt();
            DBMap<Integer, Employee> dmap = new DBMap<Integer, Employee>(capacity, "C:\\Users\\HRtech\\Documents\\record.txt");
            Employee objEmp = null;
            while (true) {
                System.out.println("Enter choice only in Number: ");
                System.out.println("PUT new emp         :    1      ");
                System.out.println("GET emp             :    2      ");
                System.out.println("Exit and Delete File:    3      ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        key++;

                        System.out.println("Enter Emp id  ");
                        id = sc.next();
                        System.out.println("Enter emp name   ");
                        name = sc.next();
                        System.out.println("Enter emp password ");
                        password = sc.next();
                        objEmp = new Employee(id, name, password);
                        dmap.put(key, objEmp);
                        break;
                    }
                    case 2: {
                        System.out.println("Please Enter Index to GET record");
                        int keyTofindObj = sc.nextInt();

                        Employee employee = dmap.get(keyTofindObj);
                        if (employee != null) {
                            System.out.println(employee.getId());
                            System.out.println(employee.getName());
                            System.out.println(employee.getPassword());
                        } else {
                            System.out.println("No such employee");
                        }
                        break;
                    }
                    case 3: {
                        if (dmap.exit()) {
                            System.exit(0);
                        }
                    }
                    default:
                        System.out.println("Wrong Choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
