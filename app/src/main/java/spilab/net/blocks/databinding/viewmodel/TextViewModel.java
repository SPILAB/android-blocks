package spilab.net.blocks.databinding.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import spilab.net.blocks.BR;
import spilab.net.blocks.databinding.model.TextModel;

public class TextViewModel extends BaseObservable {

    @NonNull
    private final TextModel textModel;

    /**
     * ObservableField will update the UI each time we set the text value
     */
    @NonNull
    public final ObservableField<String> text;

    public TextViewModel(@NonNull TextModel textModel,
                         @NonNull ObservableField<String> text) {
        this.textModel = textModel;
        this.text = text;
    }

    /**
     * notifyPropertyChanged will notify the UI that the user name
     * and current user name should be updated.
     */
    public void setUserName(String userName) {
        textModel.setUserName(userName);
        notifyPropertyChanged(BR.userName);
        notifyPropertyChanged(BR.currentUserName);
    }

    @Bindable
    public String getUserName() {
        return textModel.getUserName();
    }

    @Bindable
    public String getCurrentUserName() {
        return "Your name is " + textModel.getUserName();
    }

    public void sayHelloPressed() {
        text.set(textModel.buildHelloText());
    }

    public void askQuestionPressed() {
        text.set(textModel.buildQuestionText());
    }
}