package frc.robot;

import java.util.Scanner;

  public class Main {
      public static void main(String[] args) throws Exception {
          Scanner myScanner = new Scanner(System.in);
  
          System.out.println("What is your name?");
  
          String name = myScanner.nextLine();
  
          System.out.println("Hello, " + name + " are you ready to test your knowledge of AZTECH Robotics? (y/n)");
  
          if("y".equals(myScanner.nextLine())){
              System.out.println("Pick Your Section ");
              System.out.println("[1] Team History");
              System.out.println("[2] Competition History");
            
          switch(myScanner.nextInt()){
              case 1 -> teamHistory();
              case 2 -> compHistory();
              default -> System.out.println (name + ", now I don't believe that was an");
          }
          
              System.exit(0);
          }else{
              System.out.println("Bye");
              System.exit(0);
          }
             myScanner.close();
       
        }
        public static void teamHistory(){
          
            System.out.println("What year was the team founded (2017 or 2018)");
            Scanner myScanner = new Scanner(System.in);
            if("2017".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Team History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                teamHistory2();
              }
              else{
                moveonTeam();  
                }
              }else{
              System.out.println("Sorry, not quite! Would you like to continue with the Team History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  teamHistory2();
                }
                else{
                  moveonTeam();
                }
                myScanner.close();
              }
            }
              
          

        public static void teamHistory2(){
            System.out.println("Who founded the team? (Mr. Heiser or Mr. Hawkins)");
            Scanner myScanner = new Scanner(System.in);
            if("Mr. Heiser".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Team History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                teamHistory3();
              }
              else{
                moveonTeam();
                }
              }else{
              System.out.println("Sorry, not quite! Would you like to continue with the Team History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  teamHistory3();
                }
                else{
                  moveonTeam();
                }
                 myScanner.close();
              }
            }
        
        public static void teamHistory3(){
          Scanner myScanner = new Scanner(System.in);
           System.out.println("Who is one of the current lead mentors?(Dr. Wendell or Charlie)");
          
            if("Dr. Wendell".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Team History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                teamHistory4();
              }
              else{
                System.out.println("Would you like to move onto [1] Competition History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> compHistory();
                  case 2 -> exit();
                }
              }
              myScanner.close();
            }
            else{
              System.out.println("Sorry, not quite! Would you like to continue with the Team History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  teamHistory4();
                }
                else{
                  moveonTeam();
                }
              }
          myScanner.close();
        }
       
        public static void teamHistory4(){
          Scanner myScanner = new Scanner(System.in);
          System.out.println("What is the highest position in the team organization?(Business/Technical President [1] or Engineering Director [2] or Lead Mentor [3])");
          
            if("1".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Team History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                teamHistory5();
              }
              else{
                System.out.println("Would you like to move onto [1] Competition History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> compHistory();
                  case 2 -> exit();
                }
              }
              myScanner.close();
            }
            else{
              System.out.println("Sorry, not quite! Would you like to continue with the Team History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  teamHistory5();
                }
                else{
                  moveonTeam();
                }
              }
          myScanner.close();
        }

        public static void teamHistory5(){
          Scanner myScanner = new Scanner(System.in);
          System.out.println("Bonus Question: Who started the team with Mr. Heiser?(Thomas Quillian [1] or Ryan Dimman [2])");
          
              if("2".equals(myScanner.nextLine())){
                System.out.println("Congratulation! You have completed the team History Questions!");
                moveonTeam();
                }
              else{
              System.out.println("Sorry, not quite! This was all the Team Questions");
               moveonTeam();
                
                myScanner.close();
              }
            }
         
        

         public static void compHistory(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("Which of the following awards did AZTECH Robotics recieve during the Crescendo Season? (Impact Award or Spirit Award or Wood Flowers Award)");
            if("Spirit Award".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Competition History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                compHistory2();
              }
              else{
                System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> teamHistory();
                  case 2 -> exit();
              }
            }
          }else{
            System.out.println("Sorry, not quite! Would you like to continue with the Competition History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  compHistory2();
                }
                else{
                moveonComp();  
                
              }
          }
          myScanner.close();
        }
        public static void compHistory2(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("How many Dean's List Finalists has our team had?");
            if("3".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Competition History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                compHistory3();
              }
              else{
                System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> teamHistory();
                  case 2 -> exit();
              }
            }
          }else{
            System.out.println("Sorry, not quite! Would you like to continue with the Competition History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  compHistory3();
                }
                else{
                moveonComp();  
                
              }
          }
          myScanner.close();
        }

        public static void compHistory3(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("What year did AZTECH Robotics attend Worlds?");
            if("2019".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Competition History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                compHistory4();
              }
              else{
                System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> teamHistory();
                  case 2 -> exit();
              }
            }
          }else{
            System.out.println("Sorry, not quite! Would you like to continue with the Competition History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  compHistory4();
                }
                else{
                moveonComp();  
                
              }
          }
          myScanner.close();
        }

        public static void compHistory4(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("What competition did AZTECH Robotics win in 2019 (AZ East [1] or AZ West [2] or AZ Valley [3]");
            if("2".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Competition History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                compHistory5();
              }
              else{
                System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> teamHistory();
                  case 2 -> exit();
              }
            }
          }else{
            System.out.println("Sorry, not quite! Would you like to continue with the Competition History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  compHistory5();
                }
                else{
                moveonComp();  
                
              }
          }
          myScanner.close();
        }

        public static void compHistory5(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("Bonus Question: Name of the 3 Dean's List Award Winners (Only First Name - Capitalize First Letter)");
            if("Ben".equals(myScanner.nextLine())){
              System.out.println("Congratulations! You have competed the Competition History Category!");
              moveonComp();
              }
            if("Tishya".equals(myScanner.nextLine())){
              System.out.println("Congratulations! You have competed the Competition History Category!");
              moveonComp();
              }
            if("Zach".equals(myScanner.nextLine())){
              System.out.println("Congratulations! You have competed the Competition History Category!");
              moveonComp();
        
            }else{
              System.out.println("Sorry, not quite! That was all the Competition History questions.");
                if("y".equals(myScanner.nextLine())){
                  compHistory5();
                }
                else{
                moveonComp();  
                
              }
          }
            
            myScanner.close();
          }
        
        
      

        public static void moveonTeam(){
          Scanner myScanner = new Scanner(System.in);
          System.out.println("Would you like to move onto [1] Competition History or [2] Exit?");
                  switch(myScanner.nextInt()){
                    case 1 -> compHistory();
                    case 2 -> exit();
                  }
          myScanner.close();
        }

        public static void moveonComp(){
          Scanner myScanner = new Scanner(System.in);
           System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                  switch(myScanner.nextInt()){
                    case 1 -> teamHistory();
                    case 2 -> exit();
        }
        myScanner.close();
      }
         public static void exit(){
          System.exit (0);
        }
      }
    
  