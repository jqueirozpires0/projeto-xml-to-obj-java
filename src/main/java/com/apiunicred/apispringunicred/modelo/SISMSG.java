package com.apiunicred.apispringunicred.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SISMSG {
    @JsonProperty("SLC0001")
    SLC0001 SLC0001;
}
