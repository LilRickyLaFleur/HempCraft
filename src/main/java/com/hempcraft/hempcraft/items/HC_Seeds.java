package com.hempcraft.hempcraft.items;

import net.minecraft.item.Item;
import com.hempcraft.hempcraft.HempCraft;

public class HC_Seeds 
{
    public HC_Seeds(String Handler, Item.Properties Properties)
    {
        Item seeds = new Item(Properties);
        HempCraft.ITEMS.register("seeds/" + Handler, () -> seeds);
    }
}
