package net.greenrivertech.bdizzle.tsarandomizer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static Random rnd = new Random();
    ImageButton arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrow = (ImageButton) findViewById(R.id.arrowBtn);
    }

    /** Called when the user touches the arrow button */
    public void arrowClicked(View view) {
        if(getRandomBoolean()){
            arrow.setImageResource(R.drawable.arrow1);
        } else {
            arrow.setImageResource(R.drawable.arrow2);
        }
        startTimer();
    }

    public static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }

    public void startTimer() {
        new CountDownTimer(4000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                arrow.setImageResource(0);
            }
        }.start();
    }

}
