package com.example.charl.motif;

import android.os.Bundle;

public class GalleryMenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Adding our layout to parent class frame layout (adds navigation drawer).
         */
        getLayoutInflater().inflate(R.layout.activity_gallery_menu, frameLayout);




        //setContentView(R.layout.activity_gallery_menu);
    }
}
