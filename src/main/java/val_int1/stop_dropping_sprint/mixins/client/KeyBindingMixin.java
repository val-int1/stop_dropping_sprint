package val_int1.stop_dropping_sprint.mixins.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import val_int1.stop_dropping_sprint.init.StopDroppingSprint;

@Mixin(KeyBinding.class)
@Environment(EnvType.CLIENT)
public class KeyBindingMixin {

	@Shadow
	private boolean pressed;

	@Inject(method="setPressed", at=@At("HEAD"))
	private void sds_injectSetPressed(boolean pressed, CallbackInfo info) {
		if(!pressed || this.pressed) { return; }
		KeyBinding that = (KeyBinding) (Object) this;
		if(!(that instanceof StickyKeyBinding)) {
			StopDroppingSprint.LAST_PRESSED = null;
		}
	}

}
