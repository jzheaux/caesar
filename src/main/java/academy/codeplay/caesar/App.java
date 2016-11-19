package academy.codeplay.caesar;

/**
 * Hello world!
 *
 */
public class App 
{
	private static class Composer {
		String firstName;
		String middleName;
		String lastName;
		Integer yearBorn;
		Integer yearDied;
		String placeBorn;
		String placeDied;
	}

	private static class Song {
		String name;
		Integer year;
		Integer lowCaesar, highCaesar;
	}
	
	private static class Video {
		Integer firstCaesar, secondCaesar;
		Composer composer;
		Song song;
		
		Integer getSubtractedCaesar() {
			return firstCaesar - secondCaesar;
		}
		
		Integer getAddedCaesar() {
			return firstCaesar + secondCaesar;
		}
	}
	
    public static void main( String[] args )
    {
    	Video one = new Video();
    	one.firstCaesar = 1;
    	one.secondCaesar = 0;
    	
    	Composer beethoven = new Composer();
    	beethoven.firstName = "Ludwig";
    	beethoven.middleName = "Van";
    	beethoven.lastName = "Beethoveon";
    	beethoven.yearBorn = 1770;
    	beethoven.yearDied = 1827;
    	beethoven.placeBorn = "";
    	
    	Composer vivaldi = new Composer();
    	vivaldi.firstName = "Antonio";
    	vivaldi.middleName = "";
    	vivaldi.lastName = "Vivaldi";
    	vivaldi.yearBorn = 1678;
    	vivaldi.yearDied = 1741;
    	vivaldi.placeBorn = "Italy";
    	
    	Composer brahms = new Composer();
    	brahms.firstName = "Johann";
    	brahms.middleName = "";
    	brahms.lastName = "Brahms";
    	brahms.yearBorn = 1833;
    	brahms.yearDied = 1897;
    	brahms.placeBorn = "Germany";
    	
    	Composer joplin = new Composer();
    	joplin.firstName = "Scott";
    	joplin.middleName = "";
    	joplin.lastName = "Joplin";
    	joplin.yearBorn = 1867-1868;
    	joplin.yearDied = 1917;
    	joplin.placeBorn = "United States of America";
    	
    	Composer mozart = new Composer();
    	mozart.firstName = "Wolfgang";
    	mozart.middleName = "Amadeus";
    	mozart.lastName = "Mozart";
    	
    	
    	
    	Song fifth = new Song();
    	fifth.name = "Beethoven's 5th Symphony";
    	fifth.year = 1804;
    	fifth.lowCaesar = 0;
    	fifth.highCaesar = 0;
    	
    	
    	
    	
    	
    	
        
    }
}
