
import java.util.Scanner;

public class adventure {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //this program will give you a series of questions that will allow you to choose your own adventure. your adventure needs to have 4 choices per path
            // one of the inputs needs to be an int 
            // you need while loop checks to make sure the usar is inputting a valid choice 
            // 1. indentation is gonna be very important. make sure your indents are right 
            // 2. don't forget the ; at the end of lines 

        System.out.println("answer in one word answers with no caps");
        System.out.println(" ");
        System.out.println("you are unarmed and walking in a dangerous forest, lookig for the dark wizard when you come acorss a split in the path: do you take the path to the right which goes towards the sound of a river, or to the left which goes up a flimsy path up a cliff or head back down the path ? (\'left\' or \'right\' or \'back\')");
        String path = keyboard.nextLine();

        while ( !path.equals("right") && !path.equals("left") && !path.equals("back")){
            System.out.println("please input either left ot right or back");
            path = keyboard.nextLine();
        }
        
        if (path.equals( "right")){
            System.out.println("you head down the path to the sounds of a river, you find a small bridge almost fallen apart that heads over a river, a little up the river you find a area where the river is shallow that looks walkable: do you take the bridge or do you take the shallow part ? (\'bridge\' or \'shallows\') ");
            String river = keyboard.nextLine();

            while(!river.equals("bridge") && !river.equals("shallows")){
                System.out.println("please input either bridge or shallows");
                river = keyboard.nextLine();

            }

            if (river.equals("bridge")){
                System.out.println("you begin to walk across the bridge when a board you step on gives out and you fall into the current, you manage to make it out of the river downstream and find yourself outside of a tall dark tower with a large oak door: do you try to break down the door or search for a key? (\'break\' or \'search\')");
                String door = keyboard.nextLine();

                while (!door.equals("break") && !door.equals("search")){
                    System.out.println("please input either break or search");
                }

                if (door.equals("break")){
                    System.out.println("you slam into the door break it down, theres the wizard infront of you ! he raises his wand and begins to shoot lighting: pick a number between 1 and 100");
                    int lightning = keyboard.nextInt();

                    while ( lightning <0 && lightning >100){
                        System.out.println("please input a number between 0 and 100");
                        lightning = keyboard.nextInt();
                    }

                    if (lightning < 50){
                        System.out.println("you chose " + lightning + " which is less than 50 which basically means you decide to dodge left: you do that which was a stupid mistake and so get hit and you're dead now, haha dumbass");
                        System.out.println("the end, you lost and got the mid ending ");

                    }
                    else if (lightning > 50){
                        System.out.println("you chose " + lightning + " which is more than 50 which basically means you dodge right. this was the right option. the wizard misses and his lighting bounces off the wall killing himself. you saved the kingdome and are a hero now with loads of babes and money");
                        System.out.println("the end, you won with the material girl ending");
                    }
                }

                if (door.equals("search")){
                    System.out.println("you look around the tower and find a entrance to a basement, in the basement you find two boxes, one of the boxes is gilded in gold and diamonds, the other is a small wooden box that's falling apart: do you take the gold box or the wood box ? (\'gold\' or \'wood\')");
                    String box = keyboard.nextLine();
                    while(!box.equals("gold") && !box.equals("wood")){
                        System.out.println("please input either gold or wood");
                        box = keyboard.nextLine();
                    }

                    if (box.equals("gold")){
                        System.out.println("you open the gold box and find a gold curved sword with blood dripping off the blade, it screams at you. you take it cause you feel like you need to. you take it and the key you foun din the box with it and go back and open up the tower door, inside is the dark wizard !!!!!! suddenly the word take a mind of it's own and slices your throat harvesting your soul. the wizard uses your soul to destroy the entire kingdom and blow up the world !");
                        System.out.println("you lost, you got the worst ending, what a loser");
                    }
                    else if (box.equals("wood")){
                        System.out.println("inside the would box and inside is a small sword, as you grab it the dark wizard busts into the basement starts murmering a curse at you, before he can finish you stab him with the sword. his staff drops to the ground and calls out your name, you pick it up and assume your role as the new dark wizard, you have become what you sought to destroy and the cycle begins anew");
                        System.out.println("you won? you got the anti-hero ending");
                    }
                }
            }

            else if (river.equals("shallows")){
                System.out.println("you start to walk through the shallows when you trip on something that turns out to be a sword but before you can pick it up you hear a yell, an ugly orc now blocks your path across the river: do you grab for the sword and attack or rush the orc and try and knock him down? (\'sword\' or \'rush\') ");
                String orc = keyboard.nextLine();
                while(!orc.equals("sword") && !orc.equals("rush")){
                    System.out.println("please input either sword or rush");
                    orc = keyboard.nextLine();
                }

                if (orc.equals("sword")){
                    System.out.println("you grab the sword and defelct the orcs attack just in time, his weapon flies off into the river and you stab him, he dies and his body floats down stream. you continue down the path where you find a clearing, in the clearing you see the DARk WiZARD practicing magic, he looks to be doing soemthing to a deer and it's calling out in pain: do you sneak up behind him and kill him or do you get his attention first? (\'kill\' or \'attention\')");
                    String wizard = keyboard.nextLine();

                    while(!wizard.equals("kill") && !wizard.equals("attention")){
                        System.out.println("please inpout either kill or attention");
                        wizard = keyboard.nextLine();
                    }

                    if (wizard.equals("kill")){
                        System.out.println("you stab him and he screams in pain and dies. slwoly the forest arounds you shrivels and dies. you realize that the dark wizard was no dark wizard at all");
                        System.out.println("you lost, you got the realization ending");
                    }

                    else if(wizard.equals("attention")){
                        System.out.println("you yell at the wizard and he calls you over, you carefully walk over and he shows you the injured deer he is healing. suddenly you realuize that the dark wizard is no dark wizard at all and is actually the protector of the forest. you go home and tell the King the dark wizard is dead, now he can care for the forest in peace");
                        System.out.println("you won, you got the true ending!");
                    }
                }
    
                else if (orc.equals("rush")){
                    System.out.println("you rush the orc and knock him off his feet, you both fall to the ground hitting your heads and getting knocked out. you wake up being dragged by a figure in a dark cloak, THE WIZARD, as soon as he realized you're awake he pulls out his wand but you grab it from him, you only remember two spells: do you shoot fire at him or water?  (\'fire\' or \'water\') ");
                    String wand = keyboard.nextLine();

                    while(!wand.equals("fire") && !wand.equals("water")){
                        System.out.println("please inpout either fire or water");
                        wand = keyboard.nextLine();
                    }

                    if (wand.equals("fire")){
                        System.out.println("you shoot fire at him and he absorbs it and shoots it back at you, as the flames take you, you realize you were in way over your head and you had no chances in the first place, you die knowing you failed");
                        System.out.println("you lost, you got the sad ending");
                    }

                    else if(wand.equals("water")){
                        System.out.println("you shoot water at him and he melts in a scream. you have just defeated the most powerful wizard in the world, you are the most powerful knight in the kingdom.");
                        System.out.println("you won, you got the ego ending");
                    }
                }
            }
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        else if(path.equals("left")){
            System.out.println("you make your way up the cliff when suddenly a goblin blocks the path up the cliff, he is sleeping: do you try and sneak past the goblin or do you try and wake it up and win in a fight? (\'sneak\' or \'fight\') ");
            String goblin = keyboard.nextLine();

            while (!goblin.equals("sneak") && !goblin.equals("fight")){
                System.out.println("please input either sneak or fight");
                goblin = keyboard.nextLine();
            }

            if (goblin.equals("sneak")){
                System.out.println("you sneak past the goblin and he doesn't wake up, as your sneaking you see he has a sowrd next to him: do you take the sword or do you leave it ? (\'take\' or \'leave\')");
                String goblinSword = keyboard.nextLine();

                while (!goblinSword.equals("take") && !goblinSword.equals("leave")){
                    System.out.println("please input either take or leave");
                    goblinSword = keyboard.nextLine();
                }

                if (goblinSword.equals("take")){
                    System.out.println("you take the sword from the sleeping golin and he doesn't notice, you know have a sword. you continue up the clif and at the top you find an alter with the dark wizard praying at it: do you sneak up to him from the left through the trees or the right behind the rocks (\'trees\' or \'rocks\'");
                    String alter = keyboard.nextLine();
                    
                    while (!alter.equals("trees") && !alter.equals("rocks")){
                        System.out.println("please input either trees or rocks");
                        alter = keyboard.nextLine();
                     }
                    
                    if (alter.equals("trees")){
                         System.out.println("you sneak trough the trees but you step on a twig, the wizard hears and you are dead before you can even start to run");
                         System.out.println("you lost, you got the twig betrayal ending");
                    }
                    
                    else if(alter.equals("rocks")){
                         System.out.println("you sneak to the alter unnoticed, with the sword you come up behind the wizard and stab him in the back. he's dead before he can even realize");
                        System.out.println("you won, you got the undetected ending");
                    
                    }
                }

                else if (goblinSword.equals("leave")){
                    System.out.println("you continue without the sword. at the top of the cliff you a large rock made of obsidion, it glows with unkown light and calls you towards it: do you touch the rock or walk away from it? (\' touch \' or \' walk \')");
                    String hello = keyboard.nextLine();
                
                    while (!hello.equals("touch") && !hello.equals("walk")){
                        System.out.println("please input either touch or walk");
                        hello = keyboard.nextLine();
                    }
                
                    if (hello.equals("touch")){
                        System.out.println("you walk up and touch the stone. suddenly you are filled with an impending sense of doom, you know know evrerythng in the universe. you are now an all knowing god with infinite power");
                        System.out.println("you won with the omnipotent ending");
                    }
                
                    else if(hello.equals("walk")){
                        System.out.println("there is no choice. there is one option. you must touch the stone. you walk up and touch the stone. suddenly you are filled with an impending sense of doom, you know know evrerythng in the universe. you are now an all knowing god with infinite power");
                        System.out.println("you won with the omnipotent ending");
                    }
                
                }

            }

            else if (goblin.equals("fight")){
                System.out.println("you wake up the goblin and he jumps up and instantly stabs you with a sword, you fall off the cliff. as you're falling you see one of those conveiniant cliff bushes from the movies: do you grab the cliff bush or hope that the tree canopy can ease your fall? (\'bush\' or \'tree\')");
                String falling = keyboard.nextLine();

                while (!falling.equals("bush") && !falling.equals("tree")){
                    System.out.println("please input either bush or tree");
                }

                if (falling.equals("bush")){
                    System.out.println("you grab the bush and are hanging off the cliff when the wizard appears above you and demands you beg for your life: do you beg or die(\' beg\' or \'die\')");
                    String fall = keyboard.nextLine();
                
                    while (!fall.equals("beg") && !fall.equals("die")){
                        System.out.println("please input either beg or die");
                        fall = keyboard.nextLine();
                    }

                    if (fall.equals("beg")){
                        System.out.println("you beg and cry for your life but it means nothing to the wizard, your life is forfit and you die because you trusted a dark wizard");
                        System.out.println("you lost with the no dignaty ending");
                    }
                
                    else if(fall.equals("die")){
                        System.out.println("you tell the wizard to piss off and he respects that but still has to kill you. atleast this time you kept your dignaty");
                        System.out.println("you lost with the dignaty ending");
                    }
                
                }
                    
                else if(falling.equals("tree")){
                    System.out.println(" you fall through the trees and hit the ground. your leg is broken. do you try to call to safety or call for help (\'crawl\' or \'cry\')");
                    String help = keyboard.nextLine();
                
                    while (!help.equals("crawl") && !help.equals("cry")){
                        System.out.println("please input either crawl or cry");
                        help = keyboard.nextLine();
                    }

                    if (help.equals("crawl")){
                        System.out.println("you crawl back to the path where a traveler through the forest finds you and helps you back to town where you are healed. the dark wizard continues to terrorize the people and you failed to stop him");
                        System.out.println("you won with the failure ending");
                    }
                
                    else if(help.equals("cry")){
                        System.out.println("you cry out for help and infront of you appears a dark wizard. why would you call for help in a forest where a dark wizard lives and likes to kill people?!?!?!");
                        System.out.println("you lost with the dumbass ending");
                    }
                
                }
                

            }


        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        else if (path.equals( "back")){
            System.out.println("you turn around and right behind you is a huge troll with a club. he has swords sticking out of his back from all the knights that have tried to kill him: do you try and get one of the swords or fight him with fists (\'swords\' or \'fists\') ");
            String troll = keyboard.nextLine();

            while(!troll.equals("swords") && !troll.equals("fists")){
                System.out.println("please input either swords or fish");
                troll = keyboard.nextLine();
            }

            if (troll.equals("swords")){
                System.out.println("you run behind him and before he can turn around you grab a sword from his back. it's a small sword with a dark stone in the hilt. he turns around and swings at you: do you dodge or parry (\'dodge\' or \'parry\')");
                String swing = keyboard.nextLine();

                while (!swing.equals("dodge") && !swing.equals("parry")){
                    System.out.println("please input either dodge or parry");
                }

                if (swing.equals("dodge")){
                    System.out.println("you dodge the swing and he misses and spins around, he is dizzy and open to an attack: do you stab his face or his heart? (\'face\' or  \'heart\'')");
                    String stab = keyboard.nextLine();

                    while(!stab.equals("face") && !stab.equals("heart")){
                        System.out.println("please input either face or heart");
                        stab = keyboard.nextLine();
                    }

                    if (stab.equals("face")){
                        System.out.println("you try to stab him in his face but he regains control and before you can react he slams his club into you, crushing you into the ground");
                        System.out.println("you lost with the clubbed ending");
                    }
                
                    else if(stab.equals("heart")){
                        System.out.println("before the troll can regain control you stab your sword deep into his heart and he falls over and dies you go back to your town as a hero and a moster killer !! ");
                        System.out.println("you won with the \'wait what happned to the dark wizard\' ending");
                    }
                }

                if (swing.equals("parry")){
                    System.out.println("you parry his hit and he drops his club: do you give him a quick death or slowly skin him alive (\'quick\' or \'slow\')");
                    String unarmed = keyboard.nextLine();

                    while(!unarmed.equals("quick") && !unarmed.equals("slow")){
                        System.out.println("please input either quick or slow");
                        unarmed = keyboard.nextLine();
                    }

                    if (unarmed.equals("quick")){
                        System.out.println("you give the troll a quick death and continue on to find the dark wizard");
                        System.out.println("you won with the \'i didn't have time to continue the story\' ending");
                    }
                    else if (unarmed.equals("slow")){
                        System.out.println("dude.........");
                        System.out.println("Wtf if wrong with you ending");
                    }
                }
            }

            else if (troll.equals("fists")){
                System.out.println("you rush the troll and punch him as hard as you can in the face. he falls on his back. do you WWE elbow slam him or go for his manhood (\'elbow\' or \'peen?\') ");
                String knocked = keyboard.nextLine();

                while(!knocked.equals("elbow") && !knocked.equals("peen?")){
                    System.out.println("please input either elbow or peen?");
                    knocked = keyboard.nextLine();
                }

                if (knocked.equals("elbow")){
                    System.out.println("you WWE elbow slam him but his bouncy troll belly resists the hit and bounces you off into the trees. the troll gets up but can't see you hidden in the bush: do you sneack attack or sneakc attack but this time you yell while doing it (\'silent\' or \'yell\')");
                    String attack = keyboard.nextLine();

                    while(!attack.equals("silent") && !attack.equals("yell")){
                        System.out.println("please inpout either silent or yell");
                        attack = keyboard.nextLine();
                    }

                    if (attack.equals("silent")){
                        System.out.println("you silently run at the troll and snap his neck he dies and you steal all the pastries he was hoarding in his cave");
                        System.out.println("you won with the baked goods ending");
                    }

                    else if(attack.equals("yell")){
                        System.out.println("you yell at him while trying to sneak attack. obviously he notices you and kills you instantly");
                        System.out.println("you won with the cliche movie trope ending");
                    }
                }

                else if (knocked.equals("peen?")){
                    System.out.println("you punch him there and he instantly dies: do you look for his treasure cave or go home. (\'cave\' or \'home\') ");
                    String pile = keyboard.nextLine();

                    while(!pile.equals("home") && !pile.equals("cave")){
                        System.out.println("please inpout either cave or home");
                        pile = keyboard.nextLine();
                    }

                    if (pile.equals("cave")){
                        System.out.println("you find his cave and it's filled with lots of paitings of birds in suits. Odd. in another ending it's filled with pastries");
                        System.out.println("you won with the distinguished birds ening");
                    }

                    else if(pile.equals("home")){
                        System.out.println("you go home without any reward. while you're going to sleep you remember that you totally forgot about the dark wizard!");
                        System.out.println("you won with the \'oh shit I gotta go back ending\'");
                    }
                }
            }
        }

        keyboard.close();

    }
        
    
}