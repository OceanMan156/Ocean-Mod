package net.anthony.ocean.item;

import net.anthony.ocean.Ocean;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ocean.MOD_ID);
    public static final RegistryObject<Item> OCROME = ITEMS.register("ocrome",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB)));
    public static final RegistryObject<Item> RAW_OCROME = ITEMS.register("raw_ocrome",
            () ->new Item(new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
