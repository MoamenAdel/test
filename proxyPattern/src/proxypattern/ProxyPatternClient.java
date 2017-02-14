package proxypattern;


public class ProxyPatternClient {
	
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("7amada el rewe4");
		
		access.grantInternetAccess();
	}


}
