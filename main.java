import java.io.*;
import java.util.*;
import java.text.*;
public class MathematicaImpetus
{
    public static void main()throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMMMMMMMMMM/yyyy //EEEEEEEEEEEE//");
        System.out.println(sdf.format(date));
        String st3="Only enter number pal, coz we care for you";
        String st1="Hello World";
        String st4="May we start Y or N?";
        String st2="Welcome to Mathematica Impetus";
        String st5="A popular qoute by Albert Einstein";
        String st6="Sceince without Religion is lame, Religion without Science is blind";
        for(int i=0;i<st1.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(st1.charAt(i));
        }
        System.out.println();
        for(int i=0;i<st2.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(st2.charAt(i));
        }
        System.out.println();
        for(int i=0;i<st3.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(st3.charAt(i));
        }
        System.out.println();
        for(int i=0;i<20;i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(st4.charAt(i));
        }
        System.out.println();
        String li=ob.readLine();int trp=0;
        while(li.equalsIgnoreCase("Y"))
        {
            System.out.println("What do you wanna do??");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("1.Addition,Subtraction,Multiplication,Division");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("2.Factorials");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("3.Factors and Multiples");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("4.Powers & Roots");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("5.Profit Loss and Discount");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("6.Interests(Simple and compound)");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("7.Quadratic Equations");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("8.Pythagorus' corner");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("9.Trigonometry");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("10.Mensuration");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("11.Binary conversions");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("12.Digit calculus");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("13.Fun with numbers");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("14.Mean");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("15.Temperature conversions");
            for(int j=1;j<=75;j++)
            {
                try
                {
                    Thread.sleep(8);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print("-");
            }
            System.out.println();
            System.out.println("Enter your choice");
            String x=ob.readLine();
            if(x.equalsIgnoreCase("1"))
            {   
                double ari,on;
                double art=0;
                System.out.println("Enter first number");
                double fn=Double.parseDouble(ob.readLine());
                System.out.println("Enter operator");
                String op=ob.readLine();
                if(op.equalsIgnoreCase("+"))
                {
                    System.out.println("Enter other number");
                    on=Double.parseDouble(ob.readLine());
                    art=fn+on;
                }
                else if(op.equalsIgnoreCase("-"))
                {
                    System.out.println("Enter other number");
                    on=Double.parseDouble(ob.readLine());
                    art=fn-on;   
                }
                else if(op.equalsIgnoreCase("*"))
                {
                    System.out.println("Enter other number");
                    on=Double.parseDouble(ob.readLine());
                    art=fn*on;
                }
                else if(op.equalsIgnoreCase("/"))
                {
                    System.out.println("Enter other number");
                    on=Double.parseDouble(ob.readLine());
                    art=fn/on;
                }
                System.out.println("User do you want to enter another number? Y or N");
                String oth=ob.readLine();
                while(oth.equalsIgnoreCase("Y"))
                {
                    System.out.println("Enter operator");
                    op=ob.readLine();
                    if(op.equalsIgnoreCase("+"))
                    {
                        System.out.println("Enter other number");
                        on=Double.parseDouble(ob.readLine());
                        art=art+on;
                    }
                    else if(op.equalsIgnoreCase("-"))
                    {
                        System.out.println("Enter other number");
                        on=Double.parseDouble(ob.readLine());
                        art=art-on;   
                    }
                    else if(op.equalsIgnoreCase("*"))
                    {
                        System.out.println("Enter other number");
                        on=Double.parseDouble(ob.readLine());
                        art=art*on;
                    }
                    else if(op.equalsIgnoreCase("/"))
                    {
                        System.out.println("Enter other number");
                        on=Double.parseDouble(ob.readLine());
                        art=art/on;
                    }
                    System.out.println("User do you want to enter another number? Y or N");
                    oth=ob.readLine();   
                }
                System.out.println("The answer is "+art);
            }
            else if(x.equalsIgnoreCase("2"))
            {
                System.out.println("Enter the number");
                long fac=1;
                long lim=Long.parseLong(ob.readLine());
                if(lim==0)
                    System.out.println("1");
                else{
                    for(long i=1;i<=lim;i++)
                    {
                        fac=fac*i;
                    }}
                System.out.println("The factorial for "+lim+" is "+fac);
            }
            else if(x.equalsIgnoreCase("3"))
            {
                System.out.println("a.factors");
                System.out.println("b.multiples");
                System.out.println("c.HCF");
                System.out.println("d.LCM");
                System.out.println("e.primefactors");
                System.out.println("f.primefactorisation");
                System.out.println("Enter Choice");
                String choice=ob.readLine();
                if(choice.equalsIgnoreCase("a"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine());
                    System.out.println("Your factors are ---->");
                    for(long i=1;i<=num;i++)
                    {
                        if(num%i==0)
                        {
                            System.out.println(i);
                        }
                    }
                }
                else if(choice.equalsIgnoreCase("b"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine());
                    System.out.println("Enter a limit coz u know that multiples are unlimited in number...");
                    long mul=Long.parseLong(ob.readLine());
                    System.out.println("Your multiples are ---->");
                    long p=0;
                    for(long i=1;i<=mul;i++)
                    {
                        System.out.println(num*i);
                    }
                }
                else if(choice.equalsIgnoreCase("c"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine());
                    System.out.println("Enter another number");
                    long oth=Long.parseLong(ob.readLine());
                    long h=0,i;
                    for(i=2;i<=num;i++)
                    {
                        if(num%i==0&&oth%i==0)
                        {
                            h=i;
                        }
                    }
                    System.out.println("Your HCF is "+h);
                }
                else if(choice.equalsIgnoreCase("d"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine());
                    System.out.println("Enter another number");
                    long oth=Long.parseLong(ob.readLine());
                    long h=0,i;
                    for(i=1;i<=(num*oth);i++)
                    {
                        if(i%num==0&&i%oth==0)
                        {
                            h=i;
                            break;
                        }
                    }
                    System.out.println("Your LCM is "+h);   
                }
                else if(choice.equalsIgnoreCase("e"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine()); 
                    long i,j,c=0,n=num;
                    System.out.println("Your factors are --->");
                    for(i=1;i<=n;i++)
                    {
                        if(n%i==0)
                        {
                            c=0;
                            for(j=1;j<=i;j++)
                            {
                                if(i%j==0)
                                {
                                    c++;
                                }
                            }
                            if(c==2)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                }
                else if(choice.equalsIgnoreCase("f"))
                {
                    System.out.println("Enter a number");
                    long num=Long.parseLong(ob.readLine()); 
                    long i=1,j,c=0;
                    System.out.println("The primefactorisation for this is----->"); 
                    while(i<=num)
                    {
                        if(num%i==0)
                        {
                            c=0;
                        }
                        for(j=1;j<=i;j++)
                        {
                            if(i%j==0)
                            {
                                c++;
                            }
                        }
                        if(c==2)
                        {
                            num=num/i;
                            System.out.println(i);
                        }
                        else
                        {
                            i++;
                        }
                    }
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("4"))
            {
                System.out.println("1.Power");
                System.out.println("2.Roots");
                System.out.println("Enter choice");
                int ch=Integer.parseInt(ob.readLine());
                switch(ch)
                {
                    case 1:
                    System.out.println("input a number");
                    double num=Double.parseDouble(ob.readLine());
                    System.out.println("input power");
                    double pow=Double.parseDouble(ob.readLine());
                    double np=Math.pow(num,pow);
                    System.out.println("answer---->"+np);
                    break;
                    case 2:
                    System.out.println("input a number");
                    double nu=Double.parseDouble(ob.readLine());
                    System.out.println("input root(only 2 or 3)");
                    double root=Double.parseDouble(ob.readLine());
                    double rt;
                    if(root==2)
                    {
                        rt=Math.sqrt(nu);
                        System.out.println(rt);
                    }
                    else if(root==3)
                    {
                        rt=Math.cbrt(nu);
                        System.out.println(rt);
                    }
                    else
                    {
                        System.out.println("Sorry, I cannot do this");
                    }
                    break;
                    default:
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("5"))
            {
                double dc,nsp;
                double p,pp,l,lp;
                System.out.println("Enter Cost price");
                double CP=Double.parseDouble(ob.readLine());
                System.out.println("Enter MRP");
                double SP=Double.parseDouble(ob.readLine());
                System.out.println("Hey Buddy,wanna input some discount?Y or N?");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("y"))
                {
                    System.out.println("Will you enter in (1.)percentage or (2.)absolute value??");
                    System.out.println("just enter the serial number my man");
                    String wer=ob.readLine();
                    if(wer.equalsIgnoreCase("2"))
                    {
                        System.out.println("Enter discount");
                        dc=Double.parseDouble(ob.readLine());
                        nsp=SP-dc;
                    }
                    else
                    {
                        System.out.println("Enter discount");
                        dc=Double.parseDouble(ob.readLine());
                        nsp=SP-(dc/100)*SP;
                    }
                    if(nsp>CP)
                    {
                        p=(nsp-CP);
                        pp=(p/CP)*100;
                        System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("profit="+p);
                        System.out.println("profit percent=" +pp +"%");
                    }
                    else if(nsp<CP)
                    {
                        l=(CP-nsp);
                        lp=(l/CP)*100;
                        System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("loss"+l);
                        System.out.println("loss percent="+lp+"%");
                    }
                    else
                    {
                        System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("no profit no loss");
                    }
                }
                else
                {
                    if(SP>CP)
                    {
                        p=(SP-CP);
                        pp=(p/CP)*100;
                        System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("profit="+p);
                        System.out.println("profit percent=" +pp +"%");
                    }
                    else if(SP<CP)
                    {
                        l=(CP-SP);
                        lp=(l/CP)*100;
                        System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("loss"+l);
                        System.out.println("loss percent="+lp+"%");
                    }
                    else
                    {
                        System.out.println("no profit no loss");
                    }
                }
            }
            else if(x.equalsIgnoreCase("6"))
            {
                System.out.println("a.simple");
                System.out.println("b.compound");
                System.out.println("Please enter your INTEREST(i mean, choice)");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("a"))
                {
                    System.out.println("Enter principle");
                    double p,r,t;
                    p=Double.parseDouble(ob.readLine());
                    System.out.println("Enter Time");
                    t=Double.parseDouble(ob.readLine());
                    System.out.println("Enter rate");
                    r=Double.parseDouble(ob.readLine());
                    double k;
                    double a;
                    k=(p*r*t)/100;
                    System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("The simple interest is Rs" +k);
                    System.out.println("The amount is Rs" +(p+k));
                }
                else if(fgh.equalsIgnoreCase("b"))
                {
                    System.out.println("Enter principle");
                    double p,r,t;
                    p=Double.parseDouble(ob.readLine());
                    System.out.println("Enter n");
                    t=Double.parseDouble(ob.readLine());
                    System.out.println("Enter rate");
                    r=Double.parseDouble(ob.readLine());
                    double o=(100+r)/100;
                    double a=Math.pow(o,t);
                    double am=p*a;
                    double ci=am-p;
                    System.out.println("Hmmmmm,let me recheck it,you know na,MONEY MATTERS!!");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("amount is"+am+" rupees");
                    System.out.println("compound interest is"+ci+" rupees");
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("7"))
            {
                double a,b,c;
                System.out.println("Enter coefficient of x square");
                a=Double.parseDouble(ob.readLine());
                System.out.println("Enter coefficient of x");
                b=Double.parseDouble(ob.readLine());
                System.out.println("Enter constant");
                c=Double.parseDouble(ob.readLine());
                double d=(b*b-4*a*c);
                if(d>0)
                {
                    double t=Math.sqrt(d);
                    double x1=(-b+t)/(2*a);
                    double x2=(-b-t)/(2*a);
                    System.out.println("Roots are real & unequal--->"+x1+" "+x2);
                }
                else if(d==0)
                {
                    double x1=(-b/2*a);
                    System.out.println("Roots are real & equal"+x1);
                }
                else
                {
                    System.out.println("Roots are imaginary");
                }
            }
            else if(x.equalsIgnoreCase("8"))
            {
                System.out.println("What do you wanna do??");
                System.out.println("a.Pythagorian triplets");
                System.out.println("FIND-->");
                System.out.println("b.Hypotenuse");
                System.out.println("c.Base");
                System.out.println("d.Perpendicular");
                System.out.println("Enter your choice");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("a"))
                {
                    System.out.println("Enter hypotenuse");
                    long hyp=Long.parseLong(ob.readLine());
                    long b,c=0,d=0,h=0,i;
                    b=hyp*hyp;
                    for(c=1;c<=b;c++)
                    {
                        for(d=1;d<=b;d++)
                        {
                            if(b==(c*c)+(d*d))
                            {
                                for(i=1;i<=hyp;i++)
                                {
                                    if(hyp%i==0&&c%i==0&&d%i==0)
                                    {
                                        h=i;
                                    }
                                }
                                break;
                            }
                        }
                        if(b==(c*c)+(d*d))
                        {
                            break;
                        }
                    }
                    if(h>0)
                    {
                        System.out.println("your triplets are---->"+(hyp/h)+","+(d/h)+","+(c/h));
                    }
                    else
                    {
                        System.out.println("no triplets");
                    }
                }
                else if(fgh.equalsIgnoreCase("b"))
                {
                    System.out.println("Enter perpendicular and base rsply");
                    double perp=Double.parseDouble(ob.readLine());
                    double base=Double.parseDouble(ob.readLine());
                    double hyp=Math.sqrt((perp*perp)+(base*base));
                    System.out.println("The hypotenuse is"+hyp);
                }
                else if(fgh.equalsIgnoreCase("c"))
                {
                    System.out.println("Enter hypotenuse and perpendicular rsply");
                    double perp=Double.parseDouble(ob.readLine());
                    double base=Double.parseDouble(ob.readLine());
                    double hyp=Math.sqrt((perp*perp)-(base*base));
                    System.out.println("The base is"+hyp);
                }
                else if(fgh.equalsIgnoreCase("d"))
                {
                    System.out.println("Enter hypotenuse and base rsply");
                    double perp=Double.parseDouble(ob.readLine());
                    double base=Double.parseDouble(ob.readLine());
                    double hyp=Math.sqrt((perp*perp)-(base*base));
                    System.out.println("The perpendicular is"+hyp);
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
                System.out.println("FACT:The Pythagorus theorem known today was given by BUDDHAYAN,an Indian Mathematician");
                System.out.println("Grrrrr......these Europeans..........");
            }
            else if(x.equalsIgnoreCase("9"))
            {
                System.out.println("What do you want to find");
                System.out.println("i.Sin");
                System.out.println("ii.Cos");
                System.out.println("iii.Tan");
                System.out.println("iv.Cosec");
                System.out.println("v.Sec");
                System.out.println("vi.Cot");
                System.out.println("Enter Choice");
                String fgh=ob.readLine();
                System.out.println("Will you the enter value in (1.)theta or (2.)radians?");
                int qwer=Integer.parseInt(ob.readLine());double theta=0;
                if(qwer==1){System.out.println("Enter the value of theta");
                    double thet=Double.parseDouble(ob.readLine());
                    theta=thet*(Math.PI/180);}
                else if(qwer==2){System.out.println("Enter the value in radians");theta=Double.parseDouble(ob.readLine());}
                else
                {System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
                if(fgh.equalsIgnoreCase("i"))
                {
                    double p=Math.sin(theta);
                    System.out.println(p);
                }
                else if(fgh.equalsIgnoreCase("ii"))
                {
                    double p=Math.cos(theta);
                    System.out.println(p);
                }
                else if(fgh.equalsIgnoreCase("iii"))
                {
                    double p=Math.tan(theta);
                    System.out.println(p);
                }
                else if(fgh.equalsIgnoreCase("iv"))
                {
                    double p=Math.sin(theta);
                    System.out.println(1/p);
                }
                else if(fgh.equalsIgnoreCase("v"))
                {
                    double p=Math.cos(theta);
                    System.out.println(1/p);
                }
                else if(fgh.equalsIgnoreCase("vi"))
                {
                    double p=Math.tan(theta);
                    System.out.println(1/p);
                }
                else
                {
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("10"))
            {
                System.out.println("Enter your choice");
                System.out.println("1.Area");
                System.out.println("2.Volume");
                System.out.println("3.Perimeter");
                System.out.println("4.Surface area");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("1"))
                {
                    System.out.println("Area of---->");
                    System.out.println("1.Circle");
                    System.out.println("2.Square");
                    System.out.println("3.Rectangle");
                    System.out.println("4.Polygon");
                    System.out.println("5.Trapezium");
                    System.out.println("6.Parallelogram");
                    System.out.println("7.Rhombus");
                    System.out.println("8.Triangle");
                    System.out.println("9.Semi circle");
                    System.out.println("10.Ellipse");
                    System.out.println("Enter choice");
                    int ch=Integer.parseInt(ob.readLine());
                    double l,r,ar,b,h,he,pd,sd;
                    System.out.println("Area -->");
                    switch(ch)
                    {
                        case 1:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        ar=3.141592653589793*r*r;
                        System.out.println(ar);
                        break;
                        case 2:
                        System.out.println("Enter side");
                        l=Double.parseDouble(ob.readLine());
                        ar=l*l;
                        System.out.println(ar);
                        break;
                        case 3:
                        System.out.println("Enter length");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter breadth");
                        b=Double.parseDouble(ob.readLine());
                        ar=l*b;
                        System.out.println(ar);
                        break;
                        case 4:
                        System.out.println("Enter number of sides");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter value of 1 side");
                        b=Double.parseDouble(ob.readLine());
                        r=Math.tan(l/3.141592653589793);
                        ar=(l/4.0)*b*b*(1.0/r);
                        System.out.println(ar);
                        break;
                        case 5:
                        System.out.println("Enter the length of 1st side");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter the length of 2nd side");
                        b=Double.parseDouble(ob.readLine());
                        System.out.println("Enter height");
                        r=Double.parseDouble(ob.readLine());
                        ar=0.5*(l+b)*r;
                        System.out.println(ar);
                        break;
                        case 6:
                        System.out.println("Enter length");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter breadth");
                        b=Double.parseDouble(ob.readLine());
                        ar=l*b;
                        System.out.println(ar);
                        break;
                        case 7:
                        System.out.println("Enter length of 1st diagonal");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter length of 2nd diagonal");
                        b=Double.parseDouble(ob.readLine());
                        ar=0.5*l*b;
                        System.out.println(ar);
                        break;
                        case 9:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        ar=3.141592653589793*r*r*0.5;
                        System.out.println(ar);
                        break;
                        case 10:
                        System.out.println("Enter 1st semiaxis");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter 2nd semiaxis");
                        b=Double.parseDouble(ob.readLine());
                        ar=3.141592653589793*l*b;
                        System.out.println(ar);
                        break;
                    }
                    if(ch==8)
                    {
                        System.out.println("What do you want to enter");
                        System.out.println("a.3 sides");
                        System.out.println("b.Base and hieght");
                        String sl=ob.readLine();
                        if(sl.equalsIgnoreCase("a"))
                        {
                            System.out.println("Enter 1st side");
                            l=Double.parseDouble(ob.readLine());
                            System.out.println("Enter 2nd side");
                            b=Double.parseDouble(ob.readLine());
                            System.out.println("Enter 3rd side");
                            h=Double.parseDouble(ob.readLine());
                            he=(l+b+h)/2.0;
                            pd=he*(he-l)*(he-b)*(he-h);
                            ar=Math.sqrt(pd);
                            System.out.println(ar);
                        }
                        else
                        {
                            System.out.println("Enter base");
                            l=Double.parseDouble(ob.readLine());
                            System.out.println("Enter hieght");
                            b=Double.parseDouble(ob.readLine());
                            ar=0.5*l*b;
                            System.out.println(ar);
                        }
                    }
                }
                else if(fgh.equalsIgnoreCase("2"))
                {
                    System.out.println("Volume of---->");
                    System.out.println("1.Sphere");
                    System.out.println("2.Cube");
                    System.out.println("3.Cuboid");
                    System.out.println("4.Cone");
                    System.out.println("5.Pyramid");
                    System.out.println("6.Parallelopiped");
                    int ch=Integer.parseInt(ob.readLine());
                    double l,r,vol,b,h;
                    switch(ch)
                    {
                        case 1:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        vol=(4.0/3.0)*3.141592653589793*r*r*r;
                        System.out.println(vol);
                        break;
                        case 2:
                        System.out.println("Enter side");
                        l=Double.parseDouble(ob.readLine());
                        vol=l*l*l;
                        System.out.println(vol);
                        break;
                        case 3:
                        System.out.println("Enter length");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter breadth");
                        b=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        vol=l*b*h;
                        System.out.println(vol);
                        break;
                        case 4:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        vol=(1.0/3.0)*3.141592653589793*r*r*h;
                        System.out.println(vol);
                        break;
                        case 5:
                        System.out.println("Enter side");
                        l=Double.parseDouble(ob.readLine());
                        vol=(1.0/3.0)*l*l*l;
                        System.out.println(vol);
                        break;
                        case 6:
                        System.out.println("Enter base");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter perpendicular distance between base and side parallel to it");
                        b=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        vol=l*b*h;
                        System.out.println(vol);
                        break;
                        default:
                        System.out.println("Hmmmmm,let me search for it");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("Wrong choice");
                    }
                }
                else if(fgh.equalsIgnoreCase("3"))
                {
                    System.out.println("Enter number of sides");
                    int n=Integer.parseInt(ob.readLine());double s=0;int i;
                    double a[]=new double[n];
                    if(n==3)
                    {
                        System.out.println("Enter sides");
                        double f=Double.parseDouble(ob.readLine());
                        double g=Double.parseDouble(ob.readLine());
                        double h=Double.parseDouble(ob.readLine());
                        if(f+g<h||f+g==h)
                        {
                            System.out.println("Shape invalid");
                        }
                        else
                        {
                            for(i=0;i<n;i++)
                            {
                                a[i]=Double.parseDouble(ob.readLine());
                            }
                            for(i=0;i<n;i++)
                            {
                                s=s+a[i];
                            }
                            System.out.println("Perimeter ----> "+s);
                        }
                    }
                    else
                    {
                        for(i=0;i<n;i++)
                        {
                            a[i]=Double.parseDouble(ob.readLine());
                        }
                        for(i=0;i<n;i++)
                        {
                            s=s+a[i];
                        }
                        System.out.println("Perimeter ----> "+s);
                    }
                }
                else if(fgh.equalsIgnoreCase("4"))
                {
                    System.out.println("Surface area of---->");
                    System.out.println("1.Sphere");
                    System.out.println("2.Cube");
                    System.out.println("3.Cuboid");
                    System.out.println("4.Cone");
                    System.out.println("5.Parallelopiped");
                    System.out.println("6.Lateral surface area");
                    System.out.println("7.Curved surface area of cylinder");
                    int ch=Integer.parseInt(ob.readLine());
                    double l,r,vol,b,h;
                    switch(ch)
                    {
                        case 1:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        vol=4.0*3.141592653589793*r*r;
                        System.out.println(vol);
                        break;
                        case 2:
                        System.out.println("Enter side");
                        l=Double.parseDouble(ob.readLine());
                        vol=6.0*l*l;
                        System.out.println(vol);
                        break;
                        case 3:
                        System.out.println("Enter length");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter breadth");
                        b=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        r=(l*b)+(b*h)+(h*l);
                        vol=2.0*r;
                        System.out.println(vol);
                        break;
                        case 4:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        vol=3.141592653589793*r*(r*r+h*h);
                        System.out.println(vol);
                        break;
                        case 5:
                        System.out.println("Enter base");
                        l=Double.parseDouble(ob.readLine());
                        System.out.println("Enter perpendicular distance between base and side parallel to it");
                        b=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        r=(l*b)+(b*h)+(h*l);
                        vol=2.0*r;
                        System.out.println(vol);
                        break;
                        case 6:
                        System.out.println("Enter number of sides in area of cross section");
                        int n=Integer.parseInt(ob.readLine());double s=0;int i;
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        double a[]=new double[n];
                        if(n==3)
                        {
                            System.out.println("Enter sides");
                            double f=Double.parseDouble(ob.readLine());
                            double g=Double.parseDouble(ob.readLine());
                            double j=Double.parseDouble(ob.readLine());
                            if(f+g<j||f+g==j)
                            {
                                System.out.println("Shape invalid");
                            }
                            else
                            {
                                for(i=0;i<n;i++)
                                {
                                    a[i]=Double.parseDouble(ob.readLine());
                                }
                                for(i=0;i<n;i++)
                                {
                                    s=s+a[i];
                                }
                                System.out.println("L.S.A----> "+(s*h));
                            }
                        }
                        else
                        {
                            for(i=0;i<n;i++)
                            {
                                a[i]=Double.parseDouble(ob.readLine());
                            }
                            for(i=0;i<n;i++)
                            {
                                s=s+a[i];
                            }
                            System.out.println("L.S.A ----> "+s*h);
                        }
                        break;
                        case 7:
                        System.out.println("Enter radius");
                        r=Double.parseDouble(ob.readLine());
                        System.out.println("Enter hieght");
                        h=Double.parseDouble(ob.readLine());
                        vol=3.141592653589793*r*(r*r+h*h);
                        System.out.println(vol);
                        break;
                        default:
                        System.out.println("Hmmmmm,let me search for it");
                        try
                        {
                            Thread.sleep(3000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("Wrong choice");
                    }
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("11"))
            {
                System.out.println("What do you wanna do??");
                System.out.println("1.Binary to decimal");
                System.out.println("2.Decimal to binary");
                System.out.println("Enter your preference");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("1"))
                {
                    System.out.println("Enter a binary code");
                    long n=Long.parseLong(ob.readLine());
                    long xe=n,a,b;
                    double i,j,s=0,t=0,d,c=0;
                    while(n!=0)
                    {
                        a=n%10;
                        c++;
                        n=n/10;
                    }
                    for(i=0;i<=c;i++)
                    {
                        b=xe%10;
                        d=(long)Math.pow(2,i);
                        long df=b*(long)d;
                        t=t+df;
                        xe=xe/10;
                    }
                    System.out.println((long)t);
                }
                else if(fgh.equalsIgnoreCase("2"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=1,t=0,xe=n; 
                    while(n!=0)
                    {
                        long a=n%2;
                        s=s*10+a;
                        n=n/2;
                    }
                    while(s!=0)
                    {
                        long b=s%10;
                        t=t*10+b;
                        s=s/10;
                    }
                    System.out.println(t/10);
                }
                else
                {
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("12"))
            {
                System.out.println("1.Digit sum");
                System.out.println("2.Digit multiplication");
                System.out.println("3.Ultimate palindrome");
                System.out.println("4.Minimum digit");
                System.out.println("5.Maximum digit");
                System.out.println("6.Number reversal");
                System.out.println("Enter choice");
                System.out.println("Answer-->");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("1"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=0,xe=n;
                    while(n!=0)
                    {
                        long a=n%10;
                        s=s+a;n=n/10;
                    }
                    System.out.println("Answer-->");
                    System.out.println(s);
                }
                else if(fgh.equalsIgnoreCase("2"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=1,xe=n;
                    while(n!=0)
                    {
                        long a=n%10;
                        s=s*a;n=n/10;
                    }
                    System.out.println("Answer-->");
                    System.out.println(s);
                }
                else if(fgh.equalsIgnoreCase("3"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=0,xe=n,r=1,p=n;
                    while(s!=1)
                    {
                        while(n!=0)
                        {
                            long a=n%10;
                            s=s*10+a;
                            n=n/10;
                        }
                        if(xe==s)
                        {
                            break;
                        }
                        else
                        {
                            n=n+xe+s;
                            xe=n;s=0;
                        }
                    }
                    System.out.println("the ultimate palindrome for "+p+" is "+s+" :-)");
                }
                else if(fgh.equalsIgnoreCase("4"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long min=9;
                    while(n!=0)
                    {
                        long a=n%10;
                        if(a<min)
                        {
                            min=a;
                        }
                        n=n/10;
                    }
                    System.out.println("Answer-->");
                    System.out.print(min);
                }
                else if(fgh.equalsIgnoreCase("5"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long max=0;
                    while(n!=0)
                    {
                        long a=n%10;
                        if(a>max)
                        {
                            max=a;
                        }
                        n=n/10;
                    }
                    System.out.println("Answer-->");
                    System.out.print(max);
                }
                else if(fgh.equalsIgnoreCase("6"))
                {
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=0,a,xe=n;
                    while(n!=0)
                    {
                        a=n%10;
                        s=s*10+a;
                        n=n/10;
                    }
                    System.out.println("Answer-->");
                    System.out.println(s);
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("13"))
            {
                System.out.println("1.Palindrome");
                System.out.println("2.Armstrong");
                System.out.println("3.Smith");
                System.out.println("4.Magic");
                System.out.println("Enter choice");
                String fgh=ob.readLine();
                if(fgh.equalsIgnoreCase("1"))
                {
                    System.out.println("Palindromes are numbers which read the same from backwards as read from forward");
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=0,xe=n;
                    while(n!=0)
                    {
                        long a=n%10;
                        s=s*10+a;
                        n=n/10;
                    }
                    if(s==xe)
                    {
                        System.out.println("palindrome");
                    }
                    else
                    {
                        System.out.println("not palindrome");
                    }
                }
                else if(fgh.equalsIgnoreCase("2"))
                {
                    System.out.println("These numbers are equal to the sum of cubes of their digits");
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long xe=n,s=0,a;
                    while(n!=0)
                    {
                        a=n%10;
                        s=s+(a*a*a);
                        n=n/10;
                    }
                    if(s==xe)
                    {
                        System.out.println("armstrong");
                    }
                    else
                    {
                        System.out.println("not armstrong");
                    }
                }
                else if(fgh.equalsIgnoreCase("3"))
                {
                    System.out.println("Mr.Smith is a number whose sum of digits is equal to");
                    System.out.println("the sum of the primenumbers obtained during primfactorisation");
                    System.out.println("example: 378.");
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long xe=n,s=0,c=0,i=1,j,s1=0;
                    while(xe!=0)
                    {
                        long d=xe%10;
                        s1=s1+d;
                        xe=xe/10;
                    }
                    while(i<=n)
                    {
                        if(n%i==0)
                        {
                            c=0;
                        }
                        for(j=1;j<=i;j++)
                        {
                            if(i%j==0)
                            {
                                c++;
                            }}
                        if(c==2)
                        {
                            n=n/i;
                            s=s+i;
                        }
                        else
                        {
                            i++;
                        }
                    }
                    if(s==s1)
                    {
                        System.out.println("smith");
                    }
                    else
                    {
                        System.out.println("not a smith");
                    }
                }
                else if(fgh.equalsIgnoreCase("4"))
                {
                    System.out.println("A number whose repititive digital sum equals 1");
                    System.out.println("Enter a number");
                    long n=Long.parseLong(ob.readLine());
                    long s=0,a,p=0;
                    while(s!=1)
                    {
                        while(n!=0)
                        {
                            a=n%10;
                            s=s+a;
                            n=n/10;
                        }
                        if(s<10)
                        {
                            p=s;
                            break;
                        }
                        else
                        {
                            n=s;
                            s=0;
                        }
                    }
                    if(p==1)
                    {
                        System.out.println("yes it is a magic number");
                    }
                    else
                    {
                        System.out.println("no its not a magic number");
                    }
                }
                else 
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }
            else if(x.equalsIgnoreCase("14"))
            {
                System.out.println("Enter number of terms");
                int n=Integer.parseInt(ob.readLine());
                double a[]=new double[n];
                double s=0.0;
                int i;
                System.out.println("Enter elements");
                for(i=0;i<n;i++)
                {
                    a[i]=Double.parseDouble(ob.readLine());
                }
                for(i=0;i<n;i++)
                {
                    s=s+a[i];
                }
                System.out.println("mean---> "+(s/n));
            }
            else if(x.equalsIgnoreCase("15"))
            {
                System.out.println("1.Celsius");
                System.out.println("2.Kelvin");
                System.out.println("3.Fahrenhiet");
                System.out.println("Enter the unit(only the unit given)");
                int temp=Integer.parseInt(ob.readLine());
                System.out.println("Enter the unit in which you wan to convert");
                int tempc=Integer.parseInt(ob.readLine());
                System.out.println("Enter the value");
                double val=Double.parseDouble(ob.readLine());
                double c,f,k;
                if(temp==1&&tempc==2)
                {
                    k=273.15+val;
                    System.out.println(k);
                }
                else if(temp==1&&tempc==3)
                {
                    f=(1.8*val)+32.0;
                    System.out.println(f);
                }
                else if(temp==2&&tempc==1)
                {
                    c=val-273.15;
                    System.out.println(c);
                }
                else if(temp==2&&tempc==3)
                {
                    c=val-273.15;
                    f=(1.8*c)+32.0;
                    System.out.println(f);
                }
                else if(temp==3&&tempc==1)
                {
                    c=(val-32.0)/1.8;
                    System.out.println(c);
                }
                else if(temp==3&&tempc==2)
                {
                    c=(val-32.0)/1.8;
                    k=273.15+c;
                    System.out.println(k);
                }
                else
                {
                    System.out.println("Hmmmmm,let me search for it");
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Wrong choice");
                }
            }

            else
            {
                System.out.println("Hmmmmm,let me search for it");
                try
                {
                    Thread.sleep(3000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Wrong choice");
            }
            for(int j=1;j<=75;j++)
            {
                try
                {
                    Thread.sleep(8);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print("-");
            }
            System.out.println();
            System.out.println("User, do you want to go further??????? Y or N??");
            if(li.equalsIgnoreCase("n"))
            {
                break;
            }
            li=ob.readLine();
            trp++;
        }
        if(trp==0)
        {
            String noprobs="No problem Sir/Madam";
            for(int i=0;i<noprobs.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(noprobs.charAt(i));
            }
        }
        else
        {
            String not="Number of times calculator used:";
            for(int i=0;i<not.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(not.charAt(i));
            }
            int xx=trp,ss=0,aa;
            System.out.print(" ");
            while(trp!=0)
            {
                aa=trp%10;
                ss=ss*10+aa;
                trp=trp/10;
            }
            while(ss!=0)
            {
                aa=ss%10;
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(aa);
                ss=ss/10;
            }
            System.out.println();
            String nam="Enter your name please";
            for(int i=0;i<nam.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(nam.charAt(i));
            }
            System.out.println();
            String name=ob.readLine();
            String users="UsersMI.txt";
            try
            {
                name+=" , ";
                FileWriter ob1=new FileWriter(users,true);
                if(name.equalsIgnoreCase("SUYASH AGARWAL , "))
                {
                }
                else
                {
                    ob1.append(name);
                    ob1.append("\n");
                    ob1.close();
                }
            }
            catch(Exception e)
            {
                System.out.println();
            }
            String hwc="Would you like to leave a feedback??";
            for(int i=0;i<hwc.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(hwc.charAt(i));
            }
            System.out.println();
            String reply=ob.readLine();
            String th="Thank you Sir/Madam";
            for(int i=0;i<th.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(th.charAt(i));
            }
            System.out.println();
            String inf="Well I have an interesting qoute for you ;)";
            for(int i=0;i<inf.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(inf.charAt(i));
            }
            System.out.println();
            for(int i=0;i<st5.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(st5.charAt(i));
            }
            System.out.println();
            for(int i=0;i<st6.length();i++)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.print(st6.charAt(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        String mb="Made by:";
        for(int i=0;i<mb.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(mb.charAt(i));
        }
        System.out.println();
        String suyash="Suyash Agarwal";
        for(int i=0;i<suyash.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(suyash.charAt(i));
        }
        System.out.println();
        String agarwal="AGARWAL SOLUTIONS ENTERPRIZE";
        for(int i=0;i<agarwal.length();i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(agarwal.charAt(i));
        }
        System.out.println();
        for(int j=1;j<=75;j++)
        {
            try
            {
                Thread.sleep(8);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print("-");
        }
    }
}
