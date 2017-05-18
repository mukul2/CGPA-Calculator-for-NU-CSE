package com.example.mukul.mycgpa;


import android.animation.ValueAnimator;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.SeekBar;
import android.widget.TextView;


import com.github.channguyen.rsv.RangeSliderView;

import java.util.ArrayList;

import belka.us.androidtoggleswitch.widgets.ToggleSwitch;




public class MainActivity extends AppCompatActivity {





    TextView t1,t2,t3,t4,t5,t6,t7,t8;

    float ed1;
    float ed2;
    float ed3;

    TextView tvgpa;
    float oldf=0,newf=0;

    float ed4;
    float ed5;
    float ed6;
    float ed7;
    float ed8;
    float i1;
    String t;
    float  sum,sum1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa);








        t1 =(TextView)findViewById(R.id.tv);
        t2 =(TextView)findViewById(R.id.tv2);
        t3 =(TextView)findViewById(R.id.tv3);
        t4 =(TextView)findViewById(R.id.tv4);
        t5 =(TextView)findViewById(R.id.tv5);
        t6 =(TextView)findViewById(R.id.tv6);
        t7 =(TextView)findViewById(R.id.tv7);
        t8 =(TextView)findViewById(R.id.tv8);


        tvgpa  =(TextView)findViewById(R.id.progress_circle_text);

        SeekBar s = (SeekBar) findViewById(R.id.sb);
        SeekBar s2 = (SeekBar) findViewById(R.id.sb2);
        SeekBar s3 = (SeekBar) findViewById(R.id.sb3);
        SeekBar s4 = (SeekBar) findViewById(R.id.sb4);
        SeekBar s5 = (SeekBar) findViewById(R.id.sb5);
        SeekBar s6 = (SeekBar) findViewById(R.id.sb6);
        SeekBar s7 = (SeekBar) findViewById(R.id.sb7);
        SeekBar s8 = (SeekBar) findViewById(R.id.sb8);

        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                                         @Override
                                         public void onProgressChanged(SeekBar seekBar,
                                                                       int progress, boolean fromUser) {
                                             setEd1(Float.valueOf(calcu(String.valueOf(progress))));
                                             t1.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                                             //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

                                         }

                                         @Override
                                         public void onStartTrackingTouch(SeekBar seekBar) {


                                         }

                                         @Override
                                         public void onStopTrackingTouch(SeekBar seekBar) {

                                         }
                                     });
        s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd2(Float.valueOf(calcu(String.valueOf(progress))));
                t2.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd3(Float.valueOf(calcu(String.valueOf(progress))));
                t3.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd4(Float.valueOf(calcu(String.valueOf(progress))));
                t4.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd5(Float.valueOf(calcu(String.valueOf(progress))));
                t5.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                // Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd6(Float.valueOf(calcu(String.valueOf(progress))));
                t6.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd7(Float.valueOf(calcu(String.valueOf(progress))));
                t7.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress, boolean fromUser) {
                setEd8(Float.valueOf(calcu(String.valueOf(progress))));
                t8.setText(calcu2(progress) + "=" + Float.valueOf(calcu(String.valueOf(progress))));
                //Toast.makeText(getApplicationContext(),String.valueOf(progress),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




































       Button b =(Button)findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                sum = (float) ((Float.valueOf(getEd1())+Float.valueOf(getEd3())+Float.valueOf(getEd4())+Float.valueOf(getEd6())+Float.valueOf(getEd8()))*3+
                                        (Float.valueOf(getEd2())+Float.valueOf(getEd5())+Float.valueOf(getEd7()))*1.5);




                        sum = (float) (sum/19.5);
                sum1  =sum*100/4;



                CircleProgressBar circleProgressBar = (CircleProgressBar) findViewById(R.id.custom_progressBar1);
                circleProgressBar.setProgressWithAnimation( sum1);
                circleProgressBar.setColor(Color.parseColor("#00FA9A"));

                CircleProgressBar circleProgressBar2 = (CircleProgressBar) findViewById(R.id.custom_progressBar2);
                circleProgressBar2.setProgressWithAnimation((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4)));
                circleProgressBar2.setColor(Color.parseColor("#DC143C"));


                CircleProgressBar circleProgressBar3 = (CircleProgressBar) findViewById(R.id.custom_progressBar3);
                circleProgressBar3.setProgressWithAnimation((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.5*4)));
                circleProgressBar3.setColor(Color.CYAN);

                CircleProgressBar circleProgressBar4 = (CircleProgressBar) findViewById(R.id.custom_progressBar4);
                circleProgressBar4.setProgressWithAnimation((float) ((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.5*4))-
                        Float.valueOf(getEd3())*3*100/(19.5*4)));
                // circleProgressBar4.setColor(Color.BLUE);
                circleProgressBar4.setColor(Color.parseColor("#4682B4"));


                CircleProgressBar circleProgressBar5 = (CircleProgressBar) findViewById(R.id.custom_progressBar5);
                circleProgressBar5.setProgressWithAnimation((float) ((float) ((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.5*4))-
                        Float.valueOf(getEd3())*3*100/(19.5*4))-Float.valueOf(getEd4())*3*100/(19.5*4)));
                circleProgressBar5.setColor(Color.MAGENTA);


                CircleProgressBar circleProgressBar6 = (CircleProgressBar) findViewById(R.id.custom_progressBar6);
                circleProgressBar6.setProgressWithAnimation((float) ((float) ((float) ((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.5*4))-
                        Float.valueOf(getEd3())*3*100/(19.5*4))-Float.valueOf(getEd4())*3*100/(19.5*4))-Float.valueOf(getEd5())*1.5*100/(19.5*4)));
                circleProgressBar6.setColor(Color.parseColor("#FFD700"));


                CircleProgressBar circleProgressBar7 = (CircleProgressBar) findViewById(R.id.custom_progressBar7);
                circleProgressBar7.setProgressWithAnimation((float) ((float) ((float) ((float) ((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.5*4))-
                        Float.valueOf(getEd3())*3*100/(19.5*4))-Float.valueOf(getEd4())*3*100/(19.5*4))-Float.valueOf(getEd5())*1.5*100/(19.5*4))-Float.valueOf(getEd6())*3*100/(19.5*4)));
                circleProgressBar7.setColor(Color.parseColor("#FFA07A"));


                CircleProgressBar circleProgressBar8 = (CircleProgressBar) findViewById(R.id.custom_progressBar8);
                circleProgressBar8.setProgressWithAnimation((float) ((float) ((float) ((float) ((float) ((float) (sum1-Float.valueOf(getEd1())*3*100/(19.5*4))-Float.valueOf(getEd2())*1.5*100/(19.54))-
                        Float.valueOf(getEd3())*3*100/(19.5*4))-Float.valueOf(getEd4())*3*100/(19.5*4))-Float.valueOf(getEd5())*1.5*100/(19.5*4))-Float.valueOf(getEd6())*3*100/(19.5*4)-
                        Float.valueOf(getEd7())*1.5*100/(19.5*4)));
                circleProgressBar8.setColor(Color.parseColor("#008080"));











                setNewf(sum);



                ValueAnimator animator = ValueAnimator.ofFloat(getOldf(),getNewf());
                setOldf(sum);
                animator.setDuration(1500);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {
                        //tvgpa.setText(animation.getAnimatedValue().toString());
                        tvgpa.setText(String.format("%.02f", animation.getAnimatedValue()));
                    }
                });
                animator.start();

























            }
        });





    }









    public float getEd1() {
       // Toast.makeText(getApplicationContext(),"from get ed1 " + String.valueOf(ed1),Toast.LENGTH_SHORT).show();

        return ed1;
    }

    public void setEd1(float ed1) {

        this.ed1 = ed1;
    }

    public float getEd2() {
        return ed2;
    }

    public void setEd2(float ed2) {
        this.ed2 = ed2;
    }

    public float getEd3() {
        return ed3;
    }

    public void setEd3(float ed3) {
        this.ed3 = ed3;
    }

    public float getEd4() {
        return ed4;
    }

    public void setEd4(float ed4) {
        this.ed4 = ed4;
    }

    public float getEd5() {
        return ed5;
    }

    public void setEd5(float ed5) {
        this.ed5 = ed5;
    }

    public float getEd6() {
        return ed6;
    }

    public void setEd6(float ed6) {
        this.ed6 = ed6;
    }

    public float getEd7() {
        return ed7;
    }

    public void setEd7(float ed7) {
        this.ed7 = ed7;
    }

    public float getEd8() {
        return ed8;
    }

    public void setEd8(float ed8) {
        this.ed8 = ed8;
    }
    public float getOldf() {
        return oldf;
    }

    public void setOldf(float oldf) {
        this.oldf = oldf;
    }

    public float getNewf() {
        return newf;
    }

    public void setNewf(float newf) {
        this.newf = newf;
    }

    public float calcu(String s1) {

       // Toast.makeText(getApplicationContext(),"from calcu method " + s1,Toast.LENGTH_SHORT).show();





        {
            if (s1.equals("9") )

            {

                i1 = (float) 4.0;
            }

            else if (s1.equals("8"))

            {

                i1 = (float) 3.75;
            }
            else if (s1.equals("7"))

            {

                i1 = (float) 3.50;
            }
            else  if (s1.equals("6") )

            {

                i1 = (float) 3.25;
            }
            else if (s1.equals("5"))

            {

                i1 = (float) 3.0;
            }
            else  if (s1.equals("4"))

            {

                i1 = (float) 2.75;
            }
            else  if (s1.equals("3"))

            {

                i1 = (float) 2.5;
            }else if (s1.equals("2"))

            {

                i1 = (float) 2.25;
            }




            else   if (s1.equals("1") )

            {

                i1 = (float) 2.0;
            }else if (s1.equals("0") )

            {

                i1 = (float) 0;
            }

            return i1;


        }}
    public String calcu2(int j) {

        // Toast.makeText(getApplicationContext(),"from calcu method " + s1,Toast.LENGTH_SHORT).show();





        {
            if (j==0 )

            {

               t ="F";
            }

            else if (j==1 )

            {
                t ="D";

            }
            else if (j==2 )

            {
                t ="C";

            }
            else  if (j==3 )

            {
                t ="C+";

            }
            else if (j==4 )

            {
                t ="B-";

            }
            else  if (j==5 )

            {

                t ="B";

            }
            else  if (j==6 )

            {
                t ="B+";

            }else if (j==7 )

            {
                t ="A-";

            }




            else   if (j==8 )

            {
                t ="A";


            }
            else   if (j==9 )

            {
                t ="A+";


            }

            return t;


        }


    }










}
