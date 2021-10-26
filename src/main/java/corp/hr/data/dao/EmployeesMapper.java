package corp.hr.data.dao;

import corp.hr.data.dto.Employees;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeesMapper implements RowMapper<Employees> {
    @Override
    public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {

        Employees employees = new Employees();
        employees.setCommission_pct(rs.getLong("commission_pct"));
        employees.setDepartment_id(rs.getInt("department_id"));
        employees.setEmployee_id(rs.getInt("employee_id"));
        employees.setFirst_name(rs.getString("first_name"));
        employees.setLast_name(rs.getString("last_name"));
        employees.setEmail(rs.getString("email"));
        employees.setPhone_number(rs.getString("phone_number"));
        employees.setHire_date(rs.getDate("hire_date"));
        employees.setJob_id(rs.getString("job_id"));
        employees.setSalary(rs.getLong("salary"));
        employees.setManager_id(rs.getInt("manager_id"));
        return employees;

    }

}
