//Create two arrays whose elements are strings: one with at least 10 adjectives,
//another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective
//and hyphenate the combination and display the generated name to the user.
public class ServerNameGenerator {
    public static String getServerString(String[] strArr) {
        int randomElement = (int) (Math.random() * strArr.length);
        System.out.println(randomElement);
        String str = strArr[randomElement];
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String[] serverAdj = {"busted", "crippled", "poisoned", "unknown", "majestic", "discombobulated", "confused", "enraged", "energized", "sleepy"};
        String[] serverNoun = {"hobo", "vagabond", "fighter", "dad", "artist", "mom", "dog", "vehicle", "airship", "pimp"};

        String serverName = "Your server name is: \n" + getServerString(serverAdj) + "-" + getServerString(serverNoun);
        System.out.println(serverName);
    }
}
