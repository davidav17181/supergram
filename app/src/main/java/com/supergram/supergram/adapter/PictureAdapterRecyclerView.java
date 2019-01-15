package com.supergram.supergram.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.supergram.supergram.R;
import com.supergram.supergram.model.Picture;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private Context context;

    public PictureAdapterRecyclerView(Context context, ArrayList<Picture> pictures) {
        this.pictures = pictures;
        this.context = context;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_picture, parent, false);

        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
            Picture picture = pictures.get(position);
            holder.imageCard.setBackgroundResource(picture.getPicture());
            holder.usernameCard.setText(picture.getUserName());
            holder.timeCard.setText(picture.getTime());
            holder.likeNumberCard.setText(picture.getLikesNumber());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeNumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            imageCard = (ImageView) itemView.findViewById(R.id.imageCard);
            usernameCard = (TextView) itemView.findViewById(R.id.usernameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likeNumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);


        }
    }
}
