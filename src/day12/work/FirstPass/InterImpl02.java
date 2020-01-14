package day12.work.FirstPass;

import day12.work.FirstPass.Inter;

public class InterImpl02<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
