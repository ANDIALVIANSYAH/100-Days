package java7;

public class java7 {
    
    public static void main(String[] args) {
        String nm = "Alvin";
        int a = 0;
        boolean kondisi = true;
        
        while (a < nm.length()){
            System.out.println(" awal nama ke- " + ( a + 1)+" " + nm);
            a++;
            
            if(a == 10){
                kondisi = false;
            }
        }
    }
    
}
