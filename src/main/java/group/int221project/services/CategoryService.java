package group.int221project.services;

import group.int221project.entities.Category;
import group.int221project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Integer categoryId){
        return categoryRepository.findById(categoryId).orElseThrow(
                () -> new ResourceNotFoundException(categoryId + " does not exist ")
        );
    }
}
