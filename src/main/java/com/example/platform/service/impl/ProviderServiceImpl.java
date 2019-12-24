package com.example.platform.service.impl;

import com.example.platform.entity.Provider;
import com.example.platform.repository.ProviderRepository;
import com.example.platform.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public List<Provider> getAllProvider() {
        return providerRepository.findAll();
    }

    @Override
    public Provider getProviderById(long id) {
        return providerRepository.findById(id);
    }

    @Override
    public void save(Provider provider) {
        providerRepository.save(provider);
    }

    @Override
    public void edit(Provider provider) {
        providerRepository.save(provider);
    }

    @Override
    public void delete(long id) {
        providerRepository.deleteById(id);
    }
}
