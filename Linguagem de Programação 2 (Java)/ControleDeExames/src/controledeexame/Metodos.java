/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeexame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Metodos {
    public static void gravar(String path, String dados[]) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.append("\n" + dados[0] + dados[1] + dados[2]);
        buffWrite.close();
    }
}
