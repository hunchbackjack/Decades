package uk.ac.kent.jds27.demolyric.multiplayer;

import java.util.ArrayList;

class LyricAndAnswers {

    //list to store lyrics from the 1950's
    private final ArrayList<String> fiveLyrics = new ArrayList<>();

    //list to store lyrics from the 1960's
    private final ArrayList<String> sixLyrics = new ArrayList<>();

    //list to store lyrics from the 1970's
    private final ArrayList<String> sevenLyrics = new ArrayList<>();

    //list to store lyrics from the 1980's
    private final ArrayList<String> eightLyrics = new ArrayList<>();

    //list to store lyrics from the 1990's
    private final ArrayList<String> nineLyrics = new ArrayList<>();

    //list to store lyrics from the 2000's
    private final ArrayList<String> twentyLyrics = new ArrayList<>();

    //list to store lyrics from the 2010's
    private final ArrayList<String> tenLyrics = new ArrayList<>();

    LyricAndAnswers() {

        //add lyrics to 1950's list
        fiveLyrics.add("Who never ever learned to read or write so well, but he could play a guitar just like a-ringin' a bell" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Johnny B. Goode - Chuck Berry (1958)");
        fiveLyrics.add("Yeah they said you was high-classed, well, that was just a lie. Well, you ain't never caught a rabbit and you ain't no friend of mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hound Dog - Big Mama Thornton (1953)");
        fiveLyrics.add("You shake my nerves and you rattle my brain, too much love drives a man insane. You broke my will, oh what a thrill" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Great Balls Of Fire - Jerry Lee Lewis (1957)");
        fiveLyrics.add("Got a girl named Sue, she knows just what to do. She rock to the east, she rocks to the west but she's the girl that I know best" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tutti Frutti - Little Richard (1957)");
        fiveLyrics.add("Well, my mom and pop told me, 'son, you gotta make some money' if you want to use the car to go ridin' next Sunday" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Summertime Blues - Eddie Cochran (1958)");
        fiveLyrics.add("At first I thought it was infatuation but, woo, it's lasted so long. Now I find myself wanting to marry you and take you home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You Send Me - Sam Cooke (1957)");
        fiveLyrics.add("When tears come down like falling rain, you'll toss around and call my name" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Your Cheatin' Heart - Hank Williams (1952)");
        fiveLyrics.add("Always though it's crowded, you still can find some room. Those broken-hearted lovers cry away there in their gloom" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Heartbreak Hotel - Elvis Presley (1956)");
        fiveLyrics.add("Well, you can knock me down, step in my face, slander my name all over the place" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Blue Suede Shoes - Carl Perkins (1955)");
        fiveLyrics.add("I got the rockin' pneumonia, I need a shot of rhythm and blues" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roll Over Beethoven - Chuck Berry (1956)");
        fiveLyrics.add("Train I ride, sixteen coaches long. Well, that long black train got my baby and gone" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mystery Train - Junior Parker (1953)");
        fiveLyrics.add("I want you to know, I said I want you to know right now, yeah! You been good to me baby, better than I been to myself" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shout - The Isley Brothers (1959)");
        fiveLyrics.add("Tombstone hand and a graveyard mine, just 22 and I don't mind dying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Who Do You Love? - Bo Diddley (1956)");
        fiveLyrics.add("Well, I said come on over baby, we got chicken in the barn. Come on over baby, I got the bull by the horns" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Whole Lotta Shakin' Goin' On - Big Maybelle (1955)");
        fiveLyrics.add("I never kissed a bear, I never kissed a goon, but I can shake a chicken in the middle of the room" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Have A Party - Elvis Presley (1957)");
        fiveLyrics.add("I keep a close watch on this heart of mine, I keep my eyes wide open all the time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Walk The Line - Johnny Cash (1956)");
        fiveLyrics.add("Love is ended before it's begun, and too many moonlight kisses seem to cool in the warmth of the sun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When I Fall In Love - Doris Day (1952)");
        fiveLyrics.add("Let's walk up to the preacher and let us say 'I do', then you'll know you'll have me and I'll know that I'll have you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Be Cruel - Elvis Presley (1956)");
        fiveLyrics.add("The warden threw a party in the county jail, the prison band was there and they began to wail" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jailhouse Rock - Elvis Presley (1957)");
        fiveLyrics.add("My darling dear, love you all the time. I'm just a fool, a fool in love with you." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Earth Angel - The Penguins (1954)");
        fiveLyrics.add("When the clock strikes two, three and four, if the band slows down we'll yell for more" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rock Around The Clock - Bill Haley & His Comets (1954)");
        fiveLyrics.add("Too real is this feeling of make believe, too real when I feel what my heart can't conceal" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Great Pretender - The Platters (1955)");
        //fiveLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //fiveLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //fiveLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //fiveLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 1960's list
        sixLyrics.add("Some folks are born silver spoon in hand, Lord don't they help themselves, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fortunate Son - Creedence Clearwater Revival (1969)");
        sixLyrics.add("No reason to get excited, the theif he kindly spoke" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Along The Watchtower - Jimi Hendrix (1968)");
        sixLyrics.add("Heaven holds a place for those who pray, hey, hey, hey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mrs. Robinson - Simon & Garfunkel (1968)");
        sixLyrics.add("If the sky that we look upon should tumble and fall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stand By Me - Ben E. King (1962)");
        sixLyrics.add("I stuck around St. Petersburg when I saw it was a time for a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sympathy For The Devil - The Rolling Stones (1968)");
        sixLyrics.add("When I had you to myself, I didn't want you around, those pretty faces always make you stand out in a crowd" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want You Back - Jackson 5 (1969)");
        sixLyrics.add("My father was a gamblin' man, way down in New Orleans" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "House Of The Rising Sun - The Animals (1964)");
        sixLyrics.add("Take a sad song and make it better" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Jude - The Beatles (1968)");
        sixLyrics.add("He'd give up all his comfort, sleep out in the rain, if she said that's the way it ought to be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When A Man Loves A Woman - Percy Sledge (1966)");
        sixLyrics.add("But, he can't be a man 'cause he doesn't smoke the same cigarettes as me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(I Can't Get No) Satisfaction - The Rolling Stones (1965)");
        sixLyrics.add("Regrets, I've had a few, but then again, too few to mention. I did what I had to do, and saw it through without exemption" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "My Way - Frank Sinatra (1969)");
        sixLyrics.add("You never close your eyes anymore when I kiss your lips and there's no tenderness like before in your fingertips" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Lost That Loving Feeling - The Righteous Brothers (1964)");
        sixLyrics.add("Ground Control to Major Tom, take your protein pills and put your helmet on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Space Oddity - David Bowie (1969)");
        sixLyrics.add("Stopped into a church, I passed along the way. Well, I got down on my knees, and I pretend to pray" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Dreamin' - The Mamas And The Papas (1966)");
        sixLyrics.add("What you want, baby, I got it, what you need, do you know I got it?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Respect - Otis Redding (1965)");
        sixLyrics.add("I thought love was more or less a giving thing, the more I gave the less I got oh yeah" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I'm A Believer - The Monkees (1967)");
        sixLyrics.add("I-I love the colorful clothes she wears and the way the sunlight plays upon her hair" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Good Vibrations - The Beach Boys (1966)");
        sixLyrics.add("You're the meanest old woman that I've ever have seen, I guess if you say so I'll have to pack my things and go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hit The Road Jack - Ray Charles (1961)");
        sixLyrics.add("How does it feel to be without a home, with no direction home?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Like A Rolling Stone - Bob Dylan (1965)");
        sixLyrics.add("Dirty old river, must you keep rolling, rolling into the night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Waterloo Sunset - The Kinks (1967)");
        sixLyrics.add("Hey, where did we go? Days when the rains came, down in the hollow playin' a new game" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Brown Eyed Girl - Van Morrison (1967)");
        sixLyrics.add("Here come old flat top, he come groovin' up slowly, he got joo joo eyeballs, he one holy roller" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come Together - The Beatles (1969)");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sixLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 1970's list
        sevenLyrics.add("L.A. proved too much for the man, so he's leaving a life he's come to know" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Midnight Train To Georgia - Gladys Knight & The Pips (1973)");
        sevenLyrics.add("And I think it's gonnna be a long long time, 'till touch down brings me round again to find" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rocket Man (I Think It's Going To Be A Long Long Time) - Elton John (1972)");
        sevenLyrics.add("You can rely on the old man's money, you can rely on the old man's money" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rich Girl - Daryl Hall & John Oates (1976)");
        sevenLyrics.add("Listen to the wind blow, down comes the night. Running in the shadows" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Chain - Fleetwood Mac (1977)");
        sevenLyrics.add("We'll be together, with a roof right over our heads" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Is This Love - Bob Marley (1978)");
        sevenLyrics.add("Man, we just fell about the place, if that chick don't want to know, forget her" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Boys Are Back In Town - Thin Lizzy (1976)");
        sevenLyrics.add("When food is gone you are my daily meal, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Got The Love - Candi Staton (1976)");
        sevenLyrics.add("Oh, what a night, hypnotizing, mesmerizing me, she was everything I dreamed she'd be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "December 1963 (Oh What A Night) - Frankie Valli & The Four Seasons (1975)");
        sevenLyrics.add("Did you write the book of love and do you have faith in God above" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "American Pie - Don McLean (1971)");
        sevenLyrics.add("Now John at the bar is a friend of mine, he gets me my drinks for free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Piano Man - Billy Joel (1973)");
        sevenLyrics.add("Lips are sweet as candy, it's taste stays on my mind. Girl, you got me thirsty for another cup of wine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hooked On A Feeling - Blue Swede (1974)");
        sevenLyrics.add("We like our fun and we never fight, you can't dance and stay uptight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing In The Moonlight - Toploader (1972)");
        sevenLyrics.add("Anybody could be that guy, night is young and the music's high" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing Queen - ABBA (1976)");
        sevenLyrics.add("Life is old there, older than the trees, younger than the mountains, blowing like a breeze" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Home, Country Roads - John Denver (1971)");
        sevenLyrics.add("He said, 'we haven't had that spirit here since nineteen sixty-nine'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hotel California - The Eagles (1976)");
        sevenLyrics.add("I'm just a poor boy, I need no sympathy, because I'm easy come, easy go, little high, little low" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bohemian Rhapsody - Queen (1975)");
        sevenLyrics.add("You may say I'm a dreamer, but I'm not the only one" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Imagine - John Lennon (1971)");
        sevenLyrics.add("Young man, I was once in your shoes. I said, I was down and out with the blues" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Y.M.C.A - Village People (1978)");
        sevenLyrics.add("Sprung from cages out on highway nine, chrome wheeled, fuel injected, and steppin' out over the line" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Born To Run - Bruce Springsteen (1975)");
        sevenLyrics.add("Some people call me the space cowboy, yeah, some call me the gangster of love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Joker - Steve Miller Band (1973)");
        sevenLyrics.add("If I leave here tomorrow, would you still remember me?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Free Bird - Lynyrd Skynyrd (1973)");
        sevenLyrics.add("You keep on dancin' and the room gets hot, you drive us wild, we'll drive you crazy" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rock And Roll All Nite - Kiss (1975)");
        sevenLyrics.add("And as we wind on down the road, our shadows taller than our soul" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stairway To Heaven - Led Zeppelin (1971)");
        sevenLyrics.add("Oh, take your time, don't live too fast, troubles will come and they will pass" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Simple Man - Lynyrd Skynyrd (1973)");
        sevenLyrics.add("Into this house we're born, into this world we're thrown, like a dog without a bone, an actor out on loan" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Riders On The Storm - The Doors (1971)");
        sevenLyrics.add("Anyway the thing is, what I really mean, yours are the sweetest eyes I've ever seen" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Your Song - Elton John (1970)");
        sevenLyrics.add("It's a God awful small affair to the girl with the mousy hair, but her mummy is yelling no and her daddy has told her to go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Life On Mars? - David Bowie (1971)");
        sevenLyrics.add("I've been really tryin', baby, tryin' to hold back this feeling for so long" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Get It On - Marvin Gaye (1973)");
        sevenLyrics.add("Thunder only happens when it's raining, players only love you when they're playing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dreams - Fleetwood Mac (1977)");
        sevenLyrics.add("Thirteen month old baby, broke the lookin' glass, seven years of bad luck, the good things in your past" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Superstition - Stevie Wonder (1972)");
        sevenLyrics.add("See-saw swingin' with the boys in the school with your feet flyin' up in the air" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Walk This Way - Aerosmith (1975)");
        sevenLyrics.add("And in my hour of darkness she is standing right in front of me, speaking words of wisdom" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let It Be - The Beatles (1970)");
        sevenLyrics.add("Buddy, you're a young man, hard man, shouting in the street, gonna take on the world someday" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Will Rock You - Queen (1977)");
        sevenLyrics.add("Hell, with it baby cause you're fun and you're mine and you look so divine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come And Get Your Love - Redbone (1973)");
        sevenLyrics.add("We're just two lost souls swimming in a fish bowl" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wish You Were Here - Pink Floyd (1975)");
        sevenLyrics.add("I, I will be King, and you, you will be Queen" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Heroes - David Bowie (1977)");
        sevenLyrics.add("And that sweet city woman, she moves through the light controlling my mind and my soul" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Night Fever - Bee Gees (1977)");
        sevenLyrics.add("If I should stay I would only be in your way. So I'll go, but I know I'll think of you each step of the way." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Will Always Love You - Dolly Parton (1974)");
        sevenLyrics.add("Well, you can tell by the way I use my walk I'm a woman's man, no time to talk" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stayin' Alive - Bee Gees (1977)");
        sevenLyrics.add("You walked into the party, like you were walking on a yacht" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You're So Vain - Carly Simon (1972)");
        sevenLyrics.add("Dancin' and singin' and movin' to the groovin' and just when it hit me somebody turned around and shouted" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Play That Funky Music - Wild Cherry (1976)");
        sevenLyrics.add("The ice age is coming, the sun is zooming in. Meltdown expected, the wheat is growin' thin" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "London Calling - The Clash (1979)");
        sevenLyrics.add("When you're weary, feeling small, when tears are in your eyes, I'll dry them all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bridge Over Troubled Water - Simon & Garfunkle (1970)");
        sevenLyrics.add("Actin' funny, but I don't know why. Excuse me while I kiss the sky" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Purple Haze - Jimi Hendrix (1970)");
        sevenLyrics.add("Said - said - said: I remember when-a we used to sit, in the government yard in Trenchtown" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Woman No Cry - Bob Marley (1975)");
        sevenLyrics.add("He'd like to come and meet us, but he thinks he'd blow our minds" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Starman - David Bowie (1972)");
        sevenLyrics.add("You don't have to put on the red light, those days are over, you don't have to sell your body to the night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roxanne - The Police (1978)");
        sevenLyrics.add("Well, I hope Neil Young will remember, a southern man don't need him around anyhow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sweet Home Alabama - Lynyrd Skynyrd (1973)");
        sevenLyrics.add("She can kill with a smile, she can wound with her eyes, she can ruin your faith with her casual lies" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She's Always a Woman - Billy Joel (1977)");
        sevenLyrics.add("And I would have liked to have known you but I was just a kid, your candle burned out long before your legend ever did" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Candle In The Wind - Elton John (1973)");
        sevenLyrics.add("Loving you isn't the right thing to do, how can I ever change things that I feel" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Go Your Own Way - Fleetwood Mac (1977)");
        sevenLyrics.add("Know it sounds funny but, I just can't stand the pain. Girl, I'm leaving you tomorrow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Easy - Commodores (1977)");
        sevenLyrics.add("Blue jean baby, L.A. lady, seamstress for the band, pretty eyed, pirate smile, you'll marry a music man" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tiny Dancer - Elton John (1971)");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //sevenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 1980's list
        eightLyrics.add("I said to the man 'are you trying to tempt me?'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Down Under - Men At Work (1980)");
        eightLyrics.add("Oh can't you see, you belong to me. My poor heart aches, with every step you take" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Every Breath You Take - The Police (1983)");
        eightLyrics.add("He turned to me as if to say, 'Hurry boy, it's waiting there for you'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Africa - Toto (1982)");
        eightLyrics.add("Rosenbergs, H-Bomb, Sugar Ray, Panmunjom, Brando, The King And I, and The Catcher In The Rye" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Didn't Start The Fire - Billy Joel (1989)");
        eightLyrics.add("I've seen your face before my friend, but I don't know if you know who I am" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Air Tonight - Phil Collins (1981)");
        eightLyrics.add("I play along with the charade, there doesn't seem to be a reason to change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jessie's Girl - Rick Springfield (1981)");
        eightLyrics.add("But not us, (no never) no not us (no never) we are far too young and clever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come On Eileen - Dexys Midnight Runners (1982)");
        eightLyrics.add("And you're a very sexy girl, very hard to please" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Jungle - Guns N' Roses (1987)");
        eightLyrics.add("We're no strangers to love, you know the rules and so do I" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Never Gonna Give You Up - Rick Astley (1987)");
        eightLyrics.add("Annie, are you ok? So, Annie are you ok? Are you ok, Annie?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smooth Criminal - Michael Jackson (1987)");
        eightLyrics.add("Streetlights, people, living just to find emotion. Hiding somewhere in the night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Stop Believing - Journey (1981)");
        eightLyrics.add("The phone rings in the middle of the night, my father yells what you gonna do with your life" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Girls Just Want To Have Fun - Cyndi Lauper (1983)");
        eightLyrics.add("People always told me be careful of what you do, and don't go around breaking young girls' hearts" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Billie Jean - Michael Jackson (1982)");
        eightLyrics.add("In touch with the ground I'm on the hunt down I'm after you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hungry Like The Wolf - Duran Duran (1982)");
        eightLyrics.add("It's close to midnight, something evil's lurking from the dark" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thriller - Michael Jackson (1982)");
        eightLyrics.add("Life is a mystery, everyone must stand alone. I hear you call my name, and it feels like home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Like a Prayer - Madonna (1989)");
        eightLyrics.add("How can you just leave me standing? Alone in a world that's so cold (so cold)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When Doves Cry - Prince (1984)");
        eightLyrics.add("Clock strikes upon the hour and the sun begins to fade" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Wanna Dance With Somebody - Whitney Houston (1987)");
        eightLyrics.add("I want a ticket to anywhere, maybe we make a deal. Maybe together we can get somewhere" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fast Car - Tracy Chapman (1988)");
        eightLyrics.add("Let's dance in style, let's dance for a while, heaven can wait we're only watching the skies" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Forever Young - Alphaville (1984)");
        eightLyrics.add("See the stone set in your eyes, see the thorn twist in your side" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "With Or Without You - U2 (1987)");
        eightLyrics.add("Yes, I'm let loose from the noose that's kept me hanging about" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Back In Black - AC/DC (1980)");
        eightLyrics.add("These girls are really sleazy, all they just say is please me, or spend some time and rock a rhyme, I said 'It's not that easy'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It's Tricky - Run D.M.C (1986)");
        eightLyrics.add("She's been living in her white bread world as long as anyone with hot blood can and now she's looking for a downtown man, that's what I am" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uptown Girl - Billy Joel (1983)");
        eightLyrics.add("Now, what you hear is not a test I'm rappin' to the beat, and me, the groove, and my friends are gonna try to move your feet" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rappers Delight - The Sugarhill Gang (1980)");
        eightLyrics.add("Baby, I'm hot just like an oven, I need some lovin'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sexual Healing - Marvin Gaye (1982)");
        eightLyrics.add("Gina works the diner all day working for her man she brings home her pay, for love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Livin' On A Prayer - Bon Jovi (1986)");
        eightLyrics.add("I've seen your flag on the marble arch, and love is not a victory march" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hallelujah - Leonard Cohen (1984)");
        eightLyrics.add("You know I'm a dreamer but my heart's of gold, I had to run away high so I wouldn't come home low" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Home Sweet Home - Motley Crue (1985)");
        eightLyrics.add("And she'll tease you, she'll unease you, all the better just to please you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bette Davis Eyes - Kim Carnes (1981)");
        eightLyrics.add("Disconnect the telephone line, relax baby and draw that blind" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tonight's The Night (Gonna Be Alright) - Rod Stewart (1981)");
        eightLyrics.add("Risin' up, back on the street, did my time, took my chances" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Eye Of The Tiger - Survivor (1982)");
        eightLyrics.add("Are you ready, hey, are you ready for this? Are you hanging on the edge of your seat? " + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Another One Bites The Dust - Queen (1980)");
        eightLyrics.add("Now and then when I see her face she takes me away to that special place" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sweet Child O' Mine - Guns N' Roses (1987)");
        eightLyrics.add("I have climbed the highest mountains, I have run through the fields, only to be with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Still Haven't Found What I'm Looking For - U2 (1987)");
        eightLyrics.add("I've listened to preachers, I've listened to fools, I've watched all the dropouts who make their own rules" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy Train - Ozzy Osbourne (1980)");
        eightLyrics.add("She's a good girl, loves her mama, loves Jesus and America too. She's a good girl, crazy 'bout Elvi, loves horses and her boyfriend too" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Free Fallin' - Tom Petty (1989)");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //eightLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 1990's list
        nineLyrics.add("That's me in the corner, that's me in the spotlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Losing My Religion - R.E.M (1991)");
        nineLyrics.add("Marry him, or marry me, I'm the one that loves you baby can't you see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Two Princes - Spin Doctors (1991)");
        nineLyrics.add("I don't believe that anybody feels the way I do, about you now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wonderwall - Oasis (1995)");
        nineLyrics.add("You say we've got nothing in common, no common ground to start from" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakfast At Tiffany's - Deep Blue Something (1993)");
        nineLyrics.add("So I'll start a revolution from my bed, because you said the brains I had went to my head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Look Back In Anger - Oasis (1995)");
        nineLyrics.add("'Cause I knew it from the start, baby when you broke my heart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Return Of The Mack - Mark Morrison (1996)");
        nineLyrics.add("I said maybe I don't really wanna know how your garden grows 'cause I just want to fly" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Live Forever - Oasis (1994)");
        nineLyrics.add("I don't know what they want from me, it's like the more money we come across the more problems we see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mo Money Mo Problems - The Notorious B.I.G (1997)");
        nineLyrics.add("My anaconda don't want none unless you got buns hun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Baby Got Back - Sir Mix-A-Lot (1992)");
        nineLyrics.add("Am I your fire? Your one desire" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want It That Way - The Backstreet Boys (1999)");
        nineLyrics.add("Trying to make ends meet, you're a slave to the money and then you die" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bittersweet Symphony - The Verve (1997)");
        nineLyrics.add("And down the waterfall wherever it may take me I know that life won't break me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Angels - Robbie Williams (1997)");
        nineLyrics.add("I'm worse at what I do best and for this gift I feel blessed" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smells Like Teen Spirit - Nirvana (1991)");
        nineLyrics.add("Well it's too late, tonight to drag the past out into the light" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One - U2 (1991)");
        nineLyrics.add("And if you said this life ain't good enough I would give my world to lift you up" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smooth - Santana (1999)");
        nineLyrics.add("My loneliness is killing me (and I) I must confess I still believe (still believe)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "... Baby One More Time - Britney Spears (1998)");
        nineLyrics.add("And you can't fight the tears that ain't coming, or the moment of truth in your lies" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Iris - Goo Goo Dolls (1998)");
        nineLyrics.add("Hangin' out the passenger side of his best friend's ride, trying to holla at me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Scrubs - TLC (1992)");
        nineLyrics.add("It's a cool place and they say it gets colder, you're bundled up now, wait till you get older" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Star - Smash Mouth (1999)");
        nineLyrics.add("You think you've got it, oh, you think you've got it. But got it just don't get it when there's nothin' at all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Ya! - Outkast (1990)");
        nineLyrics.add("An enchanted moment and it sees me through, it's enough for this restless warrior just to be with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can You Feel The Love Tonight - Elton John (1994)");
        nineLyrics.add("Well, don't get lonely now, and dry your whining eyes. I'm just roaming for the moment" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When I Come Around - Green Day (1994)");
        nineLyrics.add("You can brush my hair, undress me everywhere. Imagination, life is your creation" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Barbie Girl - Aqua (1997)");
        nineLyrics.add("Exit, light, enter, night. Take my hand, we're off to never-never land" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Enter Sandman - Metallica (1991)");
        nineLyrics.add("But you won't get a crumb from me 'cause I'm from the streets of Compton" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Forgot About Dre - Dr. Dre (1999)");
        nineLyrics.add("Thoughts arrive like butterflies oh he don't know, so he chases them away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Even Flow - Pearl Jam (1991)");
        nineLyrics.add("Say it ain't so, I will not go, turn the lights off, carry me home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All The Small Things - Blink-182 (1999)");
        nineLyrics.add("What have I become, my sweetest friend. Everyone I know goes away in the end" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hurt - Nine Inch Nails (1994)");
        nineLyrics.add("Don't tell me it's not worth fightin' for, I can't help it, there's nothin' I want more" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(Everything I do) I do it for you - Bryan Adams (1991)");
        nineLyrics.add("I'm the kinda G the little homies wanna be like on my knees in the night, sayin' prayers in the streetlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Gansta's Paradise - Coolio (1995)");
        nineLyrics.add("Blood loss in a bathroom stall, a southern girl with a scarlet drawl" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Scar Tissue - Red Hot Chili Peppers (1999)");
        nineLyrics.add("With their tanks, and their bombs, and their bombs, and their guns, in your head, in your head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Zombie - The Cranberries (1993)");
        nineLyrics.add("When she wants something, she don't want to pay for it, she walk right through the door" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Been Caught Stealing - Jane's Addiction (1990)");
        nineLyrics.add("This is what you do, I think about a ring and all the things that come along with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You Make Me Wanna... - Usher (1997)");
        nineLyrics.add("But how many corners do I have to turn? How many times do I have to learn, all the love I have is in my mind?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Lucky Man - The Verve (1997)");
        nineLyrics.add("So take the photographs and still frames in your mind, hang it on a shelf in good health and good time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Good Riddance (Time Of Your Life) - Green Day (1997)");
        nineLyrics.add("Slowly walking down the hall, faster than a cannonball, where were you while we were getting high?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Champagne Supernova - Oasis (1995)");
        nineLyrics.add("And that's about the time she walked away from me, nobody likes you when you're twenty three" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "What's My Age Again - Blink 182 (1999)");
        nineLyrics.add("Here's a thought for every man who tries to understand what is in his hands (what's in his hands)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Cast No Shadow - Oasis (1994)");
        nineLyrics.add("You and me baby ain't nothin' but mammals so let's do it like they do on the Discovery Channel (do it again now)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bad Touch - Bloodhound Gang (1999)");
        nineLyrics.add("I wish you would step back from that ledge my friend, you could cut ties with all the lies that you've been living in" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jumper - Third Eye Blind (1997)");
        nineLyrics.add("I never thought I'd die alone, I laughed the loudest who'd have known?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Adam's Song - Blink 182 (1999(");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //nineLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 2000's list
        twentyLyrics.add("Soft lips are open, them knuckles are pale. Feels like you're dying, you're dying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sex On Fire - Kings Of Leon (2008)");
        twentyLyrics.add("Since you became a V.I.Person it's like your problems have all worsened" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Starz In Their Eyes - Just Jack (2007)");
        twentyLyrics.add("Let me take you where you'll let me, because leaving just upsets me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jenny Don't Be Hasty - Paolo Nutini (2006)");
        twentyLyrics.add("Life is good and the girls are gorgeous, suddenly the air smells much greener now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "These Streets - Paolo Nutini (2006)");
        twentyLyrics.add("Just in time, I'm so glad you have a one-track mind like me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey, Soul Sister - Train (2009)");
        twentyLyrics.add("The streets are dirty too but you never look back over what you've done" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Morning - Razorlight (2006)");
        twentyLyrics.add("When head of state didn't play guitar, not everybody drove a car" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Wish I Was A Punk Rocker (With Flowers In My Hair) - Sandi Thom (2006)");
        twentyLyrics.add("And if you leave here, you leave me broken, shattered, I lie" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Out - Franz Ferdinand (2004)");
        twentyLyrics.add("I used to roll the dice, feel the fear in my enemy's eyes" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Viva La Vida - Coldplay (2008)");
        twentyLyrics.add("Bring it back down, bring it back down tonight. Never thought I'd let a rumor ruin my moonlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Somebody Told Me - The Killers (2004)");
        twentyLyrics.add("I'm coming out of my cage and I've been doing just fine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mr. Brightside - The Killers (2004)");
        twentyLyrics.add("In time I want to be your best friend, East side lovers living on the West end" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Stop - Red Hot Chili Peppers (2002)");
        twentyLyrics.add("Did you have to go to jail, put your house up for sale, did you get a good lawyer?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Valerie - The Zutons (2006)");
        twentyLyrics.add("Sometimes I get the feeling she's watching over me, and other times I feel like I should go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Black Parade - My Chemical Romance (2006)");
        twentyLyrics.add("Some vodka that will jump start my heart quicker, then a shot when I get shocked at the hospital" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Without Me - Eminem (2002)");
        twentyLyrics.add("Caroline!(Caroline!) Caroline! All the guys would say she's mighty fine(Mighty fine!)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roses - Outkast (2003)");
        twentyLyrics.add("Yeah this one right here goes out to all the baby's mamas, mamas, mamas, mamas, baby mamas, mamas" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ms. Jackson - Outkast (2000)");
        twentyLyrics.add("Can't you see he's the man let me hear you applaud, he is more than a man he's a shining golden god" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Classico - Tenacious D (2006)");
        twentyLyrics.add("Them baggy sweat pants and the Reebok's with the straps" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Low - Flo Rida (2008)");
        twentyLyrics.add("He's always hated me because I never got a J O B" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crashed The Wedding - Busted (2003)");
        twentyLyrics.add("I'm back in Liverpool and everything seems the same, but I worked something out last night that changed this little boy's brain" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Dance To Joy Division - The Wombats (2007)");
        twentyLyrics.add("I look and stare so deep in your eyes, I touch on you more and more every time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy In Love - Beyonce (2003)");
        twentyLyrics.add("They're gonna clean up your looks with all the lies in the book" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Teenagers - My Chemical Romance (2006)");
        twentyLyrics.add("So where's your picket fence love? And where's that shiny car?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Gives You Hell - All American Rejects (2008)");
        twentyLyrics.add("Stop making the eyes at me I'll stop making the eyes at you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Bet That You Look Good On The Dancefloor - Arctic Monkeys (2006)");
        twentyLyrics.add("Everyday is so wonderful, then suddenly it's hard to breathe" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Beautiful - Christina Aguilera (2002)");
        twentyLyrics.add("It's hard to say that I'd rather stay awake when I'm asleep 'cause everything is never as it seems" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fireflies - Owl City (2009)");
        twentyLyrics.add("I'm still alive but I'm barely breathing just prayin' to a god that I don't believe in" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakeven - The Script (2008)");
        twentyLyrics.add("If you're having girl problems I feel bad for you son" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "99 Problems - Jay-Z (2003)");
        twentyLyrics.add("And though time goes by I will always be in a club with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1973 - James Blunt (2007)");
        twentyLyrics.add("Would you dance if I asked you to dance? Or would you run and never look back?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hero - Enrique Iglesias (2001)");
        twentyLyrics.add("'Cause there's nothing, there's nothing you can teach me that I can't learn from Mr. Hathaway" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rehab - Amy Winehouse (2006)");
        twentyLyrics.add("Never made it as a wise man, I couldn't cut it as a poor man stealing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "How You Remind Me - Nickelback (2001)");
        twentyLyrics.add("All I know, time is a valuable thing watch it fly by as the pendulum swings" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The End - Linkin Park (2003)");
        twentyLyrics.add("I'm up on him, he up on me, don't pay him any attention" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Single Ladies (Put A Ring On It) - Beyoncé (2008)");
        twentyLyrics.add("Few times I've been around that track so it's not just gonna happen like that" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hollaback Girl - Gwen Stefani (2004)");
        twentyLyrics.add("I want your ugly, I want your disease, I want your everything as long as it's free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bad Romance - Lady Gaga (2009)");
        twentyLyrics.add("When the sun shines, we shine together, told you I'll be here forever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Umbrella - Rihanna (2007)");
        twentyLyrics.add("Yeah I was out of touch, but it wasn't because I didn't know enough, I just knew too much" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy - Gnarls Barkley (2006)");
        twentyLyrics.add("My life is brilliant, my love is pure. I saw an angel, of that I'm sure" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You're Beautiful - James Blunt (2004)");
        twentyLyrics.add("People killin', people dyin', children hurt can you hear them cryin'?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Where Is The Love? - Black Eyed Peas (2003)");
        twentyLyrics.add("Slamming Bentley doors, hopping out of Porsche's, popping up on Forbes lists, gorgeous, hold up" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Young Forever - Jay-Z (2009)");
        twentyLyrics.add("Well open up your mind and see like me, open up your plans and damn you're free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I'm Yours - Jason Mraz (2005)");
        twentyLyrics.add("So lately, been wondering, who will be there to take my place, when I'm gone you'll need love to light the shadows on your face" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wherever You Will Go - The Calling (2001)");
        twentyLyrics.add("Nobody wanta' see us together, nobody thought that we'd last forever, I feel them hoping and praying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Matter - Akon (2006)");
        twentyLyrics.add("Promise I'll be kind, but I won't stop until that boy is mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Paparazzi - Lady Gaga (2008)");
        twentyLyrics.add("I drove for miles and miles and wound up at your door. I've had you so many times but somehow I want more" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She Will Be Loved - Maroon 5 (2002)");
        twentyLyrics.add("Chill out, what you yelling for? Lay back, it's all been done before" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Complicated - Avril Lavigne (2002)");
        twentyLyrics.add("Tomorrow's getting harder, make no mistake, luck ain't enough you've got to make your own breaks" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It's My Life - Bon Jovi (2000)");
        twentyLyrics.add("Control yourself, take only what you need from it. A family of trees wanting to be haunted" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Kids - MGMT (2008)");
        twentyLyrics.add("I was too weak to give in, too strong to lose. My heart is under arrest again, but I break loose" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Best Of You - Foo Fighters (2005)");
        twentyLyrics.add("I’m just a notch in your bedpost, but you're just a line in a song" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sugar, We're Going Down - Fall Out Boy (2005)");
        twentyLyrics.add("Welcome to a new kind of tension, all across the alien nation" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "American Idiot - Green Day (2004)");
        twentyLyrics.add("Wake me up inside, call my name and save me from the dark" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bring Me To Life - Evanescence (2003)");
        twentyLyrics.add("By becoming this all I want to do is be more like me and be less like you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Numb - Linkin Park (2003)");
        twentyLyrics.add("There's a hole in your logic, you who know all the answers" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Goodbye Mr. A - The Hoosiers (2007)");
        twentyLyrics.add("They will not force us, they will stop degrading us, they will not control us, we will be victorious " + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uprising - Muse (2009)");
        twentyLyrics.add("The unsuspecting victim of darkness in the valley, we can live like Jack and Sally if we want" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Miss You - Blink-182 (2003)");
        twentyLyrics.add("Watching the people get lairy, it's not very pretty I tell thee. Walking through town is quite scary, it's not very sensible either" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Predict A Riot - Kaiser Chiefs (2005)");
        twentyLyrics.add("There is nothing I need except the function to breathe, but I'm not really fussed, doesn't matter to me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ruby - Kaiser Chiefs (2007)");
        twentyLyrics.add("So one, two, three, take my hand and come with me because you look so fine that I really wanna make you mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Are You Gonna Be My Girl - Jet (2003)");
        twentyLyrics.add("Jack had a gang that he called 'The Many Grams', he was known as Smack Jack the Cracker Man" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sheila - Jamie T (2007)");
        twentyLyrics.add("When there's no one left to fight, boys like him don't shine so bright" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sticks 'n' Stones - Jamie T (2009)");
        twentyLyrics.add("And I want these words to make things right, but it's the wrongs that make the words come to life. Who does he think he is?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thnks Fr Th Mmrs - Fall Out Boy (2007)");
        twentyLyrics.add("Rate yourself and rake yourself, take all the courage you have left wasted on fixing all the problems that you made in your own head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Little Lion Man - Mumford & Sons (2009)");
        twentyLyrics.add("Oh, let's just get this whole thing straight, I don't wanna kidnap the truth and negotiate" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Before I Fall To Pieces - Razorlight (2006)");
        twentyLyrics.add("It's not about your make-up, or how you try to shape up to these tiresome paper dreams, paper dreams honey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She Moves In Her Own Way - The Kooks (2006)");
        twentyLyrics.add("I said tell me your name is it sweet? She said my boy it's Dagger" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chelsea Dagger - The Fratellis (2006)");
        twentyLyrics.add("Send in your skeletons, sing as their bones go marching in, again" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Pretender - Foo Fighters (2007)");
        twentyLyrics.add("I backed my car into a cop car the other day, well, he just drove off - sometimes life's okay" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Float On - Modest Mouse (2004)");
        twentyLyrics.add("Love forever, love has freely turned forever you and me. Windmill, windmill for the land, is everybody in?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Feel Good Inc - Gorillaz (2005)");
        twentyLyrics.add("Let's get lost tonight, you could be my black Kate Moss tonight. Play secretary, I'm the boss tonight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stronger - Kanye West (2007)");
        twentyLyrics.add("Everybody wants to know her name, how does she cope with her new found fame?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Five Colours In Her Hair - McFly (2004)");
        twentyLyrics.add("Her name is Noel, I have a dream about her. She rings my bell, I got gym class in half an hour" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Teenage Dirtbag - Wheatus (2000)");
        twentyLyrics.add("And I'm talking to myself at night because I can't forget. Back and forth through my mind behind a cigarette" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Seven Nation Army - The White Stripes (2003)");
        twentyLyrics.add("All along the eastern shore, put your circuits in the sea. This is what the world is for, making electricity" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Electric Feel - MGMT (2007)");
        twentyLyrics.add("I said, you've got me where you want me again and I can't turn away. I'm hanging by a thread and I'm feeling like I'll fall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Back Against The Wall - Cage The Elephant (2008)");
        twentyLyrics.add("And I would answer all your wishes, if you asked me to. But if you deny me one of your kisses don't know what I'd do" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All About You - McFly (2005)");
        twentyLyrics.add("Tell me your secrets and ask me your questions, oh let's go back to the start" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Scientist - Coldplay (2002)");
        twentyLyrics.add("When you left I lost a part of me, it's still so hard to believe. Come back baby please" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Belong Together - Mariah Carey (2004)");
        twentyLyrics.add("I'm in the club with my homies, try'na get a lil' v-I, keep it down on the low key, 'cause you know how it feels" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Yeah! - Usher (2004)");
        twentyLyrics.add("I just want you close, where you can stay forever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No One - Alicia Keys (2007)");
        twentyLyrics.add("I got the hit that beat the block, you can get that bass overload. I got the that rock and roll, that future flow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Boom Boom Pow - The Black Eyed Peas (2009)");
        twentyLyrics.add("Baby good love and protection, make me your selection. Show you the way love's supposed to be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let Me Love You - Mario (2004)");
        twentyLyrics.add("Wake up in the morning feeling like P Diddy" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tik Tok - Ke$ha (2009)");
        twentyLyrics.add("Cutie the bomb, met her at a beauty salon with a baby Louis Vuitton under her underarm" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Gold Digger - Kanye West (2005)");
        twentyLyrics.add("You tell me that you need me, then you go and cut me down, but wait" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Apologize - OneRepublic (2005)");
        twentyLyrics.add("Yeah, my momma she told me don't worry about your size, she says, boys like a little more booty to hold at night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All About That Bass - Meghan Trainor (2014)");
        twentyLyrics.add("That's when she said, 'I don't hate you, boy, I just want to save you while there's still something left to save'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Savior - Rise Against (2008)");
        twentyLyrics.add("My shadow's the only one that walks beside me, my shallow heart's the only thing that's beating" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Boulevard Of Broken Dreams - Green Day (2004)");
        twentyLyrics.add("She never knew that there was anything more than poor, what in the world does your company take me for?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dani California - Red Hot Chili Peppers (2006)");
        twentyLyrics.add("'Cause I'm losing my sight, losing my mind, wish somebody would tell me I'm fine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Last Resort - Papa Roach (2000)");
        twentyLyrics.add("With a thousand lies, and a good disguise hit 'em right between the eyes" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You're Gonna Go Far, Kid - The Offspring (2008)");
        twentyLyrics.add("I'm gonna pop some tags, only got twenty dollars in my pocket" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thrift Shop - Macklemore (2012)");
        twentyLyrics.add("Go, shawty, it's your birthday. We gon' party like it's yo birthday" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In Da Club - 50 Cent (2003)");
        twentyLyrics.add("Oh no I see a spider web it's tangled up with me, and I lost my head, and thought of all the stupid things I said" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Trouble - Coldplay (2000)");
        twentyLyrics.add("The heart is a bloom, shoots up through the stony ground. There's no room, no space to rent in this town" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Beautiful Day - U2 (2000)");
        twentyLyrics.add("I never really gave up on, breakin' out of this two-star town. I got the green light, I got a little fight, I'm gonna turn this thing around" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Read My Mind - The Killers (2006)");
        twentyLyrics.add("I was scared, I was scared, tired and under prepared, but I wait for it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In My Place - Coldplay (2002)");
        twentyLyrics.add("She acts like summer and walks like rai, reminds me that there's a-time to change, hey, hey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Drops of Jupiter - Train (2001)");
        twentyLyrics.add("\"Fight the Power\" comes great responsibility, 'F the Police' but who's stopping you from killing me?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Harder Than You Think - Public Enemy (2007)");
        twentyLyrics.add("Where to, where do I go? If you never try, then you'll never know. How long do I have to climb up on the side of this mountain of mine?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Speed of Sound - Coldplay (2005)");
        twentyLyrics.add("The lights go out and I can't be saved, tides that I tried to swim agains have brought me down upon my knees, oh I beg, I beg and plead" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Clocks - Coldplay (2002)");
        twentyLyrics.add("When we collide we come together, if we don't we'll always be apart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Many of Horror - Biffy Clyro (2009)");
        twentyLyrics.add("He doesn't look a thing like Jesus but he talks like a gentlemen, like you imagined" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When You Were Young - The Killers (2006)");
        twentyLyrics.add("Please don't go crazy, if I tell you the truth. No you don't know what happened and you never will if you don't listen to me while I talk to the wall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "How To Be Dead - Snow Patrol (2003)");
        twentyLyrics.add("Here comes the rain again, falling from the stars. Drenched in my pain again, becoming who we are" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wake Me Up When September Ends - Green Day (2004)");
        twentyLyrics.add("Oh Mary's ambitious she wanna to be a politician, she been dreaming about it since she was a girl" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Cry - The Script (2008)");
        twentyLyrics.add("Don't let it go to waste, I love it but I hate the taste, weight keepin' me down" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All My Life - Foo Fighters (2002)");
        twentyLyrics.add("If I lay here, if I just lay here, would you lie with me and just forget the world?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chasing Cars - Snow Patrol (2006)");
        twentyLyrics.add("Kill me if you dare, hold my head up everywhere, keep myself right on this train" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Underdog - Kasabian (2009)");
        twentyLyrics.add("Oh, but it's right hard to remember that on a day like today when you're all argumentative and you've got the face on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mardy Bum - Arctic Monkeys (2006)");
        twentyLyrics.add("Where is the moment when we needed the most? You kick up the leaves, and the magic is lost" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bad Day - Daniel Powter (2005)");
        twentyLyrics.add("I'm more than a bird, I'm more than a plane, I'm more than some pretty face beside a train, and it's not easy to be me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Superman (It's Not Easy) - Five For Fighting (2000)");
        twentyLyrics.add("Me and all my friends we're all misunderstood, they say we stand for nothing and there's no way we ever could" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Waiting On the World to Change - John Mayer (2006)");
        twentyLyrics.add("But things just get so crazy, living life gets hard to do, and I would gladly hit the road, get up and go if I knew that someday it would lead me back to you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sunday Morning - Maroon 5 (2002)");
        twentyLyrics.add("I came along, I wrote a song for you and all the things you do" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Yellow - Coldplay (2000)");
        twentyLyrics.add("Our dreams, and they are made out of real things like a, shoe box of photographs with sepia-toned loving" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Better Together - Jack Johnson (2005)");
        twentyLyrics.add("'Cause all of the stars are fading away, just try not to worry, you'll see them some day" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stop Crying Your Heart Out - Oasis (2002)");
        twentyLyrics.add("So lately, been wondering who will be there to take my place, when I'm gone you'll need love to light the shadows on your face" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wherever You Will Go - The Calling (2001)");
        twentyLyrics.add("And how can I stand here with you and not be moved by you? Would you tell me how could it be any better than this?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Everything - Lifehouse (2000)");
        twentyLyrics.add("Really sorry now, they weren't to know, they got caught up in your talent show with you persnickety little bastards in your fancy dress" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wisemen - James Blunt (2004)");
        twentyLyrics.add("I'm trying to right my wrongs, but it's funny them same wrongs helped me write this song" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Touch the Sky - Kanye West (2005)");
        twentyLyrics.add("I've been here before a few times and I'm quite aware we're dying. And your hands they shake with goodbyes, and I'll take you back if you'd have me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Always - Blink 182 (2003)");
        twentyLyrics.add("All the time my baby you on my mind, and I don't know why yeah but the feeling is fine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancin' - Aaron Smith feat. Luvli (2005)");
        twentyLyrics.add("But at least have the decency in you to leave me alone, when you freaks see me out in the streets when I'm eating or feeding my daughter to not come and speak to me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Way I Am - Eminem (2000)");
        twentyLyrics.add("Look into my eyes and it's easy to see one and one make two, two and one make three, it was destiny" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tribute - Tenacious D (2001)");
        twentyLyrics.add("Can't you see that it's just rainin', ain't no need to go outside" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Banana Pancakes - Jack Johnson (2005)");
        twentyLyrics.add("Dear Mister \"I'm Too Good To Call Or Write My Fans, this will be the last package I ever send your ass, it's been six months and still no word, I don't deserve it?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stan - Eminem (2000)");
        twentyLyrics.add("I'm stopping at the offy, 20 cigarettes and a 6 pack to relax me, and as I cross back over the street I guess I never saw that taxi" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Day I Died - Just Jack (2009)");
        twentyLyrics.add("What a night for a dance, you know I'm a dancing machine, with the fire in my bones, and the sweet taste of kerosene" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Revelry - Kings of Leon (2008)");
        twentyLyrics.add("This is what I want to be and this is what I give to you because I get it free, she smiles while I do my time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Could Die For You - Red Hot Chili Peppers (2002)");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //twentyLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        //add lyrics to 2010's list
        tenLyrics.add("And I know she'll be the death of me, at least we'll both be numb. And she'll always get the best of me, the worst is yet to come" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Feel My Face - The Weeknd (2015)");
        tenLyrics.add("Everybody's looking for love, oh, oh, ain't that the reason you're at this club" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In My Head - Jason Derulo (2010)");
        tenLyrics.add("Maybe I'm foolish, maybe I'm blind, thinking I can see through this" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Human - Rag'N'Bone Man (2017)");
        tenLyrics.add("Drink some Margaritas by a string of blue lights, listen to the Mariachi play at midnight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Are You With Me - Lost Frequencies (2014)");
        tenLyrics.add("I'm breaking in, shaping up, then checking out on the prison bus" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Radioactive - Imagine Dragons (2012)");
        tenLyrics.add("So they dug your grave and the masquerade will come calling out at the mess you made" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Demons - Imagine Dragons (2013)");
        tenLyrics.add("My left stroke just went viral" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "HUMBLE. - Kendrick Lamar (2017)");
        tenLyrics.add("Everybody want the key and the secret to rap immortality like I have got" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rap God - Eminem (2013)");
        tenLyrics.add("I'm living in that 21st Century, doing something mean to it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "POWER - Kanye West (2010)");
        tenLyrics.add("I did not believe that it would end, no, everything came second to the Benzo" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Better Now - Post Malone (2018)");
        tenLyrics.add("The club isn't the best place to find a lover so the bar is where I go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shape Of You - Ed Sheeran (2017)");
        tenLyrics.add("I get along with old timers 'cause my name's a reminder of a pop song people forgot" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Took A Pill In Ibiza - Mike Posner (2016)");
        tenLyrics.add("Yeah, that’s the crew that I’m repping on the rise to the top, no lead in our zeppelin" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Party Rock Anthem - LMFAO (2011)");
        tenLyrics.add("You could travel the world, but nothing comes close to the golden coast" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Gurls - Katy Perry (2010)");
        tenLyrics.add("I love when it's all too much, five a.m. turn the radio up. Where's the rock and roll?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Raise Your Glass - P!nk (2010)");
        tenLyrics.add("The scars of your love remind me of us, they keep me thinking that we almost had it all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rolling In The Deep - Adele (2011)");
        tenLyrics.add("So if by the time the bar closes and you feel like falling down, I'll carry you home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Are Young - Fun. (2011)");
        tenLyrics.add("Hey, you tell your friends it was nice to meet them, but I hope I never see them again" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Closer - The Chainsmokers (2016)");
        tenLyrics.add("Then you smiled over your shoulder for a minute, I was stone-cold sober" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Say You Won't Let Go - James Arthur (2016)");
        tenLyrics.add("I thought I was an atheist until I realised I'm a God" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Woah Woah Woah - Watsky (2014)");
        tenLyrics.add("I always had that dream like my daddy before me, so I started writing songs, I started writing stories" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "7 Years - Lukas Graham (2015)");
        tenLyrics.add("I was told, when I get older, all my fears would shrink but now I'm insecure, and I care what people think" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stressed Out - Twenty-One Pilots (2015)");
        tenLyrics.add("Take me into your loving arms, kiss me under the light of a thousand stars" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thinking Out Loud - Ed Sheeran (2014)");
        tenLyrics.add("I'll worship like a dog at the shrine of your lies, I'll tell you my sins and you can sharpen your knife" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me To Church - Hozier (2013)");
        tenLyrics.add("How many times do I have to tell you, even when you’re crying you’re beautiful too" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Of Me - John Legend (2013)");
        tenLyrics.add("Well you only need the light when it's burning low, only miss the sun when it starts to snow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let Her Go - Passenger (2012)");
        tenLyrics.add("I tried carrying the weight of the world, but I only have two hands" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wake Me Up - Avicii (2013)");
        tenLyrics.add("I belong with you, you belong with me, you're my sweetheart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ho Hey - The Lumineers (2012)");
        tenLyrics.add("I done said a lotta things in my day, I admit it, this is payback in a way, I regret it that I did it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Lucky You - Eminem (2018)");
        tenLyrics.add("Your stare was holding, ripped jeans, skin was showin'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Call Me Maybe - Carly Rae Jepsen (2012)");
        tenLyrics.add("I'm too hot (hot damn), am I bad 'bout that money, break it down" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uptown Funk - Mark Ronson (2014)");
        tenLyrics.add("I'll never miss a beat, I'm lightning on my feet, and that's what they don't see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shake It Off - Taylor Swift (2014)");
        tenLyrics.add("So I put my hands up, they're playing my song, and the butterflies fly away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Party In The U.S.A - Miley Cyrus (2010)");
        tenLyrics.add("I put you high up in the sky and now, you’re not coming down. It slowly turned, you let me burn and now, we’re ashes on the ground" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wrecking Ball - Miley Cyrus (2013)");
        tenLyrics.add("I can only tell you what it feels like, and right now there's a steel knife, in my windpipe" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Love The Way You Lie - Eminem (2010)");
        tenLyrics.add("And I can't stop till the whole word knows my name 'cause I was only born inside my dreams" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Centuries - Fall Out Boy (2015)");
        tenLyrics.add("I go crazy 'cause here isn't where I wanna be and satisfaction feels like a distant memory" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "R U Mine? - Arctic Monkeys (2013)");
        tenLyrics.add("Tell me how's it feel sittin' up there, feeling so high but too far away to hold me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Without Me - Halsey (2018)");
        tenLyrics.add("I should've stayed with you last night, instead of going out to find trouble" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let You Love Me - Rita Ora (2018)");
        tenLyrics.add("Give me one good reason why I should never make a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Budapest - George Ezra (2014)");
        tenLyrics.add("Oh we go where nobody knows, with guns hidden under our petticoats" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chocolate - The 1975 (2013)");
        tenLyrics.add("I wanted the fame but not the cover of Newsweek, oh well, guess beggars can't be choosey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Monster - Eminem (2013)");
        tenLyrics.add("So break my step and relent, you forgave and I won't forget" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Will Wait - Mumford & Sons (2012)");
        tenLyrics.add("Cause I'm a sad sad post teen could have been a love machine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Zombie - Jamie T (2014)");
        tenLyrics.add("Now can I kick it, thank you, yeah I’m so damn grateful. I grew up, really wanted gold fronts but that’s what you get when Wu-Tang raised you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Hold Us - Macklemore (2011)");
        tenLyrics.add("I won't stay put, give me the chance to be free Suffolk sadly seems to sort of suffocate me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You Need Me, I Don't Need You - Ed Sheeran (2011)");
        tenLyrics.add("Joey was an artist just living out of case, but his best work was his letters home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "L.I.F.E.G.O.E.S.O.N - Noah And The Whale (2011)");
        tenLyrics.add("We've come too far to give up who we are, so let's raise the bar and our cups to the stars" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Get Lucky - Daft Punk (2013)");
        tenLyrics.add("I know that I’m rich enough for pride, I see a billion dollars in your eyes. Even if we’re strangers til we die" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Runaway (U And I) - Galantis (2015)");
        tenLyrics.add("But if you close your eyes, does it almost feel like nothing changed at all?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Pompeii - Bastille (2012)");
        tenLyrics.add("Come on, come on, turn the radio on, it's Saturday and I won't be long. Gotta paint my nails, put my high heels on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Cheap Thrills - Sia (2016)");
        tenLyrics.add("I know I don't know you, but I'd like to skip the small talk and romance, girl" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can We Dance - The Vamps (2014)");
        tenLyrics.add("I'm perusing down fourth and they watching me. I do a handstand, the eagle lands on my seat, well hello" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Downtown - Macklemore (2016)");
        tenLyrics.add("We bring the stars out, we bring the women and the cars and the cards out" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Pass Out - Tinie Tempah (2010)");
        tenLyrics.add("I'm a rebel just for kicks now, I been feeling it since 1966 now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Feel It Still - Portugal. The Man (2017)");
        tenLyrics.add("I'm a hot air balloon that could go to space, with the air, like I don't care baby by the way" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Happy - Pharell Williams (2013)");
        tenLyrics.add("She took my arm, I don't know how it happened, we took the floor and she said" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shut Up And Dance - Walk The Moon (2014)");
        tenLyrics.add("You better move, you better dance, let's make a night, you won't remember, I'll be the one, you won't forget" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Timber - Pitbull (2013)");
        tenLyrics.add("I don't wanna be needing your love I just wanna be deep in your love, and it's killing me when you're away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sugar - Maroon 5 (2014)");
        tenLyrics.add("Players, put yo' pinky rings up to the moon. Girls, what y'all trying to do?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "24K Magic - Bruno Mars (2016)");
        tenLyrics.add("I been through the ringer, but they could do little to the middle finger, I think I got a tear in my eye, I feel like the king of my world" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Not Afraid - Eminem (2010)");
        tenLyrics.add("On the day that I got arrested, I'm innocent, I protested. She just feels rejected had her heart broken by someone she's obsessed with" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She Said - Plan B (2010)");
        tenLyrics.add("He came for me just like I knew he would, but this time I was ready and I killed him good." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Prayin' - Plan B (2010)");
        tenLyrics.add("All that I want is to wake up fine, tell me that I'm alright, that I ain't gonna die" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hard Times - Paramore (2017)");
        tenLyrics.add("And every time I step up in the buildin' everybody hands go up, and they stay there" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All I Do Is Win - DJ Khaled (2010)");
        tenLyrics.add("Well, take a journey into my mind, you'll see why it's venom I rhyme" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Magic - B.o.B (2010)");
        tenLyrics.add("I used to be a strange fruit, Billy Holiday, then you got me by my roots, took the pain away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hurt Me Tomorrow - K'naan (2012)");
        tenLyrics.add("I think your love would be too much, or you'll be left in the dust. Unless I stuck by ya" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sunflower - Post Malone (2018)");
        tenLyrics.add("I been movin' calm, don't start no trouble with me, tryna keep it peaceful is a struggle for me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "God's Plan - Drake (2018)");
        tenLyrics.add("I want to taste her lips, yeah, 'cause they taste like you. I want to drown myself in a bottle of her perfume" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Girl Crush - Harry Styles (2017)");
        tenLyrics.add("Now they wanna know me since I hit the top, ayy, this a Rollie, not a stopwatch" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Nonstop - Drake (2018)");
        tenLyrics.add("Kiki, do you love me? Are you riding? Say you'll never ever leave from beside me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In My Feelings - Drake (2018)");
        tenLyrics.add("Who am I? Someone that's afraid to let go, uh, you decide, if you're ever gonna let me know, yeah" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sad! - XXXTENTACION (2018)");
        tenLyrics.add("All alone, call my phone, make me feel right. Girl you know when you call, make me feel right" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Moonlight - XXXTENTACION (2018)");
        tenLyrics.add("Then I realized she's right there, and I'm at home like, 'Damn, this ain't fair'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Break Up With Your Girlfriend, I'm Bored - Ariana Grande (2019)");
        tenLyrics.add("You like my hair? Gee, thanks, just bought it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "7 Rings - Ariana Grande (2019");
        tenLyrics.add("One taught me love, one taught me patience, and one taught me pain, now, I'm so amazing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thank U, Next - Ariana Grande (2019)");
        tenLyrics.add("You know he's only calling 'cause he's drunk and alone" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "New Rules - Dua Lipa (2017)");
        tenLyrics.add("I was born to flex (Yes), diamonds on my neck, I like boardin' jets" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Money - Cardi B (2018)");
        tenLyrics.add("Big talks of the town, big boy gang moves (gang moves!), I like to walk around with my chain loose (chain, chain!)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Walk It Talk It - Migos (2018)");
        tenLyrics.add("Money changin' colors like tie-dye (tie-dye), I'm just tryna get it, I ain't tryna die (whoa)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stir Fry - Migos (2018)");
        tenLyrics.add("Woo, made this here with all the ice on in the booth, at the gate outside, when they pull up, they get me loose" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "SICKO MODE - Travis Scott (2018)");
        tenLyrics.add("She'll make you curse, but she a blessing, she'll rip your shirt within a second" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sweet But Psycho - Ava Max (2018)");
        tenLyrics.add("Even though we're kicked out the party 'cause we both hate everybody, we're the ones they wanna be like" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Close To Me - Ellie Goulding (2018)");
        tenLyrics.add("And every day you know that we ride through the backstreets of a blue Corvette" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Eastside - Benny Blanco (2018)");
        tenLyrics.add("Love to see you shine in the night like the diamond you are. I'm on the other side, it's alright, just hold me in the dark" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Better - Khalid (2018)");
        tenLyrics.add("Yellow diamonds in the light, and we're standing side by side" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Found Love - Rihanna (2011)");
        tenLyrics.add("You can get addicted to a certain kind of sadness" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Somebody That I Used To Know - Gotye (2011)");
        tenLyrics.add("But every song's like gold teeth, Grey Goose, trippin' in the bathroom, bloodstains, ball gowns, trashin' the hotel room" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Royals - Lorde (2013)");
        tenLyrics.add("Just shoot for the stars if it feels right and aim for my heart if you feel like it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Moves Like Jagger - Maroon 5 (2010)");
        tenLyrics.add("I know when I compliment her she won't believe me, and it's so, it's so sad to think that she don't see what I see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Just The Way You Are - Bruno Mars (2010)");
        tenLyrics.add("So you wanna play with magic, boy, you should know whatcha falling for" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dark Horse - Katy Perry (2013)");
        tenLyrics.add("He's got a rolled cigarette, hanging out his mouth he's a cowboy kid, yeah found a six shooter gun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Pumped Up Kicks - Foster The People (2010)");
        tenLyrics.add("I love you when you're singing that song and I got a lump in my throat 'cause you're gonna sing the words wrong" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Riptide - Vance Joy (2013)");
        tenLyrics.add("I only call you when it's half past five, the only time that I'll be by your side" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Hills - The Weeknd (2015)");
        tenLyrics.add("Do you like walking in the rain? When you think of love, do you think of pain?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mess is Mine - Vance Joy (2014)");
        tenLyrics.add("1738, ayy, I'm like 'Hey, what's up? Hello'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Trap Queen - Fetty Wap (2014)");
        tenLyrics.add("Do you ever feel like a misfit? Everything inside you is dark and twisted" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "So Am I - Ava Max (2019)");
        tenLyrics.add("I'm going under and this time I fear there's no one to save me. This all or nothing really got a way of driving me crazy" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Someone You Loved - Lewis Capaldi (2018)");
        tenLyrics.add("I just took a DNA test, turns out I'm 100% that bitch even when I'm crying crazy" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Truth Hurts - Lizzo (2017)");
        tenLyrics.add("I do my hair toss, check my nails, baby how you feelin'?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Good as Hell - Lizzo (2016)");
        tenLyrics.add("She's all laid up in bed with a broken heart while I'm drinking Jack all alone in my local bar" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For the First Time - The Script (2010)");
        tenLyrics.add("I want a real love, dark skinned and Aunt Viv love, that Jada and that Will love, that leave a toothbrush at your crib love and you ain't gotta wonder whether that's your kid love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Role Modelz - J. Cole (2014)");
        tenLyrics.add("Don't think I fit in at this party, everyone's got so much to say" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Don't Care - Ed Sheeran & Justin Bieber (2019)");
        tenLyrics.add("Me and Kurt feel the same, too much pleasure is pain, my girl spites me in vain, all I do is complain" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Goodbyes - Post Malone (2019)");
        tenLyrics.add("Yeah, I was born a misfit, grew up ten miles from the town of Ipswich. Wanted to make it big, I wished it to existence" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Remember the Name - Ed Sheeran feat. 50 Cent and Eminem (2019)");
        tenLyrics.add("She is something to behold, elegant and bold. She is electricity, running to my soul" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Georgia - Vance Joy (2014)");
        tenLyrics.add("Maybe you should know that my mama don't like you and she likes everyone" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Love Yourself - Justin Bieber (2015)");
        tenLyrics.add("I'm always screaming my lungs out 'til my head starts spinning, playing my songs is the way I cope with life" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All I Want - A Day to Remember (2010)");
        tenLyrics.add("I see you grooving, my heart rate is rising, I see planets colliding, you look so enticing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Way That You Move - Kwaku Asante (2018)");
        tenLyrics.add("They say boys don't cry, but your dad has shed a lot of tears. They say I should be a strong man but baby, I'm still filled with fear" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Growing Up - Macklemore & Ryan Lewis feat. Ed Sheeran (2016)");
        tenLyrics.add("Worked so hard, forgot how to vacation, they ain't never had the dedication, people hatin', say we changed and look we made it, yeah, we made it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Congratulations - Post Malone (2016)");
        tenLyrics.add("First things first I'ma say all the words inside my head, I'm fired up and tired of the way that things have been" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Believer - Imagine Dragons (2019)");
        tenLyrics.add("And I'd beg you, but you know I'm never home, and I love you but I need another year alone" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "7 - Catfish And The Bottlemen (2016)");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        //tenLyrics.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

    }

    //get all 1950's songs
    ArrayList<String> getFiveList() {
        return fiveLyrics;
    }

    //get all 1960's songs
    ArrayList<String> getSixList() {
        return sixLyrics;
    }

    //get all 1970's songs
    ArrayList<String> getSevenList() {
        return sevenLyrics;
    }

    //get all 1980's songs
    ArrayList<String> getEightList() {
        return eightLyrics;
    }

    //get all 1990's songs
    ArrayList<String> getNineList() {
        return nineLyrics;
    }

    //get all 2000's songs
    ArrayList<String> getTwentyList() {
        return twentyLyrics;
    }

    //get all 2010's songs
    ArrayList<String> getTenList() {
        return tenLyrics;
    }

}

