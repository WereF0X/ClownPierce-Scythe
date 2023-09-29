
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownpiercemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.clownpiercemod.item.ScytheItem;
import net.mcreator.clownpiercemod.item.S2Item;
import net.mcreator.clownpiercemod.item.S12Item;
import net.mcreator.clownpiercemod.item.ClownPierceRingItem;
import net.mcreator.clownpiercemod.ClownpierceModMod;

public class ClownpierceModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ClownpierceModMod.MODID);
	public static final RegistryObject<Item> SCYTHE = REGISTRY.register("scythe", () -> new ScytheItem());
	public static final RegistryObject<Item> CLOWN_PIERCE_SPAWN_EGG = REGISTRY.register("clown_pierce_spawn_egg", () -> new ForgeSpawnEggItem(ClownpierceModModEntities.CLOWN_PIERCE, -6750208, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> CLOWN_PIERCE_RING = REGISTRY.register("clown_pierce_ring", () -> new ClownPierceRingItem());
	public static final RegistryObject<Item> S_2 = REGISTRY.register("s_2", () -> new S2Item());
	public static final RegistryObject<Item> C_2_SPAWN_EGG = REGISTRY.register("c_2_spawn_egg", () -> new ForgeSpawnEggItem(ClownpierceModModEntities.C_2, -6750208, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> S_12 = REGISTRY.register("s_12", () -> new S12Item());
}
