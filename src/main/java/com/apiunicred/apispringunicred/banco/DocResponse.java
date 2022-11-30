package com.apiunicred.apispringunicred.banco;

import com.apiunicred.apispringunicred.modelo.BCMSG;
import com.apiunicred.apispringunicred.modelo.SISMSG;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@ToString
@Builder
public class DocResponse {
    private BcmsgResponse BCMSG;
    private SismsgResponse SISMSG;
    public String xmlns;
}
