package com.cosmicgelatin.seasonals.core.data.server.tags;

import com.cosmicgelatin.seasonals.core.Seasonals;
import com.cosmicgelatin.seasonals.core.registry.SeasonalsBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class SeasonalsBlockTagsProvider extends BlockTagsProvider {

    public SeasonalsBlockTagsProvider(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, Seasonals.MODID, existingFileHelper);
    }

    @Override
    public void addTags() {

        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                SeasonalsBlocks.PUMPKIN_ICE_CREAM_BLOCK.get(),
                SeasonalsBlocks.SWEET_BERRY_ICE_CREAM_BLOCK.get()
        );
    }
}