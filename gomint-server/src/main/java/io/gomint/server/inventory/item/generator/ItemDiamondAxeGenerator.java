package io.gomint.server.inventory.item.generator;

import io.gomint.server.inventory.item.ItemDiamondAxe;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ItemDiamondAxeGenerator implements ItemGenerator {

   @Override
   public ItemDiamondAxe generate( short data, byte amount, NBTTagCompound nbt ) {
       return new ItemDiamondAxe( data, amount, nbt );
   }

   @Override
   public ItemDiamondAxe generate( short data, byte amount ) {
       return new ItemDiamondAxe( data, amount );
   }

}
