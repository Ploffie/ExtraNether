package nl.plff.minecraft.extranether.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockKyaniteBlock extends Block {

    public BlockKyaniteBlock() {
        super(Material.IRON);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1.5F);
        setSoundType(SoundType.METAL);
        setLightLevel(0);
        setUnlocalizedName("kyanite_block");
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 0;
    }
}
