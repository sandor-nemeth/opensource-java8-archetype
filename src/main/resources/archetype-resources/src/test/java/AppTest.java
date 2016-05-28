#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package};

import java.lang.reflect.Constructor;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        App.main();
    }

    @Test
    public void hasPrivateConstructor() throws Exception {
        Constructor<App> cnr = App.class.getDeclaredConstructor();
        assertThat(cnr, notNullValue());
        cnr.setAccessible(true);
        cnr.newInstance();
    }
}
