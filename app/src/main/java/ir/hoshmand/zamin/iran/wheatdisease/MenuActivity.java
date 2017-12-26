package ir.hoshmand.zamin.iran.wheatdisease;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.clans.fab.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiagnoseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.activities.DiseaseActivity;
import ir.hoshmand.zamin.iran.wheatdisease.adapters.MenuItemsAdapter;
import ir.hoshmand.zamin.iran.wheatdisease.models.DataHandler;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    ImageButton btnBack;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.diseasesRecycler)
    RecyclerView diseasesRecycler;
    @BindView(R.id.fabDiagnos)
    FloatingActionButton fabDiagnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        setDatas();
        new TypeFaceHandler(getAssets());
        setToolbar();
        MenuItemsAdapter adapter = new MenuItemsAdapter(DataHandler.disease, this);
        diseasesRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        diseasesRecycler.setAdapter(adapter);
    }

    private void setToolbar() {
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setText(R.string.title_main_page);
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setTypeface(TypeFaceHandler.sultanBold);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
    }

    private void setDatas() {
        new DataHandler(this);
    }

    @OnClick({R.id.btnBack, R.id.fabDiagnos})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBack:
                finish();
                break;
            case R.id.fabDiagnos:
                startActivity(new Intent(MenuActivity.this, DiagnoseActivity.class));
                break;
        }
    }
}
