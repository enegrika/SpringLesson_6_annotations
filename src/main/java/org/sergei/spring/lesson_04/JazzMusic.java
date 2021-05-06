package org.sergei.spring.lesson_04;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Take five";
    }

    @Override
    public List getSongList() {
        List<String> list = new ArrayList<>();
        list.add("Take five");
        list.add("Watermelon Man");
        list.add("Unforgettable");
        return list;
    }

    @Override
    public void doInit() {
        System.out.println("jazz music bean initialized " + this);

    }

    @Override
    public void doDestroy() {
        System.out.println("jazz music bean destroyed " + this);

    }
}
