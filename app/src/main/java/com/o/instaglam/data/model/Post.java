package com.o.instaglam.data.model;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@ParseClassName("Post")
public class Post extends ParseObject{

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED = "createdAt";
    public static final String KEY_AVATAR = "avatar";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parsefile){
        put(KEY_IMAGE,parsefile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

    public ParseFile getAvatar(){ return getParseUser(KEY_USER).getParseFile(KEY_AVATAR);}

    public String getTimestamp() {

        Date today = new Date();
        Date dateRaw = getCreatedAt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat justTime = new SimpleDateFormat("h:mm a");

        String compareDate = dateFormat.format(today);
        String parsedDate = dateFormat.format(dateRaw);

        if (parsedDate.equals(compareDate)){
            return justTime.format(dateRaw);
        }
        return parsedDate;}

        public Date getCreatedAtDate(){
        return getCreatedAt();
        }
}
