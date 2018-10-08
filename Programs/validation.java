import java.io.*;

public class validation
{
    private String username;
    private String password;

    public validation(String username,String password){
      this.username=username;
      this.password=password;
    }

    public void validateUsername()
    {
      boolean flag;
      if(username.charAt(0)>=65 && username.charAt(0)<=97)
      {
        flag = true;
      }
      else if(username.indexOf(' ') >= 0)
      {
        flag = false;
      }
      else
      {
        flag = true;
      }
      if(flag == false)
      {
        System.out.println("invalid Username");
      }
      else
      {
        System.out.println("valid Password");
      }
    }
    // public void validatePassword()
    // {
    //   char ch;
    //   int flag = 1;
    //   if (password.length() < 8)
    //     flag = 0;
    //   for(int i=0 ; i < password.length() ; i++) {
    //     ch = str.charAt(i);
    //     if( password.isDigit(ch)) {
    //         numberFlag = true;
    //     }
    //     else if (password.isUpperCase(ch)) {
    //         capitalFlag = true;
    //     }
    //     else if (password.isLowerCase(ch)) {
    //         lowerCaseFlag = true;
    //     }
    //   }
    //   if(numberFlag && capitalFlag && lowerCaseFlag)
    //   {
    //     flag = 0;
    //   }
    //   else
    //   {
    //     flag = 1;
    //   }
    // }
    public static void main(String args[])throws IOException{
      try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a username : ");
        String user = br.readLine();
        System.out.println("Please enter a password : ");
        String pass = br.readLine();
        validation obj=new validation(user,pass);
        obj.validateUsername();
        // obj.validatePassword();
      }catch(Exception e){
        System.out.println(e);
      }
  }
}
