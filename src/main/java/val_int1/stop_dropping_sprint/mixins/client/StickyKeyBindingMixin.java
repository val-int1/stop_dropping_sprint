package val_int1.stop_dropping_sprint.mixins.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.StickyKeyBinding;
import val_int1.stop_dropping_sprint.init.StopDroppingSprint;

@Mixin(StickyKeyBinding.class)
@Environment(EnvType.CLIENT)
public class StickyKeyBindingMixin {

	@ModifyVariable(method="setPressed", at=@At(value="LOAD", ordinal=0), argsOnly=true)
	private boolean sds_modvarSetPressed(boolean pressed) {
		StickyKeyBinding that = (StickyKeyBinding) (Object) this;
		if(pressed) {
			StopDroppingSprint.LAST_PRESSED = that;
		}
		return !pressed && that == StopDroppingSprint.LAST_PRESSED;
	}

}
