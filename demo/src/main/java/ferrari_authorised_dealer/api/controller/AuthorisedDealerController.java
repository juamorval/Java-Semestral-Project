package ferrari_authorised_dealer.api.controller;

import ferrari_authorised_dealer.business.AuthorisedDealerService;
import ferrari_authorised_dealer.business.EntityStateException;
import ferrari_authorised_dealer.domain.AuthorisedDealer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.NoSuchElementException;

@RestController
public class AuthorisedDealerController {

    private final AuthorisedDealerService authorisedDealerService;

    public AuthorisedDealerController(AuthorisedDealerService authorisedDealerService) {
        this.authorisedDealerService = authorisedDealerService;
    }


    @PostMapping("/authorisedDealer")
    public void create(@RequestBody AuthorisedDealer authorisedDealer) throws EntityStateException {
        authorisedDealerService.create(authorisedDealer);
    }

    @GetMapping("/authorisedDealer")
    public Collection<AuthorisedDealer> readAll() {
        return authorisedDealerService.readAll();
    }

    @GetMapping("/authorisedDealer/{id}")
    public AuthorisedDealer readById(@PathVariable String id) {
        try {
            return authorisedDealerService.readById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/authorisedDealer/{id}")
    public void update(@PathVariable String id, @RequestBody AuthorisedDealer authorisedDealer) throws EntityStateException {
        authorisedDealerService.update(authorisedDealer);
    }

    @DeleteMapping("/authorisedDealer/{id}")
    public void delete(@PathVariable String id) {
        authorisedDealerService.deleteById(id);
    }


}
