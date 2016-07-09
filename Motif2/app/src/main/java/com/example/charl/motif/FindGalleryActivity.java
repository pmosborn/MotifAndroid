package com.example.charl.motif;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;


public class FindGalleryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_gallery);
        //Listener for the ListView in the FindGalleryActivity
        AdapterView.OnItemClickListener listItemClickListener = new AdapterView.OnItemClickListener(){

          //create the onItemClick method
          public void onItemClick(AdapterView<?> listView,
                                  View view,
                                  int listPosition,
                                  long listID){
              if(listPosition == 0){
                  //if the user chooses position 0 create the intent
                  Intent intent = new Intent(FindGalleryActivity.this, GalleryMenuActivity.class);
                  //Send intent to GalleryMenuActivity
                  startActivity(intent);
              }
          }
        };

        //add newly created listener to the ListView
        ListView listView = (ListView) findViewById(R.id.artgallerylist);
        listView.setOnItemClickListener(listItemClickListener);
    }
}
