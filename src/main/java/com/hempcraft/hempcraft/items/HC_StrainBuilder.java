package com.hempcraft.hempcraft.items;

import com.hempcraft.hempcraft.HempCraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HC_StrainBuilder 
{
    static ItemGroup default_group = HempCraft.hempcraft_item_group;
    private Item.Properties bud_properties = new Item.Properties().tab(default_group).stacksTo(64);
    private Item.Properties seed_properties = new Item.Properties().tab(default_group).stacksTo(64);

    private String Handle;

    public HC_StrainBuilder(String Handle)
    {
        this.Handle = Handle;
        new HC_Bud(Handle, bud_properties);
        new HC_Seeds(Handle, seed_properties);
    }

    // public Item[] A()
    // {
    //     Item joint = new HC_Joint(Handle).A();
    //     Item cone = new HC_Cones(Handle).A();

    //     Item[] array = {joint, cone};
    //     return array;

    // }

    public void A()
    {
        // Item joint = new HC_Joint(Handle).A();
        // Item cone = new HC_Cones(Handle).A();
        new HC_Joint(Handle).A();
        new HC_Cones(Handle).A();
        new HC_Blunts(Handle).A();

        // Item[] array = {joint, cone};
        // return array;

    }

    public void AA(String Effect1, String Effect2)
    {
        new HC_Joint(Handle).AA(Effect1, Effect2);
        new HC_Cones(Handle).AA(Effect1, Effect2);
        new HC_Blunts(Handle).AA(Effect1, Effect2);
    }

    public void AAA(String Effect1, String Effect2, String Effect3)
    {
        new HC_Joint(Handle).AAA(Effect1, Effect2, Effect3);
        new HC_Cones(Handle).AAA(Effect1, Effect2, Effect3);
        new HC_Blunts(Handle).AAA(Effect1, Effect2, Effect3);
    }
}
