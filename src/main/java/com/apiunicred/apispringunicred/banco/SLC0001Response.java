package com.apiunicred.apispringunicred.banco;

import com.apiunicred.apispringunicred.modelo.Grupo_SLC0001_Liquid;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
