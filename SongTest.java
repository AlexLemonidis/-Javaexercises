import java.util.Scanner;

public class SongTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int option;
		Singer frank= new Singer ("Frank Sinatra");
		Singer wham =new Singer ("Wham!");
		Singer mariah=new Singer("Mariah Carey");
		Singer chris =new Singer("Chris Rea");
		Singer sia =new Singer("Sia");
		
		new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" ); 
		new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );  	 
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );  	 
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");  	 
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" ); 
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" ); 	

	
		
		while (true){ 
		System.out.println("Welcome to our DMST Christmas music application");
		System.out.println("Menu:");
		System.out.println("Type 1 to display singer's list");
		System.out.println("Type 2 to display Frank Sinatra's available songs" );
		System.out.println("Type here");
		option=scanner.nextInt();
		
		while (option<1 || option>2) {
			System.out.println("Eishgage ksana");
			option=scanner.nextInt();
		}	
		
			
		if ( option==1 ) {
			for (int i=0; i<Singer.singer.length; i++  ) {
				
				if (Singer.singer[i]!=null) {
					System.out.println(Singer.singer[i].toString());
				}
			}
		}
		
		else if (option==2) {
			int counterSongs=0;
			for (int i=0; i<Song.songs.length; i++) {
				if (Song.songs[i]!=null) {
					if (frank.equals(Song.songs[i].getSinger())) {
						counterSongs++;
					}
				}
		
			}
			if (counterSongs>0) {System.out.println(counterSongs+" songs were found!");}
			for (int i=0; i<Song.songs.length; i++) {
				if (Song.songs[i]!=null) {
					if (frank.equals(Song.songs[i].getSinger())) {
						System.out.println(Song.songs[i].toString());
					}
				}
		
			}	
		
		
		}

	
			}	

		}
	}

