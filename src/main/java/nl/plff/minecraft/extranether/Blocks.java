package nl.plff.minecraft.extranether;

import net.minecraft.block.Block;
import nl.plff.minecraft.extranether.block.BlockKyaniteBlock;
import nl.plff.minecraft.extranether.block.BlockKyaniteOre;
import nl.plff.minecraft.extranether.block.BlockSulfurBlock;
import nl.plff.minecraft.extranether.block.BlockSulfurOre;

class Blocks { // TODO: Maybe convert this to singleton instance?

    static final Block sulfurOre = new BlockSulfurOre();
    static final Block sulfurBlock = new BlockSulfurBlock();
    static final Block kyaniteOre = new BlockKyaniteOre();
    static final Block kyaniteBlock = new BlockKyaniteBlock();

}
