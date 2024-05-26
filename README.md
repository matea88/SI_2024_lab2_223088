# Втора лабораториска вежба по Софтверско инженерство

## Матеа Манова 223088

##  Control Flow Graph
#![FINAL](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/b4730d05-ce56-4f4e-bed6-28f18ee6ee23)

### Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10. 

### Тест случаи според критериумот  Every branch
![branches_final](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/0bf050d5-269a-4230-a950-2c738d919038)


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
5. allItems = [Item(Name = null, Barcode = null, Price = 301, Discount = 0),
Payment = 7 - Вредноста на баркодот е null и се фрла RuntimeException("No barcode!")

###Тест случаи според критериумот Multiple Condition
![kombinacii_final](https://github.com/matea88/SI_2024_lab2_223088/assets/163212679/c1cc6c10-df46-4e06-9333-4b8db202ff5b)


### Објаснување на Multiple Condition
1. allItems = [Item(Name = maicka, Barcode = 027, Price = 301, Discount = 0,1), payment = 241     = true && true && true, ќе продолжи да се извршува во if-условот
2. allItems = [Item(Name = farmercinja, Barcode = 270, Price = 301, Discount = 0,1), payment = 24 = true && true && false, нема да продолжи да се извршува во if-условот
3. allItems = [Item(Name = tashnicka, Barcode = 270, Price = 301, Discount = 0), payment = 241    = true && false && false, нема да продолжи да се извршува во if-условот
4. allItems = [Item(Name = paticinja, Barcode = 270, Price = 299, Discount = 0), payment = 241    = false && false && false, нема да продолжи да се извршува во if-условот
