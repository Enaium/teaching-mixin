package cn.enaium.learn.mixin.mixin;

import cn.enaium.learn.mixin.program.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Project: Mixin
 * Author: Enaium
 */
@Mixin(Main.class)
public class MainMixin {
    @Inject(at = @At("HEAD"),method = "main")
    private static void main(String[] args, CallbackInfo callbackInfo) {
        System.out.println("Hello Mixin");
    }
}
