package com.example.hunnydates;

import android.net.Uri;

public final class CurrentUser {
    private static CurrentUser currentUser = new CurrentUser();

    private String displayName = null;
    private String givenName = null;
    private String familyName = null;
    private String email = null;
    private String accountID = null;
    private Uri photoURL = null;

    private CurrentUser() {}

    public static CurrentUser getInstance() {
        return currentUser;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public Uri getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(Uri photoURL) {
        this.photoURL = photoURL;
    }

}
