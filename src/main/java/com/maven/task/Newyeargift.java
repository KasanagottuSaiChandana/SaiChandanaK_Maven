package com.maven.task;
import java.util.*;
public class Newyeargift {
	    public static void main( String[] args )
	    { 
	        int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0,total_candies = 0;
	        char n1;
	        Sweets collect;
	        Boolean n=true;
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("fill the gift box with different types of sweets available below");
	        while(n) {
	       
	        System.out.println("AVAILABLE SWEETS");
	        System.out.println("1.SNICKERS!!");
	        System.out.println("2.CREAMS!!");
	        System.out.println("3.ECLAIRS!!");
	        System.out.println("4.CANDIES!!");
	        System.out.println("5.JALEBI!!");
	        System.out.println("6.KAJUROLL!!");
	        System.out.println("choose an item(1-6)");
	        
	        try {
	        	
	        switch(sc.next().charAt(0))
	        {
	        case '1':
	        	   System.out.println("please enter the quantity");
	        	   quantity=sc.nextInt();
	        	   System.out.println("please enter the weight in grams");
	        	   weight=sc.nextInt();
	        	   collect= new Snickers();
	        	   total_weight=collect.calcwt( quantity, weight);
	        	   totalbox_wt=totalbox_wt+total_weight;
	        	   System.out.println("total weight of snickers is:"+total_weight+"grams");
	        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	               
	        	   System.out.println("do you want any other item (y/n)");
	        	   n1=sc.next().charAt(0);
	        	      if(n1=='y'|| n1=='Y')
	        	        { 
	        	    	  n=true;
	        	          break;
	        	        }
	        	     else
	        		    {
	        	    	 n=false;
	                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	                     System.out.println("Total number of candies in the giftbox is:"+total_candies);
	                     break;
	                    }
	        case '2':
	        	   System.out.println("please enter the quantity");
	        	   quantity=sc.nextInt();
	        	   System.out.println("please enter the weight in grams");
	        	   weight=sc.nextInt();
	        	   collect=new Creams();
	        	   total_weight=collect.calcwt(quantity, weight);
	        	   totalbox_wt=totalbox_wt+total_weight;

	        	   System.out.println("total weight of creams is:"+total_weight+"grams");
	        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	   System.out.println("do you want any other item (y/n)");
	        	   n1=sc.next().charAt(0);
	        	      if(n1=='y'|| n1=='Y')
	        	        { 
	        	    	  n=true;
	        	          break; 
	        	        }
	        	      else
	        		    {
	        	    	  n=false;
	        	          System.out.println("Toatal gift box weight is:"+totalbox_wt+"grams");
	        	          System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	          break;
	        	        }
	        case '3':
	        	System.out.println("please enter the quantity");
	        	quantity=sc.nextInt();
	        	System.out.println("please enter the weight in grams");
	        	weight=sc.nextInt();
	        	collect=new Eclairs();
	        	total_weight=collect.calcwt(quantity, weight);
	        	totalbox_wt=totalbox_wt+total_weight;

	        	System.out.println("total weight of eclairs is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	break;}
	        case '4':
	        	System.out.println("please enter the quantity");
	        	quantity=sc.nextInt();
	        	System.out.println("please enter the weight in grams");
	        	weight=sc.nextInt();
	        	collect=new Candies();
	        	total_weight=collect.calcwt(quantity, weight);
	        	totalbox_wt=totalbox_wt+total_weight;
	        	total_candies=total_candies+quantity;

	        	System.out.println("total weight of Candies is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	                System.out.println("Total number of candies in the giftbox is:"+total_candies);
	                
	        	break;}
	        case '5':
	        	System.out.println("please enter the quantity");
	        	quantity=sc.nextInt();
	        	System.out.println("please enter the weight in grams");
	        	weight=sc.nextInt();
	        	collect=new Jalebi();
	        	total_weight=collect.calcwt(quantity, weight);
	        	totalbox_wt=totalbox_wt+total_weight;

	        	System.out.println("total weight of Jalebi is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	break;}
	        case '6':
	        	System.out.println("please enter the quantity");
	        	quantity=sc.nextInt();
	        	System.out.println("please enter the weight in grams");
	        	weight=sc.nextInt();
	        	collect=new Kajuroll();
	        	total_weight=collect.calcwt(quantity, weight);
	        	totalbox_wt=totalbox_wt+total_weight;

	        	System.out.println("total weight of Kajuroll is:"+total_weight+"grams");
	        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        	System.out.println("do you want any other item (y/n)");
	        	n1=sc.next().charAt(0);
	        	if(n1=='y'|| n1=='Y')
	        	    {n=true;
	        	    
	        	break;}
	        	else
	        		{n=false;
	        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
	        		System.out.println("Total number of candies in the giftbox is:"+total_candies);
	        	break;}
	        
	 
	        }}
	        catch(Exception e)
	        {
	        	System.out.println("please select from 1-6 options");
	            
	        
	        
	    }}
	        sc.close();
	}}
