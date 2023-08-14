package com.springboot.Management.service;

import com.springboot.Management.model.ManagerModel;
import com.springboot.Management.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerRepository managerRepository;
    @Override
    public void save(ManagerModel model) {
        managerRepository.save(model);
    }

    @Override
    public List<ManagerModel> getAll() {
        return managerRepository.findAll();
    }

    @Override
    public ManagerModel getOne(Long id) {
        return managerRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        managerRepository.deleteById(id);
    }
}
