package com.laba_04.menu.item.SaladMenuItems;

import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.Command;

import java.util.Scanner;

public class setSaladName implements Command {
    public static String COMMAND = "setSaladName";
    private Salad salad;
    private Scanner scanner;


    public setSaladName(Salad salad, Scanner scanner){
        this.salad = salad;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        salad.setname(scanner);
    }
}
