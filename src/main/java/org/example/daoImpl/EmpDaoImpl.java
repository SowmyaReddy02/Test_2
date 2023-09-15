package org.example.daoImpl;

import org.example.dao.EmpDAO;
import org.example.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmpDaoImpl implements EmpDAO {

    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(Employee employee) {
        String query = "insert into employee_info values(?,?,?,?);";
        jdbcTemplate.update(query,new Object[]{employee.getEmpId(),employee.getName(),employee.getSalary(),employee.getCompanyId()});
    }
    @Override
    public void read(){
        String query = "select * from employee_info";
         List res= jdbcTemplate.queryForList(query);
         System.out.println(res);
    }
    @Override
    public void update(int id){
        String query = "update employee_info set salary=? where emp_id=?; ";
        jdbcTemplate.update(query,40000,id);
    }
    @Override
    public void delete(int id){
        String query = "delete from employee_info where emp_id=?;";
        jdbcTemplate.update(query,id);
    }
}
