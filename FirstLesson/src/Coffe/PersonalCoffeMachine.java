package Coffe;

import java.util.Scanner;

public class PersonalCoffeMachine {
    private Boolean payCoffe(Integer tokenMessage) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your token: ");
        System.out.println("1 - token = 10$");
        System.out.println("2 - token = 15$");
        tokenMessage = scan.nextInt();

        if (tokenMessage == 1 || tokenMessage == 2) {
            return true;
        }
        return false;
    }

    private String chooseCoffe(Integer option) {
        Scanner scanChoose = new Scanner(System.in);
        System.out.println("Please make your choice: ");
        System.out.println("1 - Espresso");
        System.out.println("2 - Americano");
        option = scanChoose.nextInt();

        if (option == 1) {
            return  "Espresso";
        } else if (option == 2) {
            return "Americano";
        }
        return "You make a mistake. Please be more attentively!";

    }

    private String cinnamon(Integer cinnamonadd) {
        Scanner scancinnamon = new Scanner(System.in);
        System.out.println("Maybe you want cinnamon(корица)? ");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        cinnamonadd = scancinnamon.nextInt();

        if (cinnamonadd == 1) {
            return "Yes";
        } else if (cinnamonadd == 2) {
            return "No";
        }
        return "You make a mistake. Please be more attentively!";
    }

    private String sugar(Integer sugaradd) {
        Scanner scansugar = new Scanner(System.in);
        System.out.println("Maybe you want sugar(сахар)? ");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        sugaradd = scansugar.nextInt();

        if (sugaradd == 1) {
            return "Yes";
        } else if (sugaradd == 2) {
            return "No";
        }
        return "You make a mistake. Please be more attentively!";
    }

    private void showingInfo(String message){
        System.out.println(message);
    }

    private String workDone(String coffeeType){
        return coffeeType;
    }

    public void preparedCoffe(){
        String coffeType = "";
        String cinnamon = "";
        String sugar = "";

        if (this.payCoffe(2)) {
            coffeType = this.chooseCoffe(2);
            cinnamon = this.cinnamon(2);
            sugar = this.sugar(2);
            this.showingInfo(
                    "Your choice is: " + coffeType
            );
            this.showingInfo("Preparing...");
            this.showingInfo("Preparing - 10%");
            this.showingInfo("Preparing - 30%");
            this.showingInfo("Preparing - 45%");
            this.showingInfo("Preparing - 75%");
            this.showingInfo("Preparing - 99%");
            this.showingInfo("Preparing - 100%");
            this.showingInfo(
                    "Coffee is ready: " + this.workDone(coffeType)
            );
        }   else {
             this.showingInfo("Please insert only one token! ");
        }
    }
}
