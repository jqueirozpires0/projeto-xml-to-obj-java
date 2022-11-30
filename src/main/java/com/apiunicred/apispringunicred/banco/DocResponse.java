package com.apiunicred.apispringunicred.banco;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
public class DocResponse {
    private BcmsgResponse BCMSG;
    private SismsgResponse SISMSG;
    public String xmlns;
}
