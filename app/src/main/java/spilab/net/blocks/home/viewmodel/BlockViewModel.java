package spilab.net.blocks.home.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import spilab.net.blocks.home.model.BlocksModel;
import spilab.net.blocks.home.view.Navigator;

public class BlockViewModel extends BaseObservable {

    @Nullable
    private BlocksModel blocksModel;
    private int position;
    private Navigator navigator;

    public void bind(@NonNull BlocksModel blocksModel,
                     @NonNull Navigator navigator,
                     int position) {
        this.blocksModel = blocksModel;
        this.navigator = navigator;
        this.position = position;
    }

    @Bindable
    public String getName() {
        return blocksModel != null ? blocksModel.getList().get(position).name : "";
    }

    public void blockPressed() {
        if (blocksModel != null) {
            navigator.startActivity(blocksModel.getList().get(position).start);
        }
    }
}
