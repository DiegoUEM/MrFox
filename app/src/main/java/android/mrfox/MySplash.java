package android.mrfox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MySplash extends AppCompatActivity {
    ImageView ivSplash;
    RelativeLayout MySplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ivSplash = findViewById(R.id.ivSplash);
        MySplash = findViewById(R.id.MySplash);
        setContentView(R.layout.activity_my_splash);
        //Animation alpha1 = AnimationUtils.loadAnimation(this, R.anim.opacidad);
        //MySplash.startAnimation(alpha1);
        //Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotaciones);
        //MySplash.startAnimation(rotation);

        long SPLASH_SCREEN_SELAY=3000;

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);



        //Animation alpha1 = AnimationUtils.loadAnimation(this, R.anim.opacidad);
        //ivSplash.startAnimation(alpha1);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent().setClass(MySplash.this, MyLogin.class);
                startActivity(mainIntent);

                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_SELAY);
    }
}
