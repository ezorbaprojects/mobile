package com.zorba.bt.app;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.ListAdapter;
import java.util.Calendar;

public class CommonUtils {
   public static int MAX_NO_DEVICES = 6;
   public static final int MENUITEMINDEX_ABOUT = 3;
   public static final int MENUITEMINDEX_DISCOVERY = 0;
   public static final int MENUITEMINDEX_EXIT = 4;
   public static final int MENUITEMINDEX_HELP = 1;
   public static final int MENUITEMINDEX_SENDLOG = 2;
   public static final String MENUITEM_ABOUT = "About";
   public static final String MENUITEM_DISCOVERY = "Add Room";
   public static final String MENUITEM_EXIT = "Exit";
   public static final String MENUITEM_HELP = "Help";
   public static final String MENUITEM_SENDLOG = "Send Log";

   public static void AlertBox(Activity var0, String var1, String var2) {
      (new Builder(var0)).setTitle(var1).setMessage(var2).setPositiveButton("Close", new OnClickListener() {
         public void onClick(DialogInterface var1, int var2) {
            var1.dismiss();
         }
      }).show();
   }

   public static byte[] getCurrentTime() {
      Calendar var7 = Calendar.getInstance();
      int var4 = var7.get(5);
      int var3 = var7.get(2);
      int var5 = var7.get(1);
      int var2 = var7.get(7);
      int var0 = var7.get(11);
      int var6 = var7.get(12);
      int var1 = var7.get(13);
      return new byte[]{(byte)var4, (byte)(var3 + 1), (byte)(var5 - 2000), (byte)var2, (byte)var0, (byte)var6, (byte)var1};
   }

   public static int getDeviceImage(String var0, int var1) {
      int var2 = R.drawable.unknown;
      if(var0.equals("Light")) {
         if(var1 <= 0) {
            var2 = R.drawable.light_off;
         } else {
            var2 = R.drawable.light_on;
         }
      } else if(var0.startsWith("Dimmable Light")) {
         if(var1 <= 0) {
            var2 = R.drawable.dbulb_off;
         } else {
            var2 = R.drawable.dbulb_on;
         }
      } else if(var0.startsWith("Tube Light")) {
         if(var1 <= 0) {
            var2 = R.drawable.tubelight_off;
         } else {
            var2 = R.drawable.tubelight_on;
         }
      } else if(var0.startsWith("CFL Bulb")) {
         if(var1 <= 0) {
            var2 = R.drawable.cfl_off;
         } else {
            var2 = R.drawable.cfl_on;
         }
      } else if(var0.startsWith("Cove light")) {
         if(var1 <= 0) {
            var2 = R.drawable.covelight_off;
         } else {
            var2 = R.drawable.covelight_on;
         }
      } else if(var0.startsWith("Fan")) {
         if(var1 <= 0) {
            var2 = R.drawable.fan_off;
         } else {
            var2 = R.drawable.fan_on;
         }
      } else if(var0.startsWith("Table Fan")) {
         if(var1 <= 0) {
            var2 = R.drawable.tablefan_off;
         } else {
            var2 = R.drawable.tablefan_on;
         }
      } else if(var0.startsWith("Ac")) {
         if(var1 <= 0) {
            var2 = R.drawable.ac_off;
         } else {
            var2 = R.drawable.ac_on;
         }
      } else if(var0.startsWith("Ac Split")) {
         if(var1 <= 0) {
            var2 = R.drawable.acsplit_off;
         } else {
            var2 = R.drawable.acsplit_on;
         }
      } else if(var0.startsWith("Alarm")) {
         if(var1 <= 0) {
            var2 = R.drawable.alarm_off;
         } else {
            var2 = R.drawable.alarm_on;
         }
      } else if(var0.startsWith("CC tv Indoor")) {
         if(var1 <= 0) {
            var2 = R.drawable.cctvindoor_off;
         } else {
            var2 = R.drawable.cctvindoor_on;
         }
      } else if(var0.startsWith("CC tv Outdoor")) {
         if(var1 <= 0) {
            var2 = R.drawable.cctvoutdoor_off;
         } else {
            var2 = R.drawable.cctvoutdoor_on;
         }
      } else if(var0.startsWith("Curtain")) {
         if(var1 <= 0) {
            var2 = R.drawable.curtian_off;
         } else {
            var2 = R.drawable.curtian_on;
         }
      } else if(var0.startsWith("Door Bell")) {
         if(var1 <= 0) {
            var2 = R.drawable.doorbell_off;
         } else {
            var2 = R.drawable.doorbell_on;
         }
      } else if(var0.startsWith("Door Lock")) {
         if(var1 <= 0) {
            var2 = R.drawable.doorlock_off;
         } else {
            var2 = R.drawable.doorlock_on;
         }
      } else if(var0.startsWith("Fridge")) {
         if(var1 <= 0) {
            var2 = R.drawable.fridge_off;
         } else {
            var2 = R.drawable.fridge_on;
         }
      } else if(var0.startsWith("Led")) {
         if(var1 <= 0) {
            var2 = R.drawable.led_off;
         } else {
            var2 = R.drawable.led_on;
         }
      } else if(var0.startsWith("Socket")) {
         if(var1 <= 0) {
            var2 = R.drawable.socket_off;
         } else {
            var2 = R.drawable.socket_on;
         }
      } else if(var0.startsWith("Micro Oven")) {
         if(var1 <= 0) {
            var2 = R.drawable.microwave_off;
         } else {
            var2 = R.drawable.microwave_on;
         }
      } else if(var0.startsWith("Settop Box")) {
         if(var1 <= 0) {
            var2 = R.drawable.settopbox_off;
         } else {
            var2 = R.drawable.settopbox_on;
         }
      } else if(var0.startsWith("Sprinkler")) {
         if(var1 <= 0) {
            var2 = R.drawable.sprinkler_off;
         } else {
            var2 = R.drawable.sprinkler_on;
         }
      } else if(var0.startsWith("TV")) {
         if(var1 <= 0) {
            var2 = R.drawable.tv_off;
         } else {
            var2 = R.drawable.tv_on;
         }
      }

      return var2;
   }

   public static String isValidName(Activity var0, String var1) {
      Object var2 = null;
      var1 = var1.trim();
      String var3;
      if(var1.isEmpty()) {
         AlertBox(var0, "Name", "Name is empty");
         var3 = (String)var2;
      } else if(var1.length() > 12) {
         AlertBox(var0, "Name", "Name should not be more than 12 chars");
         var3 = (String)var2;
      } else if(var1.contains("#")) {
         AlertBox(var0, "Name", "Name should not contain # letter in the name");
         var3 = (String)var2;
      } else {
         var3 = Character.toString(var1.charAt(0)).toUpperCase() + var1.substring(1);
      }

      return var3;
   }

   public static final int measureContentWidth(ViewGroup var0, ListAdapter var1) {
      ViewGroup var11 = null;
      int var2 = 0;
      View var10 = null;
      int var6 = 0;
      int var7 = MeasureSpec.makeMeasureSpec(0, 0);
      int var8 = MeasureSpec.makeMeasureSpec(0, 0);
      int var9 = var1.getCount();

      int var5;
      for(int var3 = 0; var3 < var9; var2 = var5) {
         var5 = var1.getItemViewType(var3);
         int var4 = var6;
         if(var5 != var6) {
            var4 = var5;
            var10 = null;
         }

         ViewGroup var12 = var11;
         if(var11 == null) {
            var12 = var0;
         }

         var10 = var1.getView(var3, var10, var12);
         var10.measure(var7, var8);
         var6 = var10.getMeasuredWidth();
         var5 = var2;
         if(var6 > var2) {
            var5 = var6;
         }

         ++var3;
         var6 = var4;
         var11 = var12;
      }

      return var2;
   }

   public static void setNumMaxNoDevices(int var0) {
      MAX_NO_DEVICES = var0;
   }
}