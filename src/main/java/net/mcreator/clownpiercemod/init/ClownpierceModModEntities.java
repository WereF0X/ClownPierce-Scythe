
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownpiercemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.clownpiercemod.entity.ClownPierceEntity;
import net.mcreator.clownpiercemod.entity.C2Entity;
import net.mcreator.clownpiercemod.ClownpierceModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClownpierceModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ClownpierceModMod.MODID);
	public static final RegistryObject<EntityType<ClownPierceEntity>> CLOWN_PIERCE = register("clown_pierce", EntityType.Builder.<ClownPierceEntity>of(ClownPierceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClownPierceEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<C2Entity>> C_2 = register("c_2",
			EntityType.Builder.<C2Entity>of(C2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(C2Entity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ClownPierceEntity.init();
			C2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CLOWN_PIERCE.get(), ClownPierceEntity.createAttributes().build());
		event.put(C_2.get(), C2Entity.createAttributes().build());
	}
}
