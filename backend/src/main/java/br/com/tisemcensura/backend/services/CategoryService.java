package br.com.tisemcensura.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tisemcensura.backend.entities.Category;
import br.com.tisemcensura.backend.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Optional<Category> findById(Long id){
		Optional<Category> obj = repository.findById(id);
		return obj;
	}
	
	public Category create(Category category) {
		return repository.save(category);
	}
	
	public Category update(Category category, Long id) {
		category.setId(id);
		return repository.save(category);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
