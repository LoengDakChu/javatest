package day08.homework.work8;

import day08.homework.work7.Manager;

public class work8 {
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer(668,"傅红雪");
        Tutor tutor=new Tutor(668,"鼓起");
        Maintainer Maintainer=new Maintainer(686,"庖丁");
        Buyer buyer=new Buyer(888,"景田");
        lecturer.work();
        tutor.work();
        Maintainer.work();
        buyer.work();

    }
}
