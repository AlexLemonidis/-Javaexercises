
public class Song {
private String title;
private Singer singer;
private String url; 
static int counter=0;
static Song songs[]= new Song[10];

public Song(String title,Singer singer,String url) {
	this.title=title;
	this.singer=singer;
	this.url=url;
	songs[counter++]=this;
	
}
	
	
public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Singer getSinger() {
	return singer;
}

public void setSinger(Singer singer) {
	this.singer = singer;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "Title=" + title +" , url to listen ="+url; 
	
}


}
