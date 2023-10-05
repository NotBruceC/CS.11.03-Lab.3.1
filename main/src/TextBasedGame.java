import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        System.out.println("You don't belong here\n");
        System.out.println("There's a ghost inside you\n");
        System.out.println("epic cutscene___ // fade to black\n");
        System.out.println("Wake up?");
        Scanner scanner = new Scanner(System.in);
        String WakeUp = scanner.nextLine();

        if (WakeUp.equals("no") || WakeUp.equals("No") ) {
            System.out.println("Error 404, we live, we love, we lie..");
            System.out.println("You earned a badge: Mockingbird");
            scanner.close();
        } else
            System.out.println("Jesus: Welcome back, what's ur name. ");
        Scanner scanner1 = new Scanner(System.in);
        String PlayerName = scanner1.nextLine();
        System.out.println("Jesus: " + PlayerName + " , you are not ok... ");
        System.out.println("You need some skills to attack your nightmare..");
        Scanner scanner2 = new Scanner(System.in);
        String Reply1 = scanner2.nextLine();
        if (Reply1.equals("no")) {
            System.out.println("Error Skill undetected, we live, we love, we lie..");
            System.out.println("You earned a badge: You tried");
            scanner.close();
            scanner1.close();
        } else {
            System.out.println("You gained punch (lvl1)");
        System.out.println("ATK:" + Attackpunch.getAttack());
        System.out.println("Jesus: it's time to sleep, " + PlayerName + " , good night...  ");
        System.out.println("////////////////////////////////////////////////////////////////\n" + "continue..?");
        Scanner scanner3 = new Scanner(System.in);
        String Reply2 = scanner3.nextLine();
        if (Reply2.contains("no")) {
            System.out.println("You earned a badge: No Badge deserved");
            scanner.close();
        } else {
            System.out.println("Unknown: Welcome back.. oh.. it's you again");
        System.out.println("I told you, leave before I..\n");
        System.out.println("Alarm rings!!! exits Unknown.. ");
        System.out.println("Small Devil has spawned\n" + "Stats: \n Atk:" + devil1.getAttack() + "\nHP:" + devil1.getHp());
        System.out.println("Attack? Run?");
        Scanner scanner4 = new Scanner(System.in);
        String Decision1 = scanner4.nextLine();
        if (Decision1.equals("run")) {
            System.out.println("such a brave person.. who would have thought that the minute you run, you have been cursed to slowly fade away.. we live, we love, we lie..");
            System.out.println("You earned a badge: IShowSpeed");
            scanner.close();

        } else if (!Decision1.equals("attack") && !Decision1.equals("Attack")) {
            System.out.println("gibberish detected error, we live, we love, we lie..");
            System.out.println("You earned a badge: Let us change in the represent force on a x = ( V + v is way: The partic energy by the work done is to be in the may the choose then stant force, force, force acceleration the symbol K, the particle of the kineticle i");
            scanner.close();
            scanner2.close();
        } else
            System.out.println("Little devil vs " + PlayerName);
        System.out.println(PlayerName + " uses " + "punch");
        if (Attackpunch.getAttack() - devil1.getHp() == 0) {
            System.out.println("Little devil dies");
            System.out.println("You slowly wake up..");
            Scanner scanner5 = new Scanner(System.in);
            String WakeUp1 = scanner5.nextLine();
            if (WakeUp1.equals("no")) {
                System.out.println("Error 404, we live, we love, we lie..");
                System.out.println("You earned a badge: Error404 Crash Server");
                scanner.close();
                scanner2.close();
                scanner4.close();
                scanner5.close();
            } else
                System.out.println("Jesus: You beat nightmare lvl1!");
            System.out.println("Well done.. you should learn sword attack");
            Scanner scanner6 = new Scanner(System.in);
            String Reply3 = scanner6.nextLine();
            if (Reply3.equals("no")) {
                System.out.println("your out.. you too weak, we live, we love, we lie..");
                System.out.println("You earned a badge: Failure Skill Management");
                scanner.close();
                scanner2.close();
                scanner3.close();
                scanner5.close();
            } else
                System.out.println("You gained sword (lvl1)");
            System.out.println("ATK:" + SwordSlash.getAttack());
            System.out.println("Continue?");
            Scanner scanner7 = new Scanner(System.in);
            String reply4 = scanner7.nextLine();
            if (reply4.equals("no")) {
                System.out.println("You earned a badge: Rejection");
                scanner.close();
            } else {
                System.out.println("A mysterious blue figure sneak attacked. You fainted..");
                System.out.println("Big Boss has appeared");
                System.out.println("Stats:\nAtk: " + BigBoss.getAttack() + "\nHP: " + BigBoss.getHp());
                System.out.println("Attack? Run?");
                Scanner scanner8 = new Scanner(System.in);
                String decision2 = scanner8.nextLine();
                if (decision2.equals("run")) {
                    System.out.println("You run away... but the nightmare continues to haunt you... we live, we love, we lie..");
                    System.out.println("You earned a badge: Runaway goat");
                    scanner.close();
                } else if (!decision2.equals("attack") && !decision2.equals("Attack")) {
                    System.out.println("Gibberish detected error, we live, we love, we lie..");
                    System.out.println("You earned a badge: If it is it, it is it; if it is it is it, it is.");
                    scanner.close();
                    scanner2.close();
                } else {
                    System.out.println("BigaBOSSS vs " + PlayerName);
                    int playerHP = 10;
                    int bossHP = 20;

                    while (playerHP > 0 && bossHP > 0) {
                        System.out.println(PlayerName + "'s HP:" + playerHP);
                        System.out.println("BigBoss's HP:" + bossHP);
                        System.out.println("1. Attack with punch");
                        System.out.println("2. Attack with sword");
                        System.out.print("Enter your choice.. (numbers only)");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                int punchAttack = Attackpunch.getAttack();
                                bossHP -= punchAttack;
                                System.out.println(PlayerName + " uses AttackPunch! \n Boss takes" + punchAttack + " damage");
                                int BossAttack = BigBoss.getAttack();
                                playerHP -= BossAttack;
                                break;

                            case 2:
                                int swordAttack = SwordSlash.getAttack();
                                bossHP -= swordAttack;
                                System.out.println(PlayerName + " uses SwordSlash.\n Boss takes " + swordAttack + " damage.");
                                int BossAttack1 = BigBoss.getAttack();
                                playerHP -= BossAttack1;
                                break;
                        }
                        if (playerHP <= 0) {
                            System.out.println("uh oh... You realise that the blue figure was both irl and in your nightmare.. we live, we love, we lie.");
                            System.out.println("You earned a badge: The Real Deal");
                        } else if (bossHP <= 0) {
                            System.out.println("Blue Figure: You... do belong here...");
                            System.out.println("You earned a badge: True Blue Flu");
                        }
                    }
                }
            }
                }
            }
        }
    }
            class Attackpunch {
                private static String name;
                private static int attack = 3;

                public Attackpunch(String name, int attack) {
                    Attackpunch.name = name;
                    this.attack = attack;
                }

                static String getName() {
                    return name;
                }

                static int getAttack() {
                    return attack;
                }
            }
            class SwordSlash {
                private static String name;
                private static int attack = 5;
                // can implement per wave +1 dmg

                public SwordSlash(String name, int attack) {
                    SwordSlash.name = name;
                    this.attack = attack;
                }

                static String getName() {
                    return name;
                }

                static int getAttack() {
                    return attack;
                }
            }
            class devil1 {
                private static String name;
                private static int attack = 0;
                private static int hp = 3;

                public devil1(String name, int attack, int hp) {
                    devil1.name = name;
                    this.attack = attack;
                    this.hp = hp;
                }

                static String getName() {
                    return name;
                }

                static int getAttack() {
                    return attack;
                }

                static int getHp() {
                    return hp;
                }
            }
            class BigBoss {
                private static String name;
                private static int attack = 3;
                private static int hp = 20;

                public BigBoss(String name, int attack, int hp) {
                    BigBoss.name = name;
                    this.attack = attack;
                    this.hp = hp;
                }

                static String getName() {
                    return name;
                }

                static int getAttack() {
                    return attack;
                }

                static int getHp() {
                    return hp;
                }
            }
        }

