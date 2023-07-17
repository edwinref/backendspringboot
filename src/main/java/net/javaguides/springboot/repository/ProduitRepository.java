package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
