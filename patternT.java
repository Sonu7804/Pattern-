class pattern{
        public static void main(String[] args)
        {
             int n = 10;
            
            for(int i=1; i<=n; i++)
            {
              for(int j=1 ;j<=n; j++)
              {
                 if( i == 1 || j == n/2)
                 {
                  System.out.print(" * ");
                 }
                 else
                 {
                 System.out.print("   ");
                 }
                 
                 }
                  System.out.println();
             }
           
         }
     }
     
            
        
            
        
        
        
    