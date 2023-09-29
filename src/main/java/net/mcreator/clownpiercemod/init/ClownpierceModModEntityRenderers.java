
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownpiercemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.clownpiercemod.client.renderer.ClownPierceRenderer;
import net.mcreator.clownpiercemod.client.renderer.C2Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClownpierceModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ClownpierceModModEntities.CLOWN_PIERCE.get(), ClownPierceRenderer::new);
		event.registerEntityRenderer(ClownpierceModModEntities.C_2.get(), C2Renderer::new);
	}
}
