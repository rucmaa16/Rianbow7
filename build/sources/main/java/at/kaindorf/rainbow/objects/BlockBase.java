package at.kaindorf.rainbow.objects;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.init.BlockInit;
import at.kaindorf.rainbow.init.ItemInit;
import at.kaindorf.rainbow.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

    @Override
    public void registerModels() {
        Rainbow.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }
}
