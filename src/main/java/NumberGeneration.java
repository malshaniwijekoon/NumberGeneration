import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NumberGeneration {
    public static void main(String args[]) throws IOException {
      int a,b,c,d,e,f,g;
      for(a=0;a<=9;a++){
          for(b=0;b<=9;b++){
              for(c=0;c<=9;c++){
                  for(d=0;d<=9;d++){
                      for(e=0;e<=9;e++){
                          for(f=0;f<=9;f++){
                              for(g=0;g<=9;g++){
                                numberCatagory(a,b,c,d,e,f,g);
                              }
                          }
                      }
                  }
              }
          }
      }
      System.out.println("End");
    }

    public static void printToTextFile(String numberPattern) throws IOException {
        //creating the instance of file
        File path = new File("/Users/malshaniwijekoon/Documents/Projects/NumberGeneration/src/main/resources/numberPattern.txt");

        //write and append to file
        Files.write(Paths.get(String.valueOf(path)), numberPattern.getBytes(), StandardOpenOption.APPEND);
    }

    public static void numberCatagory(int a,int b,int c,int d,int e,int f,int g) throws IOException {
        String number ="";
        String preNumber="";
        if (a==7 && b==5 && a==c && c==e && a==g && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category39"+"\n";
            printToTextFile(number);
        } else if (b==7 && c==5 && a==d && d==g && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category40"+"\n";
            printToTextFile(number);
        } else if (c==0 && d==7 && e==5 && a==b && b==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category41"+"\n";
            printToTextFile(number);
        } else if (a==b && b==c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category1"+"\n";
            printToTextFile(number);
        } else if (b==c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category2"+"\n";
            printToTextFile(number);
        } else if (b!=g && b==c && c==d && d==e && e==f ){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category3"+"\n";
            printToTextFile(number);
        } else if (c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category4"+"\n";
            printToTextFile(number);
        } else if (b==a+1 && c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category5"+"\n";
            printToTextFile(number);
        } else if (a!=f && a==b && b==c && c==d && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category5.1"+"\n";
            printToTextFile(number);
        } else if (b!=f && b==c && c==d && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6"+"\n";
            printToTextFile(number);
        } else if (a!=e && a==b && b==c && c==d && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6.1"+"\n";
            printToTextFile(number);
        } else if (b!=e && b==c && c==d && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7"+"\n";
            printToTextFile(number);
        } else if (a!=c && a==b && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7.1"+"\n";
            printToTextFile(number);
        } else if (b!=c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category8"+"\n";
            printToTextFile(number);
        } else if (b!=c && b==d && d==f && c==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category9"+"\n";
            printToTextFile(number);
        } else if (b!=d && b==c && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category10"+"\n";
            printToTextFile(number);
        } else if (b==a+1 && c==b+1 && d==c+1 && b==e && c==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category10.1"+"\n";
            printToTextFile(number);
        } else if (b!=c && c!=d && b==e && c==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category11"+"\n";
            printToTextFile(number);
        } else if (a!=c && a==b && b==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category11.1"+"\n";
            printToTextFile(number);
        } else if (b!=c && b==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category12"+"\n";
            printToTextFile(number);
        } else if (b!=c && b==e && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category13"+"\n";
            printToTextFile(number);
        } else if (b!=d && b==c && c==e && e==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category14"+"\n";
            printToTextFile(number);
        } else if (a!=d && a==b && b==c && c==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category14.1"+"\n";
            printToTextFile(number);
        } else if (b!=d && b==c && c==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.1"+"\n";
            printToTextFile(number);
        } else if (a!=c && c!=d && a==b && b==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.2"+"\n";
            printToTextFile(number);
        } else if (a!=d && d!=e && a==b && b==c && c==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.3"+"\n";
            printToTextFile(number);
        } else if (a!=e && e!=f && a==b && b==c && c==d &&d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.4"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=d && a==c && c==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category17"+"\n";
            printToTextFile(number);
        } else if (a!=c && a==b && b==f && f==g && c==d && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category17.1"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=d && b==c && c==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category19"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=d && b==c && c==f && f==g && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category20"+"\n";
            printToTextFile(number);
        } else if (a!=b && a==c && c==e && e==g && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category21"+"\n";
            printToTextFile(number);
        } else if (a!=b && a==c && c==e && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category22"+"\n";
            printToTextFile(number);
        } else if (b!=d && d!=f && b==c && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category23"+"\n";
            printToTextFile(number);
        } else if (a!=g && a==b && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category24"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category25"+"\n";
            printToTextFile(number);
        } else if (a!=e && a==b && b==c && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category26"+"\n";
            printToTextFile(number);
        } else if (b!=e && b==c && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category27"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=g && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category28"+"\n";
            printToTextFile(number);
        } else if (a!=b && a==g && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category29"+"\n";
            printToTextFile(number);
        } else if (a!=f && a==b && b==c && c==d && d==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category29.1"+"\n";
            printToTextFile(number);
        } else if (b!=f && b==c && c==d && d==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category30"+"\n";
            printToTextFile(number);
        } else if (a!=c && c!=g && a==b && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category31"+"\n";
            printToTextFile(number);
        } else if (b!=c && c!=e && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category32"+"\n";
            printToTextFile(number);
        } else if (a!=e && e!=g && a==b && b==c && c==d && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category33"+"\n";
            printToTextFile(number);
        } else if (a!=d && d!=g && a==b && b==c && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category34"+"\n";
            printToTextFile(number);
        } else if (a!=c && c!=e && a!=g && a==b && c==d && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category35"+"\n";
            printToTextFile(number);
        } else if (a!=c && c!=g && a==b && b==d && d==e && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category36"+"\n";
            printToTextFile(number);
        } else if (a!=b && b!=c && c!=g && a==d && b==e && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category37"+"\n";
            printToTextFile(number);
        } else if (a!=f && f!=g && a==b && b==c && c==d && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category38"+"\n";
            printToTextFile(number);
        }
    }
}