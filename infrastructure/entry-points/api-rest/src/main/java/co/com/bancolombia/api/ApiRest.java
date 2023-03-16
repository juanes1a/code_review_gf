package co.com.bancolombia.api;
import co.com.bancolombia.model.request.Client;
import co.com.bancolombia.model.request.Product;
import co.com.bancolombia.usecase.store.StoreUseCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ApiRest {

    private final StoreUseCase useCase;


    @PostMapping(path = "/registerClient")
    public ResponseEntity<String> registerClient(@RequestBody Client client) {
        return useCase.createClient(client);
    }

    @GetMapping(path = "/getClients")
    public ResponseEntity<List<Client>> getC() {
        return useCase.getAllClientes();
    }

    @GetMapping(path = "/getProducts")
    public ResponseEntity<List<Product>> getP() {
        return useCase.gp();
    }
}
