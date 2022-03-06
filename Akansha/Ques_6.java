class Sixth {    
    public static void main(String[] args) {    
        int year=2022;    
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
            System.out.println("THIS YEAR IS A LEAP YEAR");  
        }  
        else{  
            System.out.println("THIS YEAR IS NOT A LEAP YEAR");  
        }  
    }    
    }    
