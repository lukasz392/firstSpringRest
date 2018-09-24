package payroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    public List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

//    @GetMapping("/employees/{id}")
//    Employee one(@PathVariable Long id){
//        return repository.findById(id).orElseThrow(() -> new EmpoyeeNotFoundException(id));
//    }


}
