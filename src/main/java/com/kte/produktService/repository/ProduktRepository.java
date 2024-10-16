package com.kte.produktService.repository;

import com.kte.produktService.model.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktRepository extends JpaRepository<Produkt, Long> {

}
