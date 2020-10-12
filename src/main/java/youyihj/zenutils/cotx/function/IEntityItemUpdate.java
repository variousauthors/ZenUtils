package youyihj.zenutils.cotx.function;

import crafttweaker.annotations.ModOnly;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityItem;
import stanhebben.zenscript.annotations.ZenClass;

@FunctionalInterface
@ZenRegister
@ZenClass("mods.zenutils.cotx.IEntityItemUpdate")
@ModOnly("contenttweaker")
public interface IEntityItemUpdate {
    boolean update(IEntityItem entityItem);
}