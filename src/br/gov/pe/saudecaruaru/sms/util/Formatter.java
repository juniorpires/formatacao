/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.gov.pe.saudecaruaru.sms.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author smsti01
 */
public class Formatter {
    private static final String MESES[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto",
        "Setembro","Outubro","Novembro","Dezembro",};
    
    public String mes(int mes){
        if(0<mes && mes<12){
            return MESES[mes-1];
        }
        
        return String.valueOf(mes);
    }
    
    public String protocolo(String protocolo){
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
    
    public  String licenca(String licenca){
        if(licenca!=null && licenca.length()==13){
           return String.format("%s.%s.%s.%s.%s/%s",licenca.substring(0 , 1) ,
                                           licenca.substring(1, 2),
                                           licenca.substring(2, 4),
                                           licenca.substring(4 , 7),
                                           licenca.substring(7 , 11),
                                           licenca.substring(11 , 13)
                                           );
        }
        return licenca;
    }
    
    public  String cpfCnpj(String cpfCnpj){
        if(cpfCnpj!=null){
            if(cpfCnpj.length()==14){
                return String.format("%s.%s.%s/%s-%s",cpfCnpj.substring(0,2),
                           cpfCnpj.substring(2,5),
                           cpfCnpj.substring(5,8),
                           cpfCnpj.substring(8,12),
                           cpfCnpj.substring(12,14));
                         
                
            }else if(cpfCnpj.length()==11){
                return String.format("%s.%s.%s-%s",cpfCnpj.substring(0,3),
                           cpfCnpj.substring(3,6),
                           cpfCnpj.substring(6,9),
                           cpfCnpj.substring(9,11));
            }
        }
         return cpfCnpj;
    }
    public  String telefone(String telefone){
        if(telefone!=null && telefone.length()==10){
            return String.format("(%s) %s-%s",telefone.substring(0,2),
                           telefone.substring(2,6),
                           telefone.substring(6,10));
        }
         return telefone;
    }
    public  String cnae(String cnae){
        if(cnae!=null && cnae.length()==7){
           return String.format("%s-%s/%s",cnae.substring(0,4),
                           cnae.substring(4,5),
                           cnae.substring(5,7));
        }
         return cnae;
    }
    public String cep(String cep){
        if(cep!=null && cep.length()==8){
            return String.format("%s-%s", cep.substring(0, 5),cep.substring(5));
        }
         return cep;
    }
    
    public Object dataVazia(Date data){
        if(data==null){
            return "       /       /    "; 
        }
        
        return data;
    }
    
    public String capacidade(String capacidade){
     if(capacidade!=null){
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
            DecimalFormat df = new DecimalFormat("###,###,###,###",otherSymbols);
            String c = df.format(Integer.parseInt(capacidade));
            return c;
        }
         return capacidade;
    }
    
    public String placa(String placa){
    if(placa!=null && placa.length()==7){
       return String.format("%s-%s",placa.substring(0,3),
                           placa.substring(3,7));
    }
        return placa;
    }
    
}
