package com.example.mod;

import cn.frish2021.api.Event.EventManager;
import cn.frish2021.loader.api.LogWrapper;
import cn.frish2021.loader.api.ModInitialize;
import com.example.mod.events.EventTest;
import com.example.mod.events.ExampleEvents;

public class example implements ModInitialize {
    @Override
    public void initialize() {
        EventManager.call(new ExampleEvents());
        EventManager.register(new EventTest());
        LogWrapper.info("example","Hello MineOld Mod","Info");
    }
}
