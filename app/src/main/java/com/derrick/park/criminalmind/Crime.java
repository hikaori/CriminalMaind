package com.derrick.park.criminalmind;

import java.util.Date;
import java.util.UUID;

/**
 * Created by park on 2017-05-31.
 */

public class Crime {
    // UUID is a Java util class included in the Android Framework.
    // It provides an easy way to generage universally unique ID values.
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getSuspect() {

        return mSuspect;
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

}
