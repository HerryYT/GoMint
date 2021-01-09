/*
 * Copyright (c) 2020, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:bordure_indented_banner_pattern", id = 576 )
public class ItemBordureIndentedBannerPattern extends ItemStack implements io.gomint.inventory.item.ItemBordureIndentedBannerPattern {

    @Override
    public ItemType getItemType() {
        return ItemType.BORDURE_INDENTED_BANNER_PATTERN;
    }

}