import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FlashCardsData implements CardSearchable
{
    private FlashCard[] flashcards = new FlashCard[5];
    public FlashCardsData(){}

      /*
      ----------------------------------------------------------------------
      Calling Card Search method from the interface
      ----------------------------------------------------------------------
      */

    public Card searchCard(String subject)
    {
    FlashCard[] localCards;
        try
        {
            localCards = searchSubject(subject);
            // int cardIndex = (int)(Math.random() * localCards.length);
              Random random = new Random();
              int index = random.nextInt(localCards.length);
              if (index==0){
                  index += 1;
              }
              System.out.println(index);
              return localCards[index];
        }
        catch (CardNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }
        return null;
    }

    /*
    ----------------------------------------------------------------------
    Loading the data using the card setters and FlashCard Object which is a child to Cards
    ----------------------------------------------------------------------
    */

    void loadData()
    {
        BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader("./cardsData.txt"));
            String data;
            int counter = 0;
            while((data = in.readLine()) != null)
            {
                String cardArray[] = data.split(";");
                String subject = cardArray[0];
                String question = cardArray[1];
                String answer = cardArray[2];
                flashcards[counter] = new FlashCard(subject,question,answer);
                counter ++;
            }
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

    /*
    ----------------------------------------------------------------------
    Getting the subjects from static array and cross checking correspondense
    ----------------------------------------------------------------------
    */

    public String[] getSubjectsFromFlashCard()
    {
          String[] subjects = new String[5];
          for(int iterator = 0 ; iterator < flashcards.length ; iterator ++)
          {
                if(!subjects.equals(flashcards[iterator].getSubject()))
                {
                    subjects[iterator] = flashcards[iterator].getSubject();
                }
          }
          return subjects;
    }

    /*
    ----------------------------------------------------------------------
    Searching the subject and throwing error if not present
    ----------------------------------------------------------------------
    */

    public FlashCard[] searchSubject(String subject) throws CardNotFoundException
    {
        FlashCard[] localFlashCards = new FlashCard[5];
        for(int iterator = 0 ; iterator < localFlashCards.length ; iterator ++)
        {
            if(flashcards[iterator].getSubject().equals(subject))
            {
                localFlashCards[iterator] = flashcards[iterator];
            }
        }
        if(localFlashCards.length == 0)
        {
            throw new CardNotFoundException("The card is not available");
        }
        return localFlashCards;
    }
}
