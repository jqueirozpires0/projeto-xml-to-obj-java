package com.apiunicred.apispringunicred.api;

import com.apiunicred.apispringunicred.banco.RootResponse;
import com.apiunicred.apispringunicred.repository.XmlToObjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmlToObjServiceImpl implements XmlToObjService {

    @Autowired
    private XmlToObjRepository xmlToObjRepository;

    @Override
    public List<RootResponse> obterDoc() {
        return this.xmlToObjRepository.findAll();
    }
}
