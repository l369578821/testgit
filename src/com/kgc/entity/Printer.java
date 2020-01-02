package com.kgc.entity;

public class Printer {
    //声明接口，并设置相应set/get方法
    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    //打印机打印
    public void print(){
    System.out.println("使用"+ink.getColor()+"墨盒在"+paper.getSize()+"纸张上打印");
    }


}
