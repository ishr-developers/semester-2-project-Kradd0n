package com.philipraschle.itgradedapp.ChallengeResponse;

//@Generated("com.robohorse.robopojogenerator")
public class MetadataItem {

    //@SerializedName("key")
    private String key;

    //@SerializedName("value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "MetadataItem{" +
                        "key = '" + key + '\'' +
                        ",value = '" + value + '\'' +
                        "}";
    }
}