package geco;

import java.util.Random;

public class PasswordGeneration {

  public String  getRandomPassword(){
      String[] pass ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","1","2","6","3","4","5"};
      String mp="";

      for (int i=0;i<8;i++){
          Random r = new Random();
          int rr= r.nextInt(pass.length);
          mp+=pass[rr];

      }
      return  mp;

    }

    public static void main(String []args){
      PasswordGeneration p =new PasswordGeneration();
      System.out.print(p.getRandomPassword());
    }
}
