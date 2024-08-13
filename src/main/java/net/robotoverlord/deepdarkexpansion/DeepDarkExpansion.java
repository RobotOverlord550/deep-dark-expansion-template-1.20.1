package net.robotoverlord.deepdarkexpansion;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepDarkExpansion implements ModInitializer {
	public static final String MOD_ID = "deepdarkexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.CHISELED_DEEPSLATE)
				.lightWithItem(Items.TOTEM_OF_UNDYING)
				.destDimID(new Identifier(DeepDarkExpansion.MOD_ID, "deeperdarker"))
				.tintColor(0xc0224)
				.registerPortal();
	}
}