package com.andresVelez.mall.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Mall {
    public static final byte CAPACITY = 50; //static se puede utilizar en la misma clase pero final es constante
    private String name;
    private List<Store> stores;

    public Mall(String name) {
        this.name = name;
        this.stores = new ArrayList<>();
    }

    public boolean openStore(long storeCode, String storeName) {
        Store store = this.findStoreByCode(storeCode);

        if (this.stores.size() < CAPACITY && store == null) {
            Store storeToAdd = new Store(storeCode, storeName);
            this.stores.add(storeToAdd);
            return true;
        }

        return false;
    }

    public void closeStore(long storeCode) {
        Store store = this.findStoreByCode(storeCode);

        if (store != null) {
            this.stores.remove(store);
        } else {
            System.out.println("La tienda con codigo " + storeCode + " no existe.");
        }
    }

    public Store findStoreByName(String storeName) {
        return this.stores.stream()
                .filter(st -> st.getName().equals(storeName))
                .findFirst()
                .orElse(null);
    }

    public Store findStoreByCode(long storeCode) {
        Store storeToReturn = null;

        for (Store store : this.stores) {
            if (store.getCode() == storeCode) {
                storeToReturn = store;
                break;
            }
        }

        return storeToReturn;
    }

    public List<Store> findStores(String category) {
        return null;
    }

    public List<Store> findStoresWithTwoOrMoreCategories() {
        List<Store> storesWithTwoOrMoreCat = new ArrayList<>();

        for (Store store : this.stores) {
            if (store.getCategories().size() >= 2) {
                storesWithTwoOrMoreCat.add(store);
            }
        }

        return storesWithTwoOrMoreCat;

//        return this.stores.stream()
//                .filter(st -> st.getCategories().size() > 1)
//                .collect(Collectors.toList());
    }

    public void orderStoresByName() {
        //this.stores.stream().sorted(Comparator.comparing(Store::getName));
        this.stores.sort(Comparator.comparing(Store::getName));
    }

    public String getName() {
        return name;
    }

    public List<Store> getStores() {
        return stores;
    }
}
