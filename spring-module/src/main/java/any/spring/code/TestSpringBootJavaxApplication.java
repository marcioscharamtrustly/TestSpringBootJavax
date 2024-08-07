package any.spring.code;

import any.javax.code.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan(includeFilters = @ComponentScan.Filter(classes = javax.inject.Named.class))
public class TestSpringBootJavaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringBootJavaxApplication.class, args);
    }

    @Autowired
    private Service service;

    @Component
    class CommandLineAppStartupRunner implements CommandLineRunner {

        @Override
        public void run(String... args) {
            System.out.println("sum: " + service.sum());
        }
    }

}
