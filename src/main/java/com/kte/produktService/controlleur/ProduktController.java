package com.kte.produktService.controlleur;

import com.kte.produktService.model.Produkt;
import com.kte.produktService.service.ProduktService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produkten")
public class ProduktController {

    final ProduktService produktService;

    @GetMapping("/all")
    public List<Produkt> getAllProdukten() {
        return produktService.getAllProdukten();
    }

    @PostMapping
    public Produkt addProdukt(@RequestBody Produkt produkt) {
        return produktService.addProdukt(produkt);
    }

    @GetMapping("{id}")
    public Produkt getProduktById(@PathVariable Long id) {
        return produktService.getProduktById(id);
    }

    @PutMapping("{id}")
    public void updateProdukt(@PathVariable Long id, @RequestBody Produkt existingProdukt) {
        produktService.updateProdukt(id, existingProdukt);
    }

    @DeleteMapping("{id}")
    public void deleteProdukt(@PathVariable Long id) {
        produktService.deleteProdukt(id);
    }

}
