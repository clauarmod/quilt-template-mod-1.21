package io.github.clauarmod.junqueira_mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class JunqueiraModItem {
	public static final Item JUNQUEIRA_ITEM = new Item(new Item.Settings());

	public static void register(ModContainer mod){
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "poop_item"), JUNQUEIRA_ITEM);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(JUNQUEIRA_ITEM);
		});
	}
}
