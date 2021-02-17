package com.laba_04.menu;

import com.laba_04.Chef.Chef;
import com.laba_04.Salad.Salad;
import com.laba_04.menu.item.*;
import com.laba_04.menu.item.ChefMenuItems.AddIngredient;
import com.laba_04.menu.item.SaladMenuItems.*;
import com.laba_04.menu.item.ChefMenuItems.VegetablesInCaloriesRange;
import com.laba_04.menu.item.ProgramMenuItems.Exit;
import com.laba_04.menu.item.ProgramMenuItems.ShowInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {

  private Map<String, Command> commands;
  private Scanner scanner = new Scanner(System.in);

  public MainMenu() {
    Chef chef = new Chef();
    Salad salad = new Salad();
    commands = new HashMap<>();
    commands.put(Exit.COMMAND, new Exit(scanner)); // виклик системної функції exit(), яка завершує виконання процесу
    // та вивільняє всі зайняті ним ресурси. Сканер закрито вручну, замість операціонки.
    commands.put(ShowInfo.COMMAND, new ShowInfo());
    commands.put(AddIngredient.COMMAND, new AddIngredient(chef, salad, scanner));
    commands.put(setSaladName.COMMAND, new setSaladName(salad, scanner));
    commands.put(ShowRecipe.COMMAND, new ShowRecipe(salad));
    commands.put(countCalories.COMMAND, new countCalories(salad));
    commands.put(VegetablesInCaloriesRange.COMMAND, new VegetablesInCaloriesRange(chef, salad, scanner));
    commands.put(sortIngredientsByCalories.COMMAND, new sortIngredientsByCalories(salad));
    commands.put(sortIngredientsByWeight.COMMAND, new sortIngredientsByWeight(salad));
  }

  public void execute() {
    while(true) {
      showMenu();
      String command = readCommand();
      commands.get(command).execute();
    }
  }

  private void showMenu() {
    System.out.println(commands.keySet());
  }

  private String readCommand() {
    return scanner.next();
  }

}
