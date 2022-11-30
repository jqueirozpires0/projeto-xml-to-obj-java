package com.apiunicred.apispringunicred.banco;

import com.apiunicred.apispringunicred.modelo.SLC0001;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SismsgResponse {
    SLC0001Response SLC0001;
}
