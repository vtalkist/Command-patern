package com.laba_04.menu.item.ProgramMenuItems;

import com.laba_04.menu.item.Command;

import java.util.Scanner;

public class Exit implements Command {

  private Scanner scanner;

  public static String COMMAND = "exit";

  public Exit(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public void execute() {
    scanner.close();
    System.exit(0);
  }
}
