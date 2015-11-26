package org.decaywood.entity.trend;

import java.util.List;

/**
 * @author: decaywood
 * @date: 2015/11/26 9:57
 */
public abstract class Trend <T> {

    protected final List<T> history;

    public Trend(List<T> history) {
        if(history == null) throw new IllegalArgumentException();
        this.history = history;
    }

    public List<T> getHistory() {
        return history;
    }

}
