package ir.hoshmand.zamin.iran.wheatdisease.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiagnoseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiseaseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.models.Title;
import ir.hoshmand.zamin.iran.wheatdisease.models.Title;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;


/**
 * Created by Mohammad on 12/21/2017.
 */

/**
 * Created by Mohammad on 12/19/2017.
 */

public class TitlesAdapter extends RecyclerView.Adapter<TitlesAdapter.ViewHolder> {
    private List<Title> titles;
    private DiseaseActivity activity;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView  txtExp;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtExp = (TextView) v.findViewById(R.id.txtTitleText);
        }
    }

    public TitlesAdapter(List<Title> myDataset, DiseaseActivity activity) {
        titles = myDataset;
        this.activity = activity;
    }


    @Override
    public TitlesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.title_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.txtExp.setText(titles.get(position).getName());
        holder.txtExp.setTypeface(TypeFaceHandler.bYekanLight);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                activity.nextQuestion(titles.get(position));
                activity.nextCard(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

}


