package com.apiunicred.apispringunicred.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BCMSG {
    @JsonProperty("IdentdEmissor")
    private int IdentdEmissor;
    @JsonProperty("IdentdDestinatario")
    private int IdentdDestinatario;
    @JsonProperty("Grupo_Seq")
    Grupo_Seq Grupo_Seq;
    @JsonProperty("DomSist")
    private String DomSist;
    @JsonProperty("NUOp")
    private double NUOp;
}