package InterviewChallenge;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class TowerOfHanoi {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static Stack<Integer> stack3 = new Stack<>();
    static Stack<Integer> goalStack = new Stack<>();
    static int moveCount = 0;
    static HashMap<String, Integer> score = new HashMap<>();


    final static String outputFilePath = "Scores.txt";

    public static void main(String[] args) {

        String playAgain;
        do {

            Scanner scan = new Scanner(System.in);

            int a, b, win = 0, height;
            String name;
            System.out.println("Hello. Please enter your name.");
            name = scan.next();

            System.out.println("Welcome to the Tower of Hanoi, " + name + ".\n" +
                    "The goal is to transfer all of the rings\n" +
                    "from Stack 1 to either Stack 2 or Stack 3.\n" +
                    "You can't move a bigger ring onto a smaller ring.");
            System.out.println("How tall should the Tower of Hanoi be?\n" +
                    "Enter a number between 3 and 8. (3 by default.)");
            height = scan.nextInt();
            if (height >= 3 && height <= 8) {
                for (int i = height; i >= 1; i--) {
                    stack1.add(i);
                    goalStack.add(i);
                }
            } else {
                System.out.println("That number is not between 3-8.");
                stack1.add(3);
                stack1.add(2);
                stack1.add(1);
                win = 1;
            }
            showStacks(height);
            do {
                System.out.println("Move from which stack?");
                a = scan.nextInt();
                if (a == 0) {
                    System.out.println("Goodbye :)");
                    System.exit(0);
                }
                System.out.println("To which stack?");
                b = scan.nextInt();
                move(a, b);
                showStacks(height);
                if (stack2.equals(goalStack) || stack3.equals(goalStack)) {
                    win = 1;
                    System.out.println("Congratulations, " + name + "! You finished in " + moveCount + " moves.");
                    score.put(name, moveCount);
                    writeScore(name, moveCount, height);
                }
            } while (win == 0);
            System.out.println("Would you like to play again? Yes (y) or No (n)");
            playAgain = scan.next();
            stack1.clear();
            stack2.clear();
            stack3.clear();
            goalStack.clear();
            if (playAgain.equals("n")) {
                System.out.println("Goodbye :)");
                System.exit(0);
            }
        } while (playAgain.equals("y"));
    }


    public static void move(int a, int b) {
        Integer value;
        switch (a) {
            case 1:
                if (!stack1.empty()) {
                    value = stack1.peek();
                    switch (b) {
                        case 2:
                            if (stack2.empty() || value < stack2.peek()) {
                                stack1.pop();
                                stack2.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        case 3:
                            if (stack3.empty() || value < stack3.peek()) {
                                stack1.pop();
                                stack3.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("That stack is still empty. Try again.");
                }
                break;
            case 2:
                if (!stack2.empty()) {
                    value = stack2.peek();
                    switch (b) {
                        case 1:
                            if (stack1.empty() || value < stack1.peek()) {
                                stack2.pop();
                                stack1.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        case 3:
                            if (stack3.empty() || value < stack3.peek()) {
                                stack2.pop();
                                stack3.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("That stack is still empty. Try again.");
                }
                break;
            case 3:
                if (!stack3.empty()) {
                    value = stack3.peek();
                    switch (b) {
                        case 1:
                            if (stack1.empty() || value < stack1.peek()) {
                                stack3.pop();
                                stack1.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        case 2:
                            if (stack2.empty() || value < stack2.peek()) {
                                stack3.pop();
                                stack2.push(value);
                                ++moveCount;
                            } else {
                                System.out.println("Illegal move. Try again.");
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("That stack is still empty. Try again.");
                }
                break;
            default:
                break;

        }
    }

    public static void showStacks(int height) {
        String _0 = "        |        ";
        String _1 = "       (_)       ";
        String _2 = "      (_/_)      ";
        String _3 = "     (_\\_\\_)     ";
        String _4 = "    (_/_/ /_)    ";
        String _5 = "   (_\\_\\_\\_\\_)   ";
        String _6 = "  (_/_/_/_/_/_)  ";
        String _7 = " (_\\_\\_\\_\\_\\_\\_) ";
        String _8 = "(_/_/_/_/_/_/_/_)";

        Iterator<Integer> itr1 = stack1.iterator();
        Iterator<Integer> itr2 = stack2.iterator();
        Iterator<Integer> itr3 = stack3.iterator();

        ArrayList<Integer> stack1List = new ArrayList<>();
        ArrayList<Integer> stack2List = new ArrayList<>();
        ArrayList<Integer> stack3List = new ArrayList<>();

        while (itr1.hasNext()) {
            stack1List.add(itr1.next());
        }
        while (itr2.hasNext()) {
            stack2List.add(itr2.next());
        }
        while (itr3.hasNext()) {
            stack3List.add(itr3.next());
        }
        var stacks = new ArrayList<ArrayList<Integer>>() {{
            add(stack1List);
            add(stack2List);
            add(stack3List);
        }};

        for (int i = height - 1; i >= 0; i--) {
            for (ArrayList list : stacks) {
                try {
                    if (list.get(i).equals(0)) {
                        System.out.println(_0);
                    } else if (list.get(i).equals(1)) {
                        System.out.print(_1);
                    } else if (list.get(i).equals(2)) {
                        System.out.print(_2);
                    } else if (list.get(i).equals(3)) {
                        System.out.print(_3);
                    } else if (list.get(i).equals(4)) {
                        System.out.print(_4);
                    } else if (list.get(i).equals(5)) {
                        System.out.print(_5);
                    } else if (list.get(i).equals(6)) {
                        System.out.print(_6);
                    } else if (list.get(i).equals(7)) {
                        System.out.print(_7);
                    } else if (list.get(i).equals(8)) {
                        System.out.print(_8);
                    }
                } catch (Exception e) {
                    System.out.print(_0);
                }
            }
            System.out.println();
        }
        System.out.println("[_______1_______][_______2_______][_______3_______]");
    }

    public static void writeScore(String name, int moveCount, int height) {
        File file = new File(outputFilePath);
        BufferedWriter bf;
        try {
            bf = new BufferedWriter(new FileWriter(file, true));
            bf.write("Time: " + LocalDateTime.now() + ", Height: "  + height + ", Name: "  + name + ", Move Count: " + moveCount);
            bf.newLine();
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

