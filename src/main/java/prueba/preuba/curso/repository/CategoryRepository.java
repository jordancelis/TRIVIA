package prueba.preuba.curso.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import prueba.preuba.curso.entities.Category;

@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Category finById(Long id){
        return entityManager.find(Category.class, id);

    }
}
