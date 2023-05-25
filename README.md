# AmazonLogin
		
		# Frameworks : 
		
			> Maven : Maven, POM(Project Object Model)’a dayanan güçlü bir proje yönetim aracıdır. Projenin kolay build edilmesi, bağımlılıkların yönetilmesi ve paket formatların derlenmesinde kolaylık sağlamaktadır.
			
			
			> Selenium : Web tarayıcıları üzerinde test otomasyonu yazmamızı sağlayan bir araçtır. Açık kaynak kodlu olması yaygın kullanılma sebeplerinden biridir. Selenium IDE, Selenium WebDriver ve Selenium Grid gibi farklı amaçlar için kullanılan araçlar mevcuttur.
			
			
			> JUnit : Page Object Model oluşturmak için kullanılan bir kütüphanedir. Ayrıca Assertionları kullanmak için bu kütüphaneye ihtiyacımız vardır.
		
			
		# Proje Yapısı
		
			> pom.xml : Projede kullanılan framework ve teknolojilerin dependency olarak tanımlandığı dosyadır. 

			> BasePage.java : Selenium methodlarının tanımlandığı java dosyasıdır.

            > LoginPage.java : Locatorların tanmımlandıgı ve senaryonun koşuldugu java dosyasıdır.
			
			> BaseTest.java : Driverın ayağa kaldırılması ve kapatılması için bu java dosyası kullanılır.@BeforeAll ve @AfterAll annotasyonları kullanılmaktadır.
			

			
			
			
			
			
		
			
			
