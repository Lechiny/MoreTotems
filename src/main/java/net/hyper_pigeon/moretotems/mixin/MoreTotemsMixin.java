package net.hyper_pigeon.moretotems.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MoreTotemsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {

	}
}
