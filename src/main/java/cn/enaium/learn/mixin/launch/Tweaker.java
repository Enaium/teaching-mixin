package cn.enaium.learn.mixin.launch;

import cn.enaium.learn.mixin.program.Main;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.io.File;
import java.util.List;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Tweaker implements ITweaker {
    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {

    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.json");
    }

    @Override
    public String getLaunchTarget() {
        return Main.class.getName();
    }

    @Override
    public String[] getLaunchArguments() {
        return new String[0];
    }
}
