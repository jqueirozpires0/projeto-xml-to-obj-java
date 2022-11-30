package com.apiunicred.apispringunicred;

import com.apiunicred.apispringunicred.banco.*;
import com.apiunicred.apispringunicred.repository.XmlToObjRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;

@SpringBootTest(classes= {ApiSpringUnicredApplication.class})
public class XmlToObjRepositoryTest {
    @Autowired
    private XmlToObjRepository repository;

    @BeforeEach
    public void setUp() {
        repository.deleteAll();
    }

    @Test
    @SneakyThrows
    void RepositoryTypeTest(){
        ConvertXmlToObj obj = new ConvertXmlToObj();
        RootResponse rootResponse = new RootResponse(null, obj.returnObj());
        repository.save(rootResponse);
        Optional<RootResponse> root = repository.findById(rootResponse.getId());

        assertTrue(repository.count() > 0);
        assertTrue(root.isPresent());

    }
}
