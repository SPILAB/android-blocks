package spilab.net.blocks.databinding.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import spilab.net.blocks.R;
import spilab.net.blocks.databinding.ActivityDataBindingBinding;
import spilab.net.blocks.databinding.viewmodel.TextViewModelLifeCycle;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        TextViewModelLifeCycle speakViewModelLifeCycle = ViewModelProviders.of(this).get(TextViewModelLifeCycle.class);
        speakViewModelLifeCycle.bind(binding);
    }
}
