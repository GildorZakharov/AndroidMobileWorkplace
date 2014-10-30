package ru.lizaalert.hotline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;

public class SmsReciver extends BroadcastReceiver {

	final private static String ACTION = "android.provider.Telephony.SMS_RECEIVED";
	
	final private static String LOG_TAG = "myLogs"; //для проверки выполнения действия
	
	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent != null && intent.getAction() != null &&
		        ACTION.compareToIgnoreCase(intent.getAction()) == 0) {
		    Object[] pduArray = (Object[]) intent.getExtras().get("pdus");
		    SmsMessage[] messages = new SmsMessage[pduArray.length];
		    for (int i = 0; i < pduArray.length; i++) {
		        messages[i] = SmsMessage.createFromPdu((byte[]) pduArray[i]);
		    }
		    StringBuilder bodyText = new StringBuilder();
		        for (int i = 0; i < messages.length; i++) {
		            bodyText.append(messages[i].getMessageBody());
		        }
		    String body = bodyText.toString();
		    Log.d(LOG_TAG, "Sms Recived: " + body);
		    
		    abortBroadcast();		    		    
		}		
	}
}
