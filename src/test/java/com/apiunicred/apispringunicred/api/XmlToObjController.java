package com.apiunicred.apispringunicred.api;

import com.apiunicred.apispringunicred.banco.RootResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xml")
public class XmlToObjController {

    @Autowired
    private XmlToObjService xmlToObjService;

    @GetMapping
    public List<RootResponse> obterDoc() {
        return this.xmlToObjService.obterDoc();
    }
}
