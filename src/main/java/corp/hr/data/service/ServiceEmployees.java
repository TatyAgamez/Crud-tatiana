package corp.hr.data.service;

import corp.hr.data.dto.Employees;
import corp.hr.data.exception.ServiceException;

import java.util.List;

public interface ServiceEmployees {
    public void save(Employees employees)  throws ServiceException;
    public List<Employees> getAll()  throws ServiceException;
}
