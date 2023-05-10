package Patterns.Behavioral.chain;

import Patterns.Behavioral.chain.notificators.EmailNotificator;
import Patterns.Behavioral.chain.notificators.SimpleReportNotificator;
import Patterns.Behavioral.chain.notificators.SmsNotificator;

public class Solution {
    public static void main(String[] args) {
        Notificator report = new SimpleReportNotificator(Priority.ROUTINE);
        Notificator email = new EmailNotificator(Priority.IMPORTANT);
        Notificator sms = new SmsNotificator(Priority.ASAP);

        report.setNextNotificator(email);
        email.setNextNotificator(sms);

        report.notifyManager(" everithing fucks", Priority.ROUTINE);

    }
}
