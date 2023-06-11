public class Premenne {
    public static void main(String[] args) {
        //delkaracia premennej
        int x = 3; //byte short int long---celociselne datove typy
        double y; //float double ----REALNE DATOVE TYPY
        double b;
        double c;
        boolean z;

        int d = 2;
        int e = x/d;

        String q;
        //inicializacia datoveho typu----priradenie hodnoty
        x = 3;
        y = 1.1d; //double-po priradenej hodnote napisat "d"
                  //float-po priradenej hodnote napisat "f"
        z = true;
        q = "aVo";
        b = 2.2d;
        c = y + b;

        System.out.println(x + " " + y + " " + z + " " + q +" " + c + " " + e);

        // = OPERATOR PRIRADENIA
        //zmena datoveho typu PRETYPOVANIE
        int a = (int) c; //Pretypovanie-z vacsieho na mensi musime novy typ dat do ()

        System.out.println(e);

        double f = e; //konverzia datoveho typu
        System.out.println(f);

        //OPERANTY ARITMETICKE
         int i = 5; // + - * /   i + j  atd
         int j = 2;
         int k = i % j; //vydeli hodnoty a vypise zvysok
        System.out.println(k);
        ++k; //++ zvysi hodnotu o jedno
        System.out.println(k);
        --k; //znizi hodnotu o jedno
        System.out.println(k);

        //OPERATORY PRIRADENIA

       /* Operator	Example	Same As	Try it
                =	x = 5	x = 5
               +=	x += 3	x = x + 3
               -=	x -= 3	x = x - 3
                *=	x *= 3	x = x * 3
                /=	x /= 3	x = x / 3
                %=	x %= 3	x = x % 3
                &=	x &= 3	x = x & 3
                |=	x |= 3	x = x | 3
                ^=	x ^= 3	x = x ^ 3
                >>=	x >>= 3	x = x >> 3
                <<=	x <<= 3	x = x << 3 */
        k+=2; //+= zvysi hodnotu o danu velkost (+ - * /)
        System.out.println(k);


        //OPERATORY POROVNANIA
       /*    Operator	Name	Example	Try it
                ==	Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y

        */
        //OPERATORY LOGYCKE
        /*
            Operator	Name	Description	Example	Try it
            && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
            || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
            !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

         */





    }
}
