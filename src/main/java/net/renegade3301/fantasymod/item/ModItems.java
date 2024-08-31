package net.renegade3301.fantasymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.renegade3301.fantasymod.FantasyMod;

public class ModItems {
    public static final Item REFINED_EMERALD = registerItem("refined_emerald", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FantasyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasyMod.LOGGER.info("Registering Mod Items for " + FantasyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REFINED_EMERALD);
        });
    }
}
