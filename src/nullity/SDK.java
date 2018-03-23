package nullity;

import java.util.Objects;

/**
 * The sdk main component which requires the config to perform more actions
 */
public class SDK {
    private SDKConfig sdkConfig;

    public SDK(SDKConfig sdkConfig){
        Objects.requireNonNull(sdkConfig, "SDK config is null");
        Objects.requireNonNull(sdkConfig.getKey(), "The API key cannot be null");
        Objects.requireNonNull(sdkConfig.getSecret(), "The API secret cannot be null");

        this.sdkConfig = sdkConfig;
    }

    // Do whatever you want here ...

}
