
package kuisprakpbo;

import java.util.Scanner;

/**
 *
 * @author gilym
 */
public class KuisPrakPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
         int temp,temp1,temp2;
         do{
             System.out.println("Form Pendaftaran");
        System.out.println("1.Beasiswa Pelajar");
        System.out.println("2.Beasiswa Mahasiswa ");
        System.out.print("Pilih : ");int pil = Input.nextInt();
        double a,b,c;
      
        temp=pil;
        switch(pil){
            case 1 : System.out.println("\n====================");
                     System.out.println("   Beasiswa Pelajar ");
                     System.out.println("====================\n");
                     Scanner in = new Scanner(System.in);
                     System.out.print("Nama : ");String nama = in.nextLine();
                     System.out.print("Umur  : ");long umur = Input.nextLong();
                     do{
                        System.out.println("\n====================");
                     System.out.println("    Form Penilain     ");
                     System.out.println("====================\n");
                     System.out.println("Keterangan : Nilai Antara 0-100");
                     System.out.print("Struktur dan Konten Esai : ");double konten = Input.nextDouble();
                     System.out.print("Teknik Visualisasi  : ");double visual = Input.nextDouble();
                     System.out.print("Kemampuan Design Thinking : "); double design = Input.nextDouble();
                    
                
                     a=konten;
                     b=visual;
                     c=design;
                     
                     }while(a < 0 || a>100 || b<0 || b>100 || c<0|| c > 100 );
                     
                     do{
                           System.out.println("\n\n====================");
                        System.out.println("Menu");
                        System.out.println("====================\n");
                        System.out.println("1.Tampilkan Hasil");
                        System.out.println("2.Edit");
                        System.out.println("3.Exit");
                        System.out.println("Pilihan : ");int pil1 = Input.nextInt();
                         temp1=pil1;
         
                        switch(pil1){
                            case 1 :   Seleksi seleksi= new Seleksi(a,b,c);


                                       System.out.println("Hasil Nilai = " + seleksi.hasilpel());
                                       double hasil1 =seleksi.hasil1;


                                      if(  hasil1>=87.5 && umur >=16 && umur <=24){

                                          System.out.println("Keterangan = LULUS");
                                          System.out.println("Selamat "+nama + "( "+umur+" ) diterima di Program Beasiswa Pelajar");
                                      }
                                      else {

                                          System.out.println("Keterangan =TIDAK LULUS");
                                          System.out.println("Mohon Maaf "+nama + "( "+umur+" ) Tidak diterima di Program Beasiswa Pelajar Karena Belum Memenuhi Persyaratan");
                                      }break;

                            case 2 : do{
                                       System.out.println("\n====================");
                                    System.out.println("    Form Edit     ");
                                    System.out.println("====================\n");
                                    System.out.println("Keterangan : Nilai Antara 0-100");
                                    System.out.print("Struktur dan Konten Esai : ");double konten = Input.nextDouble();
                                    System.out.print("Teknik Visualisasi  : ");double visual = Input.nextDouble();
                                    System.out.print("Kemampuan Design Thinking : "); double design = Input.nextDouble();


                                    a=konten;
                                    b=visual;
                                    c=design;

                                    }while(a < 0 || a>100 || b<0 || b>100 || c<0|| c > 100 );
                                    break;

                            case 3 : System.out.println("Terima kasih");

                            default : System.out.println("Pilihan Tidak Tersedia");

                        }
                                    }while(temp1!=3);
                       
                    
               
                     break;
                     
            case 2 : 
                    System.out.println("\n====================");
                     System.out.println("   Beasiswa Mahasiswa ");
                     System.out.println("====================\n");
                     Scanner on = new Scanner(System.in);
                     System.out.print("Nama : ");String nama1 = on.nextLine();
                     System.out.print("Umur  : ");long umur1 = Input.nextLong();
                     do{
                        System.out.println("\n====================");
                     System.out.println("    Form Penilain     ");
                     System.out.println("====================\n");
                     System.out.println("Keterangan : Nilai Antara 0-100");
                     System.out.print("Struktur dan Konten Jurnal : ");double konten1 = Input.nextDouble();
                     System.out.print("Relevansi Data   : ");double data = Input.nextDouble();
                     System.out.print("Kemampuan Problem Solving : "); double problem = Input.nextDouble();
                    Seleksi seleksi= new Seleksi(konten1,data,problem);
                         
                     a=konten1;
                     b=data;
                     c=problem;
                     }while(a < 0 || a > 100 || b < 0 || b > 100 || c < 0|| c > 100 );
                     
                     do{
                           System.out.println("\n\n====================");
                        System.out.println("Menu");
                        System.out.println("====================\n");
                        System.out.println("1.Tampilkan Hasil");
                        System.out.println("2.Edit");
                        System.out.println("3.Exit");
                        System.out.println("Pilihan : "); int pil2 = Input.nextInt();
                       temp1=pil2;
                        
         switch(pil2){
             case 1 :  Seleksi seleksi= new Seleksi(a,b,c);
             
                       
                        System.out.println("Hasil Nilai = " + seleksi.hasilmah());
                        double hasil2 =seleksi.hasil2;
                      
                       
                       if(  hasil2>=87.5&& umur1 >=16 && umur1 <=24){
                           
                           System.out.println("Keterangan = LULUS");
                           System.out.println("Selamat "+nama1 + "( "+umur1+" ) diterima di Program Beasiswa Pelajar");
                       }
                       else {
            
                           System.out.println("Keterangan =TIDAK LULUS");
                           System.out.println("Mohon Maaf "+nama1 + "( "+umur1+" ) Tidak diterima di Program Beasiswa Pelajar Karena Belum Memenuhi Persyaratan");
                       }break;
                       
             case 2 : do{
                        System.out.println("\n====================");
                     System.out.println("    Form Penilain     ");
                     System.out.println("====================\n");
                     System.out.println("Keterangan : Nilai Antara 0-100");
                     System.out.print("Struktur dan Konten Jurnal : ");double konten1 = Input.nextDouble();
                     System.out.print("Relevansi Data   : ");double data = Input.nextDouble();
                     System.out.print("Kemampuan Problem Solving : "); double problem = Input.nextDouble();
                    
                         
                     a=konten1;
                     b=data;
                     c=problem;
                     
                     }while(a < 0 || a > 100 || b < 0 || b > 100 || c < 0|| c > 100 );
             break;
             
             case 3 : System.out.println("Terim Kasih");break;
             
             default : System.out.println("Pilihan Tidak Tersedia");
         }
        
                     }while(temp1!=3);
                      
                                
                     break;
          
                     
            
                     
            default : System.out.println(" Mohon Maaf Pilihan Tidak Tersedia ");
                         
                     
    }
         }while(temp>3);
         
        
        
    }
}
