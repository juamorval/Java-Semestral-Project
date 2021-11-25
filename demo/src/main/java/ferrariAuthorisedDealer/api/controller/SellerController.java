package ferrariAuthorisedDealer.api.controller;

import ferrariAuthorisedDealer.business.EntityStateException;
import ferrariAuthorisedDealer.business.SellerService;
import ferrariAuthorisedDealer.domain.Seller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SellerController {

    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping("/seller")
    public void create(@RequestBody Seller seller) throws EntityStateException {
        sellerService.create(seller);
    }

    @GetMapping("/seller")
    public Collection<Seller> readAll() {
        return sellerService.readAll();
    }

    @GetMapping("/seller/{id}")
    public Seller readById(@PathVariable String id) {
        return sellerService.readById(id).orElseThrow();
    }

    @PutMapping("/seller/{id}")
    public void update(@PathVariable String id, @RequestBody Seller seller) throws EntityStateException {
        sellerService.update(seller);
    }

    @DeleteMapping("/seller/{id}")
    public void delete(@PathVariable String id) {
        sellerService.deleteById(id);
    }
}
