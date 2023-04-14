import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class HelloBot extends TelegramLongPollingBot {

    private final String BOT_TOKEN = "5339759422:AAEcOvIzJDaNUPH_H0NkIEQkt3BCdnmzpzU";
    private final String BOT_USERNAME = "test_store178";


    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
//133056085
    @Override
    public void onUpdateReceived(Update update) {
        if (update != null || update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            Contact contact = update.getMessage().getContact();
            System.out.println(contact);
            try {
                execute(new SendMessage(chatId.toString(), "Hi " + update.getMessage().getText()));
            } catch (TelegramApiException e) {
                e.printStackTrace();
                e.printStackTrace();
            }
        }
    }
}
//366711056
//366711056