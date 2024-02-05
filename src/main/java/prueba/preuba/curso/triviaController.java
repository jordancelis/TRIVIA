package prueba.preuba.curso;


import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prueba.preuba.curso.entities.Category;
import prueba.preuba.curso.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class triviaController {
    @Autowired
    CategoryRepository categoryRepository;



    @GetMapping("/sapo/{id}")
    public Category prubea(@PathVariable Long id){

        return  categoryRepository.finById(id);
    }

        @GetMapping("/question/{categoria}")
        public Category getQuestions(@PathVariable String categoria) {

            List<Category> resultado = new ArrayList<>();
            Category ejemplo  = categoryRepository.finById(1L);
            resultado.add(ejemplo);
            return ejemplo;
        }



        @GetMapping("/categories")
        public Category[] getCategories(){

            Category cat = new Category();
            cat.setName("Arte");
            cat.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

            Category cat2 = new Category();
            cat2.setName("Deportes");
            cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

            Category[] Categori = new Category[2];
            Categori[0] = cat;
            Categori[1] = cat2;
            return Categori;


           /* return  "[\n" +
                    "  {\n" +
                    "    \"category\": \"Prueba\",\n" +
                    "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Deportes\",\n" +
                    "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Arte\",\n" +
                    "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Cine\",\n" +
                    "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Historia\",\n" +
                    "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"category\": \"Ciencia\",\n" +
                    "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                    "  }\n" +
                    "]";*/
        }
    }


