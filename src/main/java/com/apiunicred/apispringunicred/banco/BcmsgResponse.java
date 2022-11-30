package com.apiunicred.apispringunicred.banco;

import lombok.*;



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
