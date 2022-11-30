package com.apiunicred.apispringunicred.banco;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Grupo_SeqResponse {
    private int NumSeq;
    private String IndrCont;
}
