/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sms.util;

/**
 *
 * @author smsti01
 */
public class Formatter {
    
    public static String protocolo(String protocolo){
        if (protocolo!= null && protocolo.length() == 11){
            StringBuilder builder=new StringBuilder();
            builder.append(protocolo.substring(0, 5));
            builder.append('-');
            builder.append(protocolo.substring(5,7));
            builder.append('/');
            builder.append(protocolo.substring(7));
            return builder.toString();
        }
        return protocolo;
    }
}
