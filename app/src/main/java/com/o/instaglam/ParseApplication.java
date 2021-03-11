package com.o.instaglam;

import android.app.Application;

import com.o.instaglam.data.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fnxpU8KlWuqdfhL8CML4A2QCKvKKF3Pblrp35KEp")
                .clientKey("mDAwB6MyjYE9sFe6Ndo795A0N851FHgcCbqsZELO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
