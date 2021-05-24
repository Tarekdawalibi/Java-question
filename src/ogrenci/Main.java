package ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int not[][] = new int [5][4];
    static String ogrenci[][] = new String [5][4];
   static Scanner scn = new Scanner (System.in);
   static ArrayList<String> ogrenciAdları = new ArrayList<String>();
	public static void ogrencBilgileriEkle()
    {
		for(int indis=0;indis<5;indis++)
		{
  
        System.out.println("Ad Giriniz \n");
        ogrenci[indis][0] = scn.next();
        System.out.println("Cinsiyet Giriniz: \n");
        ogrenci[indis][1] = scn.next();
        System.out.println("Vize1 Notunu Giriniz: \n");
        not[indis][0] = scn.nextInt();
        System.out.println("Vize2 Notunu Giriniz: \n");
        not[indis][1] = scn.nextInt();
		}
        
        
        
    }
	public static int farkliIsımSayisi()
	{
		boolean control;
		for(int i=0;i<5;i++)
		{
			if(i==0)
			{
				ogrenciAdları.add(ogrenci[i][0]);
			}
			else
			{
				control = false;
				for(int j=0;j<ogrenciAdları.size();j++)
				{
					if(ogrenci[i][0].equalsIgnoreCase(ogrenciAdları.get(j)))
					{
						control = true;
					}
					
				}
				if(!control)
				{
					ogrenciAdları.add(ogrenci[i][0]);
				}
			}
			
		}
		
		return ogrenciAdları.size();
	}
	public static void genelHarfNotuBelirle()
	{
		for(int i=0;i<5;i++)
		{
			float nott = (float) ((not[i][0]*0.3)+(not[i][1]*0.7));
			if(nott>=85)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "AA");
			}
			else if(nott>=80 && nott<85)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "BA");
			}
			else if(nott>=75 && nott<80)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "BB");
			}
			else if(nott>=70 && nott<75)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "CB");
			}
			else if(nott>=65 && nott<70)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "CC");
			}
			else if(nott>=60 && nott<65)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "DC");
			}
			else if(nott>=50 && nott<60)
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "DD");
			}
			else
			{
				System.out.println(ogrenci[i][0]+" "+ogrenci[i][1]+" "+ nott + "FF");
			}
		}
	}
    static void ortalamaUstuOgrenciAdları()
    {
    	System.out.println("Ortalaması Sınıf Ortalamasının Üzerinde Olan Öğrenciler");
    	int ortalama =0;
    	for(int indis = 0; indis<5;indis++)
    	{
    		ortalama += (not[indis][0]+not[indis][1])/2;
    	}
    	ortalama= ortalama/5;
    	for(int i = 0; i<5; i++)
    	{
            if((not[i][0]+not[i][1])/2>ortalama)
            {
            	System.out.println(ogrenci[i][0]);
            }
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         ogrencBilgileriEkle();
         ortalamaUstuOgrenciAdları();
         System.out.println("Farklı İsim Sayısı: "+ farkliIsımSayisi());
         genelHarfNotuBelirle();
         
	}

	    

}