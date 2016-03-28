package com.zorba.bt.app.dao;

public class RoomData {
   private String address = "";
   private String name = "";
   private boolean isRGB = false;
   
   public RoomData(String var1, String var2) {
      this.name = var2;
      this.address = var1;
      isRGB = name.endsWith("_RGB");
   }

   public String getAddress() {
      return this.address;
   }

   public String getName() {
      return this.name;
   }

   public boolean isRGBType() {
	   return isRGB;
   }
   
   public String toString() {
      return this.name;
   }
}
