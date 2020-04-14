import java.util.ArrayList;
import java.util.Scanner;

public class GameRun {

    public static void main(String args[]){

        boolean hasPotato = false;
        ArrayList<Item> playerStuff = new ArrayList();
        ArrayList<Item> storeStuff = new ArrayList();
        Weapon bow = new Weapon("bow", 25, 150);
        Weapon rustyDagger = new Weapon("rusty dagger", 10, 10);
        Weapon sword = new Weapon("sword", 20, 100);
        Weapon club = new Weapon("club", 13, 70);
        Scanner sc = new Scanner(System.in);
        Weapon fist = new Weapon("fist", 5, 0);
        storeStuff.add(bow);
        storeStuff.add(sword);
        storeStuff.add(club);

        Enemy farmer = new Enemy(75, "Zebadiah", rustyDagger, 30);
        Shop merchant = new Shop(storeStuff);

        System.out.println("You are traveling through a forest and come upon a main dirt road. \nYou are hungry and you have one last set of rations. Some berries," +
                " a potato, and some chicken jerky. \nDo you eat your last ration or try and search for some more food in the forest? \n 0: eat ration you think the village is very close"+
                "\n 1: search the forest for a little extra food " );

        int digit = -1;
        digit = sc.nextInt();

        if(digit==0){
            System.out.println("You eat your last ration. You should be at the village in under an hour.");

        }

        if(digit == 1){
            System.out.println("You start your search through the forest looking for some food for your next meal \n You come across some berries so you lay down your pack and start to collect them."+
                    " You feel like there is a prescence behind you. Do you \n 0: wait \n 1: whip around and attack it");
            int digit2 = sc.nextInt();
            if (digit2 == 0){
                System.out.println("You wait and see what happens. Out of the corner of the eye you see a small figure pick up your pack and then book it! ");
            }
        }
        System.out.print("Hello traveler! What is your name? I am one of the farmers in this fair town");
        String playerName = sc.nextLine();
        MainCharacter player = new MainCharacter(100, playerName, fist, playerStuff, 15);
        System.out.println("Hello " + playerName);

        System.out.println("Have you happened to find a potato around here?");
        System.out.println("What do you do? \n 0: Attack with your " + player.getWeaponName() + "\n 1: No, I have not \n 2: Yes I have");
        digit = sc.nextInt();

        if(digit==0){
            player.attack(farmer);
            player.attack(farmer);
            System.out.println("AHHHHHHH");
            sleep(600);
            while(farmer.getHealth()>0 && player.getHealth() > 0){
                farmer.attack(player);
                player.attack(farmer);
                sleep(600);
            }

            if(player.getHealth() > 0){
                System.out.println("You have killed the farmer! ");

            }

            else{
                System.out.println("You died! Game over maaaaaan");
                System.out.println("Would you like to play again? \n 0: yes \n 1: no");

              int x= sc.nextInt();
                gameOver(x);
            }


        }
        if(digit==1){
            System.out.println("Oh, well I recently heard there was a large store of them in the mountain. \n If you happen to bring one to me I will pay you well");
        }
        if(digit==2){
            System.out.println("Oh yes! I will pay you 200 gold if you trade it with me! I need it to regrow my crop");
            if(hasPotato){
                System.out.println("Give farmer potato?\n 0: yes \n 1: no");
                int choice = -1;
                choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("Oh well then. I guess I won't be able to start a harvest this year");
                }
                else if(choice == 0){
                    System.out.println("Thank you so much! Here take the gold!");

                    player.addGold(200);
                    System.out.println("You have been awarded 200 gold");
                }
            }


        }




    }


        public static void gameOver(int choice){

            String args1[] = new String[3];

            if(choice == 0){
                GameRun.main(args1);
            }

            if(choice == 1){
                System.exit(0);
            }


        }

        public static void sleep(int milliseconds){
            try
            {
                Thread.sleep(milliseconds);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
}
