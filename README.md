# MD5-ve-SHA1-Hashleme

Verilen String değerini MD5 ve SHA1 algoritması ile hashleyip yine string olarak dönderen metotlar eklendi.
<br />
Sql select sorgusu ile de hashleme yapılabilir
```
select convert(varchar(40) , HASHBYTES('SHA1' ,'hashlenecek değer') , 2)```
