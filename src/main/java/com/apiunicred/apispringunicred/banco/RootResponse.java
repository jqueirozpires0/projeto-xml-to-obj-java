package com.apiunicred.apispringunicred.banco;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class RootResponse {
    @Id
    private String id;
    private DocResponse DOC;
}
