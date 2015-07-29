package com.john.appi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by root on 7/29/15.
 */
public class MyIntro extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {



        /*
        Add your slide's fragments here
        AppIntro will automatically generate the dots indicator and buttons.

        */

//        addSlide(R.layout.slide1);
//        addSlide(R.layout.slide2);
//        addSlide(R.layout.slide3);


      /*
        Instead of fragments, you can also use our default slide
       Just set a title, description, background and image. AppIntro will do the rest
        */

        addSlide(AppIntroFragment.newInstance("slide1", "thi is my slide booyah",R.drawable.image1,R.color.material_blue_grey_800));
        addSlide(AppIntroFragment.newInstance("slide2", "this is my slide 2 booyah",R.drawable.image2,R.color.material_blue_grey_800));

        // OPTIONAL METHODS
        // Override bar/separator color
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
        // Do something when users tap on Done button.
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}