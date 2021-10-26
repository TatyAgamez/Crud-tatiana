package corp.hr.data.dao;

import corp.hr.data.dto.Employees;
import corp.hr.data.exception.DaoException;

import java.util.ArrayList;
import java.util.List;

public interface EmployeesDao {
    public void save(Employees employees) throws DaoException;
    public void update(Employees employees) throws DaoException;
    public int exist(Employees employees) throws DaoException;
    public List<Employees> getAll()  throws DaoException;
}
