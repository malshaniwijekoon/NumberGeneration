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
        if (b==c && c==d && d==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory1"+"\n";
            printToTextFile(number);
        } else if(b!=g && b==c && c==d && d==e && e==f ){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory2"+"\n";
            printToTextFile(number);
        } else if(c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory3"+"\n";
            printToTextFile(number);
        } else if(b==a+1 && c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory4"+"\n";
            printToTextFile(number);
        } else if(b!=f && b==c && c==d && d==e && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory5"+"\n";
            printToTextFile(number);
        } else if(b!=e && b==c && c==d && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory6"+"\n";
            printToTextFile(number);
        } else if(b!=c && c==d && d==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory7"+"\n";
            printToTextFile(number);
        } else if(b!=c && b==d && d==f && c==e && e==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory8"+"\n";
            printToTextFile(number);
        } else if(b!=d && b==c && d==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory9"+"\n";
            printToTextFile(number);
        } else if(b!=c && c!=d && d!=b && b==e && c==f && d==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory10"+"\n";
            printToTextFile(number);
        } else if(b!=c && b==d && d==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory11"+"\n";
            printToTextFile(number);
        } else if(b!=c && b==e && c==d && d==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory12"+"\n";
            printToTextFile(number);
        } else if(b!=d && b==c && c==e && e==f && d==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory13"+"\n";
            printToTextFile(number);
        } else if(b!=d && b==c && c==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory14"+"\n";
            printToTextFile(number);
        } else if(b!=c && c!=d && d!=b && b==e && e==f && f==g){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory15"+"\n";
            printToTextFile(number);
        } else if(a!=b && a==c && c==e && e==g && b==f){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory16"+"\n";
            printToTextFile(number);
        } else if(b!=c && b==f && f==g && c==d && d==e){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory17"+"\n";
            printToTextFile(number);
        } else if(b!=d && b==c && c==e && d==f){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory18"+"\n";
            printToTextFile(number);
        } else if(b!=d && b==c && c==f && f==g && d==e){
            number="075"+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Catagory19"+"\n";
            printToTextFile(number);
        } 
    }
}