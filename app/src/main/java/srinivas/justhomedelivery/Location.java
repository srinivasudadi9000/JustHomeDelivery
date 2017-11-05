package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Location extends Activity implements View.OnClickListener {
    ImageView knife,cart,loc,person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        knife = (ImageView)findViewById(R.id.knife);
        cart = (ImageView)findViewById(R.id.cart);
        loc = (ImageView)findViewById(R.id.loc);
        person = (ImageView)findViewById(R.id.person);
        loc.setImageDrawable(getResources().getDrawable(R.drawable.loc));
        knife.setOnClickListener(Location.this);
        cart.setOnClickListener(Location.this);
        loc.setOnClickListener(Location.this);
        person.setOnClickListener(Location.this);
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.knife:
                knife.setImageDrawable(getResources().getDrawable(R.drawable.knifee));
                Intent cuisine = new Intent(Location.this,Home.class);
                startActivity(cuisine);
                finish();
                break;
            case R.id.cart:
                cart.setImageDrawable(getResources().getDrawable(R.drawable.cartt));
                Intent cart = new Intent(Location.this,Cuisines.class);
                startActivity(cart);
                finish();
                break;
            case R.id.person:
                loc.setImageDrawable(getResources().getDrawable(R.drawable.loc));
                Intent loc = new Intent(Location.this,Contacts.class);
                startActivity(loc);
                finish();
                break;

        }

    }


}
