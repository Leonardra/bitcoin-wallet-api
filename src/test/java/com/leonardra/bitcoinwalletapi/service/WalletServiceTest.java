package com.leonardra.bitcoinwalletapi.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class WalletServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(WalletServiceTest.class);
    @Autowired
    WalletService walletService;

    @Test
    void createWallet() {
        Map<String, String> walletFromApi = walletService.createWallet("wallet_from_api_2");
        LOG.info("{}", walletFromApi);
    }
}