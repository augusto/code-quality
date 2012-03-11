package org.workshop.code.coupling.is_this_low;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Client {

    @Test
    public void calculate_net_price() {
        double expectedNetPrice = 10;
        double grossPrice =  10 + 2;
        double vat = 0.20;

        VATService vatService = new VATService();
        vatService.setVatRate(vat);

        double actualNetPrice = vatService.vatFromGrossPrice(grossPrice);
        assertThat(actualNetPrice, equalTo(expectedNetPrice));
    }
}
