package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cuisines extends Activity implements View.OnClickListener {
    ImageView knife,cart,loc,person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuisiness);
        knife = (ImageView)findViewById(R.id.knife);
        cart = (ImageView)findViewById(R.id.cart);
        loc = (ImageView)findViewById(R.id.loc);
        person = (ImageView)findViewById(R.id.person);
        cart.setImageDrawable(getResources().getDrawable(R.drawable.cartt));
        knife.setOnClickListener(Cuisines.this);
        cart.setOnClickListener(Cuisines.this);
        loc.setOnClickListener(Cuisines.this);
        person.setOnClickListener(Cuisines.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.knife:
                knife.setImageDrawable(getResources().getDrawable(R.drawable.knifee));
                Intent cuisine = new Intent(Cuisines.this,Home.class);
                startActivity(cuisine);
                finish();
                break;

            case R.id.loc:
                loc.setImageDrawable(getResources().getDrawable(R.drawable.loc));
                Intent loc = new Intent(Cuisines.this,Location.class);
                startActivity(loc);
                finish();
                break;
            case R.id.person:
                person.setImageDrawable(getResources().getDrawable(R.drawable.personn));
                Intent person = new Intent(Cuisines.this,Contacts.class);
                startActivity(person);
                finish();
                break;
        }

    }
}
