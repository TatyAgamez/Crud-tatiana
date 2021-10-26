package corp.hr.data.service;

import corp.hr.data.dao.EmployeesDao;
import corp.hr.data.dto.Employees;
import corp.hr.data.exception.DaoException;
import corp.hr.data.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ServiceEmployeesImp implements ServiceEmployees {

    @Autowired
    private EmployeesDao dao;

    @Override
    public void save(Employees employees)   throws ServiceException {
        try {
            int cantidad = dao.exist(employees);
            if(cantidad==0){
                dao.save(employees);
            }else{
                dao.update(employees);
            }

        }catch (DaoException de){
            throw new ServiceException(de);
        }

    }
    @Override
    public List<Employees> getAll()  throws ServiceException {
        try {
           return  dao.getAll();

        }catch (DaoException de){
            throw new ServiceException(de);
        }

    }
}
