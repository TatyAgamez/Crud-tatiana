package corp.hr.data.controler;

import corp.hr.data.dto.Employees;
import corp.hr.data.exception.ServiceException;
import corp.hr.data.service.ServiceEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/hr")
public class ControlerEmployees {
    @Autowired
    private ServiceEmployees service;

    @PostMapping(path="/saveEmployees")
    public ResponseEntity<Employees> saveEmployees (@RequestBody Employees employees) {
        try{
            service.save(employees);
        }catch (ServiceException se){
            se.printStackTrace();
        }

        return  ResponseEntity.ok(employees);
    }

    @PostMapping(path="/getAllEmployees")
    public ResponseEntity<List<Employees> > getAll () {
        List<Employees> listaRetorno=null;
        try{
            listaRetorno= service.getAll();
        }catch (ServiceException se){
            se.printStackTrace();
        }

        return  ResponseEntity.ok(listaRetorno);
    }
    @PutMapping(path = "/updateEmployees")
    public ResponseEntity<Employees>   updateEmployees (@RequestBody Employees employees) {
        try{
            serv.(employees);
        }catch (ServiceException se){
            se.printStackTrace();
        }

        return  ResponseEntity.ok(employees);
    }

}
