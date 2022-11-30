package com.apiunicred.apispringunicred.repository;

import com.apiunicred.apispringunicred.banco.RootResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface XmlToObjRepository extends MongoRepository<RootResponse, String> {
}
