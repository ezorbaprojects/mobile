package com.zorba.bt.app.dao;

public class DeviceData {
   public static final String DEVICETYPE_AC = "Ac";
   public static final String DEVICETYPE_ACSPLIT = "Ac Split";
   public static final String DEVICETYPE_ALARM = "Alarm";
   public static final String DEVICETYPE_CCTV_INDOOR = "CC tv Indoor";
   public static final String DEVICETYPE_CCTV_OUTDOOR = "CC tv Outdoor";
   public static final String DEVICETYPE_CFL = "CFL Bulb";
   public static final String DEVICETYPE_COVE_LIGHT = "Cove light";
   public static final String DEVICETYPE_CURTAIN = "Curtain";
   public static final String DEVICETYPE_DIM_LIGHT = "Dimmable Light";
   public static final String DEVICETYPE_DOORBELL = "Door Bell";
   public static final String DEVICETYPE_DOORLOCK = "Door Lock";
   public static final String DEVICETYPE_FAN = "Fan";
   public static final String DEVICETYPE_FRIDGE = "Fridge";
   public static final String DEVICETYPE_LED = "Led";
   public static final String DEVICETYPE_LIGHT = "Light";
   public static final String DEVICETYPE_MICROOVEN = "Micro Oven";
   public static final String DEVICETYPE_SETTOPBOX = "Settop Box";
   public static final String DEVICETYPE_SOCKET = "Socket";
   public static final String DEVICETYPE_SPRINKLER = "Sprinkler";
   public static final String DEVICETYPE_TABLEFAN = "Table Fan";
   public static final String DEVICETYPE_TUBELIGHT = "Tube Light";
   public static final String DEVICETYPE_TV = "TV";
   public static final String DEVICETYPE_UNKNOWN = "Unknown";
   public static final String[] deviceTypes = new String[]{"Light", "Dimmable Light", "Tube Light", "CFL Bulb", "Cove light", "Fan", "Table Fan", "Ac", "Ac Split", "Alarm", "CC tv Indoor", "CC tv Outdoor", "Curtain", "Door Bell", "Door Lock", "Fridge", "Led", "Socket", "Micro Oven", "Settop Box", "Sprinkler", "TV"};
   public static final String[] lightdeviceTypes = new String[]{"Light", "Dimmable Light", "Tube Light", "CFL Bulb", "Cove light"};
   public static final String[] nonlightdeviceTypes = new String[]{"Fan", "Table Fan", "Ac", "Ac Split", "Alarm", "CC tv Indoor", "CC tv Outdoor", "Curtain", "Door Bell", "Door Lock", "Fridge", "Led", "Socket", "Micro Oven", "Settop Box", "Sprinkler", "TV"};
   private int devid = 0;
   private String name = "";
   private String powerinwatts = "10";
   private int status = -1;
   private String type = "Unknown";

   public DeviceData(int var1, String var2, String var3, String var4, int var5) {
      this.devid = var1;
      this.name = var2;
      this.type = var3;
      this.powerinwatts = var4;
      this.status = var5;
   }

   public static boolean isDimmable(String var0) {
      boolean var1;
      if(!var0.equals("Dimmable Light") && !var0.equals("Fan")) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static boolean isLightType(String var0) {
      boolean var1;
      if(!var0.equals("Light") && !var0.equals("Dimmable Light") && !var0.equals("Cove light") && !var0.equals("Dimmable Light") && !var0.equals("Tube Light")) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public int getDevId() {
      return this.devid;
   }

   public String getName() {
      return this.name;
   }

   public String getPower() {
      return this.powerinwatts;
   }

   public int getStatus() {
      return this.status;
   }

   public String getType() {
      return this.type;
   }

   public boolean isDimmable() {
      return isDimmable(this.type);
   }

   public boolean isUnknownType() {
      return this.type.equals("Unknown");
   }

   public void setStatus(int var1) {
      this.status = var1;
   }

   public String toString() {
      return "deviid=" + this.devid + " name=" + this.name + " type=" + this.type + " power=" + this.powerinwatts + " status=" + this.status;
   }
}