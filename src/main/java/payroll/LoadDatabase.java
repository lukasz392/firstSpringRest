package payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Autowired
    EmployeeRepository repository;

    @Bean
    @Autowired
    public void initDatabase() {
        log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
        log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "theft")));
    }
}
