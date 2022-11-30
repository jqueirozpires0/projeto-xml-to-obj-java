package com.apiunicred.apispringunicred.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SLC0001 {
    @JsonProperty("CodMsg")
    private String CodMsg;
    @JsonProperty("NumCtrlSLC")
    private double NumCtrlSLC;
    @JsonProperty("ISPBIF")
    private int ISPBIF;
    @JsonProperty("TpInf")
    private String TpInf;
    @JsonProperty("Grupo_SLC0001_Liquid")
    Grupo_SLC0001_Liquid Grupo_SLC0001_Liquid;
    @JsonProperty("DtHrSLC")
    private Date DtHrSLC;
    @JsonProperty("DtMovto")
    private Date DtMovto;
}
