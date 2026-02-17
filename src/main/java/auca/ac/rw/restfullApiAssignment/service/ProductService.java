package auca.ac.rw.restfullApiAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import auca.ac.rw.restfullApiAssignment.modal.ecommerce.Product;
import auca.ac.rw.restfullApiAssignment.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;


    public String addNewProduct(Product product) {
      productRepository.save(product);
      return "Product added successfully";
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public String updateProduct(Long id, Product product) {
        Optional<Product> existProduct = productRepository.findById(id);
        if(existProduct.isPresent()) {
            product.setId(id);
            productRepository.save(product);
            return "Product updated successfully";
        }
        return "Product with id " + id + " not found";
    }

    public String deleteProduct(Long id) {
        Optional<Product> existProduct = productRepository.findById(id);
        if(existProduct.isPresent()) {
            productRepository.deleteById(id);
            return "Product deleted successfully";
        }
        return "Product with id " + id + " not found";
    }

    public List<Product> searchBycategory(String categoryName){

        List<Product>products = productRepository.findByCategory(categoryName);

        if (products !=null && !products.isEmpty()) {
            return products;
            
        }
        else{
            return null;
        }
    }

    
}
