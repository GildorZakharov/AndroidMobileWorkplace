/*
    Copyright (c) 2014 Anton Prozorov <avprozorov@gmail.com>
    Copyright (c) 2014 Other contributors as noted in the AUTHORS file.

    Р­С‚РѕС‚ С„Р°Р№Р» СЏРІР»СЏРµС‚СЃСЏ С‡Р°СЃС‚СЊСЋ РїСЂРёР»РѕР¶РµРЅРёСЏ "РњРѕР±РёР»СЊРЅРѕРµ СЂР°Р±РѕС‡РµРµ РјРµСЃС‚Рѕ РѕРїРµСЂР°С‚РѕСЂР°
    Р“РѕСЂСЏС‡РµР№ Р»РёРЅРёРё РїРѕ РїСЂРѕРїР°РІС€РёРј РґРµС‚СЏРј".

    Р”Р°РЅРЅР°СЏ Р»РёС†РµРЅР·РёСЏ СЂР°Р·СЂРµС€Р°РµС‚ Р»РёС†Р°Рј, РїРѕР»СѓС‡РёРІС€РёРј РєРѕРїРёСЋ "РњРѕР±РёР»СЊРЅРѕРіРѕ СЂР°Р±РѕС‡РµРіРѕ
    РјРµСЃС‚Р° РѕРїРµСЂР°С‚РѕСЂР° Р“РѕСЂСЏС‡РµР№ Р»РёРЅРёРё РїРѕ РїСЂРѕРїР°РІС€РёРј РґРµС‚СЏРј" Рё СЃРѕРїСѓС‚СЃС‚РІСѓСЋС‰РµР№
    РґРѕРєСѓРјРµРЅС‚Р°С†РёРё (РІ РґР°Р»СЊРЅРµР№С€РµРј РёРјРµРЅСѓРµРјС‹РјРё В«РџСЂРѕРіСЂР°РјРјРЅРѕРµ РћР±РµСЃРїРµС‡РµРЅРёРµВ»),
    Р±РµР·РІРѕР·РјРµР·РґРЅРѕ РёСЃРїРѕР»СЊР·РѕРІР°С‚СЊ РџСЂРѕРіСЂР°РјРјРЅРѕРµ РћР±РµСЃРїРµС‡РµРЅРёРµ Р±РµР· РѕРіСЂР°РЅРёС‡РµРЅРёР№, РІРєР»СЋС‡Р°СЏ
    РЅРµРѕРіСЂР°РЅРёС‡РµРЅРЅРѕРµ РїСЂР°РІРѕ РЅР° РёСЃРїРѕР»СЊР·РѕРІР°РЅРёРµ, РєРѕРїРёСЂРѕРІР°РЅРёРµ, РёР·РјРµРЅРµРЅРёРµ, РґРѕР±Р°РІР»РµРЅРёРµ,
    РїСѓР±Р»РёРєР°С†РёСЋ, СЂР°СЃРїСЂРѕСЃС‚СЂР°РЅРµРЅРёРµ, СЃСѓР±Р»РёС†РµРЅР·РёСЂРѕРІР°РЅРёРµ Рё/РёР»Рё РїСЂРѕРґР°Р¶Сѓ РєРѕРїРёР№
    РџСЂРѕРіСЂР°РјРјРЅРѕРіРѕ РћР±РµСЃРїРµС‡РµРЅРёСЏ, С‚Р°РєР¶Рµ РєР°Рє Рё Р»РёС†Р°Рј, РєРѕС‚РѕСЂС‹Рј РїСЂРµРґРѕСЃС‚Р°РІР»СЏРµС‚СЃСЏ РґР°РЅРЅРѕРµ
    РџСЂРѕРіСЂР°РјРјРЅРѕРµ РћР±РµСЃРїРµС‡РµРЅРёРµ, РїСЂРё СЃРѕР±Р»СЋРґРµРЅРёРё СЃР»РµРґСѓСЋС‰РёС… СѓСЃР»РѕРІРёР№:

    РЈРєР°Р·Р°РЅРЅРѕРµ РІС‹С€Рµ СѓРІРµРґРѕРјР»РµРЅРёРµ РѕР± Р°РІС‚РѕСЂСЃРєРѕРј РїСЂР°РІРµ Рё РґР°РЅРЅС‹Рµ СѓСЃР»РѕРІРёСЏ РґРѕР»Р¶РЅС‹ Р±С‹С‚СЊ
    РІРєР»СЋС‡РµРЅС‹ РІРѕ РІСЃРµ РєРѕРїРёРё РёР»Рё Р·РЅР°С‡РёРјС‹Рµ С‡Р°СЃС‚Рё РґР°РЅРЅРѕРіРѕ РџСЂРѕРіСЂР°РјРјРЅРѕРіРѕ РћР±РµСЃРїРµС‡РµРЅРёСЏ.

    Р”РђРќРќРћР• РџР РћР“Р РђРњРњРќРћР• РћР‘Р•РЎРџР•Р§Р•РќР�Р• РџР Р•Р”РћРЎРўРђР’Р›РЇР•РўРЎРЇ В«РљРђРљ Р•РЎРўР¬В», Р‘Р•Р— РљРђРљР�РҐ-Р›Р�Р‘Рћ
    Р“РђР РђРќРўР�Р™, РЇР’РќРћ Р’Р«Р РђР–Р•РќРќР«РҐ Р�Р›Р� РџРћР”Р РђР—РЈРњР•Р’РђР•РњР«РҐ, Р’РљР›Р®Р§РђРЇ, РќРћ РќР•
    РћР“Р РђРќР�Р§Р�Р’РђРЇРЎР¬ Р“РђР РђРќРўР�РЇРњР� РўРћР’РђР РќРћР™ РџР Р�Р“РћР”РќРћРЎРўР�, РЎРћРћРўР’Р•РўРЎРўР’Р�РЇ РџРћ Р•Р“Рћ
    РљРћРќРљР Р•РўРќРћРњРЈ РќРђР—РќРђР§Р•РќР�Р® Р� РћРўРЎРЈРўРЎРўР’Р�РЇ РќРђР РЈРЁР•РќР�Р™ РџР РђР’. РќР� Р’ РљРђРљРћРњ РЎР›РЈР§РђР•
    РђР’РўРћР Р« Р�Р›Р� РџР РђР’РћРћР‘Р›РђР”РђРўР•Р›Р� РќР• РќР•РЎРЈРў РћРўР’Р•РўРЎРўР’Р•РќРќРћРЎРўР� РџРћ Р�РЎРљРђРњ Рћ Р’РћР—РњР•Р©Р•РќР�Р�
    РЈР©Р•Р Р‘Рђ, РЈР‘Р«РўРљРћР’ Р�Р›Р� Р”Р РЈР“Р�РҐ РўР Р•Р‘РћР’РђРќР�Р™ РџРћ Р”Р•Р™РЎРўР’РЈР®Р©Р�Рњ РљРћРќРўР РђРљРўРђРњ, Р”Р•Р›Р�РљРўРђРњ
    Р�Р›Р� Р�РќРћРњРЈ, Р’РћР—РќР�РљРЁР�Рњ Р�Р—, Р�РњР•Р®Р©Р�Рњ РџР Р�Р§Р�РќРћР™ Р�Р›Р� РЎР’РЇР—РђРќРќР«Рњ РЎ РџР РћР“Р РђРњРњРќР«Рњ
    РћР‘Р•РЎРџР•Р§Р•РќР�Р•Рњ Р�Р›Р� Р�РЎРџРћР›Р¬Р—РћР’РђРќР�Р•Рњ РџР РћР“Р РђРњРњРќРћР“Рћ РћР‘Р•РЎРџР•Р§Р•РќР�РЇ Р�Р›Р� Р�РќР«РњР�
    Р”Р•Р™РЎРўР’Р�РЇРњР� РЎ РџР РћР“Р РђРњРњРќР«Рњ РћР‘Р•РЎРџР•Р§Р•РќР�Р•Рњ.

    РљСЂРѕРјРµ СЃРѕРґРµСЂР¶РёРјРѕРіРѕ РІ СЌС‚РѕРј СѓРІРµРґРѕРјР»РµРЅРёРё, РЅРё РЅР°Р·РІР°РЅРёРµ "Р“РѕСЂСЏС‡РµР№ Р»РёРЅРёРё РїРѕ
    РїСЂРѕРїР°РІС€РёРј РґРµС‚СЏРј", РЅРё РЅР°Р·РІР°РЅРёРµ "Р”РѕР±СЂРѕРІРѕР»СЊРЅРѕРіРѕ РїРѕРёСЃРєРѕРІРѕРіРѕ РѕС‚СЂСЏРґР° "Р›РёР·Р°
    РђР»РµСЂС‚", РЅРё РёРјРµРЅР° РІС‹С€РµСѓРєР°Р·Р°РЅРЅС‹С… РґРµСЂР¶Р°С‚РµР»РµР№ Р°РІС‚РѕСЂСЃРєРёС… РїСЂР°РІ РЅРµ РґРѕР»Р¶РЅРѕ Р±С‹С‚СЊ
    РёСЃРїРѕР»СЊР·РѕРІР°РЅРѕ РІ СЂРµРєР»Р°РјРµ РёР»Рё РёРЅС‹Рј СЃРїРѕСЃРѕР±РѕРј, С‡С‚РѕР±С‹ СѓРІРµР»РёС‡РёРІР°С‚СЊ РїСЂРѕРґР°Р¶Сѓ,
    РёСЃРїРѕР»СЊР·РѕРІР°РЅРёРµ РёР»Рё РґСЂСѓРіРёРµ СЂР°Р±РѕС‚С‹ РІ СЌС‚РѕРј РџСЂРѕРіСЂР°РјРјРЅРѕРј РѕР±РµСЃРїРµС‡РµРЅРёРё Р±РµР·
    РїСЂРµРґС€РµСЃС‚РІСѓСЋС‰РµРіРѕ РїРёСЃСЊРјРµРЅРЅРѕРіРѕ СЂР°Р·СЂРµС€РµРЅРёСЏ.

    Permission is hereby granted, free of charge, to any person obtaining a
    copy of this software and associated documentation files (the "Software"),
    to deal in the Software without restriction, including without limitation
    the rights to use, copy, modify, merge, publish, distribute, sublicense,
    and/or sell copies of the Software, and to permit persons to whom the
    Software is furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
    DEALINGS IN THE SOFTWARE.

    Except as contained in this notice, the name of Liza Alert or the name of
    Liza Alerts's hotline department or the name(s) the above copyright holders
    shall not be used in advertising or otherwise to promote the sale, use or
    other dealings in this Software without prior written authorization.
 */

package ru.lizaalert.hotline;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;

import java.util.ArrayList;
import java.util.Calendar;

public class SmsChannel extends Channel {

    private static final int DELIVERY_TIMEOUT = 1000 * 60 * 10; // 10 min delivery timeout
    private Thread deliveryThread;
    private BroadcastReceiver smsStatusReceiver;

    private ArrayList<String> messageParts = new ArrayList<String>();

    public SmsChannel(Context context) {
        super(context);
    }

    @Override
    public void send(String text, final String destination, final ChannelHandler channelHandler) {
        final SmsManager smsManager = SmsManager.getDefault();

        final PendingIntent sentIntent = PendingIntent.getBroadcast(context, 0 , new Intent(IntentFields.SMS_SENT), 0);
        final PendingIntent deliveredIntent = PendingIntent.getBroadcast(context, 0, new Intent(IntentFields.SMS_DELIVERED), 0);

        deliveryThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(DELIVERY_TIMEOUT);
                    context.unregisterReceiver(smsStatusReceiver);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        deliveryThread.start();

        smsStatusReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (IntentFields.SMS_SENT.equals(action)) {
                    channelHandler.sent(Calendar.getInstance());
                }

                if (IntentFields.SMS_DELIVERED.equals(action)) {
                    channelHandler.delivered(Calendar.getInstance());
                    context.unregisterReceiver(this);
                    deliveryThread.interrupt();
                }
            }
        };

        IntentFilter smsStatusIntentFilter = new IntentFilter();
        smsStatusIntentFilter.addAction(IntentFields.SMS_SENT);
        smsStatusIntentFilter.addAction(IntentFields.SMS_DELIVERED);

        context.registerReceiver(smsStatusReceiver, smsStatusIntentFilter);

        messageParts = smsManager.divideMessage(text);

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (messageParts.size() == 1) {
                    smsManager.sendTextMessage(destination, null, messageParts.get(0), sentIntent, deliveredIntent);
                } else if (messageParts.size() > 1) {
                    ArrayList<PendingIntent> sentIntents = new ArrayList<PendingIntent>();
                    sentIntents.add(sentIntent);

                    ArrayList<PendingIntent> deliveredIntents = new ArrayList<PendingIntent>();
                    deliveredIntents.add(deliveredIntent);

                    smsManager.sendMultipartTextMessage(destination, null, messageParts, sentIntents, deliveredIntents);
                }
            }
        }).start();
    }
}
