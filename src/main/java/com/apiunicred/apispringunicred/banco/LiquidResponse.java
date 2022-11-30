package com.apiunicred.apispringunicred.banco;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
public class LiquidResponse {
    private Date DtLiquid;
    private int NumSeqCicloLiquid;
    List<Object> Grupo_SLC0001_Prodt;
}
