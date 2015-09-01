import java.util.Scanner;

public class TextAdventure{
    
    public static void main (String[]args){
       
       Scanner getChoice = new Scanner(System.in);
       int choice;
       int area =1;
       String location = "hej";
       boolean goBack = false;
       boolean gameOver = false;
       boolean hasStick = false;
       boolean hasSword = false;
       
       do{
           
           location = "You're standing at a crossroads. " + "\n" 
           +"To the west you see the road winding down towards the sea. " + "\n" 
           +"The North path leads into a dark forest. " + "\n";           
           System.out.println(location);
           System.out.print("Where do you wish to go?(West:1, North:2): ");
           choice = getChoice.nextInt();
           
           
           //if(choice<1 || choice>3){System.out.println ("You can't go that way!");}
               
           if(choice==1){
              System.out.println("You follow the path down towards the sea until you reach the beach.");
              
               do{
                    location = "You're at the beach, there is a small cave to the north, in south you can see a small man fishing.";                    
                    System.out.println(location);
                    System.out.print("Where do you wish to go?(North:1, South:2): ");
                    choice = getChoice.nextInt();
                    
                        if(choice==1){                        
                            location ="In the cave you find a sharp stick. "
                            +"Do you pick upp the sharp stick? y:1/n:2?";
                            System.out.print(location);
                            choice = getChoice.nextInt();
                            if(choice==1){
                                System.out.println("You now have a stick! Fearsome!");
                                hasStick = true;
                                System.out.println("You head back to the beach.");  
                                goBack = true;
                            }
                            else{
                                System.out.println("You dont want a shabby old stick and you leave the cave.");
                                goBack = true;
                            }
                            
                        }else if(choice==2){                            
                            System.out.println("You head towards the fisherman. He's trying to catch fish with an old sword without much success."
                            +"He looks up at you and exclaims"                       
                            + "\n'How am I supposed to fish without my spear!'");
                            do{ 
                                if(hasSword){
                                    System.out.println("The fisherman is fishing happily with his new spear.");
                                }
                                else{
                                    System.out.println("The fisherman is frustatedly clubbing the water with his sword.");
                                    System.out.println("Do you wish to go back? y:1/n:2");
                                    choice = getChoice.nextInt();
                                    
                                    if(choice==1){
                                        goBack = true;
                                    }
                                    
                                }
                                
                                if(hasStick){
                                    System.out.println("You figure that your stick can make an excellent fishing spear.");
                                    System.out.println("Give the man your stick? y:1/n:2)");
                                    choice = getChoice.nextInt();
                                    if(choice==1){
                                        System.out.println("You hand the man your stick.");
                                        System.out.println("The man's eyes widen at the sight of the stick.");
                                        System.out.println("That would work much better than my old sword! \nHere you can have it in trade!");
                                        hasStick=false;
                                        hasSword=true;
                                        System.out.println("You head back.");
                                        goBack=true;
                                    }
                                    else if(choice == 2){
                                        System.out.println("My ssssstick! My precioussss");
                                        System.out.println("You head back.");
                                        goBack=true;
                                    }
                                }
                            }while(!goBack);
                            goBack = false;
                        }
                        

                    }while(!goBack);
                    goBack = false;
            
                          
            }else if(choice==2){
                location = "As you enter the forest you have a feeling you've just made a terrible mistake." +"\n"
                +"You start contemplating turning back when a huge beast lunges out of the forest.";
                
                System.out.println(location);
                if(!hasSword && !hasStick){
                    System.out.println("You see a huge mouth full of teeth getting closer and you feel" +"a final sensation of teeth"+"\n"
                    +"sinking into your throat.");
                    System.out.println ("You have died!");
                    gameOver=true;
                }else if (hasStick){
                    System.out.println("You raise your mighty stick and shout menacingly 'Not while I have the shar stick'");
                    System.out.println("Alas, the sharp stick may be sharp but it isn't very strong and it snaps in half");
                    System.out.println("You feel sharp teeth bite into your neck.");
                    System.out.println ("You have died!");
                    gameOver=true;

                }else{
                    System.out.println("You slash visciously with your sword and the beast's head spins away into the forest");
                    System.out.println("You feel a sense of accomplishment and continue on to further adventures");
                    System.out.println ("You win!");
                    gameOver=true;
                
            }
                
                                     
           }
            
       }while(!gameOver);
       
    }
    
}