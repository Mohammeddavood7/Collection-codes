package com.april24.ArrayListorLinkedList.task;

import java.io.IOException;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) throws IOException
	{
		
		CabCustomer cc1 =  new CabCustomer(111, "smith", "ameerpet", "madhapur", 12, "9876543211");
		CabCustomer cc2 =  new CabCustomer(222, "ward", "madhapur", "ameerpet", 12, "9876543212");
		CabCustomer cc3 =  new CabCustomer(333, "scott", "punjagutta", "hightechcity", 22, "9876543213");
		CabCustomer cc4 =  new CabCustomer(444, "miller", "hightectcity", "punjagutta", 22, "9876543214");
		CabCustomer cc5 =  new CabCustomer(555, "john", "balkampet", "karithabadh", 8, "9876543215");
		CabCustomer cc6 =  new CabCustomer(666, "willsmith", "lbnagar", "dilsukhnagar", 4, "9876543216");
  
		CabCustomer cc7 =  new CabCustomer(777, "captainmiller", "dilsukhnagar", "lbnagar", 5, "9876543217");
		
		
		CabCustomerService ccs = new CabCustomerService();
		ccs.addCabCustomer(cc1);
		ccs.addCabCustomer(cc2);
     	ccs.addCabCustomer(cc3);
     	ccs.addCabCustomer(cc4);
		ccs.addCabCustomer(cc5);
     	ccs.addCabCustomer(cc6);
     	ccs.addCabCustomer(cc7);

     	
		CabCustomerService ccs1 = new CabCustomerService();
		CabCustomer cc8 =  new CabCustomer(888, "captainmiller", "dilsukhnagar", "lbnagar", 5, "9876543217");
        ccs1.addCabCustomer(cc8);
     	ccs1.addCabCustomer(cc6);
     	ccs1.addCabCustomer(cc7);

		ccs1.pritBill(cc7);
		
		
		

		
	
	}

}





















