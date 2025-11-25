package jee.mundia.tp3springmvcthymeleaf;

import jee.mundia.tp3springmvcthymeleaf.entities.Product;
import jee.mundia.tp3springmvcthymeleaf.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class Tp3SpringMvcThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3SpringMvcThymeleafApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("computer")
                    .price(12000)
                    .quantity(12)
                    .build());
            productRepository.save(Product.builder()
                    .name("printer")
                    .price(4000)
                    .quantity(10)
                    .build());
            productRepository.save(Product.builder()
                    .name("phone")
                    .price(9500)
                    .quantity(20)
                    .build());
            productRepository.findAll().forEach(p-> System.out.println(p.toString()));
        };
    }
}
