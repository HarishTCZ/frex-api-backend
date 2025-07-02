package com.example.frex.api.service;

import com.example.frex.api.DAO.FrexDAO;
import com.example.frex.api.DAO.JooqDAO;
import com.example.frex.api.model.FrexModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrexService {
    @Autowired
    private FrexDAO frexDAO;
    @Autowired
    private JooqDAO jooqDAO;

    public List<FrexModel> getAll(){
        return frexDAO.findAll();
    }

    public List<Long> getAllId(){
        return jooqDAO.getAllProducts();
    }
}
