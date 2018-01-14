/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
import java.util.Arrays;
public class game {
    int x1,x2,y1,y2;
    public boolean checker(int[][]arr,int r,int colm,int dig) {
    int cr = 0;
    int cc =0;
    int csq = 0;
    int row = r;
    int col = colm;
    int cells = dig;
    int[][] sarr = Arrays.copyOf(arr,arr.length);
    for(int i =0;i<=8;i++) {
    if(sarr[i][row]==cells) {
    cr++;
    }
    if(sarr[col][i]==cells) {
    cc++;
    }
    }
    int x1 = (row/3)*3;
    int y1 = (col/3)*3;
    int x2 = (row/3)*3 +2;
    int y2 = (col/3)*3 +2;
    for(int a = y1;a<=y2;a++) {
    for(int b = x1;b<=x2;b++) {
    if(sarr[a][b]==cells) {
        csq++;
    }
    }
    }
    if(cr==0&&cc==0&&csq==0) {
    return true;
    }
    else {
    return false;
    }
    }
}
