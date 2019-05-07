package com.philipraschle.itgradedapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.philipraschle.itgradedapp.ChallengeResponse.ItemsItem;
import com.philipraschle.itgradedapp.ChallengeResponse.MetadataItem;
import com.philipraschle.itgradedapp.ChallengeResponse.Response;

import java.util.List;


public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ChallengeViewHolder> {

    public Response responseObject;
    public ChallengeAdapter(Response response) {
        responseObject = response;
    }

    @NonNull
    @Override
    public ChallengeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.challenge_list_item, viewGroup, false);


        return new ChallengeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengeViewHolder challengeViewHolder, int i) {
        List<ItemsItem> listOfItems = responseObject.getItems();

        ItemsItem challenge = listOfItems.get(i);
        List<MetadataItem> metadataItemList = challenge.getMetadata();

        for (MetadataItem metadata : metadataItemList){
            if(metadata.getKey() == "name"){
                challengeViewHolder.challengeTextView.setText(metadata.getValue());
            }

        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ChallengeViewHolder extends RecyclerView.ViewHolder {
        TextView challengeTextView;

        public ChallengeViewHolder(@NonNull View itemView) {
            super(itemView);
            challengeTextView = itemView.findViewById(R.id.tv_challengetext);
        }
    }
}
