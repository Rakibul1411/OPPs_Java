package com.codes.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
        super.weight = other.weight;
        super.h = other.h;
        this.w = other.w;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
}
