
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownpiercemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.clownpiercemod.ClownpierceModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClownpierceModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClownpierceModMod.MODID);
	public static final RegistryObject<CreativeModeTab> CLOWN_PIERCE_MOD_ADDONS = REGISTRY.register("clown_pierce_mod_addons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.clownpierce_mod.clown_pierce_mod_addons")).icon(() -> new ItemStack(ClownpierceModModItems.SCYTHE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ClownpierceModModItems.S_2.get());
				tabData.accept(ClownpierceModModItems.C_2_SPAWN_EGG.get());
				tabData.accept(ClownpierceModModItems.S_12.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ClownpierceModModItems.SCYTHE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ClownpierceModModItems.CLOWN_PIERCE_SPAWN_EGG.get());
			tabData.accept(ClownpierceModModItems.CLOWN_PIERCE_RING.get());
		}
	}
}
