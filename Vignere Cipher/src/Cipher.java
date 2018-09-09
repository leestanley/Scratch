import java.util.*;


public class Cipher
{
    public static void main(String args[]) 
    {
        String plaintext;
        int plaintextLength;
        int keyLength;
        String key = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your plaintext? ");
        plaintext = in.nextLine(); 
        plaintextLength = plaintext.length();
        
        for(int i = 0, length = plaintext.length(); i < length; i++) {
            if(plaintext.charAt(i) == ' ') {
                plaintextLength--;
            }
        }
        
        keyLength = (int)(Math.random() * plaintextLength) + 1;
    
        for(int j = 0; j < keyLength; j++) {
            int asciiNum = (int)(Math.random() * (122 - 97) + 1) + 97;  // 97-122 is the ascii range for 'a' - 'z'
            key += (char)asciiNum;
        }
        
        System.out.println("Key: " + key);
        System.out.print("Ciphertext: ");
        cipher(plaintext, key);
    }
    
    /* Runs the Vigenere cipher using plaintext and a key
     * 65-90 is the ascii range for 'A' - 'Z' 
     * 97-122 is the ascii range for 'a' - 'z'
     */
    
    public static void cipher(String plaintext, String key) {
        
        int keyIndex = 0;
        int keyNum = 0;
        int cipherNum = 0;
        String ciphertext = "";
        
        for(int i = 0, length = plaintext.length(); i < length; i++) {
            if(keyIndex == key.length()) {
                keyIndex = 0;
            }
            
            keyNum = (int)key.charAt(keyIndex) - 97; 
            
            if(Character.isUpperCase(plaintext.charAt(i))) {
                cipherNum = ((int)plaintext.charAt(i) + keyNum);
                
                if(cipherNum > 90) {
                    cipherNum = cipherNum % 91 + 65;
                }
                
                ciphertext += (char)cipherNum;
                keyIndex++;
            }
            
            else if(Character.isLowerCase(plaintext.charAt(i))) {
                cipherNum = ((int)plaintext.charAt(i) + keyNum);
                
                if(cipherNum > 122) {
                    cipherNum = cipherNum % 123 + 97;
                }
                
                ciphertext += (char)cipherNum;
                keyIndex++;
            }
            
             else {
                ciphertext += plaintext.charAt(i);
            } 
            
        }
        
        System.out.println(ciphertext);
    }
}
