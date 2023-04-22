public class task1 {
   public static void main(String[] args) {
      String input = "Основание -12б степень 7, результат";
      String[] words = input.split(" ");
      int base = 0;
      int exponent = 0;
      for (int i = 0; i < words.length; i++) {
         if (words[i].equalsIgnoreCase("основание")) {
            base = Integer.parseInt(words[i + 1].replace("б", ""));
         } else if (words[i].equalsIgnoreCase("степень")) {
            exponent = Integer.parseInt(words[i + 1].replace(",", ""));
         }
      }
      int result = (int) Math.pow(base, exponent);
      System.out.println(input + " " + result);
   }
}
