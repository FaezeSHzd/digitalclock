package faeze_shzd.tamrin_5;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface d_n = Typeface.createFromAsset(getAssets(),"fonts/segment7.ttf");

        ImageButton IB1 = (ImageButton)findViewById(R.id.imgbtn1);
        final EditText ET1=(EditText) findViewById(R.id.Etxt_1);
    //    final EditText ET2=(EditText) findViewById(R.id.Etxt_2);
        final EditText ET3=(EditText) findViewById(R.id.Etxt_3);
      //  final EditText ET4=(EditText) findViewById(R.id.Etxt_4);
        final EditText ET5=(EditText) findViewById(R.id.Etxt_5);


        final MediaPlayer soundsa = MediaPlayer.create(this, R.raw.z_saat);
        final MediaPlayer soundmin = MediaPlayer.create(this, R.raw.z_daghighe);
        final MediaPlayer soundsec = MediaPlayer.create(this, R.raw.z_sanie);
        // SaAt
        final MediaPlayer h1 = MediaPlayer.create(this, R.raw.a_one);
        final MediaPlayer h1_o = MediaPlayer.create(this, R.raw.a_one_o);
        final MediaPlayer h2 = MediaPlayer.create(this, R.raw.b_two);
        final MediaPlayer h2_o = MediaPlayer.create(this, R.raw.b_two_o);
        final MediaPlayer h3 = MediaPlayer.create(this, R.raw.c_three);
        final MediaPlayer h3_o = MediaPlayer.create(this, R.raw.c_three_o);
        final MediaPlayer h4 = MediaPlayer.create(this, R.raw.d_four);
        final MediaPlayer h4_o = MediaPlayer.create(this, R.raw.d_four_o);
        final MediaPlayer h5 = MediaPlayer.create(this, R.raw.e_five);
        final MediaPlayer h5_o = MediaPlayer.create(this, R.raw.e_five_o);
        final MediaPlayer h6= MediaPlayer.create(this, R.raw.f_six);
        final MediaPlayer h6_o = MediaPlayer.create(this, R.raw.f_six_o);
        final MediaPlayer h7 = MediaPlayer.create(this, R.raw.g_seven);
        final MediaPlayer h7_o = MediaPlayer.create(this, R.raw.g_seven_o);
        final MediaPlayer h8 = MediaPlayer.create(this, R.raw.h_eight);
        final MediaPlayer h8_o = MediaPlayer.create(this, R.raw.h_eight_o);
        final MediaPlayer h9 = MediaPlayer.create(this, R.raw.i_nine);
        final MediaPlayer h9_o = MediaPlayer.create(this, R.raw.i_nine_o);
        final MediaPlayer h10 = MediaPlayer.create(this, R.raw.j_ten);
        final MediaPlayer h10_o = MediaPlayer.create(this, R.raw.j_ten_o);
        final MediaPlayer h11 = MediaPlayer.create(this, R.raw.k_eleven);
        final MediaPlayer h11_o = MediaPlayer.create(this, R.raw.k_eleven_o);
        final MediaPlayer h12 = MediaPlayer.create(this, R.raw.l_twelve);
        final MediaPlayer h12_o = MediaPlayer.create(this, R.raw.l_twelve_o);
        final MediaPlayer h13 = MediaPlayer.create(this, R.raw.m_thirteen);
        final MediaPlayer h13_o = MediaPlayer.create(this, R.raw.m_thirteen_o);
        final MediaPlayer h14 = MediaPlayer.create(this, R.raw.n_fourteen);
        final MediaPlayer h14_o = MediaPlayer.create(this, R.raw.n_fourteen_o);
        final MediaPlayer h15 = MediaPlayer.create(this, R.raw.o_fifteen);
        final MediaPlayer h15_o = MediaPlayer.create(this, R.raw.o_fifteen_o);
        final MediaPlayer h16 = MediaPlayer.create(this, R.raw.p_sixteen);
        final MediaPlayer h16_o = MediaPlayer.create(this, R.raw.p_sixteen_o);
        final MediaPlayer h17 = MediaPlayer.create(this, R.raw.q_seventeen);
        final MediaPlayer h17_o = MediaPlayer.create(this, R.raw.q_seventeen_o);
        final MediaPlayer h18 = MediaPlayer.create(this, R.raw.r_eighteen);
        final MediaPlayer h18_o = MediaPlayer.create(this, R.raw.r_eighteen_o);
        final MediaPlayer h19 = MediaPlayer.create(this, R.raw.s_nineteen);
        final MediaPlayer h19_o= MediaPlayer.create(this, R.raw.s_nineteen_o);
        final MediaPlayer h20 = MediaPlayer.create(this, R.raw.t_twenty);
        final MediaPlayer h20_o = MediaPlayer.create(this, R.raw.t_twenty_o);
        final MediaPlayer h21 = MediaPlayer.create(this, R.raw.x_twentyone);
        final MediaPlayer h21_o = MediaPlayer.create(this, R.raw.x_twentyone_o);
        final MediaPlayer h22 = MediaPlayer.create(this, R.raw.xa_twentytwo);
        final MediaPlayer h22_o = MediaPlayer.create(this, R.raw.xa_twentytwo_o);
        final MediaPlayer h23 = MediaPlayer.create(this, R.raw.xb_twentythree);
        final MediaPlayer h23_o = MediaPlayer.create(this, R.raw.xb_twentythree_o);
        final MediaPlayer h24 = MediaPlayer.create(this, R.raw.xc_twentyfour);
        final MediaPlayer h24_o = MediaPlayer.create(this, R.raw.xc_twentyfour_o);
        final MediaPlayer h30 = MediaPlayer.create(this, R.raw.u_thirty);
        final MediaPlayer h30_o = MediaPlayer.create(this, R.raw.u_thirty_o);
        final MediaPlayer h40 = MediaPlayer.create(this, R.raw.v_fourty);
        final MediaPlayer h40_o = MediaPlayer.create(this, R.raw.v_fourty_o);
        final MediaPlayer h50 = MediaPlayer.create(this, R.raw.w_fifty);
        final MediaPlayer h50_o = MediaPlayer.create(this, R.raw.w_fifty_o);


        IB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date date=new Date();
                int H = date.getHours();
                int M=date.getMinutes();
                int S=date.getSeconds();
                ET1.setText( H +" ");
              //  ET2.setText(" : ");
                ET3.setText ( M+ " " );
                //ET4.setText( " : ");
                ET5.setText (S+ " ");





                soundsa.start();
                switch (H) {
                    case 1:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h1.start();
                            }
                        });
                        break;
                    case 2:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h2.start();
                            }
                        });
                        break;
                    case 3:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h3.start();
                            }
                        });
                        break;
                    case 4:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h4.start();
                            }
                        });
                        break;
                    case 5:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h5.start();
                            }
                        });
                        break;
                    case 6:

                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h6.start();
                            }
                        });
                        break;
                    case 7:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h7.start();
                            }
                        });
                        break;
                    case 8:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h8.start();
                            }
                        });
                        break;
                    case 9:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h9.start();
                            }
                        });
                        break;
                    case 10:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h10.start();
                            }
                        });
                        break;
                    case 11:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h11.start();
                            }
                        });
                        break;
                    case 12:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h12.start();
                            }
                        });
                        break;
                    case 13:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h13.start();
                            }
                        });
                        break;
                    case 14:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h14.start();
                            }
                        });
                        break;
                    case 15:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h15.start();
                            }
                        });
                        break;
                    case 16:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h16.start();
                            }
                        });
                        break;
                    case 17:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h17.start();
                            }
                        });
                        break;
                    case 18:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h18.start();
                            }
                        });
                        break;
                    case 19:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h19.start();
                            }
                        });
                        break;
                    case 20:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h20.start();
                            }
                        });
                        break;
                    case 21:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h21.start();
                            }
                        });
                        break;
                    case 22:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h22.start();
                            }
                        });
                        break;
                    case 23:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h23.start();
                            }
                        });
                        break;
                    case 0:
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                h24.start();
                            }
                        });
                        break;
                }

            }
        });

        EditText editText1 = (EditText) findViewById(R.id.Etxt_1);
        editText1.setTypeface(d_n);

        EditText editText3 = (EditText) findViewById(R.id.Etxt_3);
        editText3.setTypeface(d_n);

        EditText editText5 = (EditText) findViewById(R.id.Etxt_5);
        editText5.setTypeface(d_n);



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


    }
}
