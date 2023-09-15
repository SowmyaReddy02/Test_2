package org.example.dao;

import org.example.model.Employee;

public interface EmpDAO {
    public void insert(Employee employee);
    public void read();
    public void update(int id);
    public void delete(int id);
}
