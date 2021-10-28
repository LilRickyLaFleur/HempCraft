package com.hempcraft.hempcraft.items;

import com.hempcraft.hempcraft.HempCraft;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

// All the items that will exist in HempCraft
public class HC_Items
{
    ItemGroup default_group = HempCraft.hempcraft_item_group;
    public static Block HYACINTH;
    public static RegistryObject<Block> Hyacinth_object;

    public HC_Items()
    {
        this.Joint_Paper();
        this.HYACINTH_INIT();

        // LOGGER.info("ITEM GROUP: " + default_group.toString());
        HempCraft.LOGGER.info("Items Loaded");
        new HC_Strains();
    }

    // Joint paper object:
    //  Non-smokeable, can create Joints
    public void Joint_Paper()
    {
        Item joint_paper = new Item(new Item.Properties().tab(default_group).stacksTo(64));
        HempCraft.ITEMS.register("joint_paper", () -> joint_paper);
        HempCraft.LOGGER.info("Joint Paper Loaded");
    }

    public void HYACINTH_INIT()
    {
        AbstractBlock.Properties hyacinth_properties = AbstractBlock.Properties.copy(Blocks.DANDELION);
        HYACINTH = new Block(hyacinth_properties);
        Hyacinth_object = HempCraft.BLOCKS.register("hyacinth", () -> HYACINTH);
        HempCraft.LOGGER.info("HYACINTH LOADED!!!!!");
    }

    public static RegistryObject<Block> get_Hyacinth()
    {
        HempCraft.LOGGER.info("Something got the Hyacinth Object");
        return Hyacinth_object;
    }
    
}
