/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan60.akatsuki;

/**
 *
 * @author user
 */
public class PBO210118058Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
            String cloth = "Black Red Cloud";
        String goal = "Gathering all Jinchuriki";
        
        Members deidara = new Members("Deidara", "Iwagakure", "Explosive Clay", 
                "S-Rank Missing Ninja", "Explosive Release", "Killed in Battle "
                        + "by Chiyo", true, cloth, goal);
        Members sasori = new Members("Sasori", "Sunagakure", "Hiruko", "S-Rank "
                + "Missing Ninja from Sunagakure's Puppet Brigade", "Puppet "
                + "Mastery", "Killed in Battle by Sakura", true, cloth, goal);
        Members kisame = new Members("Kisame Hoshigaki", "Kirigakure", "Samehada",
                "S-Rank Missing Ninja", "Shark-o-mation", "Committed Suicide", 
                true, cloth, goal);
        Members itachi = new Members("Itachi Uchiha", "Konohagakure", "Kunai", 
                "Anbu Captain Missing Ninja", "Mangekyo Sharingan", 
                "Killed by his own brother", true, cloth, goal);
        Members orochimaru = new Members("Orochimaru", "Konohagakure", 
                "Snakes", "Konohagakure's Legendary Sannin", 
                "Power of White Snake", "Killed & Revived by Sasuke", 
                false, cloth, goal);
        
        System.out.println("Akatsuki Bio");
        System.out.println("============");
        System.out.println();
        System.out.println("Cloth : " + deidara.getClothes());
        System.out.println("Goal : " + deidara.getGoals());
        System.out.println();
        
        deidara.displayMember();
        sasori.displayMember();
        kisame.displayMember();
        itachi.displayMember();
        orochimaru.displayMember();
    }
    
    
}
