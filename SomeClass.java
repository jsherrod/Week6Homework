package edu.gcccd.csis;

public class SomeClass
{

    // default constructor that throws an exception
    public SomeClass() throws Exception
    {
        String ab = "Exception test";
    }

    // constructor with one parameter that throws an exception
    public SomeClass(int inputNum) throws Exception
    {
        int num = inputNum/0;
    }

    // main method utilizes multiple try-catch statements to output
    //   exceptions if needed.
    public static void main(String[] args)
    {
        // try-catch that checks the constructor with one parameter
        try
        {
            SomeClass number = new SomeClass(34);
            System.out.println("Words in the first try.");
        }

        catch (Exception e)
        {
            System.out.println("Exception in the first catch.");
            System.out.println("Exception was " + e.toString());
        }
        System.out.println();

        // try-catch that checks the default constructor
        try
        {
            SomeClass words = new SomeClass();
            System.out.println("Words in the second try.");
        }

        catch (Exception e)
        {
            System.out.println("Exception in the second catch.");
            System.out.println("Exception was " + e.toString());
        }
    }
}