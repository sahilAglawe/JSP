package kapilit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static int save(Employee e) {
        int status = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee(id,name,password,salary) VALUES(?,?,?,?)"
            );
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getPassword());
            ps.setString(4, e.getSalary());
            status = ps.executeUpdate();
        } catch (Exception ex) { ex.printStackTrace(); }
        return status;
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setSalary(rs.getString(4));
                list.add(e);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public static Employee getEmployeeById(int id) {
        Employee e = new Employee();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setSalary(rs.getString(4));
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return e;
    }

    public static int update(Employee e) {
        int status = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE employee SET name=?, password=?, salary=? WHERE id=?"
            );
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getSalary());
            ps.setInt(4, e.getId());
            status = ps.executeUpdate();
        } catch (Exception ex) { ex.printStackTrace(); }
        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (Exception ex) { ex.printStackTrace(); }
        return status;
    }
}
