package service;

import controller.PrintController;

import java.io.IOException;

public class NumberService implements INumberService {
    String number ="";
    String preNumber="?";
    String patternCategory ="";

    PrintController printController = new PrintController();

    @Override
    public void patternCategory(String a,String b,String c,String d,String e,String f,String g) throws IOException {
        if (a.equals(b) && b.equals(c) && c.equals(d) && d.equals(e) && e.equals(f) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category1"+"\n";
            printController.printCategory(patternCategory);
        } else if (b.equals(c) && c.equals(d) && d.equals(e) && e.equals(f) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category2"+"\n";
            printController.printCategory(patternCategory);
        } else if (b.equals(c) && c.equals(d) && d.equals(e) && e.equals(f)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category3"+"\n";
            printController.printCategory(patternCategory);
        } else if (a.equals(b) && b.equals(c) && c.equals(d) && d.equals(e) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category5.1"+"\n";
            printController.printCategory(patternCategory);
        } else if (b.equals(c) && c.equals(d) && d.equals(e) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6"+"\n";
            printController.printCategory(patternCategory);
        } else if (a.equals(b) && b.equals(c) && c.equals(d) && e.equals(f) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6.1"+"\n";
            printController.printCategory(patternCategory);
        } else if (b.equals(c) && c.equals(d) && e.equals(f) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7"+"\n";
            printController.printCategory(patternCategory);
        } else if (a.equals(b) && c.equals(d) && d.equals(e) && e.equals(f) && f.equals(g)){
            patternCategory = preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7.1"+"\n";
            printController.printCategory(patternCategory);
        }
    }

    public void numberCategory(int a,int b,int c,int d,int e,int f,int g) throws IOException {
        if (a==7 && b==5 && a==c && c==e && a==g && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category39"+"\n";
            printController.printToTextFile(number);
        } else if (b==7 && c==5 && b==e && a==d && d==g && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category40"+"\n";
            printController.printToTextFile(number);
        } else if (c==0 && d==7 && e==5 && a==b && b==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category41"+"\n";
            printController.printToTextFile(number);
        } else if (a==b && b==c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category1"+"\n";
            printController.printToTextFile(number);
        } else if (b==c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category2"+"\n";
            printController.printToTextFile(number);
        } else if (b!=g && b==c && c==d && d==e && e==f ){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category3"+"\n";
            printController.printToTextFile(number);
        } else if (c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category4"+"\n";
            printController.printToTextFile(number);
        } else if (b==a+1 && c==b+1 && d==c+1 && e==d+1 && f==e+1 && g==f+1){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category5"+"\n";
            printController.printToTextFile(number);
        } else if (a!=f && a==b && b==c && c==d && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category5.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=f && b==c && c==d && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6"+"\n";
            printController.printToTextFile(number);
        } else if (a!=e && a==b && b==c && c==d && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category6.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=e && b==c && c==d && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && a==b && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category7.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category8"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && b==d && d==f && c==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category9"+"\n";
            printController.printToTextFile(number);
        } else if (b!=d && b==c && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category10"+"\n";
            printController.printToTextFile(number);
        } else if (b==a+1 && c==b+1 && d==c+1 && b==e && c==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category10.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && c!=d && b==e && c==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category11"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && a==b && b==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category11.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && b==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category12"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && b==e && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category13"+"\n";
            printController.printToTextFile(number);
        } else if (b!=d && b==c && c==e && e==f && d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category14"+"\n";
            printController.printToTextFile(number);
        } else if (a!=d && a==b && b==c && c==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category14.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=d && b==c && c==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.1"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && c!=d && a==b && b==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.2"+"\n";
            printController.printToTextFile(number);
        } else if (a!=d && d!=e && a==b && b==c && c==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.3"+"\n";
            printController.printToTextFile(number);
        } else if (a!=e && e!=f && a==b && b==c && c==d &&d==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category15.4"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=d && a==c && c==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category17"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && a==b && b==f && f==g && c==d && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category17.1"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=d && b==c && c==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category19"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=d && b==c && c==f && f==g && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category20"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && a==c && c==e && e==g && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category21"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && a==c && c==e && b==d && d==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category22"+"\n";
            printController.printToTextFile(number);
        } else if (b!=d && d!=f && b==c && d==e && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category23"+"\n";
            printController.printToTextFile(number);
        } else if (a!=g && a==b && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category24"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=c && c==d && d==e && e==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category25"+"\n";
            printController.printToTextFile(number);
        } else if (a!=e && a==b && b==c && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category26"+"\n";
            printController.printToTextFile(number);
        } else if (b!=e && b==c && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category27"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=g && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category28"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && a==g && b==c && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category29"+"\n";
            printController.printToTextFile(number);
        } else if (a!=f && a==b && b==c && c==d && d==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category29.1"+"\n";
            printController.printToTextFile(number);
        } else if (b!=f && b==c && c==d && d==e && e==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category30"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && c!=g && a==b && c==d && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category31"+"\n";
            printController.printToTextFile(number);
        } else if (b!=c && c!=e && c==d && d==f && f==g){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category32"+"\n";
            printController.printToTextFile(number);
        } else if (a!=e && e!=g && a==b && b==c && c==d && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category33"+"\n";
            printController.printToTextFile(number);
        } else if (a!=d && d!=g && a==b && b==c && d==e && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category34"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && c!=e && a!=g && a==b && c==d && e==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category35"+"\n";
            printController.printToTextFile(number);
        } else if (a!=c && c!=g && a==b && b==d && d==e && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category36"+"\n";
            printController.printToTextFile(number);
        } else if (a!=b && b!=c && c!=g && a==d && b==e && c==f){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category37"+"\n";
            printController.printToTextFile(number);
        } else if (a!=f && f!=g && a==b && b==c && c==d && d==e){
            number=preNumber+a+""+b+""+c+""+d+""+e+""+f+""+g+"$Category38"+"\n";
            printController.printToTextFile(number);
        }
    }
}
