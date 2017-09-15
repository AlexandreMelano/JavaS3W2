package javas3w2;

import java.io.FileNotFoundException;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Formatter;

/**
 *
 * @author User1
 */
public class RandomExceptions {
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
        SecureRandom random = new SecureRandom();
        Formatter errorLog = new Formatter("exceptions.csv");
        
        
        for (int i=1; i <= 100000; i++)
        {
            try
            {
             generateException(random.nextInt(100));   
            }//end of try
            catch (Exception e)
                    {
                       errorLog.format("Time %s, Exception: %s%n", LocalDateTime.now(), e.getMessage());
                    }//end of catch
           
        }//end of for
        errorLog.close();
    }//end of main
    
    /**
     * This method will generate random exceptions based on the argument
     */
    public static void generateException(int exceptionNum) throws Exception
    {
      if (exceptionNum == 0) 
          throw new Exception("Wrong password");
      else if (exceptionNum == 1)
          throw new Exception("Long API response time");
      else if (exceptionNum % 3 == 0)
          throw new Exception("Invalid input");
      else if (exceptionNum >= 2)
          throw new Exception("Programmingon a sunny day causes exceptions");
    }//end of generateException
 
    
    
    
    
    
    
}//end of class
