package com.company;

import com.abstractfactories.AcousticGuitarFactory;
import com.abstractfactories.ClassicalGuitarFactory;
import com.abstractfactories.ElectricGuitarFactory;
import com.elements.Guitar;

public class Main {

    public static void main(String[] args) {
        ElectricGuitarFactory JBM100Factory = new ElectricGuitarFactory("JBM100","Ibanez","DiMarzio Titan",25.5,3000);
        ElectricGuitarFactory KellyFactory = new ElectricGuitarFactory("Kelly","Jackson","Seymour Duncan",25,2300);
        ElectricGuitarFactory MH1000Factory = new ElectricGuitarFactory("MH1000","ESP","EMG",25,1700);

        Guitar guitar1 = JBM100Factory.createGuitar();
        Guitar guitar2 = JBM100Factory.createGuitar();
        Guitar guitar3 = KellyFactory.createGuitar();
        Guitar guitar4 = MH1000Factory.createGuitar();

        System.out.println("guitar1 specs:");
        System.out.println(     guitar1);
        System.out.println("guitar2 specs:");
        System.out.println(     guitar2);
        System.out.println("guitar3 specs:");
        System.out.println(     guitar3);
        System.out.println("guitar4 specs:");
        System.out.println(     guitar4);

        ClassicalGuitarFactory BadGuitarFactory = new ClassicalGuitarFactory("garbage","trash","N/A",24,22);
        Guitar guitar5 = BadGuitarFactory.createGuitar();
        System.out.println("guitar5 specs:");
        System.out.println(     guitar5);

        AcousticGuitarFactory WorseGuitarFactory = new AcousticGuitarFactory("junk","rubbish","N/A",24.5,150);
        Guitar guitar6 = WorseGuitarFactory.createGuitar();
        System.out.println("guitar6 specs:");
        System.out.println(     guitar6);
    }
}
