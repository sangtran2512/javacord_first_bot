package com.bindo2512;
import com.bindo2512.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
public class Commands implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(Main.prefix+"status")){
            event.getChannel().sendMessage("I'm still alive!");
        }
    }
}
