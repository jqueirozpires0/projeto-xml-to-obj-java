package com.apiunicred.apispringunicred.modelo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Getter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DOC {
    @JsonProperty("BCMSG")
    BCMSG BCMSG;
    @JsonProperty("SISMSG")
    SISMSG SISMSG;
    private String xmlns;
}
