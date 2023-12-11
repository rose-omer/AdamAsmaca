import java.util.Scanner;

public class adamAsmaca {

    private static String[] kelimeler = {"terminator", "muz", "bilgisayar", "inek", "yağmur", "su", "adam", "kadın", "bardak","programlama", "java", "python", "html", "css", "javascript", "algoritma", "veritabanı", "mobil", "uygulama", "geliştirici", "web", "backend", "frontend", "framework", "derleme", "hata ayıklama", "hata", "versiyon", "kontrol", "veritabanı", "sunucu", "istemci", "arayüz", "optimizasyon", "duyarlı", "tasarım", "şifreleme", "kimlik doğrulama", "yetkilendirme", "değişken", "döngü", "koşul", "tekrar", "fonksiyon", "nesne", "sınıf", "kalıtım", "polimorfizm", "soyutlama", "kapsülleme", "API", "arayüz", "kütüphane", "geliştirme", "test", "çevik", "scrum", "kanban", "depo", "taahhüt", "birleştirme", "dal", "çek", "istek", "biyoloji", "kimya", "fizik", "astronomi", "coğrafya", "ekonomi", "sosyoloji", "psikoloji", "politika", "felsefe", "edebiyat", "sanat", "müzik", "film", "spor", "kültür", "din", "dil", "eğitim", "biyokimya", "genetik", "evrim", "tür", "okyanus bilimi", "meteoroloji", "volkan", "gezegen", "galaksi", "element", "molekül", "kimyasal", "hücre", "organizma", "ekosistem", "fotosentez", "çekirdek", "elektron", "yerçekimi", "kuvvet", "enerji", "tarih", "coğrafya", "ekonomi", "sosyoloji", "psikoloji", "politika", "felsefe", "edebiyat", "sanat", "müzik", "film", "spor", "kültür", "din", "dil", "eğitim"};
    private static String kelime = kelimeler[(int) (Math.random() * kelimeler.length)]; //random kelime seçtik
    private static String yıldızlar = new String(new char[kelime.length()]).replace("\0", "*"); // kelime uzunluğu kadar tekrar et diyip yıldız atıyoruz
    private static int sayaç = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (sayaç < 7 && yıldızlar.contains("*")) {
            System.out.println("Kelimedeki herhangi bir harfi tahmin et");
            System.out.println(yıldızlar);//yıldızları ekrana verdik
            String tahmin = input.next();
            adam(tahmin);//adamın durumunu ekrana verdil
        }
        input.close();
    }

    public static void adam(String tahmin) {
       // Yeni bir yıldız dizisi oluşturulur. Bu dizi, güncellenmiş tahminlere göre kelimenin durumunu tutar.
                String yeniyıldız = "";
        // Seçilen kelimenin her harfi için kontrol yapılır.
        for (int i = 0; i < kelime.length(); i++) {
            // Eğer tahmin edilen harf, kelimenin bu pozisyonundaki harfle eşleşiyorsa:
            if (kelime.charAt(i) == tahmin.charAt(0)) {
                // Yeni yıldız dizisine, tahmin edilen harfi ekleyerek günceller.
                yeniyıldız += tahmin.charAt(0);
            }
            // Eğer tahmin edilen harf, kelimenin bu pozisyonundaki harfle eşleşmiyorsa ve bu pozisyon daha önce açılmışsa:
            else if (yıldızlar.charAt(i) != '*') {
                // Yeni yıldız dizisine, kelimenin bu pozisyonundaki harfi ekleyerek günceller.
                yeniyıldız += kelime.charAt(i);
            }
            // Eğer tahmin edilen harf, kelimenin bu pozisyonundaki harfle eşleşmiyorsa ve bu pozisyon daha önce açılmamışsa:
            else {
                // Yeni yıldız dizisine, "*" karakterini ekleyerek günceller.
                yeniyıldız += "*";
            }
        }

        // Eğer yeni yıldız dizisi, eski yıldız dizisine eşitse, kullanıcı yanlış tahmin yapmıştır ve sayaç artırılır, ardından `adamResmi` fonksiyonu çağrılır.
        if (yıldızlar.equals(yeniyıldız)) {
            sayaç++;
            adamResmi();
        }
        // Eğer yeni yıldız dizisi, eski yıldız dizisinden farklıysa, yıldız dizisi güncellenir.
        else {
            yıldızlar = yeniyıldız;
        }

        // Eğer güncellenmiş yıldız dizisi, seçilen kelimeye eşitse, kullanıcı oyunu kazanmıştır ve kazandığına dair bir mesaj verilir.
        if (yıldızlar.equals(kelime)) {
            System.out.println("Doğru! Kazandınız! Kelime şuydu: " + kelime);
        }
    }

    public static void adamResmi() {                //adamımızın resmi
        if (sayaç == 1) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (sayaç == 2) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (sayaç == 3) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (sayaç == 4) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (sayaç == 5) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (sayaç == 6) {
            System.out.println("Yanlış tahmin, tekrar deneyin");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (sayaç == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("OYUN BİTTİ! Kelime şuydu: " + kelime);
        }
    }
}