/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;
/**
 *
 * @author isabe
 */
public class KelasInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama");
        Person p = new Person();
        p.setNama(sc.nextLine());
        System.out.println("Nama saya adalah : "+p.getNama());
    }
}
