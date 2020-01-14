package day12.work.FirstPass;

import day12.work.FirstPass.Inter;

public class InterImpl01 implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
