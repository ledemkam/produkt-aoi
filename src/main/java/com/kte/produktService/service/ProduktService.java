package com.kte.produktService.service;

import com.kte.produktService.model.Produkt;
import com.kte.produktService.repository.ProduktRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProduktService {

    final ProduktRepository produktRepository;

    public List<Produkt> getAllProdukten() {
        return produktRepository.findAll();
    }

    public Produkt addProdukt(Produkt produkt) {
        return produktRepository.save(produkt);
    }

    public Produkt getProduktById(Long id) {
        return produktRepository.findById(id).orElse(null);
    }

    public void updateProdukt(Long id, Produkt produkt) {
        Produkt existingProdukt = getProduktById(id);
        if (existingProdukt != null) {
            existingProdukt.setName(produkt.getName());
            existingProdukt.setPrice(produkt.getPrice());
            produktRepository.save(existingProdukt);
        }

    }

    public void deleteProdukt(Long id) {
        produktRepository.deleteById(id);
    }
}
