package com.tsola2002.ch04_strings_iostreams_files;

import java.io.File;

public class Files {

  public static void main(String[] args) {
    createFile1();
    // createFolderAndFile();
    //listFilesFolders();
  }

  public static void createFile1(){
    //CREATE THE FILE OBJECT
    File f = new File("outputstream.txt");
    try {
      f.createNewFile();
      // THIS WILL DELETE OUT FILE
      //f.delete();
    } catch (Exception e) {
      // THIS WILL DISPLAY A STACKTRACE ERROR
      e.printStackTrace();
    }
  }

  public static void createFolderAndFile(){
    String path = "new_folder" + File.separator
        + "subfolder" + File.separator;
    String fileName = "shola.txt";
    File f  = new File(path + fileName);
    try{
      new File(path).mkdirs();
      f.createNewFile();
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }

  public static void listFilesFolders(){

    String path1 =  "folder1" + File.separator;
    String path2 =  "folder2" + File.separator;
    String path = path1 + path2;
    File f1 =  new File(path + "file1.txt");
    // folder1/folder2/file1.txt
    File f2 =  new File(path + "file2.txt");
    // folder1/folder2/file2.txt
    File dir1 = new File(path1); // folder1/
    File dir = new File(path); // folder1/folder2/
    try {
      dir.mkdirs(); // create the folders
      f1.createNewFile(); // create file1.txt
      f2.createNewFile(); // create file2.txt
    }catch (Exception e){
      e.printStackTrace();
    }
    //LIST ALL FOLDERS
    for(String d: dir1.list()){
      System.out.println(d + " ");
    }



  }

}
