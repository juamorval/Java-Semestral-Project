package ferrari_authorised_dealer.api.controller;


import ferrari_authorised_dealer.business.ClientService;
import ferrari_authorised_dealer.business.EntityStateException;
import ferrari_authorised_dealer.domain.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.NoSuchElementException;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/client")
    public void create(@RequestBody Client client) throws EntityStateException {
        try {
            clientService.create(client);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/client")
    public Collection<Client> readAll() {
        return clientService.readAll();
    }

    @GetMapping("/client/{id}")
    public Client readById(@PathVariable String id) {
        try {
            return clientService.readById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/client/{id}")
    public void update(@PathVariable String id, @RequestBody Client client) throws EntityStateException {
        try {
            clientService.update(client);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/client/{id}")
    public void delete(@PathVariable String id) throws Exception {
        try {
            clientService.deleteById(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
