package com.example.platform.service;

import com.example.platform.entity.Provider;
import java.util.List;

public interface ProviderService {
    public List<Provider> getAllProvider();

    public Provider getProviderById(long id);
    public Provider getProviderByName(String name);

    public void save(Provider provider);
    public void edit(Provider provider);
    public void delete(long id);
}
