package org.dev.arnav;

import java.io.File;
import java.io.IOException;

class FormatPenDrive{
	
	public static String format(File path) throws IOException{
		try{
			if(path.isDirectory()){
				String files[] = path.list();
				File f;
				for (String str : files) {
					System.out.println("Files name: "+str);
					try{
						Thread.sleep(3000);
					}catch (InterruptedException e) {
						// TODO: handle exception
					}
					f=new File(path, str);
					f.delete();
					System.out.println("File deleted: "+str);
					
				}
				return "File deleted sucessfully";
			}
		}catch (Exception e) {
			System.out.println("Exceptin in FormatPenDrive: "+e);
		}
		return "Not Deleted!";
	}
	
}
public class Main {
	public static void main(String[] args) throws IOException {
		File f=new File("G:/xxx");
		String str=FormatPenDrive.format(f);
		System.out.println("Message: "+str);
	}
}
