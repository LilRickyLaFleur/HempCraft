package com.hempcraft.hempcraft.world.gen;

import com.hempcraft.hempcraft.HempCraft;
import com.hempcraft.hempcraft.items.HC_Items;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class ModConfiguredFeatures 
{
    public static final ConfiguredFeature<?, ?> HYACINTH_CONFIG = Feature.FLOWER.configured((
        new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(HC_Items.get_Hyacinth().get().defaultBlockState()), 
        SimpleBlockPlacer.INSTANCE))
        .tries(12)
        .build())
        .count(5)
        .decorated(Features.Placements.HEIGHTMAP_WORLD_SURFACE);

    public static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature)
    {
        HempCraft.LOGGER.info("ModConfiguredFeatures.java: register");
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

}
