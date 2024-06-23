# Java Basic Programs

#### 1st - Print All Fibonacci Number Till N
```
#### [PC:Que-15 & Sol-16]  
# E.g. - 0 1 1 2 3 5 8 13 21 34 
```

#### 2nd - Count Digits in a Number
```
#### [PC:Que-17 & Sol-18]  

# E.g. Digit 
int a = 65784383;
digit count = 8.
```

### 3rd - Digits of a number
```
#### [PC:Que-19 & Sol-20]

E.g.
int n = 754 
7
5
4

Get digit count and divide n by q = Math.pow(10, count-1)-> 100 {n/q}

E.g.
d = 65784383
d1
d2
d3
...digits of the number.

Print all digit left to right with different line.
Sample Input
E.g. - 65784383
Sample Output
6
5
7
8
4
3
8
3
```

#### 4th - Reverse a Number
```
#### [PC:L-20 => Que-21 & Sol-22]  

# E.g.  
int n = 65784383
3 8 3 4 8 7 5 6
```

#### 5th - Inverse of a number
![Inverse Image](../assets/inversenumberque.png)
![Inverse Example](../assets/inversenumber.png)
```
#### [PC:L-22 => Que-23 & Sol-24]  

# E.g.
Input Format  
int n
'n' where n is any integer value.  
int i 
'i' where i is inverted number.

Sample Input
n = 426135

Sample Output
i = 416253

Number should be according to digits (6 digit number [1-6]), it should not be miss any digit and beyond the digit.
e.g 5 digit number we have.
then n = 426135
we cannot use number like this 426137;
```

#### 6th - Rotate a number
![Inverse Image](../assets/rotateanumberque.png)
![Inverse Image](../assets/rotateanumber.png)
#### [PC:L-24 => Que-25 & Sol-26]

```  
# E.g.
Input Format  
int n
'n' where n is any integer value.  
int i 
'k' where k is integer number. 
Note:- k indicates from which the number we have to rotate the number n.

Output format
int r
'r' where r is rotated number

Sample Input
n = 23457
k = 2
Sample Output
r = 57234

number format note:
n = 12340056
k = 3
r = 05612340

Note:-
if number contains '0' and kth rotation number indicates to start rotation from 0th number. 
and then we rotate the number. after that rotate number start with zero, 
then number's first zero would not show in result. 

```

#### 7th - GCD and LCM
![Inverse Image](../assets/gcdandlcmque.png)
![Inverse Image](../assets/gcdandlcm.png)
![Inverse Image](../assets/gcdandlcm1.png)
#### [PC:L-26 => Que-27 & Sol-28]

```  
# E.g.
Input Format  
int n1
'n1' where n1 is any integer value.  
int n2 
'n2' where n2 is any integer value.

Output format
int GCD;
int LCM; 

Sample Input
n1 = 36
n2 = 24
Sample Output
GCD = 12
LCM = 72

int on1;
int on2;
on1 and on2 are contains n1 and n2 original number.

Calculate GCD and LCM (Formula)
if we have GCD or LCM
LCM(n1, n2) = (n1 * n2) / GCD(n1, n2)

```

#### 8th - Prime Factorization

![Inverse Image](../assets/primefactorizationque.png)
![Inverse Image](../assets/primefactorization.png)
#### [PC:L-28 => Que-29 & Sol-30]

```  
# E.g.
Input Format    
int n
'n' where n is any integer value.  

Output Format
p1 p2 p3 p4.... All prime factors of n.

Sample Input
n = 1440
Sample Output
int a = 2 2 2 2 2 3 3 5
```
