package cn.enaium.learn.mixin.mixin;

import cn.enaium.learn.mixin.program.Program;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

/**
 * Project: Mixin
 * Author: Enaium
 */
@Mixin(Program.class)
public interface IProgramMixin {
    @Accessor("name")
    String getName();

    @Accessor("name")
    @Mutable
    void setName(String name);

    @Invoker("hello")
    void cHello();
}
