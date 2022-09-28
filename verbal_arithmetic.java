package project;

public class verbal_arithmetic {
    public static void main(String[] args) {
        for(int T=0; T<10; T++){
            for(int O=0; O<10; O++){
                if(T==O) continue;
                int D = (4*O)%10;
                if(D==O || D==T) continue;
                int G = (4*T)/10;
                if(G==O || G==D || G==T || G==0) continue;
                int TOO = T*400+O*40+O*4 ;
                int GOOD = G*1000+O*100+O*10+D ;
                if(TOO==GOOD) 
                System.out.println("T is "+T+" O is "+O+" G is "+G+" D is "+D);
                else continue;
            }
        }
    }
}