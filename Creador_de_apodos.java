public class Main {
  public static void main(String[] args) {
	String name = "Meli";
	
    String apodo = "";
    
   if (name.length() <= 3){
   	 System.out.println("Tu nombre es muy corto");
   }
   else{
    for (int i = 0; i < 5; i++ ){
    	
    	if (name.charAt(2) == 'a' || name.charAt(2) == 'e'|| name.charAt(2) == 'i'|| name.charAt(2) == 'o'|| name.charAt(2) == 'u'){
        	apodo = name.substring(0,4);
        	
        }
        else{
        	apodo = name.substring(0,3);
        }
    }
  
   
   
   
    System.out.println(apodo);
   
   } 
   
  }
}
