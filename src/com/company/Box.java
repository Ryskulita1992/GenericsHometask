package com.company;

public class Box <A , B extends Number > implements Unpacable {
    A Gift ;
    B Children;

    public Box(A gift, B children) {
        Gift = gift;
        Children = children;
    }
    public Box (){}

    public A getGift() {
        return Gift;
    }

    public void setGift(A gift) {
        Gift = gift;
    }

    public B getChildren() {
        return Children;
    }

    public void setChildren(B children) {
        Children = children;
    }





    @Override
    public void unpack() {
        System.out.println("Подарки на 23 февраля!!!");


    }
}
