package com.leonardra.bitcoinwalletapi.service;

import com.leonardra.bitcoinwalletapi.model.AbstractPayload;
import com.leonardra.bitcoinwalletapi.utils.WalletUtils;
import org.bitcoinj.base.BitcoinNetwork;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;


@Service
public class WalletService {


    @Value("${node.url}")
    private String url;

    @Value("${node.url}")
    private String username;
    @Value("${node.url}")
    private String password;
    private final RestTemplate restTemplate;

    public WalletService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map createWallet(String walletName){

        AbstractPayload abstractPayload = new AbstractPayload();
        abstractPayload.setJsonRPCVersion("1.0");
        abstractPayload.setId("curltest");
        abstractPayload.setMethod("createwallet");
        abstractPayload.setParams(List.of(walletName));

        HttpHeaders httpHeaders = WalletUtils.createHttpHeader(username, password);

        HttpEntity<AbstractPayload> httpEntity = new HttpEntity<>( abstractPayload, httpHeaders);

        ResponseEntity<Map> exchange = restTemplate.exchange(url, HttpMethod.POST, httpEntity, Map.class);

        return exchange.getBody();
    }


}
