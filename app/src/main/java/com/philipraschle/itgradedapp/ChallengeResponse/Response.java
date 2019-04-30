package com.philipraschle.itgradedapp.ChallengeResponse;

import java.util.List;

//@Generated("com.robohorse.robopojogenerator")
public class Response {

    //@SerializedName("items")
    private List<ItemsItem> items;

    public List<ItemsItem> getItems() {
        return items;
    }

    public void setItems(List<ItemsItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "items = '" + items + '\'' +
                        "}";
    }
}