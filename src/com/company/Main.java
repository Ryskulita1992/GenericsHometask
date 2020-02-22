package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Integer, Long> boxForGift = new Box<>(1000, 20L);
        Box<Integer, Integer> boxForStaff = new Box<>(10000, 20);
        divideAmountForGift(boxForGift);
        divideAmountForGift2(boxForStaff);

        Box Box = new Box();
        Box.unpack();
//        Box box=new Box();
//        box.unpack();
    }

    public static void divideAmountForGift(Box<Integer, Long> boxForGift) {
        System.out.println("сумма подарков для детей равна- " + boxForGift.getGift().intValue() / +boxForGift.getChildren());

    }

    public static void divideAmountForGift2(Box<Integer, Integer> boxForStaff) {
        System.out.println("сумма подарков для сотрудников равна - " + boxForStaff.getGift().intValue() / +boxForStaff.getChildren().intValue());
    }


    }






