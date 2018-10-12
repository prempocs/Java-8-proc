package com.ps.network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressSAmple {

	 public static void main(String[] args) throws UnknownHostException  
     { 
       
     String url = "www.geeksforgeeks.org"; 
     byte addr[]={127, 0, 0, 1}; 
     InetAddress ip1 =  Inet4Address.getByName(url); 
     InetAddress ip2 =  InetAddress.getByAddress(addr); 
       
     // Following methods checks the property of the thus created object. 
     // getAddress() method 
     System.out.println("Address : " + Arrays.toString(ip1.getAddress())); 

     // getHostAddress() method 
     System.out.println("Host Address : " + ip1.getHostAddress()); 

     // isAnyLocalAddress() method 
     System.out.println("isAnyLocalAddress : " + ip1.isAnyLocalAddress()); 
       
     // isLinkLocalAddress() method 
     System.out.println("isLinkLocalAddress : " + ip1.isLinkLocalAddress()); 
       
     // returns true if this address is a loopback address. 
     System.out.println("isLoopbackAddress : " + ip1.isLoopbackAddress()); 
       
     // returns true if this multicast address has global scope.
     System.out.println("isMCGlobal : " + ip1.isMCGlobal()); 
       
     // returns true if this multicast address has link scope. 
     System.out.println("isMCLinkLocal : " + ip1.isMCLinkLocal()); 
       
     // returns true if this multicast address has node scope. 
     System.out.println("isMCNodeLocal : " + ip1.isMCNodeLocal()); 
       
     // returns true if this multicast address has organisation scope. 
     System.out.println("isMCOrgLocal : " + ip1.isMCOrgLocal()); 
       
     // returns true if this multicast address has site scope. 
     System.out.println("isMCSiteLocal : " + ip1.isMCSiteLocal()); 
       
     // isMulticastAddress() method 
     System.out.println("isMulticastAddress : " + ip1.isMulticastAddress()); 

     // isSiteLocalAddress() method 
     System.out.println("isSiteLocalAddress : " + ip1.isSiteLocalAddress()); 

     // hashCode() method 
     System.out.println("hashCode : " + ip1.hashCode()); 
       
     // equals() method 
     System.out.println("ip1==ip2 : " + ip1.equals(ip2)); 
 } 

} 