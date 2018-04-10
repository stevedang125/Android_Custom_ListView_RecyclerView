package com.steve.transactionlayoutcustomlistview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // vars:
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    EditText editText_get_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started onCreate!");

        initImageBitmaps();

        Button addButton = (Button)findViewById(R.id.button_add_person);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                final View dialogView = inflater.inflate(R.layout.add_person_layout,null);

                builder.setView(dialogView);

                builder.setTitle("Add Person");





                // Set the positive button
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                // Set the negative button
                builder.setNegativeButton("Cancel", null);

                // Create the alert dialog
                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

                // Get the alert dialog buttons reference
                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);


                // Change the alert dialog buttons text and background color
                positiveButton.setTextColor(Color.parseColor("#FF0B8B42"));
                positiveButton.setBackgroundColor(Color.parseColor("#FFE1FCEA"));

                negativeButton.setTextColor(Color.parseColor("#FFFF0400"));
                negativeButton.setBackgroundColor(Color.parseColor("#FFFCB9B7"));


                editText_get_names = (EditText)dialogView.findViewById(R.id.editText_add_name);

                Button keep_adding = (Button)dialogView.findViewById(R.id.button_keep_adding);
                keep_adding.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("====== Keep adding button clicked!! ========== ");
                        System.out.println(editText_get_names.getText().toString());
                        System.out.println("====== Keep adding button clicked!! ========== ");

                        mImageUrls.add("");
                        mNames.add(editText_get_names.getText().toString());

                        Toast.makeText(MainActivity.this , editText_get_names.getText().toString()+" added!" , Toast.LENGTH_SHORT).show();

                        editText_get_names.setText(null);

                    }
                });

            }
        });


        ListView listViewItems = (ListView) findViewById(R.id.vertical_list_item_price_name);

        Transaction step_fart_nee = new Transaction("banana", "step_fart_nee", "$34.9");
        Transaction john = new Transaction("egg", "john", "$3.9");
        Transaction steve = new Transaction("beer", "steve", "$4.89");
        Transaction abe = new Transaction("steak", "abe", "$5.93");
        Transaction dita = new Transaction("banana", "dita", "$6.88");
        Transaction jordan = new Transaction("banana", "jordan", "$23.4");
        Transaction joshua = new Transaction("steak", "joshua", "$12.3");
        Transaction subhash = new Transaction("egg", "subhash", "$6.7");
        Transaction steven = new Transaction("beer", "steven", "$21.3");
        Transaction biem = new Transaction("banana", "biem", "$43.2");
        Transaction no_name = new Transaction("steak", "no_name", "$89.2");

// //     Objects with empty names:
//        Transaction step_fart_nee = new Transaction("banana", "", "34.9");
//        Transaction john = new Transaction("egg", "", "3.9");
//        Transaction steve = new Transaction("beer", "", "4.89");
//        Transaction abe = new Transaction("steak", "", "5.93");
//        Transaction dita = new Transaction("banana", "", "6.88");
//        Transaction jordan = new Transaction("banana", "", "23.4");
//        Transaction joshua = new Transaction("steak", "", "12.3");
//        Transaction subhash = new Transaction("egg", "", "6.7");
//        Transaction steven = new Transaction("beer", "", "21.3");
//        Transaction biem = new Transaction("banana", "", "43.2");
//        Transaction no_name = new Transaction("steak", "", "89.2");


        // Add transactions to the arraylist: take Transactions objects
        ArrayList<Transaction> transactionList = new ArrayList<>();
        transactionList.add(step_fart_nee );
        transactionList.add(john );
        transactionList.add(steve );
        transactionList.add(abe );
        transactionList.add(dita );
        transactionList.add(jordan );
        transactionList.add(joshua );
        transactionList.add(subhash );
        transactionList.add(biem );
        transactionList.add(no_name );

        // take in the context, custom layout that made, arraylist(which is transactionList)
        TransactionListAdapter adapter = new TransactionListAdapter(this, R.layout.adapter_view_layout, transactionList);
        listViewItems.setAdapter(adapter);


    }
    
    private void initImageBitmaps(){

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

//        mImageUrls.add("");
//        mNames.add("Steve");
//
//        mImageUrls.add("");
//        mNames.add("Abe");

//        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
//        mNames.add("Havasu Falls");
//
//        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
//        mNames.add("Trondheim");
//
//        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
//        mNames.add("Portugal");
//
//        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
//        mNames.add("Rocky Mountain National Park");
//
//
//        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
//        mNames.add("Mahahual");
//
//        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
//        mNames.add("Frozen Lake");
//
//
//        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
//        mNames.add("White Sands Desert");
//
//        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
//        mNames.add("Austrailia");
//
//        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
//        mNames.add("Washington");

        initRecyclerView();
        
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");


        LinearLayoutManager layoutManager = new LinearLayoutManager( MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.horizontal_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);


    }


}

