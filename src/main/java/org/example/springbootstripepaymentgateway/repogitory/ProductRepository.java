package org.example.springbootstripepaymentgateway.repogitory;

import org.example.springbootstripepaymentgateway.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
