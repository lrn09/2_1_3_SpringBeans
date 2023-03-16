package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public Animal dog() {
        return new Dog();
    }

    @Bean
    public AnimalsCage animalsCage() {
        return new AnimalsCage();
    }

    @Bean
    public Timer timer() {
        return new Timer();
    }
}
