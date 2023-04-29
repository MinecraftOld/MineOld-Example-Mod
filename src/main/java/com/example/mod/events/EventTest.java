package com.example.mod.events;

import cn.frish2021.api.Event.EventTarget;
import cn.frish2021.loader.api.LogWrapper;

public class EventTest {
    @EventTarget
    public void test(ExampleEvents event) {
        LogWrapper.info("example","Hello MineOld Events!!!", "INFO");
    }
}
