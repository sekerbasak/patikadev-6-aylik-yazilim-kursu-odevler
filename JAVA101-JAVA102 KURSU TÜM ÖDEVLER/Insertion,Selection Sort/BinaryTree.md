## Binary Search Tree=>Bir düğüm her iki tarafa da referans verebiliyor. Sağ ve sol olarak. Sağ tarafından kendinden büyük elemanlar, sol tarafında ise kendinden küçük elemanlar bulunacak.

Dizimiz: [7, 5, 1, 8, 3, 6, 0, 9, 4, 2]
Bu diziye göre Binary Search Tree (BST) oluşturulması aşağıdaki gibi olacaktır:

İlk eleman 7'yi root olarak alırız.
İkinci eleman 5, root'tan küçük olduğu için sol çocuk olur.
Üçüncü eleman 1, 5'ten küçük olduğu için 5'in sol çocuğu olur.
Dördüncü eleman 8, root'tan büyük olduğu için sağ çocuk olur.
Beşinci eleman 3, 1'den büyük ama 5'ten küçük olduğu için 1'in sağ çocuğu olur.
Altıncı eleman 6, 5'ten büyük ama 7'den küçük olduğu için 5'in sağ çocuğu olur.
Yedinci eleman 0, 1'den küçük olduğu için 1'in sol çocuğu olur.
Sekizinci eleman 9, root'tan ve 8'den büyük olduğu için 8'in sağ çocuğu olur.
Dokuzuncu eleman 4, 3'ten büyük ama 5'ten küçük olduğu için 3'ün sağ çocuğu olur.
Onuncu eleman 2, 1'den büyük ama 3'ten küçük olduğu için 3'ün sol çocuğu olur.
Bu işlemlerin sonunda oluşturulan Binary Search Tree aşağıdaki gibi olur: markdownCopy code

       7  
      / \
     5   8
    / \   \
   1   6   9 
  / \   
 0   3  
    / \
   2   4  