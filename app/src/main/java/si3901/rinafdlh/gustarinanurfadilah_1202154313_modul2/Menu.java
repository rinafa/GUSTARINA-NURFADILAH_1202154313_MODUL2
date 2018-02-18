package si3901.rinafdlh.gustarinanurfadilah_1202154313_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 6; i++){
            foods.add("Bakso Super Urat");
            foods.add("Bakso Super Telur Bebek");
            foods.add("Bakso Super Pedas");
            foods.add("Bakso Super Mozarella");
            foods.add("Bakso Cuanki");
            foods.add("Green Yamin");
            foods.add("Black Yamin");
            foods.add("Pangsit Rebus");
            foods.add("Topping Cekeran");
            foods.add("Topping Tetelan");



            priceses.add(25000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(25000);
            priceses.add(15000);
            priceses.add(16000);
            priceses.add(16000);
            priceses.add(10000);
            priceses.add(10000);
            priceses.add(10000);


            photos.add(R.drawable.baksosuperurat);
            photos.add(R.drawable.baksosupertelurbebek);
            photos.add(R.drawable.baksosuperpedas);
            photos.add(R.drawable.baksosupermozarella);
            photos.add(R.drawable.baksocuanki);
            photos.add(R.drawable.greenyamin);
            photos.add(R.drawable.blackyamin);
            photos.add(R.drawable.pangsitrebus);
            photos.add(R.drawable.toppingcekeran);
            photos.add(R.drawable.toppingtetelan);

        }
    }
}
