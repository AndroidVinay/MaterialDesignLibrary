package com.example.vppl_10132.scrollabletoolbar;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VPPL-10132 on 11/9/2015.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
  public   List<Modelitem> mItems;

    private final String TAG = CardAdapter.class.getSimpleName();

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgThumbnail;
        public TextView tvNature;
        public TextView tvDesNature;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d(TAG, "ViewHolder called");
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvNature = (TextView) itemView.findViewById(R.id.tv_nature);
            tvDesNature = (TextView) itemView.findViewById(R.id.tv_des_nature);
        }
    }

    public CardAdapter() {
        super();
        mItems = new ArrayList<Modelitem>();
        Modelitem nature = new Modelitem();
        nature.setName("The Great Barrier Reef");
        nature.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        nature.setThumbnail(R.drawable.image6);
        mItems.add(nature);

        nature = new Modelitem();
        nature.setName("Grand Canyon");
        nature.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua.");
        nature.setThumbnail(R.drawable.image2);
        mItems.add(nature);

        nature = new Modelitem();
        nature.setName("Baltoro Glacier");
        nature.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis.");
        nature.setThumbnail(R.drawable.image3);
        mItems.add(nature);

        nature = new Modelitem();
        nature.setName("Iguazu Falls");
        nature.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        nature.setThumbnail(R.drawable.image4);
        mItems.add(nature);


        nature = new Modelitem();
        nature.setName("Aurora Borealis");
        nature.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.");
        nature.setThumbnail(R.drawable.image5);
        mItems.add(nature);
    }

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Log.d(TAG,"onCreateViewHolder called");
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycleview_card_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder called");
        Modelitem nature = mItems.get(position);
        holder.tvNature.setText(nature.getName());
        holder.tvDesNature.setText(nature.getDes());
        holder.imgThumbnail.setImageResource(nature.getThumbnail());
        Log.d(TAG, nature.getName() + " , " + nature.getDes() + "");
    }

    @Override
    public int getItemCount() {

        Log.d(TAG,mItems.size()+"");
        return mItems.size();
    }


}
