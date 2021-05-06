package org.sergei.spring.lesson_04;

import java.util.List;

public interface Music {
    String getSong();

    List getSongList();
    void doInit();
    void doDestroy();

}
