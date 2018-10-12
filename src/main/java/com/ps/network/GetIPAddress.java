package com.ps.network;

import java.net.InetAddress;

public class GetIPAddress {
	 public static void main(String args[]) throws Exception 
	    { 
	        String url = "www.google.com"; 
	        try
	        { 
	            // Get IP addresses related to the domain 
	            InetAddress ips[] = InetAddress.getAllByName(url); 
	  
	            // Display ip addresses 
	            System.out.println("IP Address(es)"); 
	            for (InetAddress addr:ips) 
	                System.out.println(addr.getHostAddress()); 
	        } 
	        catch(Exception ex) 
	        { 
	            System.out.println("host not found"); 
	        } 
	    } 
	} 
