package co.com.bancolombia.adapter.store;

import co.com.bancolombia.model.gateway.StoreGateway;
import co.com.bancolombia.model.request.Client;
import co.com.bancolombia.model.request.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StoreAdapter implements StoreGateway {

    List<Client> clientsDB = new ArrayList<>();
    List<Product> productsDB = new ArrayList<>();

    public StoreAdapter() {
        productsDB.add(new Product("Papas","2000"));
        productsDB.add(new Product("Zanahoria","5000"));
        productsDB.add(new Product("Gaseosa","4500"));
    }

    @Override
    public String registrarClient(Client client) {
        clientsDB.add(client);
        return clientsDB.size() + "";
    }

    @Override
    public List<Client> getClient(Client client) {
        return clientsDB;
    }

    @Override
    public List<Product> get(Product p) {
        return productsDB;
    }
}
