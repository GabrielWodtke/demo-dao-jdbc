package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEST 1:  Department insert ===");
        Department dep = new Department(null, "AI");
        departmentDao.insert(dep);
        System.out.println("Insertado com sucesso! novo id: " + dep.getId());

        /*System.out.println("=== TEST 2:  Department Update ===");
        departmentDao.update(new Department(6, "Machine Learning"));
        System.out.println("update feito com sucesso");*/

        System.out.println("=== TEST 3:  Department delete ===");
        departmentDao.deleteById(15);

        System.out.println("=== TEST 4:  find by id ===");
        System.out.println(departmentDao.findById(6));

        System.out.println("=== TEST 5:  find all ===");
        departmentDao.findAll().forEach(System.out::println);
    }
}
