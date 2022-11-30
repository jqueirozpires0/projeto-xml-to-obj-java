package com.apiunicred.apispringunicred.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Grupo_Seq {
    @JsonProperty("NumSeq")
    private int NumSeq;
    @JsonProperty("IndrCont")
    private String IndrCont;
}
