
package net.mcreator.clownpiercemod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.clownpiercemod.procedures.ClownPierceRingRightclickedProcedure;

public class ClownPierceRingItem extends Item {
	public ClownPierceRingItem() {
		super(new Item.Properties().durability(1).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ClownPierceRingRightclickedProcedure.execute(world, x, y, z, itemstack);
		return ar;
	}
}
