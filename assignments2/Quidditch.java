package assignments2;

import javax.print.event.PrintEvent;

public class Quidditch {
 
    public static void main(String args[]) {
     
        QuidditchPlayer[] allPlayers = new QuidditchPlayer[28];
        String[] teams = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        String[] positions = {"Chaser", "Chaser", "Chaser", "Beater", "Beater", "Keeper", "Seeker"};
        
        //allPlayers[0] = new QuidditchPlayer(teams[0], positions[0]);
        //allPlayers[1] = new QuidditchPlayer(teams[0], positions[1]);
        //allPlayers[2] = new QuidditchPlayer(teams[0], positions[2]);


        //allPlayers[27] = new QuidditchPlayer(teams[3], positions[6]);
        
        int count = 0;

        for( int h = 0; h<teams.length; h++ ){
            for( int k = 0; k<positions.length ; k++ ){
                allPlayers[count] = new QuidditchPlayer(teams[h], positions[k]);
                count++;
            }
        }

        for(int t = 0 ; t<allPlayers.length ; t++){
            System.out.println(allPlayers[t]);
        }
     }
}    
        class QuidditchPlayer {
        
        private String team;
        private String position;
        
        public QuidditchPlayer() {
        team = "Gryffindor";
        position = "Seeker";
        }
        
        public QuidditchPlayer(String t, String p) {
        team = t;
        position = p;
        }
        
        public String toString() {
        return team + ", " + position;
        }
    }
