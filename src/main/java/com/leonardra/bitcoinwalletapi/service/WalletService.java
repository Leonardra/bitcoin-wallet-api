package com.leonardra.bitcoinwalletapi.service;

import org.bitcoinj.base.BitcoinNetwork;

public class WalletService {

    private final BitcoinNetwork bitcoinNetwork;

    public WalletService(BitcoinNetwork bitcoinNetwork) {
        this.bitcoinNetwork = bitcoinNetwork;
    }


}
