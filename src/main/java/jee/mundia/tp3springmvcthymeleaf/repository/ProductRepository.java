package jee.mundia.tp3springmvcthymeleaf.repository;

import jee.mundia.tp3springmvcthymeleaf.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
