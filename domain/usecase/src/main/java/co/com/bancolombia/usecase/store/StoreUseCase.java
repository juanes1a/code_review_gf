package co.com.bancolombia.usecase.store;

import co.com.bancolombia.model.gateway.StoreGateway;
import co.com.bancolombia.model.request.Client;
import co.com.bancolombia.model.request.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RequiredArgsConstructor
public class StoreUseCase {
    private final StoreGateway storeGateway;

    public ResponseEntity<String> createClient(Client client) {
        String res = storeGateway.registrarClient(client);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    public ResponseEntity<List<Client>> getAllClientes() {
        var res = storeGateway.getClient(null);
        return res.size() == 0 ?
                new ResponseEntity<>(res, HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(res, HttpStatus.OK);
    }

    public ResponseEntity<List<Product>> gp() {
        var res = storeGateway.get(null);
        return res.size() == 0 ?
                new ResponseEntity<>(res, HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(res, HttpStatus.OK);
    }
}
