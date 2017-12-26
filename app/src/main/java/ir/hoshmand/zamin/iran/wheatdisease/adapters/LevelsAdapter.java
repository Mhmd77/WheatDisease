package ir.hoshmand.zamin.iran.wheatdisease.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiseaseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;


/**
 * Created by Mohammad on 12/21/2017.
 */

/**
 * Created by Mohammad on 12/19/2017.
 */

public class LevelsAdapter extends RecyclerView.Adapter<LevelsAdapter.ViewHolder> {
    private List<String> levels;
    private DiseaseActivity activity;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtExp;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtExp = (TextView) v.findViewById(R.id.txtTitleText);
        }
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
        notifyDataSetChanged();
    }

    public LevelsAdapter(List<String> myDataset, DiseaseActivity activity) {
        levels = myDataset;
        this.activity = activity;
    }


    @Override
    public LevelsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.title_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.txtExp.setText(levels.get(position));
        holder.txtExp.setTypeface(TypeFaceHandler.bYekanLight);
    }

    @Override
    public int getItemCount() {
        return levels.size();
    }

}


