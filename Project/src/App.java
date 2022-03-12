import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner (System.in);

        System.out.print("Enter grams of strawberry: ");
        int strawberry = in.nextInt();
        int strawberryBlended = strawberry;

        System.out.print("Enter grams of banana: ");
        int banana = in.nextInt();
        int bananaBlended = (banana*100)/120;

        System.out.print("Enter grams of mango: ");
        int mango = in.nextInt();
        int mangoBlended = ((mango*100)/140);

        System.out.print("Enter ml of ice: ");
        int ice = in.nextInt();

        System.out.print("Enter ml of condense milk: ");
        int condenseMilk = in.nextInt();

        System.out.print("Enter grams of sugar: ");
        int sugar = in.nextInt();

        if  (checkIngredientsBigSize( ice, condenseMilk, sugar) == true){
            System.out.print("\033[H\033[2J");
            flavorMenu(args,strawberryBlended, bananaBlended, mangoBlended);
        } else {
            System.out.print("We do not have enough ingredients to make any juice");
        }
    }

    public static boolean  checkIngredientsBigSize (int ice, int condenseMilk, int sugar){
        if (ice>= 90 && condenseMilk>=60 && sugar>=24){
            return true;
        }else {
            return false;
        } 
    }

    public static int Menu()
    {
        int flavor;
        Scanner sc = new Scanner (System.in);
        System.out.println("------------------");
        System.out.println(" SELECT AN OPTION ");
        System.out.println("------------------");
        System.out.println("1 - Make STRAWBERRY juice");
        System.out.println("2 - Make BANANA juice");
        System.out.println("3 - Make MANGO juice");
        System.out.println("4 - See inventory");

        System.out.println("Your selected option is: ");
        flavor = sc.nextInt();
        return flavor;
    }
    public static void flavorMenu (String [] args, int strawberryBlended, int bananaBlended, int mangoBlended){
        int flavorSelected;

        do {
            System.out.print("\033[H\033[2J");
            flavorSelected = Menu();
            switch (flavorSelected){
                case 1:
                strawberryJuice(strawberryBlended);
                    break;
                case 2:
                bananaJuice(bananaBlended);
                    break;
                case 3:
                mangoJuice(mangoBlended);
                    break;
            }
        }
        while (flavorSelected>3);
    }

    public static void  strawberryJuice (int strawberryBlended){

        if ( strawberryBlended>=150){
            int bigSizeStrawberry = strawberryBlended/150;
            System.out.print("You can make: " +bigSizeStrawberry+ " STRAWBERRY juice ");
        }else{
            System.out.print("We don't have enough ingredientes for a STRABERRY juice ");
        } 
    }

    public static void  bananaJuice (int bananaBlended){

        if ( bananaBlended>=50){
            System.out.print("You can make BANANA juice ");
        }else{
            System.out.print("We don't have enough ingredientes for a BANANA juice ");
        } 
    }

    public static void  mangoJuice (int mangoBlended){

        if ( mangoBlended>=50){
            System.out.print("You can make MANGO juice ");
        }else{
            System.out.print("We don't have enough ingredientes for a MANGO juice ");
        } 
    }

}
