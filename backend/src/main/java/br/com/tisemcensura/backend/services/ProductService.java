package br.com.tisemcensura.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tisemcensura.backend.entities.Product;
import br.com.tisemcensura.backend.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Optional<Product> findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj;
	}

	public Product save(Product product) {
		return repository.save(product);
	}
	
	public Product update(Product Product, Long id) {
		Product.setId(id);
		return repository.save(Product);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}


}
