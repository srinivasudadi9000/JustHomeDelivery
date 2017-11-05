package srinivas.justhomedelivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Home extends Activity implements View.OnClickListener {
    ImageView knife,cart,loc,person;
    RecyclerView recee_recyler;
    RestaurantAdapter restaurantAdapter;
    ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    SearchView search_cuisness;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        knife = (ImageView)findViewById(R.id.knife);
        cart = (ImageView)findViewById(R.id.cart);
        loc = (ImageView)findViewById(R.id.loc);
        person = (ImageView)findViewById(R.id.person);
        search_cuisness = (SearchView)findViewById(R.id.search_cuisness);
        recee_recyler = (RecyclerView)findViewById(R.id.restaurant_recyler);
        knife.setImageDrawable(getResources().getDrawable(R.drawable.knifee));
        knife.setOnClickListener(Home.this);
        cart.setOnClickListener(Home.this);
        loc.setOnClickListener(Home.this);
        person.setOnClickListener(Home.this);

        recee_recyler.setLayoutManager(new LinearLayoutManager(this));
        //recee_recyler.addOnItemTouchListener(new Recces_display.DrawerItemClickListener());
        recee_recyler.setHasFixedSize(true);
        recee_recyler.setItemViewCacheSize(20);
        recee_recyler.setDrawingCacheEnabled(true);
        recee_recyler.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        restaurants.add(new Restaurant(R.drawable.image1,"alpha","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","2.5 Km"));
        restaurants.add(new Restaurant(R.drawable.image2,"choppers hub","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","5.5 Km"));
        restaurants.add(new Restaurant(R.drawable.image3,"mediterrian hub","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","2.5 Km"));
        restaurants.add(new Restaurant(R.drawable.image4,"reccet hub","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","5 Km"));
        restaurants.add(new Restaurant(R.drawable.image5,"oaster ","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","4.5 Km"));
        restaurants.add(new Restaurant(R.drawable.image6,"ricky hub","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","3.5 Km"));
        restaurants.add(new Restaurant(R.drawable.image6,"dummy hub","Chandani Chowk ,pune","3.0","8885270193","11:00 am - 12:00 pm","2.5 Km"));
        restaurantAdapter = new RestaurantAdapter(restaurants, R.layout.res_single, getApplicationContext());
        recee_recyler.setAdapter(restaurantAdapter);


        search_cuisness.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                restaurantAdapter.filteraddress(newText.toString());

                // rla.filteraddress(newText.toString());
                return false;

            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.cart:
                cart.setImageDrawable(getResources().getDrawable(R.drawable.cartt));
                Intent cart = new Intent(Home.this,Cuisines.class);
                startActivity(cart);
                finish();
                break;
            case R.id.loc:
                loc.setImageDrawable(getResources().getDrawable(R.drawable.loc));
                Intent loc = new Intent(Home.this,Location.class);
                startActivity(loc);
                finish();
                break;
            case R.id.person:
                person.setImageDrawable(getResources().getDrawable(R.drawable.personn));
                Intent person = new Intent(Home.this,Contacts.class);
                startActivity(person);
                finish();
                break;
        }
    }
}
