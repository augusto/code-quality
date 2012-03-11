package org.workshop.code.coupling.is_this_low;

public class VATService {
    private double vat;

    public VATService() {

    }

    public void setVatRate(double vat) {
        this.vat = vat;
    }

    public double vatFromGrossPrice( double grossPrice) {
        return grossPrice / (1+vat);
    }
}
