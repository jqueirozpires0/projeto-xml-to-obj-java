package com.apiunicred.apispringunicred.banco;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
@Builder
public class SLC0001Response {
    private String CodMsg;
    private double NumCtrlSLC;
    private int ISPBIF;
    private String TpInf;
    LiquidResponse Grupo_SLC0001_Liquid;
    private Date DtHrSLC;
    private Date DtMovto;
}
