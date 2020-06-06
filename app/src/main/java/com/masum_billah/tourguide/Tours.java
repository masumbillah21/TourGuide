package com.masum_billah.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Tours implements Parcelable {
    private String mTitle;
    private String mAddress;
    private String mOpenHour;
    private String mDescription;
    private String mRating;
    private int mImageResourceId;

    public Tours(String title, String address, String openHour, String description, String rating,
                 int imageResourceId) {
        this.mTitle = title;
        this.mAddress = address;
        this.mOpenHour = openHour;
        this.mImageResourceId = imageResourceId;
        this.mDescription = description;
        this.mRating = rating;
    }

    protected Tours(Parcel in) {
        mTitle = in.readString();
        mAddress = in.readString();
        mOpenHour = in.readString();
        mDescription = in.readString();
        mRating = in.readString();
        mImageResourceId = in.readInt();
    }

    public static final Creator<Tours> CREATOR = new Creator<Tours>() {
        @Override
        public Tours createFromParcel(Parcel in) {
            return new Tours(in);
        }

        @Override
        public Tours[] newArray(int size) {
            return new Tours[size];
        }
    };

    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getOpenHour() {
        return mOpenHour;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public String getDescription() { return mDescription; }

    public String getRating() { return mRating; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitle);
        dest.writeString(mAddress);
        dest.writeString(mOpenHour);
        dest.writeString(mDescription);
        dest.writeString(mRating);
        dest.writeInt(mImageResourceId);
    }
}
