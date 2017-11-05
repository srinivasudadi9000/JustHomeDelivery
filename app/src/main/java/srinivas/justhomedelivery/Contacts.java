package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contacts extends Activity implements View.OnClickListener {
    ImageView knife,cart,loc,person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

        knife = (ImageView)findViewById(R.id.knife);
        cart = (ImageView)findViewById(R.id.cart);
        loc = (ImageView)findViewById(R.id.loc);
        person = (ImageView)findViewById(R.id.person);
        person.setImageDrawable(getResources().getDrawable(R.drawable.personn));
        knife.setOnClickListener(Contacts.this);
        cart.setOnClickListener(Contacts.this);
        loc.setOnClickListener(Contacts.this);
        person.setOnClickListener(Contacts.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.knife:
                knife.setImageDrawable(getResources().getDrawable(R.drawable.knifee));
                Intent cuisine = new Intent(Contacts.this,Home.class);
                startActivity(cuisine);
                finish();
                break;
            case R.id.cart:
                cart.setImageDrawable(getResources().getDrawable(R.drawable.cartt));
                Intent cart = new Intent(Contacts.this,Cuisines.class);
                startActivity(cart);
                finish();
                break;

            case R.id.loc:
                person.setImageDrawable(getResources().getDrawable(R.drawable.personn));
                Intent person = new Intent(Contacts.this,Location.class);
                startActivity(person);
                finish();
                break;
        }

    }
}
