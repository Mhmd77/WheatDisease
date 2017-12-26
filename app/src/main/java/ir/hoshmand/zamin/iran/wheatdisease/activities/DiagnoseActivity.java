package ir.hoshmand.zamin.iran.wheatdisease.activities;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ir.hoshmand.zamin.iran.wheatdisease.R;
import ir.hoshmand.zamin.iran.wheatdisease.adapters.QuestionsAdapter;
import ir.hoshmand.zamin.iran.wheatdisease.models.Answer;
import ir.hoshmand.zamin.iran.wheatdisease.models.Question;
import ir.hoshmand.zamin.iran.wheatdisease.ui.TypeFaceHandler;
import me.grantland.widget.AutofitTextView;

public class DiagnoseActivity extends AppCompatActivity {

    @BindView(R.id.btnBack)
    ImageButton btnBack;
    @BindView(R.id.txtTitleToolbar)
    TextView txtTitleToolbar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.txtQuestion)
    TextView txtQuestion;
    @BindView(R.id.ansRecyclerView)
    RecyclerView ansRecyclerView;
    @BindView(R.id.btnUploadImage)
    Button btnUploadImage;
    @BindView(R.id.txtAns)
    AutofitTextView txtAns;
    @BindView(R.id.ansFlipper)
    ViewFlipper ansFlipper;
    Question question;
    private QuestionsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnose);
        ButterKnife.bind(this);
        setToolbar();
        setData();
        setFonts();
        txtQuestion.setText(question.getQuestion());
        adapter = new QuestionsAdapter(question.getAnswers(), this);
        ansRecyclerView.setAdapter(adapter);
        ansRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setToolbar() {
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setText(R.string.title_diagnose);
        ((TextView) toolbar.findViewById(R.id.txtTitleToolbar)).setTypeface(TypeFaceHandler.sultanBold);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
    }

    private void setFonts() {
        new TypeFaceHandler(getAssets());
        txtQuestion.setTypeface(TypeFaceHandler.bYekanLight);
        txtAns.setTypeface(TypeFaceHandler.bYekanLight);
        btnUploadImage.setTypeface(TypeFaceHandler.sultanBold);
    }

    private void setData() {
        Question q1 = new Question("علایم اولیه بیماری در کدام بخش از گیاه مشاهده می شود؟");
        Question q2 = new Question("آیا علایم اولیه عمدتا در روی برگ و ساقه مشاهده می شود؟ ");
        Question q3 = new Question("آیا علایم اولیه بیماری بصورت جوش (تاول) های زرد، قهوه ای و سیاه در روی برگ و ساقه مشاهده می شوند؟ ");
        Question q4 = new Question("آیا علایم بیماری بصورت لکه های قهوه ای یا آبسوخته دیده می شوند؟ ");
        Question q5 = new Question("آیا علایم اولیه بیماری عمدتا در روی سنبله و دانه مشاهده می شود؟ ");
        Question q6 = new Question("آیا علایم بیماری بصورت سیاه شدن محور سنبله، تیره شدن رنگ سنبله ها، سیاه شدن قسمتی یا تمام محتویات دانه دیده می شود؟ ");
        Question q7 = new Question("آیا علایم بیماری در در اواخر فصل بصورت سبز تیره شدن رنگ سنبله ها و سیاه شدن تمام محتویات دانه در مزرعه ظاهر می شود؟ ");
        Question q8 = new Question("آیا علایم اولیه عمدتا در روی طوقه و ریشه مشاهده می شود؟ ");
        Answer ans1 = new Answer("آیا علایم اولیه عمدتا در روی برگ و ساقه مشاهده می شود ", q2);
        Answer ans2 = new Answer("آیا علایم اولیه عمدتا در روی سنبله و دانه مشاهده می شود  ", q5);
        Answer ans3 = new Answer("آیا علایم اولیه عمدتا در روی طوقه و ریشه مشاهده می شود   ", q8);
        Answer ans4 = new Answer("آیا علایم اولیه بیماری بصورت جوش (تاول) های زرد، قهوه ای و سیاه در روی برگ و ساقه مشاهده می شوند   ", q3);
        Answer ans5 = new Answer("آیا علایم بیماری بصورت پودر سفید رنگ در روی برگ، ساقه و سنبله دیده می شوند", "احتمالاعامل بیماری سفیدک پودری گندم است");
        Answer ans6 = new Answer("آیا علایم بیماری بصورت لکه های قهوه ای یا آبسوخته دیده می شوند", q4);
        Answer ans7 = new Answer("آیا علایم بیماری در اوایل بهار بصورت جوشهای زرد متمایل به نارنجی و به صورت خطی در روی برگ دیده می شوند", "احتمالاعامل بیماری زنگ زرد گندم است");
        Answer ans8 = new Answer("آیا علایم بیماری بصورت جوشهای قهوه ای و بصورت نقطه ای و پراکنده در روی برگ دیده می شوند", "احتمالاعامل بیماری زنگ قهوه ای گندم است");
        Answer ans9 = new Answer("آیا علایم بیماری در اواخر فصل ابتدا بصورت تاولهای قهو ه ای تیره که اپیدرم را پاره نموده و بعدا به رنگ سیاه عمدتا روی ساقه و برگ دیده می شوند", "احتمالاعامل بیماری زنگ سیاه گندم است");
        Answer ans10 = new Answer("آیا علایم بیماری بصورت لکه های قهو ه ای کشیده و بصورت پراکنده در سطح برگ دیده می شوند و در داخل لکه ها  نقاط سیاه رنگی دیده می شود", "احتمالا عامل بیماری سپتوریوز برگ گندم است");
        Answer ans11 = new Answer("آیا علایم بیماری بصورت لکه های قهوه ای روشن با هاله زرد رنگی و به اشکال بیضی شکل دیده می شود و در داخل بافت برگ لکه ای برنزه و به شکل چشم دیده می شود", "احتمالا عامل بیماری لکه خرمایی برگ گندم است");
        Answer ans12 = new Answer("آیا علایم بیماری بصورت لکه های آبسوخته قهوه ای روشن بصورت  نواری در سطح برگ و خوشه دیده می شود و از داخل این لکه ها نور عبور می کند", "احتمالا عامل بیماری لکه نواری باکتریایی گندم است");
        Answer ans13 = new Answer("آیا علایم بیماری بصورت لکه های آبسوخته به رنگ سفید متمایل به قهو ه ای روشن و عمدتا در وسط برگ و یا روی سنبله دیده می شود و در محل آلودگی برگ شکسته می شود", "احتمالا عامل بیماری کپک برفی گندم است");
        Answer ans14 = new Answer("آیا علایم اولیه بیماری بعد از مرحله گل دهی صرفا در روی سنبله بصورت لکه های آبسوخته به رنگ سفید متمایل به قهو ه ای روشن دیده می شود و بعدا در روی لکه ها پودر نارنجی رنگ دیده می شود", "احتمالا عامل بیماری فوزاریوم سنبله گندم است");
        Answer ans15 = new Answer("آیا علایم بیماری بصورت قهوه ای شدن قسمتی از پوشینه یا تمام پوشینه دانه دیده می شود؟ و این قهوه ای شدن عمدتا از قسمت یایین پوشینه شروع می شود و در روی برگ نیز علایم بصورت لکه های نواری دیده می شود", "احتمالا عامل بیماری لکه نواری باکتریایی گندم است");
        Answer ans16 = new Answer("آیا علایم بیماری بصورت قهوه ای شدن قسمتی از پوشینه دانه و ریشکها و گاهی روی برگها دیده می شود؟ و این قهوه ای شدن عمدتا از قسمت بالای پوشینه شروع می شود و در داخل مناطق آلوده نقاط ریز قهوه ای روشن دیده می شود", "احتمالا عامل بیماری سپتوریوز سنبله گندم است");
        Answer ans17 = new Answer("آیا علایم بیماری بصورت سیاه شدن محور سنبله، تیره شدن رنگ سنبله ها، سیاه شدن قسمتی یا تمام محتویات دانه دیده می شود", q6);
        Answer ans18 = new Answer("آیا علایم بیماری در اوایل فصل قبل از گل دهی بصورت سیاه شدن محور اصلی سنبله  در مزرعه ظاهر می شود و و تمام محتویات سنبله از بین رفته و فقط محور سنبله بافی می ماند", "احتمالاعامل بیماری پوسیدگی فوزاریومی طوقه و ریشه گندم است");
        Answer ans19 = new Answer("آیا علایم بیماری در در اواخر فصل بصورت سبز تیره شدن رنگ سنبله ها و سیاه شدن تمام محتویات دانه در مزرعه ظاهر می شود", q7);
        Answer ans20 = new Answer("آیا ارتفاع بو ته های آلوده تقریبا هم اندازه بو ته های سالم هستند", "احتمالا عامل بیماری سیاهک پنهان معمولی گندم است");
        Answer ans21 = new Answer("آیا ارتفاع بوته های آلوده نسبت به بو ته های سالم کوتاه تر هستند", "احتمالا عامل بیماری سیاهک پنهان پا کوتاه گندم است");
        Answer ans22 = new Answer("آیا علایم بیماری بصورت سیاه شدن قسمتی از دانه ها و عمدتا در قسمت شکاف داخلی دانه ها مشاهده می شود", "احتمالا عامل بیماری سیاهک ناقص گندم است");
        Answer ans23 = new Answer("آیا علایم بیماری بصورت تغییر رنگ و سیاه شدن ریشه اصلی ظاهر شده و سایر ریشه های فرعی تغییر رنگ چندانی نمی دهند", "احتمالاعامل بیماری پوسیدگی معمولی ریشه گندم است");
        Answer ans24 = new Answer("آیا علایم بیماری بصورت تغییر رنگ تمام سیستم ریشه ظاهر می شود و ریشه ها و ناحیه طوقه به رنگ قهو ه ای شکلاتی در می آید و بو ته ای آلوده در مزرعه قبل از موعد سفید رنگ می شوند ", "احتمالاعامل بیماری پوسیدگی معمولی ریشه گندم است");
        Answer ans25 = new Answer("آیا علایم بیماری بصورت سفید شدن  قبل از موعد بو ته ها  در مزرعه ظاهر می شود و بوته های به راحتی از خاک کنده می شوند و رنگ ریشه های آلودگی سیاه براق است", "احتمالاعامل بیماری پاخوره گندم است");
        q1.setPrev(null);
        q2.setPrev(q1);
        q3.setPrev(q2);
        q4.setPrev(q2);
        q5.setPrev(q1);
        q6.setPrev(q5);
        q7.setPrev(q6);
        q8.setPrev(q1);
        q1.addAnswers(ans1);
        q1.addAnswers(ans2);
        q1.addAnswers(ans3);
        q2.addAnswers(ans4);
        q2.addAnswers(ans5);
        q2.addAnswers(ans6);
        q3.addAnswers(ans7);
        q3.addAnswers(ans8);
        q3.addAnswers(ans9);
        q4.addAnswers(ans10);
        q4.addAnswers(ans11);
        q4.addAnswers(ans12);
        q4.addAnswers(ans13);
        q5.addAnswers(ans14);
        q5.addAnswers(ans15);
        q5.addAnswers(ans16);
        q5.addAnswers(ans17);
        q6.addAnswers(ans18);
        q6.addAnswers(ans19);
        q7.addAnswers(ans20);
        q7.addAnswers(ans21);
        q7.addAnswers(ans22);
        q8.addAnswers(ans23);
        q8.addAnswers(ans24);
        q8.addAnswers(ans25);
        question = q1;

    }

    public void nextQuestion(Answer answer) {
        if (answer != null && answer.isFinished()) {
            txtAns.setText(answer.getAns());
            ansFlipper.showNext();
        } else {
            txtQuestion.setText(answer.getNextQuestion().getQuestion());
            adapter.setAnswers(answer.getNextQuestion().getAnswers());
            question = answer.getNextQuestion();
        }
    }

    @OnClick({R.id.btnBack, R.id.btnUploadImage})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnBack:

                if (question.getPrev() == null) {
                    finish();
                } else {
                    if (ansFlipper.getDisplayedChild() == 1)
                        ansFlipper.showNext();
                    else
                        question = question.getPrev();
                    txtQuestion.setText(question.getQuestion());
                    adapter.setAnswers(question.getAnswers());
                }

                break;
            case R.id.btnUploadImage:
                Snackbar.make(btnUploadImage, "آپلود عکس", Snackbar.LENGTH_SHORT).show();
                break;
        }
    }
}
