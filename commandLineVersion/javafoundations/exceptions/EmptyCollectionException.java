/***********************************
James Doerhoff
11/18/11
CSC 250
Dr. Depasquale
************************************/


package javafoundations.exceptions;
public class EmptyCollectionException extends RuntimeException
{
   //------------------------------------------------------------------
   //  Sets up this exception with an appropriate message.
   //------------------------------------------------------------------
   public EmptyCollectionException (String message)
   {
      super (message);
   }
}