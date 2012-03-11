package org.workshop.code.coupling.is_this_low_2;

public class PriceService {
    private final static double VAT_RATE = 0.20;


    public PriceBreak priceBreak(double netPrice) {
        PriceBreak priceBreak = new PriceBreak();

        priceBreak.setNet(netPrice);
        priceBreak.setVat( netPrice * VAT_RATE);
        priceBreak.setGross( netPrice * (1 + VAT_RATE) );

        return priceBreak;
    }
}
