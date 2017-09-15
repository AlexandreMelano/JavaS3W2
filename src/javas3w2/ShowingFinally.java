package javas3w2;

/**
 *
 * @author User1
 */
public class ShowingFinally {
    
    public static void main(String[] args)
    {
        try{
           throwsException();
        }//end of try
        catch(Exception exception)
        {
            System.err.println("Exception handled in main method");
        
        }//end of catch
        doesNotThrowException();
        
    }//end of main
        
    public static void throwsException() throws Exception
    {
        try
        {
            System.err.println("Method throwsException");
            throw new Exception();
        }//end of try
        catch(Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally
        {
            System.err.println("Finally executed in throwException");
        }//end of finally
    }//end of throwException
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method does not throw exception");
        }//end of try
        catch (Exception e)
            {
            System.err.println(e);
            }
        finally
        {
            System.err.println("Finally executed in doesNotThrowException");
        }//end of finally
        System.out.println("End of something");
        
    }//end of doesNotThrow
    
}//end of class
