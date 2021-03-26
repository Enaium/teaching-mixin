package cn.enaium.learn.mixin.mixin;

import cn.enaium.learn.mixin.program.Program;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Project: Mixin
 * Author: Enaium
 */
@Mixin(Program.class)
public class ProgramMixin {
    @Inject(at = @At("HEAD"), method = "Head()V")
    private void head(CallbackInfo callbackInfo) {
        System.out.println("Hello HEAD");
    }

    @Inject(at = @At("HEAD"), method = "Head(Ljava/lang/String;)V")
    private void head(String name, CallbackInfo callbackInfo) {
        System.out.println("Hello " + name);
    }

    @Inject(at = @At("RETURN"), method = "Return()V")
    private void Return(CallbackInfo callbackInfo) {
        System.out.println("Hello RETURN");
    }

    @Inject(at = @At(value = "RETURN", ordinal = 1), method = "Return(I)V")
    private void Return(int index, CallbackInfo callbackInfo) {
        System.out.println("Hello RETURN " + index);
    }

    @Inject(at = @At("TAIL"), method = "Tail()V")
    private void Tail(CallbackInfo callbackInfo) {
        System.out.println("Hello TAIL");
    }

    @Inject(at = @At(value = "INVOKE", target = "Ljava/io/PrintStream;println(Ljava/lang/String;)V"), method = "Invoke()V")
    private void Invoke(CallbackInfo callbackInfo) {
        System.out.println("Hello Invoke");
    }

    @Inject(at = @At(value = "INVOKE_ASSIGN", target = "Ljava/lang/String;isEmpty()Z"), method = "InvokeAssign()V")
    private void InvokeAssign(CallbackInfo callbackInfo) {
        System.out.println("Hello InvokeAssign");
    }

    @Inject(at = @At(value = "FIELD", target = "Lcn/enaium/learn/mixin/program/Program;field:Ljava/lang/String;"), method = "Field()V")
    private void Field(CallbackInfo callbackInfo) {
        System.out.println("Hello FIELD");
    }

    @Inject(at = @At(value = "NEW", target = "java/lang/String"), method = "New()V")
    private void New(CallbackInfo callbackInfo) {
        System.out.println("Hello NEW");
    }
}
