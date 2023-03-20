package com.andresVelez.mall.app;

import com.andresVelez.mall.domain.Mall;
import com.andresVelez.mall.domain.Store;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppMall {
    public static void main(String[] args) {
        Mall mall = new Mall("San Nicolas");

        Store adidas = new Store(1, "Adidas");
        Store frisby = new Store(2, "Frisby");
        Store outlet = new Store(3, "Outlet");
        Store macdonals = new Store(4, "Macdonals");
        Store nike = new Store(5, "Nike");

        mall.getStores().add(adidas);
        mall.getStores().add(frisby);
        mall.getStores().add(outlet);
        mall.getStores().add(macdonals);
        mall.getStores().add(nike);

        mall.getStores().forEach(store -> {
            System.out.println(store.getName());
        });

        mall.getStores().stream().sorted(Comparator.comparing(Store::getName).reversed());

        for (Store tienda : mall.getStores()) {
            System.out.println(tienda.getName());
        }

        for (int i = 0; i < mall.getStores().size(); i++) {
            System.out.println(mall.getStores().get(i));
        }






    }
}
