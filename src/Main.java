public class Main {
    public static void main(String[] args) {

        // Задача №1.
        System.out.println("Задача №1");
        int a=30;
            System.out.println("Значение переменной a с типом int равно "+a);
        byte b=115;
            System.out.println("Значение переменной b с типом byte равно "+b);
        short c=16;
            System.out.println("Значение переменной c с типом short равно "+c);
        long d=587898;
            System.out.println("Значение переменной d с типом long равно "+d);
        float e= (float) 3.8;
            System.out.println("Значение переменной e с типом float равно "+e);
        double f=0.874387678;
            System.out.println("Значение переменной f с типом double равно "+f);

            //Задача №2.
        System.out.println("Задача №2");
        int aa=569;
        byte bb=2;
        byte kk=67;
        short cc=786;
        short hu=27897;
        short ed=-159;
        long dd=987_678_965_549L;
        float vv= (float) 27.12;
        boolean kl=false;

            //Задача №3
        System.out.println("Задача №3");
        byte LP=23;
        byte AC=27;
        byte EA=30;

        System.out.println("На каждого ученика рассчитано "+(480/(LP+AC+EA))+" листов бумаги");

            //Задача №4
        System.out.println("Задача №4");

        int mashin=16;
        int  proiz=2;
        int maschinproiz=mashin/proiz;

        int za20min=maschinproiz*20;
        System.out.println("За 20 минут, машины произвела бутылок "+za20min+" штук");
        int zacyt=za20min*3*24;
        System.out.println("За 1 сутки, машины произвела бутылок "+zacyt+" штук");
        int za3dnya=zacyt*3;
        System.out.println("За 3 дня, машины произвела бутылок "+za3dnya+" штук");
        int zames=za3dnya*10;
        System.out.println("За 1 месяц, машины произвела бутылок"+zames+"  штук");

            //Задача №5
        System.out.println("Задача №5");
        int class1=6;
        int sch=120;
        int nasch=sch/class1;
        System.out.println("В школе, где "+nasch+" классов, нужно "+(nasch*2)+ " банок белой краски и "+(nasch*4)+" банок коричневой краски");

        //Задача №6
        System.out.println("Задача №6");
        int ban=5;
        int bangr=ban*80;
        int moloko=200;
        int molokogr= (int) (moloko*1.05);
        int morogino=2;
        int moroginogr=morogino*100;
        int yaicho=4;
        int yaichogr=yaicho*70;
        int gr=bangr+molokogr+moroginogr+yaichogr;
        float kg= gr / 1000;
        System.out.println("вес (количество грамм) такого спорт-завтрака "+gr+" гр");
        System.out.println("переведите его в килограммы "+kg+" кг");

        //Задача №7
        System.out.println("Задача №7");
        int esli250=7000/250;
        int ecli500=7000/500;
        int sred=(ecli500+esli250)/2;
        System.out.println("Потребутся дней "+esli250+",если худеть по 250гр");
        System.out.println("Потребутся дней "+ecli500+",если худеть по 500гр");
        System.out.println("Потребутся дней всреднем  "+sred+",чтобы добиться результата похужения");

        //Задача №8
        System.out.println("Задача №8");
        int M=67760;
        int D=83690;
        int K=76230;
        int m1= (int) (M*0.1+M);
        int d1= (int)(D*0.1+D);
        int k1= (int) (K*0.1+K);
        int razm=m1*12-M*12;
        int razd=d1*12-D*12;
        int razk=k1*12-K*12;
        System.out.println(m1);
        System.out.println(d1);
        System.out.println(k1);
        System.out.println("Маша теперь получает "+m1+" рублей. Годовой доход вырос на "+razm+" рублей");
        System.out.println("Денис теперь получает "+d1+" рублей. Годовой доход вырос на "+razd+" рублей");
        System.out.println("Кристина теперь получает "+k1+" рублей. Годовой доход вырос на "+razk+" рублей");
    }
}