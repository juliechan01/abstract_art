package com.museum;
import java.util.ArrayList;
import java.util.Collections;

public class Museum {
	public static void main (String[] args) {
		ArrayList<Art> museum = new ArrayList<> ();
		museum.add(new Painting("Sunflower", "van Gogh", "It's expensive", "oil based"));
		museum.add(new Painting("The Scream", "Edward Munch", "It's cool", "oil based"));
		museum.add(new Painting("Mona Lisa", "da Vinci", "She's sort of smiling", "oil based"));
		museum.add(new Sculpture("David", "Michaelangelo", "I'm that guy", "marble"));
		museum.add(new Sculpture("The Thinker", "Rodin", "He meditating", "marble"));
		
		Collections.shuffle(museum);
		for(Art artwork: museum) {
			artwork.viewArt();
		}
	}

}
