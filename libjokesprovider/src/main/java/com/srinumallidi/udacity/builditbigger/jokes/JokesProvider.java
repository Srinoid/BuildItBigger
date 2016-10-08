package com.srinumallidi.udacity.builditbigger.jokes;

public class JokesProvider {

    int jokeArrayCount = 0;

    final static String[] OTHER_JOKE_ARRAY = new String[]{
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "Style of break up:\n" +
                    "Boy bought gift for His Girl friend-\n" +
                    "GF:Wat the hell would I do with this rocket?\n" +
                    "Boy: U wanted stars na?\n" +
                    "Now sit on it and GET LOST:p",
            "A Belated Teachers' Day\n" +
                    "\n" +
                    "Its A Humble Request\n" +
                    "\"80% Of Teachers r\n" +
                    "Suffering From Throat\n" +
                    "Pain By Teaching Students.\"\n" +
                    "So Plz\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    "BUNK d Classes As Much\n" +
                    "As Possible\n" +
                    "n\n" +
                    "Save Our Teachers",
            "boy: how do i play the guitar????\n" +
                    "girl: u should be on TV for ur talent :|\n" +
                    "boy: am i so good??? :D :O\n" +
                    "\n" +
                    "girl: if u were on TV,, i can atleast switch it off ;/"
    };
    public String getJoke(){

        String joke;
        if(jokeArrayCount < OTHER_JOKE_ARRAY.length){
            joke = OTHER_JOKE_ARRAY[jokeArrayCount];
            jokeArrayCount++;
        }
        else{
            jokeArrayCount = 0;
            joke = OTHER_JOKE_ARRAY[jokeArrayCount];
        }

        return joke;
    }
    public static String[] getOTHER_JOKE_ARRAY(){
        return OTHER_JOKE_ARRAY;
    }

}
