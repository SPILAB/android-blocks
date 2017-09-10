package spilab.net.blocks.home.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import spilab.net.blocks.databinding.view.DataBindingActivity;

public class Navigator {

    public enum Start {
        DataBinding(DataBindingActivity.class);

        private final Class clazz;

        Start(Class clazz) {
            this.clazz = clazz;
        }
    }


    @NonNull
    private final AppCompatActivity activity;

    public Navigator(@NonNull AppCompatActivity activity) {
        this.activity = activity;
    }

    public void startActivity(Start start) {
        activity.startActivity(new Intent(activity, start.clazz));
    }
}
