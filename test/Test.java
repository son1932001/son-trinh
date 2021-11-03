
import Dao.EmployeeDao;
import Entity.Employee;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        EmployeeDao employeedao = new EmployeeDao();
        List<Employee> list = employeedao.getAllEmployee();
        for (Employee o : list) {
            System.out.println(o);
        }
    }
}
