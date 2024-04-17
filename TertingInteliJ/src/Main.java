import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Place[] map = new Place[7];

        map[0] = new Place("Start");
        map[1] = new Place("P1");
        map[2] = new Place("P2");
        map[3] = new Place("P3");
        map[4] = new Place("P4");
        map[5] = new Place("P5");
        map[6] = new Place("End");

        map[0].addDoor(null,map[1],null,null);
        map[1].addDoor(map[3],map[2],map[0],null);
        map[2].addDoor(null,null,map[1],null);
        map[3].addDoor(map[4],null,null,map[1]);
        map[4].addDoor(map[5],map[6],null,map[3]);
        map[5].addDoor(null,null,null,map[4]);
        map[6].addDoor(null,null,map[4],null);

        Place actualPlace = map[0];

        Scanner scan = new Scanner(System.in);
        char choice;

        while(!actualPlace.equals(map[6])) {
            System.out.println("Aktualne położenie "+ actualPlace.getName());
            System.out.println("Możesz iść: " + actualPlace.writeDoors());

            do {
                System.out.println("Twój wybór: ");
                choice = scan.next().charAt(0);

            } while (!(choice == 'f' || choice == 'r' || choice == 'l' || choice == 'd'));

            int i = 0;
            switch (choice) {
                case 'f':
                    i = 0;
                    break;
                case 'r':
                    i = 1;
                    break;
                case 'l':
                    i = 2;
                    break;
                case 'd':
                    i = 3;
                    break;
            };
            if (actualPlace.selectPlace(i)!=null) {

                actualPlace = actualPlace.selectPlace(i);
            }
            else {

                System.out.println("Sciana");
                System.out.println("Wprowadź ponownie wybor: ");
            }

            }
        }
    }
