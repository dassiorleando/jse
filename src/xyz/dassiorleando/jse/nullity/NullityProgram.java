package xyz.dassiorleando.jse.nullity;

/**
 * @author dassiorleando
 */
public class NullityProgram {

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
