package com.hempcraft.hempcraft.items;

public class HC_Blunts 
{
    HC_Joint Blunt;

    public HC_Blunts(String Handle)
    {
        // Blunts will use the same framework as the joint to keep it simple.
        Blunt = new HC_Joint(Handle);
        Blunt.identifier = "blunts";
        Blunt.effect_timer = 135*20; // Effects last for 135s
    }

    public void A()
    {
        Blunt.A();
    }

    public void AA(String Effect1, String Effect2)
    {
        Blunt.AA(Effect1, Effect2);
    }

    public void AAA(String Effect1, String Effect2, String Effect3)
    {
        Blunt.AAA(Effect1, Effect2, Effect3);
    }

}
