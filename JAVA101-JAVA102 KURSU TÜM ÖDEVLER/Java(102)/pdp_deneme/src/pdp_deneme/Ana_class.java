package pdp_deneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ana_class {

    public static void main(String[] args) {

        // Dosya yolu komut satırı parametresi olarak veriliyor
        String dosyaYolu = args[0];

        try {
            // Dosya nesnesi oluştur
            File dosya = new File(dosyaYolu);

            // BufferedReader nesnesi oluştur
            BufferedReader reader = new BufferedReader(new FileReader(dosya));

            // Regex pattern'ları
            Pattern functionPattern = Pattern.compile("(public|private)\\s+.*?\\(.*?\\)\\s*\\{");
            Pattern singleLineCommentPattern = Pattern.compile("//.*");
            Pattern multiLineCommentPattern = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL);
            Pattern javadocPattern = Pattern.compile("/\\*\\*.*?\\*/", Pattern.DOTALL);

            // Fonksiyonlar ve yorumlar için Map nesnesi oluştur
            Map<String, Yorumlar> fonksiyonYorumlari = new HashMap<>();

            // Dosya içinde gezin
            String satir;
            while ((satir = reader.readLine()) != null) {

                // Fonksiyon tanımını ara
                Matcher functionMatcher = functionPattern.matcher(satir);
                if (functionMatcher.find()) {
                    String functionName = functionMatcher.group().split("\\s+")[1];
                    System.out.println("Fonksiyon adı: " + functionName);

                    // Yorumları ara
                    String yorumlar = "";
                    Matcher singleLineMatcher = singleLineCommentPattern.matcher(satir);
                    while (singleLineMatcher.find()) {
                        yorumlar += singleLineMatcher.group() + "\n";
                    }
                    Matcher multiLineMatcher = multiLineCommentPattern.matcher(satir);
                    while (multiLineMatcher.find()) {
                        yorumlar += multiLineMatcher.group() + "\n";
                    }
                    Matcher javadocMatcher = javadocPattern.matcher(satir);
                    while (javadocMatcher.find()) {
                        yorumlar += javadocMatcher.group() + "\n";
                    }

                    // Yorumları ekrana yazdır
                    System.out.println("Yorumlar: " + yorumlar);

                    // Fonksiyon ve yorumları Map nesnesine ekle
                    fonksiyonYorumlari.put(functionName, new Yorumlar(yorumlar));
                }
            }
            reader.close(); // dosya okuma işlemi bittiğinde BufferedReader nesnesini kapat

            // Toplam yorum sayılarını hesapla ve ekrana yazdır
            for (Map.Entry<String, Yorumlar> entry : fonksiyonYorumlari.entrySet()) {
                String functionName = entry.getKey();
                Yorumlar yorumlar = entry.getValue();

                int singleLineCommentCount = yorumlar.getSingleLineCommentCount();
                int multiLineCommentCount = yorumlar.getMultiLineCommentCount();
                int javadocCount = yorumlar.getJavadocCount();

                System.out.println("Fonksiyon: " + functionName);
                System.out.println("Tek satırlı yorum sayısı: " + singleLineCommentCount);
                System.out.println("Çok satırlı yorum sayısı: " + multiLineCommentCount);
                System.out.println("Javadoc sayısı: " + javadocCount);
                System.out.println();
                }
            // Dosya okuma işlemi bittiğinde BufferedReader nesnesini kapat
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + dosyaYolu);
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata oluştu: " + e.getMessage());
        }
    }
}