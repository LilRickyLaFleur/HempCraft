package com.hempcraft.hempcraft.events;

import com.hempcraft.hempcraft.HempCraft;
import com.hempcraft.hempcraft.commands.ReturnHomeCommand;
import com.hempcraft.hempcraft.commands.SetHomeCommand;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = HempCraft.MOD_ID)
public class ModEvents 
{
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event)
    {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event)
    {
        if(!event.getOriginal().getEntity().isAlive())
        {
            event.getPlayer().getPersistentData().putIntArray(HempCraft.MOD_ID + "homepos", event.getOriginal().getPersistentData().getIntArray(HempCraft.MOD_ID + "homepos"));
        }
    }
}
