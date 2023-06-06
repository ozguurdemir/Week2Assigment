# Week2Assigment
Basit bir araç kiralama servisi tasarımı. Elimizde üç araç çeşidi bulunuyor. Bunlar hatchback, sedan ve suv. 
Bu araclar aylık ve gunluk kiralanabiliyor, ancak hatchback sadece günlük kiralanabiliyor.
Bu araçlar kurumsal müşteri ve bireysel müşteri olarak iki farklı müşteri tipine kiralanıyor. Kurumsal müşteri her arabayı kiralayabilirken bireysel müşteri yalnızca hatchback kiralayabiliyor.
Her aracın günlük kira ücreti modeline göre değişmektedir.

Bu bağlamda Car isminde bir abstract class oluşturarak araba türlerinin ortak özelliklerini belirledim. Ayrıca calculatePrice() metodu ile her aracın kiralama ücretini hesapladım.
Bu metod girdi olarak kullanıcı tarafından verilen gün sayısını o modelin günlük kiralama fiyatı ile çarparak sonucu buluyor.
Suv araçlarda buna ek olarak aracın yaşı ile ters orantılı olacak şekilde ilave ücret eklemesi yapılıyor. Bu değişken suv sınıfında "private final int CONSTANT = 200/age;" şeklinde tanımlanmıştır.

Daha sonra başka bir abstract class olan "Client" sınıfında müşterilerin ortak özelliklerini tanımladım. 

Araba kiralama işi için RentACarService sınıfını kullandım. Bu sınıf RentACar() ismindeki metodu kullanarak kiralama işlemini gerçekleştirmeye yarıyor.
RentACar(List<Car> carList, Client client) metodu Car sınıfından türetilen nesnelerin olduğu bir sınıfı ve Client sınıfından türetilen bir müşteriyi girdi olarak alıyor. 
Bu sayede metodun içinde araba nesnelerine ve müşteri tipine göre sunulacak seçeneklere karar verebiliyoruz.
Bu metod ilk önce aracın kaç gün kiralanacağını öğrenmek için DayPickerService sınıfından pickDate() metodunu çağırıyor. Bu metod kullanıcıya günlük mü yoksa aylık mı kiralama yapmak istediğini soruyor
Bunu öğrendikten sonra RentACar() fonksiyonu müşteri tipine göre araç seçeneklerini ekrana basıyor ve müşteriden seçim yapmasını istiyor.
Müşterinin seçtiği araca göre fiyatı hesaplayıp sonucu ekrana basıyor.

Test nesneleri main class'ta oluşturuldu. İsterseniz siz de farklı nesneler oluşturup denemeler yapabilirsiniz.
main class'ta bir kurumsal bir bireysel müşteri oluşturuldu. Kurumsal müşteri ile test yapıldı ve sistem hatasız çalıştı.
