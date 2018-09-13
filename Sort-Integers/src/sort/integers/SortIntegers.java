// Ahmed Almafrachi
package sort.integers;

import javax.swing.JOptionPane;




public class SortIntegers {

 
    public static void main(String[] args) {
        
      String dialoginput; 
      
                // prompt the user to enter the three numbers usung the dialogs
                dialoginput = JOptionPane.showInputDialog("Enter the First number ");
		int n1 = Integer.parseInt(dialoginput);
                
                dialoginput = JOptionPane.showInputDialog("Enter the Second number ");
		int n2 = Integer.parseInt(dialoginput);
                
                dialoginput = JOptionPane.showInputDialog("Enter the Third number ");
		int n3 = Integer.parseInt(dialoginput);
                
                
                //compute the numbers using if  else statment.
                String str = null;  
                if (n1 <= n2 && n1 <= n3)
                {
                        if (n2 <= n3){
                                str = (n1)+" <= "+(n2)+" <= "+(n3);
                        }else
                                str = (n1)+" <= "+(n3)+" <= "+(n2);
                }
                
                if (n2 <= n1 && n2<=n3)
                {
                        if(n1 <= n3){
                        
                                str = (n2)+" <= "+(n1)+" <= "+(n3);
                        }else 
                                str = (n2)+" <= "+(n3)+" <= "+(n1);     
                }    
                
                if(n3 <= n1 && n3 <= n2)
                {
                        if(n1 <= n2){
                            
                                str = (n3)+" <= "+(n1)+" <= "+(n2);
                        }else 
                                str = (n3)+" <= "+(n2)+" <= "+(n1);
                    
                }
                
                // display the result using dialog show massage.
                JOptionPane.showMessageDialog(null, str);
                
    }
    
}
