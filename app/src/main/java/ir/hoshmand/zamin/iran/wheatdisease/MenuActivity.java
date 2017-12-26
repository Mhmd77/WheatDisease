package ir.hoshmand.zamin.iran.wheatdisease;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    ImageButton btnBack;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.diseasesRecycler)
    RecyclerView diseasesRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBack)
    public void onViewClicked() {
    }
}
