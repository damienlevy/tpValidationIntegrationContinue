package fr.ul.additionneurrest.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdderService {
    //private Random rand = new Random();
    private int num = 10;//rand.nextInt(101);//rand entre 0 et 100

    public void baseNum(int base){
        this.num = base;
    }
    public int currentBase(){
        return num;

    }
    public int add(int adder){
        return this.num+adder;

    }
    public int accumulate(int adder){
        return this.num+=adder;
    }

}
