package srinivas.justhomedelivery;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suri on 05-11-2017.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.Recceholder> {

    private List<Restaurant> reslist;
    private List<Restaurant> reslist_filter;
    private int rowLayout;
    public Context context;
    View view = null;


    public RestaurantAdapter(ArrayList<Restaurant> restaurants, int rowLayout, Context context) {
        this.reslist_filter = restaurants;
        this.reslist = restaurants;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public Recceholder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new Recceholder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(Recceholder holder, int position) {
        holder.outletname_tv.setText(reslist.get(position).getResname().toString());
        Drawable d = context.getResources().getDrawable(reslist.get(position).getImgdrawable());
        holder.imageView.setBackground(d);
        holder.ratingBar.setRating(Float.parseFloat(reslist.get(position).getRating()));
        holder.res_address.setText(reslist.get(position).getAddress());
        holder.km.setText(reslist.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return reslist.size();
    }


    public class Recceholder extends RecyclerView.ViewHolder {
        TextView outletname_tv,res_address,km;
        ImageView imageView;
        RatingBar ratingBar;

        public Recceholder(View itemView) {
            super(itemView);
            km = (TextView) itemView.findViewById(R.id.km);
            ratingBar = (RatingBar) itemView.findViewById(R.id.myratingbar);
            imageView = (ImageView) itemView.findViewById(R.id.man_image);
            outletname_tv = (TextView) itemView.findViewById(R.id.res_name);
            res_address = (TextView) itemView.findViewById(R.id.res_address);
        }
    }

    // Filter Class
    public void filteraddress(String charText) {

        charText = charText.toLowerCase();
        //  Toast.makeText(context,charText.toString(),Toast.LENGTH_SHORT).show();
        // dealerses.clear();
        if (charText.length() == 0) {
            reslist = reslist_filter;
        } else {
            ArrayList<Restaurant> filteredList = new ArrayList<>();
            for (Restaurant resname : reslist) {

                if (resname.getResname().contains(charText)) {
                    filteredList.add(resname);
                }

            }
            reslist = filteredList;
        }
        notifyDataSetChanged();
    }
}
