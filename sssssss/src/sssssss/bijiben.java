package sssssss;
/*
 * 笔记本
 * 开机
 * 运行USB设备
 * 关机
 */
public class bijiben {
      public void open(){
    	  System.out.println("电脑开机了...............");
      }
	public void  USE (USB usb){
		usb.openUSB();
		usb.closeUSB();
		
	}
	public void close(){
		System.out.println("电脑关机了...............");
	}
	
}
