package com.manh.springsecurityoauth2explanation;

import java.io.File;
import java.io.IOException;

public class FileOps {

// defaults write com.apple.screencapture name "1-"
    public static void main(String[] argv) throws IOException {

      try {
          String basePath  = File.separator + "Users" + File.separator +"bdatta" + File.separator + "SpringSecurity"
                + File.separator + "SergeyGood" + File.separator + "spring-security-oauth2-explanation";
          File folder = new File(basePath + File.separator + "images" + File.separator + "section4_practical");
          File[] listOfFiles = folder.listFiles();

          for (int i = 1; i < listOfFiles.length; i++) {

              if (listOfFiles[i].isFile()) {

                  File f = new File(basePath + File.separator + "images" + File.separator + "section4_practical" + File.separator +listOfFiles[i].getName());

                  File naeFile = new File(basePath+ File.separator + "images" + File.separator + "section4_practical" + File.separator +i+".png");

                  boolean ex = f.exists();

                  System.out.println(f.exists());

                  boolean success = f.renameTo(naeFile);

                  System.out.println(success);
              }
          }

          System.out.println("conversion is done");
      }
      catch(Exception ioe) {
          System.out.println("conversion is done" + ioe.getMessage());
      }


    }
}

