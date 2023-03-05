public class program{

    public static void main(String[] args) {

        //1
        int i = (int) (Math.random() * 2001);
        System.out.println("Рандомное число - " + i);
        
        //2
        int n = 0;
        int temp1 = i;
        while (temp1 > 0)
        {
            temp1 = temp1 / 2;
            n++;
        }
        System.out.println("Старший значащий бит - " + n);

        //3
        int k = 0;
        int temp2 = i;
        while (temp2 <= Short.MAX_VALUE){
            if(temp2 % n == 0){
                k++;
            }
        temp2++;
        }

        System.out.println("Кол-во кратных чисел - " + k);

        int m1[] = new int[k];
        int temp3 = i;
        for(int j = 0; j < k; j++){
            while (temp3 <= Short.MAX_VALUE){
                if(temp3 % n == 0){
                    m1[j]=temp3;
                }
            temp3++;
            }
        }

        //4

        int t = 0;
        int temp4 = Short.MIN_VALUE;
        while (i > temp4){
            if(temp4 % n != 0){
                t++;
            }
        temp4++;
        }

        System.out.println("Кол-во некратных чисел - " + t);

        int m2[] = new int[t];
        int temp5 = Short.MIN_VALUE;
        for(int j = 0; j < t; j++){
            while (i > temp5){
                if(temp5 % n != 0){
                    m2[j]=temp5;
                }
            temp5++;
            }
        }
    }

}
