package com.sdacademy.otto.joachim.authorisation2app;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import org.fuckboilerplate.rx_social_connect.RxSocialConnect;

import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by RENT on 2017-03-04.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RxSocialConnect.register(this, "encryption key")
                .using(new GsonSpeaker());
    }
}


