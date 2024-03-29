package com.hempcraft.hempcraft.items;

// import com.hempcraft.hempcraft.HempCraft;

// import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
// import net.minecraft.item.ItemStack;
// import net.minecraft.util.IItemProvider;
// import net.minecraftforge.client.event.ColorHandlerEvent;

public class HC_Strains 
{

    Item[] og_kush_items;


    public HC_Strains()
    {
        // List of effect strings can be found in HC_Joint.java

        // Grade A
        // og_kush_items = new HC_StrainBuilder("og_kush").A();
        new HC_StrainBuilder("og_kush").A();

        



        new HC_StrainBuilder("chem_fruit").A();
        new HC_StrainBuilder("trainwreck").A();

        // Grade AA
        new HC_StrainBuilder("purple_kush").AA("INSTANT_HEALING_1", "REGENERATION");
        new HC_StrainBuilder("skywalker_og").AA("INSTANT_HEALING_1", "SLOW_FALLING");
        new HC_StrainBuilder("platinum_cookies").AA("INSTANT_HEALING_1", "JUMP_BOOST");
        new HC_StrainBuilder("laughing_buddha").AA("MOVEMENT_SPEED", "JUMP_BOOST");

        // Grade AAA
        new HC_StrainBuilder("sour_budda").AAA("INSTANT_HEALING_2", "REGENERATION", "FIRE_RESISTANCE");
        new HC_StrainBuilder("blue_widow").AAA("INSTANT_HEALING_2", "STRENGTH", "NIGHT_VISION");
        new HC_StrainBuilder("holy_grain").AAA("INSTANT_HEALING_2", "MOVEMENT_SPEED", "SLOW_FALLING");
        new HC_StrainBuilder("scout_master").AAA("JUMP_BOOST", "MOVEMENT_SPEED", "LUCK");

    }

    // public void registerBlockColors(ColorHandlerEvent.Item event)
    // {
    //     IItemColor og_kush_color = new IItemColor() {

    //         @Override
    //         public int getColor(ItemStack p_getColor_1_, int p_getColor_2_) {
    //             return 999999;
    //         }
    //     };

    //     IItemProvider og_kush = new IItemProvider() {

    //         @Override
    //         public Item asItem() {
    //             return og_kush_items[0];
    //         }
            
    //     };
    //     event.getItemColors().register(og_kush_color, og_kush);

    //     HempCraft.LOGGER.info("Registered Item Colors");
    // }
}
