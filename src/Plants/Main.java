package Plants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Game Mode: ");
        String mode = sc.nextLine();
        boolean state = mode.equals("Night") || mode.equals("Fog");
        String input;
        do {
            System.out.print("Add a plant: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Wall Nut":
                    plants.add(new Plant.WallNut());
                    break;
                case "Sun-shroom":
                    plants.add(new Mushroom.SunShroom(state));
                    break;
                case "Puff-shroom":
                    plants.add(new Mushroom.PuffShroom(state));
                    break;
                case "Doom-shroom":
                    plants.add(new Mushroom.DoomShroom(state));
                    break;
                case "Sunflower":
                    plants.add(new Plant.Sunflower());
                    break;
                case "Peashooter":
                    plants.add(new Plant.Peashooter());
                    break;
                case "Squash":
                    plants.add(new Plant.Squash());
                    break;
                case "Jalapeno":
                    plants.add(new Plant.Jalapeno());
                    break;
                case "Coffee Bean":
                    // TODO find the first asleep mushroom
                    for (Plant p : plants) {
                        if (p instanceof Mushroom && !((Mushroom) p).isAwake()) {
                            ((Mushroom) p).awaken(new Plant.CoffeeBean());
                            break;
                        }
                    }
                    break;
                case "Lily Pad":
                    plants.add(new Plant.LilyPad());
                    break;
                case "Twin Sunflower":
                    for (Plant p : plants) {
                        if (p instanceof Plant.Sunflower) {
                            int pos = plants.indexOf(p);
                            plants.add(pos, (Plant) ((Plant.Sunflower) p).upgrade());
                            plants.remove(p);
                            break;
                        }
                    }
                    break;
                case "Cattail":
                    for (Plant p : plants) {
                        if (p instanceof Plant.LilyPad) {
                            int pos = plants.indexOf(p);
                            plants.add(pos, (Plant) ((Plant.LilyPad) p).upgrade());
                            plants.remove(p);
                            break;
                        }
                    }
                    break;

                // add more plants here
                default:
                    System.out.println(input + " is not a plant");
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Do something: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Produce Sun":
                    int num_sunprods = 0;
                    int total_suns = 0;
                    for (Plant p : plants) {
                        if (p instanceof SunProducer && p.isAlive()) {
                            num_sunprods++;
                            total_suns += ((SunProducer) p).produce_sun();
                        }
                    }
                    if (num_sunprods == 0) {
                        System.out.println("You have no sun producers");
                    } else {
                        System.out.println(num_sunprods+ " sun producers gather " + total_suns + " suns");
                    }
                    break;
                case "Attack":
                    // add implementation here
                    int num_atks = 0;
                    int total_dmg = 0;
                    for (Plant p : plants) {
                        if (p instanceof Attacker && p.isAlive()) {
                            num_atks++;
                            total_dmg += ((Attacker) p).attack();
                        }
                    }
                    if (num_atks == 0) {
                        System.out.println("You have no attackers");
                    } else {
                        System.out.println(num_atks+ " attackers dealing " + total_dmg + " damage");
                    }
                    break;
                // add more cases here
                case "Instant Kill Status":
                    boolean has_ik = false;
                    for (Plant p : plants) {
                        if (p instanceof InstantKiller && p.isAlive()) {
                            has_ik = true;
                            switch (((InstantKiller) p).killType()) {
                                case INSTANT:
                                    System.out.println(p.name + " can kill instantly");
                                    break;
                                case CLOSE_CONTACT:
                                    System.out.println(p.name + " can kill on contact");
                                    break;
                            }
                        }
                    }
                    if (!has_ik) {
                        System.out.println("You have no plants which can kill instantly");
                    }
                    break;
                case "Attacker Status":
                    boolean has_atk = false;
                    for (Plant p : plants) {
                        if (p instanceof Attacker && p.isAlive()) {
                            has_atk = true;
                            switch (((Attacker) p).rangeType()) {
                                case LIMITED:
                                    System.out.println(p.name + " can attack only when enemy is nearby");
                                    break;
                                case SINGLE_LINE:
                                    System.out.println(p.name + " can attack on a single line");
                                    break;
                                case AOE:
                                    System.out.println(p.name + " can attack using area-of-effect");
                                    break;
                                case FREE_RANGE:
                                    System.out.println(p.name + " can attack any enemies from anywhere");
                                    break;
                            }
                        }
                    }
                    if (!has_atk) {
                        System.out.println("You have no attackers");
                    }
                    break;
                case "Sort by HP":
                    plants.sort(new Plant.PlantHPComparator());
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Name":
                    Collections.sort(plants);
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Sun Cost":
                    plants.sort(new Plant.PlantSunCostComparator());
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Near Sun Cost":
                    System.out.print("Near to how many sun? ");
                    int target = sc.nextInt();
                    plants.sort(new Plant.PlantNearSunCostComparator(target));
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Specific Letter":
                    System.out.print("What letter? ");
                    char letter = sc.next().charAt(0);
                    plants.sort(new Plant.PlantCharacterComparator(letter));
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                default:
                    System.out.println("Unknown action: " + input);
            }
        } while (!input.equals("DONE"));
    }
}