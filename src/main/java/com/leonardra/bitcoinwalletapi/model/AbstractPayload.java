package com.leonardra.bitcoinwalletapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AbstractPayload {
    @JsonProperty("jsonrpc")
    private String jsonRPCVersion;
    private String id;
    private String method;
    private Object params;
}
