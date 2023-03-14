### 1. Print words in X shape
```
g           s
 e         k 
  e       e  
   k     e   
    s   g    
     f r     
      o      
     f r     
    s   g    
   k     e   
  e       e
 e         k
g           s
```

```java
public class java{
    public static void main(String[] args){
        String str = "geeksforgeeks";
        int len = str.length();
        for (int i = 0; i < len; i++){
            int j = len - 1 - i;
            for(int k = 0; k < len; k++){
                if(k == i || k == j){
                    System.out.print(str.charAt(k));
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println(""); 
        }
    }
}
```
