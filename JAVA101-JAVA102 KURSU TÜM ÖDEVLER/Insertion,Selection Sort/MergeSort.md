## Bir listeyi her adımda parçaya ayırıp tek eleman kalıncaya kadar bölüyor. Böldükten sonra sıralı bir şekilde bize sunuyor 

**dizimiz**: [16,21,11,8,12,22]
          /          \
      [16,21,11]    [8,12,22]
        /    \      /     \
 [16,21]   [11]    [8,12]  [22]
      \    /         \     /
       [11,16,21]     [8,12,22]
            \            /
         [8,11,12,16,21,22]

**Big O Notasyonu**=> **O(nlogn)**