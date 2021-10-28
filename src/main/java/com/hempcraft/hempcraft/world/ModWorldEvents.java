package com.hempcraft.hempcraft.world;

import com.hempcraft.hempcraft.HempCraft;
import com.hempcraft.hempcraft.world.gen.HCPantGeneration;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = HempCraft.MOD_ID)
public class ModWorldEvents 
{
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        HempCraft.LOGGER.info("HEMPCRAFT: biomeLoadingEvent");
        HCPantGeneration.generatePlants(event);
    }

}
