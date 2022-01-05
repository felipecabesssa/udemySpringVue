package br.com.tisemcensura.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tisemcensura.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
