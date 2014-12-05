package scholars;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.concordion.integration.junit3.ConcordionTestCase;

/* Run this class as a JUnit test. */

public class AthetizationTest extends ConcordionTestCase {
    
    public String getPhrase(String urn) {
        return ("Never looked anything up for urn " + urn);

    }

    public String getTokens(String urn) {
        return ("Never looked anything up for urn " + urn);

    }
}


