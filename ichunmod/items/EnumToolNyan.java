package ichunmod.items;

import ichunmod.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumToolNyan {
    NYAN(0, 666, 7.0F, 0.0F, 15);


    private final int harvestLevel;

    private final int maxUses;

    private final float efficiencyOnProperMaterial;

    private final float damageVsEntity;

    private final int enchantability;

    public Item customCraftingMaterial = null;

    private EnumToolNyan(int harvest, int durability, float strength, float damage, int enchantabiliy)
    {
        this.harvestLevel = harvest;
        this.maxUses = durability;
        this.efficiencyOnProperMaterial = strength;
        this.damageVsEntity = damage;
        this.enchantability = enchantabiliy;
    }

    public int getMaxUses()
    {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }

    public int getToolCraftingMaterial()
    {
        switch (this)
        {
            case NYAN:
            	return Blocks.nyanBlock.blockID;
            default:
            	return (customCraftingMaterial == null ? 0 : customCraftingMaterial.itemID);
        }
    }
}
