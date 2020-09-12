package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        int tick = 0;
        int hunger = 25;
        int loyalty = 25;
        int engagement = 25;
        int stamina = 25;
        int taskSelected = 0;
        Scanner input = new Scanner(System.in);
        String tigerName;
        System.out.println("Welcome to My Virtual Pet where you will get to own your own virtual tiger where the goal is to keep them alive for 8 hours");
        System.out.println("What would you like to name your tiger?");
        tigerName = input.nextLine();
        System.out.println("You named your tiger " + tigerName);
        while (tick <= 8){ System.out.println("These are " + tigerName + "'s current attributes:");
            System.out.println("Hunger: " + hunger);
            System.out.println("Loyalty: " + loyalty);
            System.out.println("Engagement: " + engagement);
            System.out.println("Stamina: " + stamina);
            System.out.println("Select the number next to the activity you would like to do with " + tigerName + ". It is hour " + tick);
            System.out.println("0: Ignore");
            System.out.println("1: Walk");
            System.out.println("2: Train");
            System.out.println("3: Feed");
            System.out.println("4: Let Sleep");
            taskSelected = input.nextInt();
            if(taskSelected == 0) {
                System.out.println("You would ignore a tiger?");
            } else if(taskSelected == 1){engagement = engagement + 10;
                System.out.println("You feed " + tigerName + ". They will love the exercise!");
            } else if(taskSelected == 2){loyalty = loyalty + 10;
                System.out.println("You train " + tigerName + ". Good idea to keep them loyal");
            } else if(taskSelected == 3){hunger = hunger + 10;
                System.out.println("You feed" + tigerName + ". You'll want to make sure to keep them full");
            } else if(taskSelected == 4){stamina = stamina + 10;
                System.out.println(tigerName + "Takes a nap. Good idea to keep them well rested");
            } else {
                System.out.println("Well would you look at that, you didn't follow the instructions and now you lost an hour");
            }
            engagement = engagement - 2;
            loyalty = loyalty - 2;
            hunger = hunger - 2;
            stamina = stamina - 2;

            tick++;
        }
        System.out.println("Congratulations, you made it through 8 hours with your tiger still alive!");
    }}


