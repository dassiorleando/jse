package xyz.dassiorleando.jse.nullity;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Test of NullityProgram
 * @see <a href="http://www.dassiorleando.xyz/jdk-7-objects-class-check-nullity-throw-npe"</a>
 * @author dassiorleando
 */
public class NullityProgramUnitTest {

    @Test
    public void checkGoodSDKConfig() {
        // Let's initiate our SDK config
        SDKConfig sdkConfig = new SDKConfig()
                .secret("my secret")
                .key("my key")
                .version("my version");

        // We build our sdk component
        SDK sdk = sdkConfig.build();

        assertNotNull(sdk);
    }

    @Test(expected = NullPointerException.class)
    public void catchBadSDKConfig() {
        // We instantiate an SDK with a bad config(no secret provided)
        SDKConfig sdkConfig = new SDKConfig()
                // .secret("my secret") -----> We don't send the secret
                .key("my key")
                .version("my version");

        SDK sdk = sdkConfig.build();
    }

}
