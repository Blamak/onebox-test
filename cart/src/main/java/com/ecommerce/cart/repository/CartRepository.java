package com.ecommerce.cart.repository;

import org.springframework.stereotype.Repository;

import com.ecommerce.cart.model.Cart;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

@Repository
public class CartRepository {
    
    private final Map<String, Cart> cartStorage = new ConcurrentHashMap<>();

    public void save(Cart cart) {
        cartStorage.put(cart.getId(), cart);
    }

    public Optional<Cart> findById(String cartId) {
        return Optional.ofNullable(cartStorage.get(cartId));
    }

    public void deleteById(String cartId) {
        cartStorage.remove(cartId);
    }

    public List<Cart> findAll() {
        return new ArrayList<>(cartStorage.values());
    }

    public Map<String, Cart> getAllCarts() {
        return Collections.unmodifiableMap(cartStorage);
    }
    
}
