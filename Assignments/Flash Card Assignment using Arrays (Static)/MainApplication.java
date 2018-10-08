import java.util.Scanner;
public class MainApplication
{
    public static void execute()
    {
        FlashCardsData flashCardsData = new FlashCardsData();
        //Call loadData from FlashCardsData class
        flashCardsData.loadData();
        String[] subjects = flashCardsData.getSubjectsFromFlashCard();
        System.out.println(subjects[0]);
        System.out.println(subjects[3]);
        // for (int iterator = 0 ; iterator < subjects.length ; iterator ++)
        // {
            // System.out.println((iterator + 1) + " : " + subjects[iterator]);
        // }
        System.out.println("Choose Subject by typing in the subject name : ");
        Scanner scanner = new Scanner(System.in);
        String subjectInput = scanner.nextLine();

        Card card = flashCardsData.searchCard(subjectInput);
        System.out.println(card.getQuestion())  ;
        try
        {
            for(int iterator = 0 ; iterator < 100 ; iterator += 20)
            {
              Thread.sleep(1000);
              System.out.print("....." + iterator + "%");
            }
            System.out.print(".....100%");
            System.out.print("\n");
            System.out.println("Answer : " + card.getAnswer());
        }
        catch (InterruptedException ie)
        {
            System.out.println("Process Terminated.");
        }
    }

    /*
    ----------------------------------------------------------------------
    MAIN
    ----------------------------------------------------------------------
    */
    public static void main(String args[])
    {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                             WELCOME                                    ");
        System.out.println("                  The subjects are listed below                         ");
        System.out.println("                  type 'exit' and enter to quit                         ");
        System.out.println("                  type 'start' and enter to start                       ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        // execute();
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while(status)
        {
            System.out.println("Type command");
            String commandInput = scanner.nextLine();
            switch(commandInput)
            {
                case "start":
                  execute();
                  break;

                case "exit":
                  status = false;
                  break;

                default :
                  System.out.println("Command not found");
                  break;
            }
        }
    }
}
