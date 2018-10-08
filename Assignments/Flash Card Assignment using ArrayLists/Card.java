import java.io.IOException;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class Card
{

    private static ArrayList<Flashcard> card = new ArrayList<>();
    private static boolean isDone = false;
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(args[0]));
            String data;
            int counter = 0;
            while((data = in.readLine()) != null)
            {
                String dataArr[] = data.split(args[1]);
                String question = dataArr[0];
                String answer = dataArr[1];
                card.add(new Flashcard(question,answer));
                counter ++;
            }
            run();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
        catch(IOException ioe)
        {
            System.out.println("Issues with peripheral hardware devices");
        }
        finally
        {
            try
            {
                in.close();
            }
            catch(IOException ioe)
            {
                System.out.println("Issues with peripheral hardware devices");
            }
        }
    }

    public static void run() {
        System.out.println("Your card contains " + card.size() + " flashcards.\n");
        menu();

        String scannedquestion = keyboard.next();
        while (!isDone) {
            if (scannedquestion.equals("start") || scannedquestion.equals("s")) {
                start();
                if (isDone) break;
                System.out.print("Next command: ");
                scannedquestion = keyboard.next();
            } else if (scannedquestion.equals("questions") || scannedquestion.equals("w")) {
                questions();
                System.out.print("Next command: ");
                scannedquestion = keyboard.next();
            } else if (scannedquestion.equals("review") || scannedquestion.equals("r")) {
                review();
                System.out.print("Next command: ");
                scannedquestion = keyboard.next();
            } else if (scannedquestion.equals("exit")) {
                exit();
            } else {
                System.out.println("Unrecongnized command, so the program will exit.");
                exit();
            }
        }
    }

    public static void menu() {
        System.out.println("List of available commands:\n" +
                "start - begins the training program\n" +
                "questions - lists the questions in the card\n" +
                "review - lists the questions and answers in the card\n\n" +
                "Note: you can type \"exit\" to leave the program whenever\n");
    }

    public static void start() {
        System.out.println("Press the 'enter' key to start and advance to the next question.");
        System.out.println("Press the 'r' key to review and place the term back in the card.");
        System.out.println("Press the 's' key to view statistics on the quiz.");
        String scannedquestion = "\n";
        Flashcard tempCard = null;
        boolean isNewcard = true;

        ArrayList<Flashcard> localcard = new ArrayList<>(card);

        while (!isDone) {
            scannedquestion = keyboard.nextLine();
            if (scannedquestion.equals("exit")) {
                exit();
            } else if (scannedquestion.equals("")) {
              try
              {
                for(int iterator = 0 ; iterator < 100 ; iterator += 20)
                {
                    System.out.print(iterator + "%");
                    System.out.print("...");
                    Thread.sleep(500);
                }
                System.out.println("100% " + "\n" + "Done.");
                // System.out.println('\n');
                if (!isNewcard) System.out.println("answer: " + tempCard.getanswer());
                isNewcard = false;
              }
              catch(InterruptedException ie)
              {
                  System.out.println("Process Interrupted.");
              }
                // if (!isNewcard) System.out.println("answer: " + tempCard.getanswer());
                // isNewcard = false;
                int index = (int) (Math.random() * localcard.size());
                if (localcard.size() == 0) {
                    System.out.println("\nYou have successfully completed " + card.size() + " flashcards. Returning to main menu!");
                    break;
                }
                System.out.println("\nquestion: " + localcard.get(index).getquestion());
                tempCard = new Flashcard(localcard.get(index).getquestion(), localcard.get(index).getanswer());
                localcard.remove(index);
            } else if (scannedquestion.equals("s")) {
                System.out.println("Total questions: " + card.size() + "\nNumber of completed cards: "
                        + (int)(card.size() - localcard.size()) + "\nNumber of remaining cards: " + localcard.size());
            } else if (scannedquestion.equals("r")) {
                localcard.add(tempCard);
              }
            // } else {
                // System.out.println("Unrecognized command.");
            // }
        }
    }

    public static void questions() {
        System.out.println();
        int counter = 1;
        for (Flashcard f: card) {
            System.out.println(counter + ". " + f.getquestion() + "\n");
            counter++;
        }
    }

    public static void review() {
        System.out.println();
        int counter = 1;
        for (Flashcard f: card) {
            System.out.println(counter + ". " + f.getquestion() + ": " + f.getanswer() + "\n");
            counter++;
        }
    }

    public static void exit() {
        isDone = true;
    }
}
