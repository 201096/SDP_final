package com.company.Observer;
import java.util.List;

public interface Observer {
    public void handleEvent(List<String> subscription);
}