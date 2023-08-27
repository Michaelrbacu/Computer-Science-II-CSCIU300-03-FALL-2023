class Three {
    public static void main(String[] args){                
                int a = 1, b = 10, c = 10, d = 10;
                switch(b = a++ % 3)
                {
                    case 1: 
                    case 0: c = --a / ++b ;
                    case 2: d = (a==b)? a++ : --b; break;
                    default: d++;
                }
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
}
}