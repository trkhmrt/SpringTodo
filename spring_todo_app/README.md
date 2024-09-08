# MySQL Veritabanı Şifre Değiştirme Kılavuzu

Bu kılavuzda, MySQL veritabanı şifrenizi nasıl değiştirebileceğinizi basit adımlarla açıklıyoruz. Bu işlemleri MySQL Workbench veya terminal üzerinden yapabilirsiniz.

---

## 🎯 Adım 1: MySQL Sunucusuna Bağlanma

MySQL sunucusuna bağlanmak için MySQL Workbench veya terminal kullanabilirsiniz. İşlemleri başlatmadan önce mevcut kullanıcı adı ve şifrenizle MySQL sunucusuna başarıyla bağlandığınızdan emin olun.

---

## 🛠 Adım 2: Şifre Değiştirme Komutu

MySQL'de kullanıcı şifresini değiştirmek için şu komutu kullanabilirsiniz:

```sql
ALTER USER 'root'@'localhost' IDENTIFIED BY 'yeni_sifre';


## TEKRAR EDILECEKLER ##
ResponseEntity
Optional
final
orElseThrow
@RequestBody ile @PathVariable farkı ?

---- TARIK

User user = userService.getUserById(1L).orElseThrow(() -> new UserNotFoundException("Kullanıcı bulunamadı"));

-OrelseThrow ile hata yönetimi ve istenilen hatanın geri döndürülmesi

08.09.24 - Experiences

1. Remote Database Connection Failure

	•	Bağlanma sırasında bazı yapılandırma sorunlarıyla karşılaşıldı, uzak bir veritabanına erişim başarılı olmadı. Bu, veritabanı bağlantısı yapılandırmalarının dikkatle gözden geçirilmesini ve test edilmesini gerektiriyor.

2. final ve @Autowired Uyumsuzluğu

	•	final değişkenlerle @Autowired anotasyonu birlikte kullanılamıyor. Bunun yerine @Autowired ve @RequiredArgsConstructor kullanılarak bağımlılık enjeksiyonu sağlanabilir. Bu, final alanların constructor ile otomatik olarak başlatılmasına izin veriyor.

3. Bağımlılık Enjeksiyonu Türleri

	•	Field Injection (@Autowired): Bağımlılık doğrudan sınıf alanına enjekte edilir.
	•	Setter Injection (@Setter): Setter metotları aracılığıyla bağımlılık enjekte edilir.
	•	Constructor Injection: Bağımlılık, sınıfın constructor’ı aracılığıyla enjekte edilir ve final alanlarla uyumludur.

Bu özet, programlama sürecinde öğrendiğiniz temel bilgileri hızlıca özetlemektedir.