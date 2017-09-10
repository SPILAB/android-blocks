package spilab.net.blocks.home.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import spilab.net.blocks.home.view.Navigator;

public class BlocksModel {

    public static class Block {

        public final String name;
        public final Navigator.Start start;

        public Block(@NonNull String name, Navigator.Start start) {
            this.name = name;
            this.start = start;
        }
    }

    @NonNull
    private final List<Block> blockName = new ArrayList<>();

    public BlocksModel() {
        blockName.add(new Block("Data binding", Navigator.Start.DataBinding));
        blockName.add(new Block("Retrofit", Navigator.Start.DataBinding));
    }

    @NonNull
    public List<Block> getList() {
        return blockName;
    }
}