/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
public class InputValidator {
    int c0 = 0;
    int cr = -1;
    int cc = -1;
    int csq = -1;
   static boolean validator = true;
    public InputValidator(int [][] coo) {
       int [][] co = coo;
        validator = true;
     for(int p = 0;p<=8;p++) {
        for(int q = 0;q<=8;q++) {
            c0 = 0;
            cr = -1;
            cc = -1;
            csq = -1;
            if(co[p][q]!=0) {
            if(co[p][q]==-1) {
                c0++;
        //    validator = false;
            }
            else {
            for(int i =0;i<=8;i++) {
    if(co[p][q]==co[p][i]) {
        cr++;
        //validator = false;
    }
    if(co[p][q]==co[i][q]) {
        cc++;
       // validator = false;
    }
    }
             int x1 = (p/3)*3;
    int y1 = (q/3)*3;
    int x2 = (p/3)*3 +2;
    int y2 = (q/3)*3 +2;
    for(int a = y1;a<=y2;a++) {
    for(int b = x1;b<=x2;b++) {
    if(co[p][q]==co[a][b]) {
        csq++;
       // validator = false;
    }
    }
    }
            }
           }
            if(c0!=0||cr>0||cc>0||csq>0) {
     validator = false;
     }
        }
       }
     System.out.println(c0+" "+cr+" "+cc+" "+csq);
     
    }
    public static boolean getValidator() {
    return validator;
    }
}
