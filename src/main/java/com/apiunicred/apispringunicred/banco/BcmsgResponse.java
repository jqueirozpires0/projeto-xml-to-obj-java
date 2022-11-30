package com.apiunicred.apispringunicred.banco;

import com.apiunicred.apispringunicred.modelo.Grupo_Seq;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;


@Data
@ToString
@Builder
public class BcmsgResponse {
    private int IdentdEmissor;
    private int IdentdDestinatario;
    private Grupo_SeqResponse Grupo_Seq;
    private String DomSist;
    private double NUOp;
}
