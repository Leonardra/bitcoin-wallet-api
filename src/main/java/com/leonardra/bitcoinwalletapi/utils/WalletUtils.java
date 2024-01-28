package com.leonardra.bitcoinwalletapi.utils;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;


public class WalletUtils {

    public static HttpHeaders createHttpHeader(String username, String password){
        String usernamePassword = username+":"+password;
        byte[] bytesEncoded = Base64.encodeBase64(usernamePassword.getBytes(), false);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth(new String(bytesEncoded));
        return httpHeaders;
    }
}
