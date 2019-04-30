package com.philipraschle.itgradedapp.ChallengeResponse;

import java.util.List;

//@Generated("com.robohorse.robopojogenerator")
public class ItemsItem {

    //@SerializedName("metadata")
    private List<MetadataItem> metadata;

    public List<MetadataItem> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return
                "ItemsItem{" +
                        "metadata = '" + metadata + '\'' +
                        "}";
    }
}