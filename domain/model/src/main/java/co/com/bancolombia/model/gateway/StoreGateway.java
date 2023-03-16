package co.com.bancolombia.model.gateway;

import co.com.bancolombia.model.request.Client;
import co.com.bancolombia.model.request.Product;

import java.util.List;

public interface StoreGateway {
    String registrarClient(Client client);

    List<Client> getClient(Client client);

    List<Product> get(Product p);
}
