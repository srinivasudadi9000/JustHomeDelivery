package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splashscreen extends Activity {
    Animation animation;
    TextView heading_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        heading_tv = (TextView) findViewById(R.id.heading_tv);

        animation = AnimationUtils.loadAnimation(Splashscreen.this,R.anim.zoomin);
        heading_tv.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(Splashscreen.this,login.class);
                startActivity(login);
                finish();
            }
        },2000);
    }
}
