package ir.pd.silent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SilentApplication.class, args);
    }

    @Bean
    CommandLineRunner sayHello(){
        return args -> {
            System.out.println("hello");
        };
    }
}
