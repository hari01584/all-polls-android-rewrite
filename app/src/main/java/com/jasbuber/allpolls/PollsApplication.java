package com.jasbuber.allpolls;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Jasbuber on 16/06/2016.
 */
public class PollsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());
        RealmConfiguration realmConfiguration = new RealmConfiguration.
            Builder().
            deleteRealmIfMigrationNeeded().
            build();
        Realm.setDefaultConfiguration(realmConfiguration);


    }
}
