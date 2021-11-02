package com.hempcraft.hempcraft.items;

// import net.minecraft.item.Item;

public class HC_Cones 
{

    HC_Joint Cone;

    public HC_Cones(String handle)
    {
        Cone = new HC_Joint(handle);
        Cone.identifier = "cones";
        Cone.effect_timer = 45*20;
    }

    // public Item A()
    // {
    //     return Cone.A();
        
    // }

    public void A()
    {
        Cone.A();
        
    }

    public void AA(String Effect1, String Effect2)
    {
        Cone.AA(Effect1, Effect2);
    }

    public void AAA(String Effect1, String Effect2, String Effect3)
    {
        Cone.AAA(Effect1, Effect2, Effect3);
    }

}
