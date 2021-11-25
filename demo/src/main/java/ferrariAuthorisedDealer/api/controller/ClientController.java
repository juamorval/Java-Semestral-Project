package ferrariAuthorisedDealer.api.controller;


import ferrariAuthorisedDealer.business.ClientService;
import ferrariAuthorisedDealer.business.EntityStateException;
import ferrariAuthorisedDealer.domain.Client;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/client")
    public void create(@RequestBody Client client) throws EntityStateException {
        clientService.create(client);
    }

    @GetMapping("/client")
    public Collection<Client> readAll() {
        return clientService.readAll();
    }

    @GetMapping("/client/{id}")
    public Client readById(@PathVariable String id) {
        return clientService.readById(id).orElseThrow();
    }

    @PutMapping("/client/{id}")
    public void update(@PathVariable String id, @RequestBody Client client) throws EntityStateException {
        clientService.update(client);
    }

    @DeleteMapping("/client/{id}")
    public void delete(@PathVariable String id) {
        clientService.deleteById(id);
    }
}
