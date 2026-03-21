package net.pantheon.prospector.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pantheon.prospector.Prospector;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Prospector.MOD_ID);

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CRUDE_HEMATITE = ITEMS.register("crude_hematite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEMATITE = ITEMS.register("hematite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}