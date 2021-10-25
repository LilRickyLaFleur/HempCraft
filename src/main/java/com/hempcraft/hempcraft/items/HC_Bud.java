package com.hempcraft.hempcraft.items;

import net.minecraft.item.Item;
import com.hempcraft.hempcraft.HempCraft;


public class HC_Bud 
{
    public HC_Bud(String Handler, Item.Properties Properties)
    {
        // Create Item
        Item bud = new Item(Properties);
        HempCraft.ITEMS.register(Handler, () -> bud);
    }

}
