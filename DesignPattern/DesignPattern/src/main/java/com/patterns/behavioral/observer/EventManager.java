package com.patterns.behavioral.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基础发布者
 */
public class EventManager {
    Map<String, List<EventListener>> listentrs = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listentrs.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listentrs.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listentrs.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listentrs.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
