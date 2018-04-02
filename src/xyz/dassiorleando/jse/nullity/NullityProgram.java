package xyz.dassiorleando.jse.nullity;

/**
 * @see <a href="http://www.dassiorleando.xyz/jdk-7-objects-class-check-nullity-throw-npe"</a>
 * @author dassiorleando
 */
public class NullityProgram {

    /**
     * Catch unspecified parameters and throw an exception
     * @param args
     */
    public static void main(String[] args) {
        // Let's initiate our SDK config
        SDKConfig sdkConfig = new SDKConfig()
                .secret("my secret")
                .key("my key")
                .version("my version");

        // We build our sdk component
        SDK sdk = sdkConfig.build();

        System.out.println(String.valueOf(sdk.sdkConfig2.getKey()));
    }

}
