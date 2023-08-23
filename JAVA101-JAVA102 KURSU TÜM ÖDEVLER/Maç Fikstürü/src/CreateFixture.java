
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class CreateFixture {
	
	Scanner input=new Scanner(System.in);
	
	LinkedList<String> teams=new LinkedList<>();
	LinkedList<LinkedList<String>> fixture=new LinkedList<>();
	
	//kullanıcının takımlaı girdiği kısım: 
	public void enterTeams() {
		System.out.println("Takim sayisini giriniz: ");
		int teamCount=input.nextInt();
		
		while (teamCount<2) {
			System.out.println("Gecerli takim sayisi giriniz");
			 teamCount=input.nextInt();
		}
		
		for (int i = 0; i <teamCount; i++) {
			System.out.println("Bir takim giriniz: ");
			String team=input.next();
			team=team.substring(0,1).toUpperCase()+ team.substring(1).toLowerCase();//takımın ilk harfi büyük diğerleri küçük yazdırılıyor
			
			if (!teams.contains(team)) {
				teams.add(team);
			}
			else {
				System.out.println("\t \n Bu takım fikstürde zaten var!");
				i--;
			}
		}
		
		printTeams();
		mixList();
		
	}
	
	public void printTeams() { //takımları ekrana yazdıran fonksiyon
		System.out.println("\t \n --------TAKIMLAR-------");
		for (String team : teams) {
			System.out.println(" - "+team);
		}
	}
	
	
	 public void mixList() {
		Random rnd=new Random();
            for (int i = 0; i < teams.size()-1; i++) {
	               int random=rnd.nextInt(teams.size()-1); //takım boyutuna göre rastgele sayı üretiyor
	               String temp=teams.get(random);
	               teams.add(i,teams.get(random));
	               teams.remove(teams.lastIndexOf(temp));
	
         }
	    }         
           
	 public void setFixture() {
    	        int weekCount;
    	        int i = 0;

    	        if (teams.size() % 2 == 0) {
    	            weekCount = (teams.size() - 1) * 2;
    	        } else {
    	            weekCount = teams.size() * 2;
    	        }
          
	    
	    
            while (i != weekCount) {
                LinkedList<String> week = new LinkedList<>();
                if (i < weekCount / 2) {
                    if (teams.size() % 2 == 0) {
                        for (int j = 0; j < (teams.size() - 1) / 2; j++) {
                            week.add(teams.get(j + 1) + " vs. " + teams.get(teams.size() - (j + 1)));
                        }
                        week.add(teams.get(0) + " vs. " + teams.get(teams.size() / 2));
                    } else {
                        for (int j = 0; j < teams.size() / 2; j++) {
                            week.add(teams.get(j) + " vs. " + teams.get(teams.size() - (2 + j)));
                        }
                        week.add(teams.getLast() + " vs. " + "BYE");
                    }
                } else {
                    if (teams.size() % 2 == 0) {
                        for (int j = 0; j < (teams.size() - 1) / 2; j++) {
                            week.add(teams.get(teams.size() - (j + 1)) + " vs. " + teams.get(j + 1));
                        }
                        week.add(teams.get(teams.size() / 2) + " vs. " + teams.get(0));
                    } else {
                        for (int j = 0; j < teams.size() / 2; j++) {
                            week.add(teams.get(teams.size() - (2 + j)) + " vs. " + teams.get(j));
                        }
                        week.add(teams.getLast() + " vs. " + "BYE");
                    }
                }
                fixture.add(week);
                teams.add((teams.size() % 2 + 1) % 2, teams.getLast());
                teams.remove(teams.size() - 1);
                i++;
            }

            printFixture();
        }

        public void printFixture() {
            for (int i = 0; i < fixture.size(); i++) {
                System.out.println();
                System.out.println("ROUND " + (i + 1) + "\n-------------------------");
                for (int j = 0; j < fixture.get(i).size(); j++) {
                    System.out.println(fixture.get(i).get(j));
                }
            }
        }
	
	
	

	

}
