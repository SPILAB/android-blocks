package spilab.net.blocks.databinding.model;

import android.support.annotation.NonNull;

public class TextModel {

    private static final String EMPTY = "";

    //region Example of model data
    @NonNull
    private String userName = EMPTY;

    public void setUserName(@NonNull String name) {
        this.userName = name;
    }

    @NonNull
    public String getUserName() {
        return userName;
    }
    //endregion

    //region Example of model business logic
    @NonNull
    public String buildHelloText() {
        return "Hello " + userName + "!";
    }

    @NonNull
    public String buildQuestionText() {
        return "How are you " + userName + "?";
    }
    //endregion
}
