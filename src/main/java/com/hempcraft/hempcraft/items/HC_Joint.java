package com.hempcraft.hempcraft.items;

import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;
import java.util.logging.Handler;

import com.hempcraft.hempcraft.HempCraft;


public class HC_Joint 
{

    static ItemGroup HempcraftGroup = HempCraft.hempcraft_item_group;
    static Item.Properties default_properties = new Item.Properties().tab(HempcraftGroup).stacksTo(64);

    private String Handle;

    // Item Properties
    Item.Properties properties = default_properties;

    // Joint Item
    Item joint;

    // Joint Effect Timer
    public int effect_timer = 15 * 20;     // Seconds * Ticks
    public String identifier = "joint_";
    
    // Effects
    private Supplier<EffectInstance> INSTANT_HEALING_1 = () -> new EffectInstance(Effects.HEAL, 1, 0);
    private Supplier<EffectInstance> MOVEMENT_SLOWDOWN = () -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, effect_timer);
    private Supplier<EffectInstance> INSTANT_HEALING_2 = () -> new EffectInstance(Effects.HEAL, 2, 0);
    private Supplier<EffectInstance> REGENERATION = () -> new EffectInstance(Effects.REGENERATION, effect_timer);
    private Supplier<EffectInstance> SLOW_FALLING = () -> new EffectInstance(Effects.SLOW_FALLING, effect_timer);
    private Supplier<EffectInstance> WATER_BREATHING = () -> new EffectInstance(Effects.WATER_BREATHING, effect_timer);
    private Supplier<EffectInstance> JUMP_BOOST = () -> new EffectInstance(Effects.JUMP, effect_timer);
    private Supplier<EffectInstance> MOVEMENT_SPEED = () -> new EffectInstance(Effects.MOVEMENT_SPEED, effect_timer);
    private Supplier<EffectInstance> FIRE_RESISTANCE = () -> new EffectInstance(Effects.FIRE_RESISTANCE, effect_timer);
    private Supplier<EffectInstance> STRENGTH = () -> new EffectInstance(Effects.DAMAGE_BOOST, effect_timer);
    private Supplier<EffectInstance> NIGHT_VISION = () -> new EffectInstance(Effects.NIGHT_VISION, effect_timer);
    private Supplier<EffectInstance> LUCK = () -> new EffectInstance(Effects.LUCK, effect_timer);
    
    public HC_Joint(String Handle)
    {
        this.Handle = Handle;
    }

    public Supplier<EffectInstance> getEffect(String Effect)
    {
        Supplier<EffectInstance> value;

        if(Effect.equals("INSTANT_HEALING_2")) { value = INSTANT_HEALING_2; }
        else if(Effect.equals("MOVEMENT_SLOWDOWN")) { value = MOVEMENT_SLOWDOWN; }
        else if(Effect.equals("REGENERATION")) { value = REGENERATION; }
        else if(Effect.equals("SLOW_FALLING")) { value = SLOW_FALLING; }
        else if(Effect.equals("WATER_BREATHING")) { value = WATER_BREATHING; }
        else if(Effect.equals("JUMP_BOOST")) { value = JUMP_BOOST; }
        else if(Effect.equals("MOVEMENT_SPEED")) { value = MOVEMENT_SPEED; }
        else if(Effect.equals("FIRE_RESISTANCE")) { value = FIRE_RESISTANCE; }
        else if(Effect.equals("STRENGTH")) { value = STRENGTH; }
        else if(Effect.equals("NIGHT_VISION")) { value = NIGHT_VISION; }
        else if(Effect.equals("LUCK")) { value = LUCK; }
        else { value = INSTANT_HEALING_1; }
        return value;
    };

    public void setHandle(String Handle)
    {
        this.Handle = Handle;
    }


    public Item A()
    {
        properties
            .food(new Food.Builder()
                .alwaysEat()
                .nutrition(-1)
                .effect(INSTANT_HEALING_1, 1)
                .effect(MOVEMENT_SLOWDOWN, 1)
                .build()
            );

        return BUILD();
    }

    public void AA(String Effect1, String Effect2)
    {
        properties
        .food(new Food.Builder()
            .alwaysEat()
            .nutrition(0)
            .effect(getEffect(Effect1), 1)
            .effect(getEffect(Effect2), 1)
            .build()
        );

        BUILD();
    }

    public void AAA(String Effect1, String Effect2, String Effect3)
    {
        properties
        .food(new Food.Builder()
            .alwaysEat()
            .nutrition(0)
            .effect(getEffect(Effect1), 1)
            .effect(getEffect(Effect2), 1)
            .effect(getEffect(Effect3), 1)
            .build()
        );

        BUILD();
    }

    public void RickysSpecial()
    {
        properties
        .food(new Food.Builder()
            .alwaysEat()
            .nutrition(10)
            .effect(INSTANT_HEALING_2, 1)
            .effect(REGENERATION, 1)
            .effect(SLOW_FALLING, 1)
            .effect(JUMP_BOOST, 1)
            .effect(MOVEMENT_SPEED, 1)
            .effect(FIRE_RESISTANCE, 1)
            .effect(STRENGTH, 1)
            .effect(NIGHT_VISION, 1)
            .effect(LUCK, 1)
            .build()
        );

        BUILD();
    }

    public Item BUILD()
    {
        Item joint = new Item(properties)
        {
            @Override 
            public UseAction getUseAnimation(ItemStack p_7766_1_1)
            {
                return UseAction.BOW;
            }
        };
        
        HempCraft.ITEMS.register(identifier+Handle, () -> joint);

        return joint;
    }
}
