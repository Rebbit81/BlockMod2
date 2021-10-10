package tbu.blockmod.dimensions;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class portals {
    // Just registering lol
    public static void init(){

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.NETHERITE_BLOCK)
                .destDimID(new Identifier("blockmod:the_ares"))
                .tintColor(131, 66, 184)
                .registerPortal();
    }

}
