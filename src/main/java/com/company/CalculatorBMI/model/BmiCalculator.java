package com.company.CalculatorBMI.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BmiCalculator {
    private double bmi;
    private String description;

    /*

    mniej niż 16 - wygłodzenie
16 - 16.99 - wychudzenie
17 - 18.49 - niedowaga
18.5 - 24.99 - wartość prawidłowa
25 - 29.99 - nadwaga
30 - 34.99 - I stopień otyłości
35 - 39.99 - II stopień otyłości
powyżej 40 - otyłość skrajna

     */
    public double calculator(double weight , double hight){
        bmi= (weight/(hight*hight))*10000;
        this.bmi=Math.round(bmi*100.0)/100.0;
        if (bmi<16){
           this.description="wygłodzenie";
        }else if(bmi>16 &&bmi<17){
            this.description="wychodzienie";
        }else if(bmi>17&&bmi<18.5){
           this.description="niedowaga";
        }else if(bmi>18.5&&bmi<25){
            this.description="waga prawidłowa";
        }else if(bmi>25&&bmi<30){
            description="nadwaga";
        }else if(bmi>30&&bmi<35){
            description="I Stopień otyłości";
        }else if(bmi>35){
            description="II Stopień otyłości ";
        }

        return this.bmi;
    }






}

