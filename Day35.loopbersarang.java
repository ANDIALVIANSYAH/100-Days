package loopingbersarang;

public class Main {
    
    public static void main(String[] args) {
        //loop bersarang berbentuk kotak dan segitiga
        //Looping bersarang untuk mencetak kotak bintang sebanyak 6x6 (6 ke kanan 6 ke bawah sebanyak 12x)
        for(int i = 0; i < 6; i++){
            for(int a= 0; a < 6; a++){
            System.out.print("* ");    
            }
            System.out.print("\n");
            // \n adalah Enter.
            
        }
        System.out.print("\n");
        //Looping bersarang untuk mencetak kotak angka 2 6x6
        //Looping pertama mencetak baris sebanyak 6 kali.
        //Looping kedua mencetak angka 2 sebanyak 6 kali pada setiap baris.
        for(int i = 0; i < 6; i++){
            for(int a= 0; a < 6; a++){
            System.out.print("2 ");    
            }
            
            System.out.print("\n");
        
       }
        System.out.print("\n");
        //Looping bersarang untuk mencetak segitiga dengan angka 2
        //Looping pertama mencetak baris sebanyak 6 kali.
        //Looping kedua mencetak angka 2 dan memutuskan loop jika indeks baris sama dengan indeks kolom.
        for(int i = 0; i < 6; i++){
            for(int a= 0; a < 6; a++){
            System.out.print("2 ");   
                if(i == a){
                    break;
        //Break saat indeks baris dan kolom sama, dan mengehentikan loop
                }
            }
            
            System.out.println();
        }
        System.out.print("\n");
        //Looping bersarang untuk mencetak segitiga terbalik dengan bintang
        //Looping pertama mencetak baris sebanyak 6 kali.
        //Looping kedua mencetak bintang (*) dan memutuskan loop jika jumlah indeks baris dan kolom adalah 5.
        for(int i = 0; i < 6; i++){
            for(int a= 0; a < 6; a++){
            System.out.print("* ");    
                if((i+a)==5){
                    break;
                }
            }
            
            System.out.print("\n");
        }
       

    }
              }
  
