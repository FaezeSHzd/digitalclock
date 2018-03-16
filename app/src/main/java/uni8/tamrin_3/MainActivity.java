package uni8.tamrin_3;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface d_n =Typeface.createFromAsset(getAssets(),"fonts/segment7.ttf");
        TextView tv_1 = (TextView)findViewById(R.id.TV_1);
        tv_1.setTypeface(d_n);

       TextView tv_3 = (TextView)findViewById(R.id.TV_3);
        tv_3.setTypeface(d_n);
        TextView tv_5 = (TextView)findViewById(R.id.TV_5);
        tv_5.setTypeface(d_n);

        TextView tv_6 = (TextView)findViewById(R.id.TV_6);
        tv_6.setTypeface(d_n);


        TextView tv_8 = (TextView)findViewById(R.id.TV_8);
        tv_8.setTypeface(d_n);


        TextView tv_10 = (TextView)findViewById(R.id.TV_10);
        tv_10.setTypeface(d_n);

    }}
