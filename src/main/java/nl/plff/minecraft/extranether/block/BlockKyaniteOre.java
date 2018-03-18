package nl.plff.minecraft.extranether.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.plff.minecraft.extranether.Items;

import java.util.Random;

public class BlockKyaniteOre extends Block{

    public BlockKyaniteOre() {
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1.7F);
        setSoundType(SoundType.STONE);
        setLightLevel(0);
        setUnlocalizedName("kyanite_ore");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.kyaniteChunkItem;
    }

}
