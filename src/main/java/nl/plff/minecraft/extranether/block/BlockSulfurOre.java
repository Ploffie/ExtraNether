package nl.plff.minecraft.extranether.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.plff.minecraft.extranether.Items;

import java.util.Random;

public class BlockSulfurOre extends Block {

    public BlockSulfurOre() {
        super(Material.CLAY);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(0.8F);
        setSoundType(SoundType.STONE);
        setLightLevel(0);
        setUnlocalizedName("sulfur_ore");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.sulfurDustItem;
    }

    @Override
    public int quantityDropped(Random random) {
        return 4;
    }

}
