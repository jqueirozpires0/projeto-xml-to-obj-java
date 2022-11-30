package com.apiunicred.apispringunicred.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Data
@ToString
@Builder

public class Grupo_SLC0001_Liquid {
    @JsonProperty("DtLiquid")
    private Date DtLiquid;
    @JsonProperty("NumSeqCicloLiquid")
    private int NumSeqCicloLiquid;
    @JsonProperty("Grupo_SLC0001_Prodt")
    List<Object> Grupo_SLC0001_Prodt;
}