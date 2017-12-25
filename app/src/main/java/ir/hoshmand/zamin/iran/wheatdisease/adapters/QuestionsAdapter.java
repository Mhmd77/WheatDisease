package ir.hoshmand.zamin.iran.wheatdisease.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiagnoseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.models.Answer;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;


/**
 * Created by Mohammad on 12/21/2017.
 */

/**
 * Created by Mohammad on 12/19/2017.
 */

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.ViewHolder> {
    private List<Answer> answers;
    private DiagnoseActivity activity;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtId, txtExp;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtId = (TextView) v.findViewById(R.id.txtBugItem);
            txtExp = (TextView) v.findViewById(R.id.txtBugText);
        }
    }

    public QuestionsAdapter(List<Answer> myDataset, DiagnoseActivity activity) {
        answers = myDataset;
        this.activity = activity;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
        notifyDataSetChanged();
    }

    @Override
    public QuestionsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.ans_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.txtId.setText(String.valueOf(position + 1) + "");
        holder.txtId.setTypeface(TypeFaceHandler.bYekanLight);
        holder.txtExp.setText(answers.get(position).getTitle() + "");
        holder.txtExp.setTypeface(TypeFaceHandler.bYekanLight);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.nextQuestion(answers.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return answers.size();
    }

}


