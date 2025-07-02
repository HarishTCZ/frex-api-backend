package com.example.frex.api.service;

import com.example.frex.api.DAO.FrexDAO;
import com.example.frex.api.model.FrexModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrexService {
    @Autowired
    private FrexDAO frexDAO;

    public List<FrexModel> getAll(){
        return frexDAO.findAll();
    }
}
