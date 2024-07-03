# Java Basic Pattern

#### 1st - Pattern-1

![Pattern-1 Image](../assets/pattern/patternque1.1.png)
![Pattern-1 Image](../assets/pattern/patternque1.2.png)

```
Input Format
int n = 5;

Output Format
*
*   *
*   *   *
*   *   *   *
*   *   *   *   *
```

#### 2nd - Pattern-2

![Pattern-2 Image](../assets/pattern/patternque2.1.png)
![Pattern-2 Image](../assets/pattern/patternque2.2.png)

```
Input Format
int n = 5;

Output Format
*   *   *   *   *
*   *   *   *
*   *   *
*   *
*
```

#### 3rd - Pattern-3

![Pattern-3 Image](../assets/pattern/patternque3.1.png)

```
Input Format
int n = 5;

Output Format
                *
            *   *
        *   *   *
    *   *   *   *
*   *   *   *   *
```

#### 4th - Pattern-4

![Pattern-4 Image](../assets/pattern/patternque4.1.png)
![Pattern-4 Image](../assets/pattern/patternque4.2.png)

```
Input Format
int n = 5;

Output Format
*   *   *   *   *
    *   *   *   *
        *   *   *
            *   *
                *                
```

#### 5th - Pattern-5
![Pattern-5 Image](../assets/pattern/patternque5.1.png)

```
Input Format
int n = 5;

Output Format
        *
    *   *   *                     
*   *   *   *   *
    *   *   *
        *
```

#### 6th - Pattern-6
![Pattern-6 Image](../assets/pattern/patternque6.1.png)

```
Input Format
int n = 5;

Output Format

*   *   *       *   *   *
*   *               *   *
*                       *
*   *               *   *
*   *   *       *   *   *   

```

#### 7th - Pattern-7
![Pattern-7 Image](../assets/pattern/patternque7.1.png)

```
Input Format
int n = 5;

Output Format

*   
    *
        *
            *
                *   

11  12  13  14  15   
*   *   *   *   *
21  22  23  24  25
*   *   *   *   *
31  32  33  34  35
*   *   *   *   *
41  42  43  44  45
*   *   *   *   *
51  52  53  54  55
*   *   *   *   *


(i == j)

```

#### 8th - Pattern-8
![Pattern-8 Image](../assets/pattern/patternque8.1.png)
![Pattern-8 Image](../assets/pattern/patternque8.2.png)

```
Input Format
int n = 5;

Output Format
  
                *
            *                   
        *
    *
*
    
    j
i   1   2   3   4   5   
1   *   *   *   *   *
2   *   *   *   *   *
3   *   *   *   *   *
4   *   *   *   *   *
5   *   *   *   *   *


(i + j == n + 1)

```

#### 9th - Pattern-9
![Pattern-9 Image](../assets/pattern/patternque9.1.png)

```
Input Format
int n = 5;

Output Format

*               *
    *       *
        *
    *       *
*               *


((i == j) && (i + j == n + 1))
```

#### 10th - Pattern-10
![Pattern-10 Image](../assets/pattern/patternque10.1.png)
![Pattern-10 Image](../assets/pattern/patternque10.2.png)

```
Input Format
int n = 5;

Output Format

        *
    *       *
*               *           
    *       *
        *
        
Note:-
Manage Outer Space and Inner Space
is      os
2       -1
1        1
0        3
1        1   
2       -1

print outer space then star(without iteration) after that inner space again star(with condition).

if (i <= n / 2) {
    sp1--;
    sp2 += 2;
  } else {
    sp1++;
    sp2 -= 2;
  }
        
```
