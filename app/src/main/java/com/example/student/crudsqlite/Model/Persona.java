package com.example.student.crudsqlite.Model;

/**
 * Created by student on 06.01.2017.
 */

import java.io.Serializable;

/**
 * Created by svd on 26.12.16.
 */

public class Persona implements Serializable {

    private int id;
    private String mName;
    private String mLastName;
    private String mPhoneNumber;
    private String mMail;
    private String mSkype;

    public Persona() {
    }

    public Persona(int id, String mName, String mLastName, String mPhoneNumber, String mMail, String mSkype) {
        this.id = id;
        this.mName = mName;
        this.mLastName = mLastName;
        this.mPhoneNumber = mPhoneNumber;
        this.mMail = mMail;
        this.mSkype = mSkype;
    }

    public int getId() {
        return id;
    }

    public String getmName() {
        return mName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmMail() {
        return mMail;
    }

    public String getmSkype() {
        return mSkype;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail;
    }

    public void setmSkype(String mSkype) {
        this.mSkype = mSkype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (id != persona.id) return false;
        if (mName != null ? !mName.equals(persona.mName) : persona.mName != null) return false;
        if (mLastName != null ? !mLastName.equals(persona.mLastName) : persona.mLastName != null)
            return false;
        if (mPhoneNumber != null ? !mPhoneNumber.equals(persona.mPhoneNumber) : persona.mPhoneNumber != null)
            return false;
        if (mMail != null ? !mMail.equals(persona.mMail) : persona.mMail != null) return false;
        return mSkype != null ? mSkype.equals(persona.mSkype) : persona.mSkype == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mLastName != null ? mLastName.hashCode() : 0);
        result = 31 * result + (mPhoneNumber != null ? mPhoneNumber.hashCode() : 0);
        result = 31 * result + (mMail != null ? mMail.hashCode() : 0);
        result = 31 * result + (mSkype != null ? mSkype.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", mName='" + mName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                ", mMail='" + mMail + '\'' +
                ", mSkype='" + mSkype + '\'' +
                '}';
    }
}
