package ir.hoshmand.zamin.iran.wheatdisease.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.adapters.LevelsAdapter;
import ir.hoshmand.zamin.iran.wheatdisease.adapters.TitlesAdapter;
import ir.hoshmand.zamin.iran.wheatdisease.models.DataHandler;
import ir.hoshmand.zamin.iran.wheatdisease.models.Title;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;

public class DiseaseActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    ImageButton btnBack;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.imageHeader)
    ImageView imageHeader;
    @BindView(R.id.titlesRecyclerView)
    RecyclerView titlesRecyclerView;
    @BindView(R.id.levelsRecyclerView)
    RecyclerView levelsRecyclerView;
    @BindView(R.id.recyclerFlipper)
    ViewFlipper recyclerFlipper;
    private int diseaseID;
    private LevelsAdapter levelsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        ButterKnife.bind(this);
        setToolbar();
        diseaseID = getIntent().getIntExtra("DiseaseID", 0);
        titlesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        levelsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TitlesAdapter titlesAdapter = new TitlesAdapter(DataHandler.disease.get(diseaseID).getTitles(), this);
        levelsAdapter = new LevelsAdapter(null, this);
        titlesRecyclerView.setAdapter(titlesAdapter);
        levelsRecyclerView.setAdapter(levelsAdapter);
        recyclerFlipper.setInAnimation(this, R.anim.grow_from_middle);
        recyclerFlipper.setOutAnimation(this, R.anim.shrink_to_middle);
        imageHeader.setImageDrawable(DataHandler.disease.get(diseaseID).getImage());
    }


    private void setToolbar() {
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setText(DataHandler.disease.get(diseaseID).getName());
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setTypeface(TypeFaceHandler.sultanBold);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        btnBack.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.btnBack)
    public void onViewClicked() {
        if (recyclerFlipper.getDisplayedChild() == 1) {
            recyclerFlipper.showNext();
        } else {
            finish();
        }
    }

    public void nextCard(int posistion) {
        levelsAdapter.setLevels(DataHandler.disease.get(diseaseID).getTitles().get(posistion).getLevels());
        recyclerFlipper.showNext();
    }
}
