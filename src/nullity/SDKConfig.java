package nullity;

/**
 * Just to illustrate/simulate the sdk
 * The configurations of our sdk go here
 */
public class SDKConfig {
    // Required
    private String key;
    // Required
    private String secret;
    // Optional, the default version will be used(2.0.4)
    private String version;

    public String getKey() {
        return key;
    }

    public SDKConfig key(String key) {
        this.key = key;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public SDKConfig secret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public SDKConfig version(String version) {
        this.version = version;
        return this;
    }

    public SDK build() {
        return new SDK(this);
    }
}
