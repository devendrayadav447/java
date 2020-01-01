package Primitive;

public class primitiveconversion {
    public static void main(String args[]) {

        wideningconversiondemo();
        narrowingconversiondemo();

    }
    public static void wideningconversiondemo()
    {

        float floatvar=123.67F;
        double doublevar=(double)floatvar;
        System.out.println(" floatvar is "+floatvar+" doublevar is "+doublevar);


    }
    public static void narrowingconversiondemo()
    {

        long longvar=12300000000000000L;
        int intvar=(int)longvar; //losses of data because of memeory
        System.out.println(" longvar is "+longvar+" intvar is "+intvar);
        longvar=20L; ///no data loss because of given no are in range
         intvar=(int)longvar;
        System.out.println(" longvar is "+longvar+" intvar is "+intvar);


    }
    }

