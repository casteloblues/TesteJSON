/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.controller;


import com.br.lp3.entities.InstREVSC;
import com.br.lp3.jsonModel.RevParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Castelo
 */
public class Manager {
    
    
//    private static String urlBase;
//    private static final String urlBase = "https://reverb.com/api/listings/all?make=${brand}&model=${model}&year_max=${year_max}&year_min=${year_min}&page=1&per_page=50";
//    private static String urlBase;
    public static List<InstREVSC> teste(String urlComp) { //urlComp = composição com termos de busca
        
        List<InstREVSC> instList = new ArrayList<>();
        
 
        URL url;
        
        
        try {
            url = new URL(urlComp);
            System.out.println(urlComp);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.16.0.10", 3128));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(proxy);
            BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            StringBuilder sb = new StringBuilder();
            String line;
            
            while((line = bf.readLine()) != null) {
                sb.append(line);
            }
            bf.close();
            
            conn.disconnect();
            instList = RevParser.parseFeed(sb.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instList;
    }
    
    /**
     * Método para criptografia de uma String com método MD5
     * @param md5
     * @return 
     */
    public static String MD5(String md5) {
        try {
             java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
             byte[] array = md.digest(md5.getBytes());
             StringBuffer sb = new StringBuffer();
             for (int i = 0; i < array.length; ++i) {
               sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
             return sb.toString();
         } catch (java.security.NoSuchAlgorithmException e) {
         }
         return null;
    }
}
