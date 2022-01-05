package ferrari_authorised_dealer.api.controller;

import ferrari_authorised_dealer.api.converter.Converter;
import ferrari_authorised_dealer.api.dto.AuthorisedDealerDto;
import ferrari_authorised_dealer.business.AuthorisedDealerService;
import ferrari_authorised_dealer.business.EntityStateException;
import ferrari_authorised_dealer.domain.AuthorisedDealer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestController
public class AuthorisedDealerController {

    private final AuthorisedDealerService authorisedDealerService;

    public AuthorisedDealerController(AuthorisedDealerService authorisedDealerService) {
        this.authorisedDealerService = authorisedDealerService;
    }


    @PostMapping("/authorisedDealer")
    public void create(@RequestBody AuthorisedDealerDto authorisedDealer) throws EntityStateException {
        try {
            authorisedDealerService.create(Converter.fromDto(authorisedDealer));
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/authorisedDealer")
    public Collection<AuthorisedDealerDto> readAll() {
        return authorisedDealerService.readAll().stream()
                .map(Converter::toDto).collect(Collectors.toList());
    }

    @GetMapping("/authorisedDealer/{id}")
    public AuthorisedDealerDto readById(@PathVariable String id) {
        try {
            return Converter.toDto(authorisedDealerService.readById(id).orElseThrow());
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/authorisedDealer/{id}")
    public void update(@PathVariable String id, @RequestBody AuthorisedDealerDto authorisedDealer) throws EntityStateException {
        try {
            authorisedDealerService.update(Converter.fromDto(authorisedDealer));
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }


    }

    @DeleteMapping("/authorisedDealer/{id}")
    public void delete(@PathVariable String id) {
        try {
            authorisedDealerService.deleteById(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


}
