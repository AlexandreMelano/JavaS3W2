package javas3w2;

/**
 *
 * @author User1
 */
public class UsingExceptions {
   
    public static void main(String[] args)
    {
        try
        {
            method1();
            
        }//end of try
        catch (Exception e)
        {
            System.err.printf("%s%n%n", e.getMessage());
            
            //obstain the stack track elements
            StackTraceElement[] traceElements = e.getStackTrace();
            
            System.out.printf("\"%nStack trace from getStackTrace:%n");
            System.out.printf("%20s %20s %10s %10s%n", "Class", "File", "Line", "Method");
            
            //loop through the trace elements every loop throught traceelements is a stackTrace element
            for (StackTraceElement element : traceElements)
            {
                System.out.printf("%20s ", element.getClassName());
                System.out.printf("%20s ", element.getFileName());
                System.out.printf("%5d ", element.getLineNumber());
                System.out.printf("%10s", element.getMethodName());
                
                System.out.println();
            }
            
        }//end of catch
        
    }//end of main
   
    public static void method1() throws Exception
    {
        method2();
    }//end of method1
    
    public static void method2() throws Exception
    {
        method3();
    }
    
    public static void method3() throws Exception
    {
        throw new Exception("Exception throws in method 3");
    }
    
    
    
    
}//end of class
