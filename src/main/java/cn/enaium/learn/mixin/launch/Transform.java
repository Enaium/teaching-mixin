package cn.enaium.learn.mixin.launch;

import net.minecraft.launchwrapper.IClassTransformer;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Transform implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        System.out.println(name);
        return basicClass;
    }
}
