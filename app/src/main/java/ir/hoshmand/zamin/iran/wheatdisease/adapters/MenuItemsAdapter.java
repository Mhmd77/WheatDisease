package ir.hoshmand.zamin.iran.wheatdisease.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.models.MenuItem;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;

/**
 * Created by Mohammad on 12/19/2017.
 */

public class MenuItemsAdapter extends RecyclerView.Adapter<MenuItemsAdapter.ViewHolder> {
    private List<MenuItem> values;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtHeader;
        public View layout;
        public ImageView img;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.txtMenuItem);
            img = (ImageView) v.findViewById(R.id.imgMenuItem);
        }
    }

    public MenuItemsAdapter(List<MenuItem> myDataset, Context context) {
        values = myDataset;
        this.context = context;
    }

    @Override
    public MenuItemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.menu_item_layout, parent, false);
        GridLayoutManager.LayoutParams params = (GridLayoutManager.LayoutParams) v.getLayoutParams();
        int height;
        if (context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            height = parent.getMeasuredHeight() / 4;
        else
            height = parent.getMeasuredHeight() / 2;
        params.height = height;
        v.setLayoutParams(params);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final String name = values.get(position).getTitle();
        holder.txtHeader.setText(name);
        holder.txtHeader.setTypeface(TypeFaceHandler.bYekanLight);
        holder.img.setImageDrawable(values.get(position).getImage());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

}

