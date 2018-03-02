package French;

import java.awt.*;
import java.util.*;

public class FrenchProgram
{
    public static final Scanner CONSOLE = new Scanner (System.in);
    public static final int WIDTH = 900;
    public static final int HEIGHT = 400;

    //The main method prints the option menu and calls the appropriate method based on the user's option.
    public static void main (String [] args)
    {
        System.out.println("French Language Program \n 1) Show Flags \n 2) Conjugate a verb \n Choose an option");
        int option=CONSOLE.nextInt();

        if (option == 1)
        {
            DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
            Graphics g = dp.getGraphics();
            showFlags(g);
        }
        else if (option == 2)
        {
            conjugateVerb();
        }
        else
        {
            System.out.println("That is not a valid option!");
        }
    }

    //This method calls the methods that draw each individual flag and only runs if the user chooses option 1.
    public static void showFlags(Graphics g)
    {
        for (int i=0; i<=200; i=i+200)
        {
            for (int j=0; j<=600; j=j+300)
            {
                if (j == 0 && i == 0)
                {
                    drawMonaco(g,j,i);
                    drawBelgium(g,j,i);
                    drawChad(g,j,i);
                }

                else if(j == 0 && i == 200)
                {
                    drawFrance(g,j,i);
                    drawGuinea(g,j,i);
                    drawCotedivoire(g,j,i);
                }
                g.setColor(Color.BLACK);
                g.drawRect(0,HEIGHT/2,WIDTH,0);
            }
        }
    }

    public static void drawMonaco(Graphics g, int j, int i)//This method draws the flag of Monaco.
    {
        g.setColor(Color.BLACK);
        g.drawRect(j+300,i,300,200);
        g.drawRect(j,i,0,200);
        g.setColor(Color.RED);
        g.fillRect(j,i,300,100);
        g.setColor(Color.WHITE);
        g.fillRect(j,i+100,300,100);
    }

    public static void drawBelgium(Graphics g,int j, int i)//This method draws the flag of Belgium.
    {
        g.setColor(Color.BLACK);
        g.fillRect(300,0,300,200);
        g.setColor(Color.YELLOW);
        g.fillRect(400,0,400,200);
        g.setColor(Color.RED);
        g.fillRect(500,0,500,200);
        g.setColor(Color.BLACK);
        g.drawRect(600,200,600,400);
    }

    public static void drawChad(Graphics g, int j, int i)//This method draws the flag of Chad.
    {
        g.setColor(Color.BLUE);
        g.fillRect(600,0,600,200);
        g.setColor(Color.YELLOW);
        g.fillRect(700,0,700,200);
        g.setColor(Color.RED);
        g.fillRect(800,0,800,200);
    }

    public static void drawFrance(Graphics g, int j, int i)//This method draws the flag of France.
    {
        g.setColor(Color.BLUE);
        g.fillRect(j,i,300,400);
        g.setColor(Color.WHITE);
        g.fillRect(j+100,i,300,400);
        g.setColor(Color.RED);
        g.fillRect(j+200,i,300,400);
        g.setColor(Color.BLACK);
        g.drawLine(j,i,300,200);
    }

    public static void drawGuinea(Graphics g, int j, int i)//This method draws the flag of Guinea.
    {
        g.setColor(Color.RED);
        g.fillRect(300,200,200,400);
        g.setColor(Color.BLACK);
        g.drawRect(600,200,600,400);
        g.setColor(Color.YELLOW);
        g.fillRect(400,200,400,400);
        g.setColor(Color.GREEN);
        g.fillRect(500,200,600,400);
        g.setColor(Color.BLACK);
        g.drawLine(300,200,300,400);
        g.drawLine(600,0,600,200);
        g.drawLine(300,200,600,200);
    }

    public static void drawCotedivoire(Graphics g, int j, int i)//This method draws the flag of Cote d'Ivoire.
    {
        g.setColor(Color.ORANGE);
        g.fillRect(600,200,600,400);
        g.setColor(Color.WHITE);
        g.fillRect(700,200,700,400);
        g.setColor(Color.GREEN);
        g.fillRect(800,200,800,400);
        g.setColor(Color.BLACK);
        g.drawRect(600,200,900,200);
    }

    /*This method runs if the user chooses option 2, it asks the user to enter a French verb and then runs the method
    that correctly conjugates it based on the ending.*/
    public static void conjugateVerb()
    {
        System.out.println("Enter a French verb to conjugate.");
        String verb=CONSOLE.next();

        String NewVerb=(verb.toLowerCase());

        if (NewVerb.endsWith("ir"))
        {
            conjugateIr(NewVerb);
        }
        else if (NewVerb.endsWith("er"))
        {
            conjugateEr(NewVerb);
        }
        else if (NewVerb.endsWith("re"))
        {
            conjugateRe(NewVerb);
        }
        else
        {
            System.out.println("This is not a valid verb!");
        }

    }
    public static void conjugateIr(String ir)//This method conjugates verbs ending in "-ir".
    {
        String a=ir.substring(0,ir.length()-2);

        System.out.printf("je %sis %n", a);
        System.out.printf("tu %sis %n", a);
        System.out.printf("elle %sit %n", a);
        System.out.printf("nous %sissons %n", a);
        System.out.printf("vous %sissez %n", a);
        System.out.printf("elles %sissent %n", a);
    }

    public static void conjugateEr(String er)//This method conjugates verbs ending in "-er".
    {
        String b=er.substring(0,er.length()-2);

        System.out.printf("je %se %n", b);
        System.out.printf("tu %ses %n", b);
        System.out.printf("elle %se %n", b);
        System.out.printf("nous %sons %n", b);
        System.out.printf("vous %sez %n", b);
        System.out.printf("elles %sent %n", b);
    }

    public static void conjugateRe(String re)//This method conjugates verbs ending in "-re".
    {
        String c=re.substring(0,re.length()-2);

        System.out.printf("je %ss %n", c);
        System.out.printf("tu %ss %n", c);
        System.out.printf("elle %s %n", c);
        System.out.printf("nous %sons %n", c);
        System.out.printf("vous %sez %n", c);
        System.out.printf("elles %sent %n", c);
    }
}

