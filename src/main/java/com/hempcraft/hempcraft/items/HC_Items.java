package com.hempcraft.hempcraft.items;

import com.hempcraft.hempcraft.HempCraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

// All the items that will exist in HempCraft
public class HC_Items
{
    Logger LOGGER = LogManager.getLogger();
    ItemGroup default_group = HempCraft.hempcraft_item_group;

    public HC_Items()
    {
        this.Joint_Paper();

        // LOGGER.info("ITEM GROUP: " + default_group.toString());
        LOGGER.info("Items Loaded");
        new HC_Strains();
    }

    // Joint paper object:
    //  Non-smokeable, can create Joints
    public void Joint_Paper()
    {
        Item joint_paper = new Item(new Item.Properties().tab(default_group).stacksTo(64));
        HempCraft.ITEMS.register("joint_paper", () -> joint_paper);
        LOGGER.info("Joint Paper Loaded");
    }
    
}
