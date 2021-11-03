/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Context.DBConnect;
import Entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EmployeeDao {
    Connection conn = null; //kết nối tới sql sever
    PreparedStatement ps = null; //ném câu lệnh query từ neatbean sang sql sever
    ResultSet rs = null; //nhận kết quả trả về
    
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        String query = "select * from EMPLOYEE";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Employee(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
