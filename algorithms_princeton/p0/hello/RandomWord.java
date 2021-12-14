/******************************************************************************
 *  Compilation:  javac-algs4 RandomWord.java
 *  Execution:    java-algs4 RandomWord
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord { 
    
    public static void main(String[] args) {

        // Initalize count of word 
        int count = 0; 
        String champion = "";  
        
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            count++; 
           
            // Determine probability of word  
            double p = 1.0/count; 
            boolean printWord = StdRandom.bernoulli(p);  

            // Determine if probability true 
            if (printWord) { 
                champion = s;   
            }  
                   
        }
        StdOut.println(champion);  
        
    } 
} 

