package com.example.mod.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
//    @Inject(at = @At("HEAD"), method = "main")
//    private static void main(CallbackInfo info) {
//        System.out.println("Hello MineOld Mixin!!!");
//    }
}
