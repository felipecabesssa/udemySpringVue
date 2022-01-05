package br.com.tisemcensura.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tisemcensura.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
