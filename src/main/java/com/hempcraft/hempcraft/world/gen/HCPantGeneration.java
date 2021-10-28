package com.hempcraft.hempcraft.world.gen;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import com.hempcraft.hempcraft.HempCraft;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class HCPantGeneration 
{
    public static void generatePlants(final BiomeLoadingEvent event)
    {
        RegistryKey<Biome> key = RegistryKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.PLAINS))
        {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModConfiguredFeatures.HYACINTH_CONFIG);
        }

        HempCraft.LOGGER.info("HEMPCRAFT: Generated Plants");
    }
}
