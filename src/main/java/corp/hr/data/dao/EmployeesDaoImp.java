package corp.hr.data.dao;

import corp.hr.data.dto.Employees;
import corp.hr.data.exception.DaoException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeesDaoImp implements EmployeesDao {

    private static  String INSERT = "INSERT INTO employees(first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)\n" +
                                    "VALUES(?,?,?,?,?,?,?,?,?,?);\n";
    private static String UPDATE="UPDATE employees\n" +
            "SET first_name = ?,\n" +
            "\tlast_name = ?,\n" +
            "\temail = ?,\n" +
            "\tphone_number = ?,\n" +
            "\thire_date = ?,\n" +
            "\tjob_id = ?,\n" +
            "\tsalary = ?,\n" +
            "\tcommission_pct = ?,\n" +
            "\tmanager_id = ?,\n" +
            "\tdepartment_id = ?\n" +
            "WHERE employee_id =?";
    private static String LISTADO ="SELECT employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id\n" +
            "FROM  employees ";
    JdbcTemplate jdbcTemplate;

    public EmployeesDaoImp(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Employees employees) throws DaoException {
        try {
            jdbcTemplate.update(INSERT,
                    employees.getFirst_name(),employees.getLast_name(),
                    employees.getEmail(),employees.getPhone_number(),employees.getHire_date(),employees.getJob_id(),employees.getSalary(),employees.getCommission_pct(),employees.getManager_id(),employees.getDepartment_id()
            );

         }catch (Exception se){
            throw  se;
        }

    }

    @Override
    public int exist(Employees employees) throws DaoException {
       try{

        String sql = "SELECT COUNT(employee_id) AS CANT  FROM employees    WHERE employee_id = ?";
           return jdbcTemplate.queryForObject(
                   sql, new Object[]{employees.getEmployee_id()}, Integer.class);


       }catch (Exception se){
            throw  se;
        }
    }

    @Override
    public List<Employees> getAll() throws DaoException {
        try {
            List<Employees> listaEmpleados = jdbcTemplate.query(
                    LISTADO,
                    new EmployeesMapper());
            return listaEmpleados;
        }catch (Exception e){
            throw  e;
        }
    }

    @Override
    public void update(Employees employees) throws DaoException {
        try {
            jdbcTemplate.update(UPDATE,
                    employees.getFirst_name(),employees.getLast_name(),
                    employees.getEmail(),employees.getPhone_number(),employees.getHire_date(),employees.getJob_id(),
                    employees.getSalary(),employees.getCommission_pct(),employees.getManager_id(),employees.getDepartment_id(),
                    employees.getEmployee_id()
            );

        }catch (Exception se){
            throw  se;
        }

    }
}
