import java.util.Random;
import java.util.Scanner;

public class TextBasedGame {
    public static void main(String[] args) {
        System.out.println("ssssssss\n");
        System.out.println("*fade to black*\n");
        System.out.println("Wake up?");
        Scanner scanner = new Scanner(System.in);
        String WakeUp = scanner.nextLine();

        if (WakeUp.equals("no") || WakeUp.equals("No") ) {
            System.out.println("You left the game.");
            scanner.close();
        } else
            System.out.println("Welcome back, what's ur name. ");
        Scanner scanner1 = new Scanner(System.in);
        String PlayerName = scanner1.nextLine();
        System.out.println( PlayerName + ", you have signed up to a simulation game,");
        System.out.println("In this game, you will need some skills to attack your daily habit of sleeping - nightmare..");
        Scanner scanner2 = new Scanner(System.in);
        String Reply1 = scanner2.nextLine();
        if (Reply1.equals("no")) {
            System.out.println("Unfortunately you will not find luck trying to use your brain.");
            scanner.close();
            scanner1.close();
        } else {
            System.out.println("You gained punch (lvl1)");
        System.out.println("ATK:" + Attackpunch.getAttack());
        System.out.println("Well, don't worry about it, " + PlayerName + " , get some rest first...  ");
        System.out.println("\n" + "continue..?");
        Scanner scanner3 = new Scanner(System.in);
        String Reply2 = scanner3.nextLine();
        if (Reply2.contains("no") || Reply2.contains("No")) {
            System.out.println("No longer present in the game");
            scanner.close();
        } else {
            System.out.println("Alarm rings... ");
            System.out.println("Small Devil has spawned\n" + "Stats: \n Atk:" + devil1.getAttack() + "\nHP:" + devil1.getHp());
            System.out.println("Attack or Run?");
            Scanner scanner4 = new Scanner(System.in);
            String Decision1 = scanner4.nextLine();
            if (Decision1.equals("run") || Decision1.equals("2")) {
                System.out.println("ggs");
                scanner.close();
            } else if (!Decision1.equals("attack") && !Decision1.equals("Attack") && !Decision1.equals("1")) {
                System.out.println("your response is invalid.");
                scanner.close();
            } else {
                System.out.println("Little devil vs " + PlayerName);
                System.out.println(PlayerName + " uses " + "punch");
                if (Attackpunch.getAttack() - devil1.getHp() == 0) {
                    System.out.println("Little devil dies");
                    System.out.println("You slowly wake up..");
                    Scanner scanner5 = new Scanner(System.in);
                    String WakeUp1 = scanner5.nextLine();
                    if (WakeUp1.equals("no")) {
                        System.out.println(".");
                        scanner.close();
                    } else {
                        System.out.println("Good job, that's how here works.");
                        System.out.println("Well done.. you should learn sword attack");
                        Scanner scanner6 = new Scanner(System.in);
                        String Reply3 = scanner6.nextLine();
                        if (Reply3.equals("no")) {
                            System.out.println("..");
                            scanner.close();
                        } else {
                            System.out.println("You gained sword (lvl1)");
                            System.out.println("ATK:" + SwordSlash.getAttack());
                            System.out.println("Continue?");
                            Scanner scanner7 = new Scanner(System.in);
                            String reply4 = scanner7.nextLine();
                            if (reply4.equals("no")) {
                                scanner.close();
                            } else {
                                System.out.println("You fainted..");
                                System.out.println("Big Boss has appeared");
                                System.out.println("Stats:\nAtk: " + BigBoss.getAttack() + "\nHP: " + BigBoss.getHp());
                                System.out.println("Attack? Run?");
                                Scanner scanner8 = new Scanner(System.in);
                                String decision2 = scanner8.nextLine();
                                if (decision2.equals("run") || decision2.equals("Run") || decision2.equals("2")) {
                                    System.out.println("......");
                                    scanner.close();
                                } else if (!decision2.equals("attack") && !decision2.equals("Attack") && !decision2.equals("1")) {
                                    System.out.println("no.");
                                    scanner.close();
                                } else {
                                    System.out.println("BigaBOSSS vs " + PlayerName);
                                    int playerHP = 13;
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
                                        if (bossHP > 0 && playerHP <=0 ) {
                                            System.out.println("yes. you lost");
                                        } else if(bossHP<=0) {
                                            System.out.println("\n you won and regenerated 70HP!");
                                            System.out.println("\n You beat the simple sample game, feel free to try the beta version.");
                                            System.out.println("\n Gained Dash Hit: ATK: 7");
                                            System.out.println("\n continue..? ");
                                            Scanner scanner9 = new Scanner(System.in);
                                            String reply5 = scanner9.nextLine();
                                            if (reply5.equals("no")) {
                                                //do nothing
                                            } else {
                                                int jesushp = 80;
                                                int unknownhp = 80;
                                                double matherhp = 3345/12;
                                                int playerHP1 = playerHP + 75;
                                                Random rand = new Random();
                                                int upperbound = 4;
                                                int int_random = rand.nextInt(upperbound);
                                                if (int_random <=1) {
                                                    System.out.println("Jesus vs " + PlayerName);

                                                    while (playerHP1 > 0 && jesushp > 0) {
                                                        System.out.println(PlayerName + "'s HP:" + playerHP1);
                                                        System.out.println("Jesus's HP:" + jesushp);
                                                        System.out.println("1. Attack with punch");
                                                        System.out.println("2. Attack with sword");
                                                        System.out.println("3. Attack with dash hit");
                                                        System.out.print("Enter your choice.. (numbers only)");
                                                        if (playerHP1 <= 0) {
                                                            System.out.println("you died..");
                                                            break;
                                                        }

                                                        int choice2 = scanner.nextInt();
                                                        switch (choice2) {
                                                            case 1:
                                                                int punchAttack = Attackpunch.getAttack();
                                                                jesushp -= punchAttack;
                                                                System.out.println(PlayerName + " uses AttackPunch! \n Boss takes" + punchAttack + " damage");
                                                                int BossAttack = Jesus.getAttack();
                                                                playerHP1 -= BossAttack;

                                                                break;

                                                            case 2:
                                                                int swordAttack = SwordSlash.getAttack();
                                                                jesushp -= swordAttack;
                                                                System.out.println(PlayerName + " uses SwordSlash.\n Boss takes " + swordAttack + " damage.");
                                                                int BossAttack1 = Jesus.getAttack();
                                                                playerHP1 -= BossAttack1;

                                                                break;

                                                            case 3:
                                                                int DashAttack = DashHit.getAttack();
                                                                jesushp -= DashAttack;
                                                                System.out.println(PlayerName + " uses DashHit.\n Boss takes " + DashAttack + " damage.");
                                                                int BossAttack2 = Jesus.getAttack();
                                                                playerHP1 -= BossAttack2;
                                                                break;
                                                        }
                                                        if (jesushp <= 0) {
                                                            System.out.println("you win..");
                                                            System.out.println("You earned a badge: the end.");
                                                            break;
                                                        }
                                                    }
                                                }else if (int_random == 2) {
                                                    System.out.println("Unknown vs " + PlayerName);

                                                    while (playerHP1 > 0 && jesushp > 0) {
                                                        if (playerHP1 <= 0) {
                                                            System.out.println("you died..");
                                                            break;
                                                        }
                                                        System.out.println(PlayerName + "'s HP:" + playerHP1);
                                                        System.out.println("Unknown's HP:" + unknownhp);
                                                        System.out.println("1. Attack with punch");
                                                        System.out.println("2. Attack with sword");
                                                        System.out.println("3. Attack with dash hit");
                                                        System.out.print("Enter your choice.. (numbers only)");

                                                        int choice2 = scanner.nextInt();
                                                        switch (choice2) {
                                                            case 1:
                                                                int punchAttack = Attackpunch.getAttack();
                                                                unknownhp -= punchAttack;
                                                                System.out.println(PlayerName + " uses AttackPunch! \n Boss takes" + punchAttack + " damage");
                                                                int BossAttack = Unknown.getAttack();
                                                                playerHP1 -= BossAttack;

                                                                break;

                                                            case 2:
                                                                int swordAttack = SwordSlash.getAttack();
                                                                jesushp -= swordAttack;
                                                                System.out.println(PlayerName + " uses SwordSlash.\n Boss takes " + swordAttack + " damage.");
                                                                int BossAttack1 = Unknown.getAttack();
                                                                playerHP1 -= BossAttack1;

                                                                break;

                                                            case 3:
                                                                int DashAttack = DashHit.getAttack();
                                                                jesushp -= DashAttack;
                                                                System.out.println(PlayerName + " uses DashHit.\n Boss takes " + DashAttack + " damage.");
                                                                int BossAttack2 = Unknown.getAttack();
                                                                playerHP1 -= BossAttack2;
                                                                break;
                                                        }
                                                        if (unknownhp <= 0) {
                                                            System.out.println("you win..");
                                                            System.out.println("You earned a badge: the end.");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                } else if (int_random == 3) {
                                                    System.out.println("Mather vs " + PlayerName);

                                                    while (playerHP1 > 0 && matherhp > 0) {
                                                        if (playerHP1 <= 0) {
                                                            System.out.println("you died..");
                                                            break;
                                                        }
                                                        System.out.println(PlayerName + "'s HP:" + playerHP1);
                                                        System.out.println("Jesus's HP:" + matherhp);
                                                        System.out.println("1. Attack with punch");
                                                        System.out.println("2. Attack with sword");
                                                        System.out.println("3. Attack with dash hit");
                                                        System.out.print("Enter your choice.. (numbers only)");

                                                        int choice2 = scanner.nextInt();
                                                        switch (choice2) {
                                                            case 1:
                                                                int punchAttack = Attackpunch.getAttack();
                                                                matherhp -= punchAttack;
                                                                System.out.println(PlayerName + " uses AttackPunch! \n Boss takes" + punchAttack + " damage");
                                                                int BossAttack = Mather.getAttack();
                                                                playerHP1 -= BossAttack;

                                                                break;

                                                            case 2:
                                                                int swordAttack = SwordSlash.getAttack();
                                                                matherhp -= swordAttack;
                                                                System.out.println(PlayerName + " uses SwordSlash.\n Boss takes " + swordAttack + " damage.");
                                                                int BossAttack1 = Mather.getAttack();
                                                                playerHP1 -= BossAttack1;

                                                                break;

                                                            case 3:
                                                                int DashAttack = DashHit.getAttack();
                                                                matherhp -= DashAttack;
                                                                System.out.println(PlayerName + " uses DashHit.\n Boss takes " + DashAttack + " damage.");
                                                                int BossAttack2 = Mather.getAttack();
                                                                playerHP1 -= BossAttack2;
                                                                break;
                                                        }
                                                        if (matherhp <= 0) {
                                                            System.out.println("you win..");
                                                            System.out.println("You earned a badge: the end.");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        }
                                    }
                                }
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
        class DashHit {
            private static String name;
            private static int attack = 7;

            public DashHit(String name, int attack) {
                DashHit.name = name;
                this.attack = attack;
            }

            public static int getAttack() {
                return 7;
            }
        }
        class T {
            private static String name;
            private static int attack = 10;

            public T(String name, int attack) {
                T.name = name;
                this.attack = attack;
            }
            static String getName() {
                return name;
            }

            static int getAttack() {
                return attack;
            }
        }
            class Y {
                private static String name;
                private static int attack = 13;

                public Y(String name, int attack) {
                    Y.name = name;
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
    class Jesus {
        private static String name;
        private static int attack = 9;
        private static int hp = 50;

        public Jesus(String name, int attack, int hp) {
            Jesus.name = name;
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
    class Unknown  {
        private static String name;
        private static int attack = 3*2;
        private static int hp = 20;

        public Unknown(String name, int attack, int hp) {
            Unknown.name = name;
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
    class Mather  {
        private static String name;
        private static int attack = 15%2;
        private static int hp = 20;

        public Mather(String name, int attack, int hp) {
            Mather.name = name;
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



