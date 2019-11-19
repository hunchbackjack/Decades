package uk.ac.kent.jds27.demolyric.singleplayer.decadelists;

import java.util.ArrayList;

/*
 * Class to store songs from the 60's.
 * Each level split into different arraylist to prevent unnecessary memory use.
 */
public class SixList {

    //list to store level 1
    private final ArrayList<String> level1 = new ArrayList<>();

    //list to store level 2
    private final ArrayList<String> level2 = new ArrayList<>();

//    //list to store level 3
//    private final ArrayList<String> level3 = new ArrayList<>();
//
//    //list to store level 4
//    private final ArrayList<String> level4 = new ArrayList<>();
//
//    //list to store level 5
//    private final ArrayList<String> level5 = new ArrayList<>();
//
//    //list to store level 6
//    private final ArrayList<String> level6 = new ArrayList<>();
//
//    //list to store level 7
//    private final ArrayList<String> level7 = new ArrayList<>();
//
//    //list to store level 8
//    private final ArrayList<String> level8 = new ArrayList<>();
//
//    //list to store level 9
//    private final ArrayList<String> level9 = new ArrayList<>();

    //list to store level 10
    //private final ArrayList<String> level10 = new ArrayList<>();

    public SixList() {

        //add lyrics to level 1
        level1.add("Heaven holds a place for those who pray, hey, hey, hey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mrs. Robinson - Simon & Garfunkel (1968)");
        level1.add("If the sky that we look upon should tumble and fall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stand By Me - Ben E. King (1962)");
        level1.add("Take a sad song and make it better" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Jude - The Beatles (1968)");
        level1.add("Regrets, I've had a few, but then again, too few to mention. I did what I had to do, and saw it through without exemption" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "My Way - Frank Sinatra (1969)");
        level1.add("What you want, baby, I got it, what you need, do you know I got it?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Respect - Otis Redding (1965)");
        level1.add("I-I love the colorful clothes she wears and the way the sunlight plays upon her hair" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Good Vibrations - The Beach Boys (1966)");
        level1.add("I thought love was more or less a giving thing, the more I gave the less I got oh yeah" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I'm A Believer - The Monkees (1967)");
        level1.add("Ground Control to Major Tom, take your protein pills and put your helmet on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Space Oddity - David Bowie (1969)");
        level1.add("But, he can't be a man 'cause he doesn't smoke the same cigarettes as me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(I Can't Get No) Satisfaction - The Rolling Stones (1965)");
        level1.add("When I had you to myself, I didn't want you around, those pretty faces always make you stand out in a crowd" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want You Back - Jackson 5 (1969)");

        //add lyrics to level 2
        level2.add("Some folks are born silver spoon in hand, Lord don't they help themselves, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fortunate Son - Creedence Clearwater Revival (1969)");
        level2.add("No reason to get excited, the theif he kindly spoke" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Along The Watchtower - Jimi Hendrix (1968)");
        level2.add("I stuck around St. Petersburg when I saw it was a time for a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sympathy For The Devil - The Rolling Stones (1968)");
        level2.add("My father was a gamblin' man, way down in New Orleans" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "House Of The Rising Sun - The Animals (1964)");
        level2.add("He'd give up all his comfort, sleep out in the rain, if she said that's the way it ought to be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When A Man Loves A Woman - Percy Sledge (1966)");
        level2.add("You never close your eyes anymore when I kiss your lips and there's no tenderness like before in your fingertips" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Lost That Loving Feeling - The Righteous Brothers (1964)");
        level2.add("Stopped into a church, I passed along the way. Well, I got down on my knees, and I pretend to pray" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Dreamin' - The Mamas And The Papas (1966)");
        level2.add("You're the meanest old woman that I've ever have seen, I guess if you say so 'll have to pack my things and go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hit The Road Jack - Ray Charles (1961)");
        level2.add("How does it feel to be without a home, with no direction home?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Like A Rolling Stone - Bob Dylan (1965)");
        level2.add("Dirty old river, must you keep rolling, rolling into the night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Waterloo Sunset - The Kinks (1967)");

    }

    //get level 1 array list
    public ArrayList<String> getLevel1List() {
        return level1;
    }

    //get level 2 array list
    public ArrayList<String> getLevel2List() {
        return level2;
    }

//    //get level 3 array list
//    ArrayList<String> getLevel3List() {
//        return level3;
//    }
//
//    //get level 4 array list
//    ArrayList<String> getLevel4List() {
//        return level4;
//    }
//
//    //get level 5 array list
//    ArrayList<String> getLevel5List() {
//        return level5;
//    }
//
//    //get level 6 array list
//    ArrayList<String> getLevel6List() {
//        return level6;
//    }
//
//    //get level 7 array list
//    ArrayList<String> getLevel7List() {
//        return level7;
//    }
//
//    //get level 8 array list
//    ArrayList<String> getLevel8List() {
//        return level8;
//    }
//
//    //get level 9 array list
//    ArrayList<String> getLevel9List() {
//        return level9;
//    }
}
