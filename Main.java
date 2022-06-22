package com.bindo2512;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static String token = "OTg5MDc1ODYwMjczMzg1NTYy.GlcG5U.i1K9MAzth4AU945TiJWKsPFC-BR0kFd-Rxabck";
    public static final String prefix = "!";
    public static void main(String[] args) {
        DiscordApi bot = new DiscordApiBuilder().setToken(token).login().join();
        bot.addListener(new Commands());
        /*
        bot.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!status")) {
                event.getChannel().sendMessage("I'm Still Alive!");
            }
        });
        */
        // Invite
        System.out.println("Invite Link: " + bot.createBotInvite());

    }
}
