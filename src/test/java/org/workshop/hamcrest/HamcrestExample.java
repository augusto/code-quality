package org.workshop.hamcrest;

import junit.framework.Assert;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created with IntelliJ IDEA.
 * User: Augusto
 * Date: 22/04/12
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class HamcrestExample {

    @Test
    public void jUnitAssertion() throws Exception {
        List<String> names = new ArrayList<String>();
        names.add("Augusto");


        Assert.assertEquals(1, names.size());
        Assert.assertTrue(names.size() == 1);
    }

    @Test
    public void hamcrestAssertion() throws Exception {
        List<String> names = new ArrayList<String>();
        names.add("Augusto");


        assertThat(names, hasSize(1));
        assertThat(names.size(), is(1));
        assertThat(names.size(), equalTo(1));
    }


    @Test
    public void jUnitAssertBoolean() throws Exception {
        String osName = System.getProperty("os.name");
        boolean isWindows = osName.contains("Windows");

        Assert.assertTrue(isWindows);
        Assert.assertTrue(osName.contains("Windows"));

    }

    @Test
    public void hamcrestAssertBoolea() throws Exception {
        String osName = System.getProperty("os.name");
        boolean isWindows = osName.contains("Windows");

        assertThat(isWindows, is(true));
        assertThat(osName, containsString("Windows"));
    }


}
