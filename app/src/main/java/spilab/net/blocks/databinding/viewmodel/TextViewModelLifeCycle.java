package spilab.net.blocks.databinding.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import spilab.net.blocks.databinding.ActivityDataBindingBinding;
import spilab.net.blocks.databinding.model.TextModel;

public class TextViewModelLifeCycle extends ViewModel {

    @Nullable
    private TextViewModel speakViewModel = null;

    public void bind(@NonNull ActivityDataBindingBinding binding) {
        binding.setTextViewModel(lazyGet());
    }

    private TextViewModel lazyGet() {
        if (speakViewModel == null) {
            speakViewModel = new TextViewModel(new TextModel(), new ObservableField<String>());
        }
        return speakViewModel;
    }
}
