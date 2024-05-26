# Втора лабораториска вежба по Софтверско инженерство

## Матеа Манова 223088

##  Control Flow Graph
#![FINAL](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/b4730d05-ce56-4f4e-bed6-28f18ee6ee23)

### Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10. 

### Тест случаи според критериумот  Every branch
![BRANCHES](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/cb9eb738-7354-45f1-a705-4c442e8a62fe)

### Објаснување на Every branch
1. allItems = null - Ќе се фрли RuntimeException("allItems list can't be null!")
2. allItems = [Item(Name = null, Barcode = 027, Price = 301, Discount = 0,1),
   Item((Name = tashnicka, Barcode = 313, Price = 299, Discount = 0)],
   Payment = 7777 - Има листа од два објекти и рayment е поголемо од sum и затоа се враќа true.
3. allItems = [Item(Name = null, Barcode = 027, Price = 301, Discount = 0,1),
   Item((Name = tashnicka, Barcode = 313, Price = 299, Discount = 0)],
   Payment = 7 - рayment е помало од sum и затоа се враќа false.
4. allItems = [Item(Name = null, Barcode = ?, Price = 301, Discount = 0),
   Payment = 7 - Вредноста на баркодот не е соодветна затоа се фрла RuntimeException("Invalid character in item barcode!")
5. allItems = [Item(Name = null, Barcode = ?, Price = 301, Discount = 0),
Payment = 7 - Вредноста на баркодот е null и се фрла RuntimeException("No barcode!")

###Тест случаи според критериумот Multiple Condition
![kombinacii](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/cf7dd539-36ac-492f-88f3-474013fbc155)

### Објаснување на Multiple Condition
1. allItems = [Item(Name = maicka, Barcode = 027, Price = 301, Discount = 0,1), payment = 241      = true && true && true, ќе продолжи да се извршува во if-условот
2. allItems = [Item(Name = farmercinja, Barcode = 270, Price = 301, Discount = 0,1), payment = 241 = true && true && false, нема да продолжи да се извршува во if-условот
3. allItems = [Item(Name = tashnicka, Barcode = 270, Price = 301, Discount = 0), payment = 241     = true && false && false, нема да продолжи да се извршува во if-условот
4. allItems = [Item(Name = paticinja, Barcode = 270, Price = 299, Discount = 0), payment = 241     = false && false && false, нема да продолжи да се извршува во if-условот
