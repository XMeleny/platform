package com.example.platform.repository;

import com.example.platform.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider,Long> {
    Provider findById(long id);
    Provider findByName(String name);
    void deleteById(long id);

}
