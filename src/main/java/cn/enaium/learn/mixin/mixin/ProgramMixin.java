package cn.enaium.learn.mixin.mixin;

import cn.enaium.learn.mixin.program.Program;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Project: Mixin
 * Author: Enaium
 */
@Mixin(Program.class)
public class ProgramMixin {
    /**
     * @author Enaium
     */
    @Overwrite
    public int get() {
        return 111;
    }

    @Redirect(at = @At(value = "INVOKE", target = "Lcn/enaium/learn/mixin/program/Program;get()I"), method = "g")
    private int g(Program instance) {
        return 0;
    }
}
