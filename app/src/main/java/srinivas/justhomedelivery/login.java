package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login extends Activity implements View.OnClickListener {
    EditText password_etv,email_etv;
    TextView signup_tv,google_tv,forgot_tv;
    Button login_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        password_etv = (EditText) findViewById(R.id.password_etv);
        email_etv = (EditText) findViewById(R.id.email_etv);
        signup_tv = (TextView) findViewById(R.id.signup_tv);
        google_tv = (TextView) findViewById(R.id.google_tv);
        forgot_tv = (TextView) findViewById(R.id.forgot_tv);
        login_bt  = (Button)findViewById(R.id.login_bt);
        login_bt.setOnClickListener(login.this);
        google_tv.setOnClickListener(login.this);
        forgot_tv.setOnClickListener(login.this);
        signup_tv.setOnClickListener(login.this);
     }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.google_tv:
                break;
            case R.id.signup_tv:
                break;
            case R.id.login_bt:
                Intent login = new Intent(getApplicationContext(),Home.class);
                startActivity(login);
                finish();
                break;
        }
    }
}
