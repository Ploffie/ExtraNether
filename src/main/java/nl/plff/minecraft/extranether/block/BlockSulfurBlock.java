package nl.plff.minecraft.extranether.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSulfurBlock extends Block {

    public BlockSulfurBlock() {
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2);
        setSoundType(SoundType.METAL);
        setLightLevel(0);
        setUnlocalizedName("sulfur_block");
    }


}
