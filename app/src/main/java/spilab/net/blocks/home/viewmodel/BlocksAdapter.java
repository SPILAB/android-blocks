package spilab.net.blocks.home.viewmodel;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import spilab.net.blocks.BR;
import spilab.net.blocks.R;
import spilab.net.blocks.home.model.BlocksModel;
import spilab.net.blocks.home.view.Navigator;


public class BlocksAdapter extends RecyclerView.Adapter<BlocksAdapter.ViewHolder> {

    @NonNull
    private final BlocksModel bocksModel;
    @NonNull
    private final Navigator navigator;

    static class ViewHolder extends RecyclerView.ViewHolder {

        @NonNull
        private final ViewDataBinding binding;
        @NonNull
        private final BlockViewModel blockViewModel = new BlockViewModel();

        public ViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(@NonNull BlocksModel bocksModel, Navigator navigator, int position) {
            blockViewModel.bind(bocksModel, navigator, position);
            binding.setVariable(BR.blockViewModel, blockViewModel);
            binding.executePendingBindings();
        }
    }

    public BlocksAdapter(@NonNull BlocksModel bocksModel, @NonNull Navigator navigator) {
        this.bocksModel = bocksModel;
        this.navigator = navigator;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.blocks_view_holder, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(bocksModel, navigator, position);
    }

    @Override
    public int getItemCount() {
        return bocksModel.getList().size();
    }
}
