package ferrari_authorised_dealer.api.controller;

import ferrari_authorised_dealer.business.EntityStateException;
import ferrari_authorised_dealer.business.SellerService;
import ferrari_authorised_dealer.domain.Seller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.NoSuchElementException;

@RestController
public class SellerController {

    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping("/seller")
    public void create(@RequestBody Seller seller) throws EntityStateException {
        try {
            sellerService.create(seller);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/seller")
    public Collection<Seller> readAll() {
        return sellerService.readAll();
    }

    @GetMapping("/seller/{id}")
    public Seller readById(@PathVariable String id) {
        try {
            return sellerService.readById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/seller/{id}")
    public void update(@PathVariable String id, @RequestBody Seller seller) throws EntityStateException {
        try {
            sellerService.update(seller);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/seller/{id}")
    public void delete(@PathVariable String id) throws Exception {
        try {
            sellerService.deleteById(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
