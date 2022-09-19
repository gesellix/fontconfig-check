package de.gesellix.fontconfig;

public class App {

  public String[] getAvailableFontFamilyNames() {
    return java.awt.GraphicsEnvironment
        .getLocalGraphicsEnvironment()
        .getAvailableFontFamilyNames();
  }

  public static void main(String[] args) {
    App app = new App();
    System.out.println("***");
    System.out.println("getAvailableFontFamilyNames...");
    System.out.println(String.join(",", app.getAvailableFontFamilyNames()));
    System.out.println("***");
  }
}
