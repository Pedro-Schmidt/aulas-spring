package schmidt.pedro.exemploApiH2eMySQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schmidt.pedro.exemploApiH2eMySQL.model.ClientEntity;
import schmidt.pedro.exemploApiH2eMySQL.repository.ClientRepository;

import java.util.List;

//Springboot
@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll() {
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<ClientEntity> findById(@PathVariable("id") long id) {

        if (clientRepository.findById(id).isPresent())
            return new ResponseEntity<ClientEntity>(
                    this.clientRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK);
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    public ResponseEntity<ClientEntity> save(@RequestBody ClientEntity clientEntity) {

        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(), HttpStatus.CREATED);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> update(@PathVariable("id") long id,
                                               @RequestBody ClientEntity pessoaEntity) throws Exception {

        if (id == 0 || !this.clientRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }

        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(pessoaEntity),
                new HttpHeaders(), HttpStatus.OK);

    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<ClientEntity> delete(@PathVariable("id") long id) {

        this.clientRepository.deleteById(id);
        return new ResponseEntity<ClientEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
