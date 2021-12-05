package youyihj.zenutils.api.fluid;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.liquid.ILiquidStack;
import stanhebben.zenscript.annotations.ZenClass;

import javax.annotation.Nullable;

/**
 * @author various.authors
 */
@ZenRegister
@ZenClass("mods.zenutils.ILiquidTankProperties")
public interface ILiquidTankProperties {
    @Nullable
    ILiquidStack getContents();
}
