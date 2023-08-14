package com.springboot.Management.service;

import com.springboot.Management.model.ManagerModel;

import java.util.List;

public interface ManagerService {
    void save(ManagerModel model);
    List<ManagerModel> getAll();
    ManagerModel getOne(Long id);
    void delete(Long id);
}
