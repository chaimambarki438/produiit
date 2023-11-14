package com.chaima.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.chaima.produits.entities.Categorie;

@RepositoryRestResource(path = "cat")
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
