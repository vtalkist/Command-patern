package com.laba_04.menu.item.ProgramMenuItems;

import com.laba_04.menu.item.Command;

public class ShowInfo implements Command {

  public static String COMMAND = "aboutProgram";

  @Override
  public void execute() {
    System.out.println("This program assigned for creating virtual salads by virtual chef,\n" +
            "and for manipulations over virtual ingredients. The following set\n" +
            "of commands is available:");
  }
}
