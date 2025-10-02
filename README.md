### 📚 DSA Practice in Java
This repository contains my personal practice codes for mastering Data Structures and Algorithms (DSA) using Java.

---

# 📘 Java Sorting Short Note

---

## 🔹 1. Arrays (primitive)

```java
int[] arr = {5, 2, 8, 1};

// Ascending (default)
Arrays.sort(arr);

// Descending → manual reverse
Arrays.sort(arr);
for(int i=0; i<arr.length/2; i++){
    int tmp = arr[i];
    arr[i] = arr[arr.length-1-i];
    arr[arr.length-1-i] = tmp;
}
```
---

## 🔹 2. Arrays (Objects or 2D arrays)

```java
Integer[] arr = {5, 2, 8, 1};

// Ascending
Arrays.sort(arr);

// Descending
Arrays.sort(arr, Collections.reverseOrder());
```

For **2D array**:

```java
int[][] arr = {{21,13},{27,11},{58,32}};

// Ascending by column 1
Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));

// Descending by column 1
Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]).reversed());
```
---

## 🔹 3. ArrayList

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,8,1));

// Ascending
Collections.sort(list);

// Descending
Collections.sort(list, Collections.reverseOrder());
```

---

## 🔹 4. Strings

```java
String[] s = {"banana", "apple", "mango"};

// Lexicographic ascending
Arrays.sort(s);

// Lexicographic descending
Arrays.sort(s, Collections.reverseOrder());
```

---

## 🔹 5. Custom Objects

```java
class Student {
    String name; int marks;
    Student(String n, int m){ name=n; marks=m; }
}

ArrayList<Student> list = new ArrayList<>();
list.add(new Student("A",80));
list.add(new Student("B",95));
list.add(new Student("C",70));

// By marks ascending
list.sort(Comparator.comparingInt(s -> s.marks));

// By marks descending
list.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());

// By name
list.sort(Comparator.comparing(s -> s.name));
```

---

## 🔹 6. PriorityQueue (Heap)

```java
// Min-Heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max-Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```
---

## 🔹 7. TreeMap & TreeSet (Sorted automatically)

```java
TreeMap<String,Integer> map = new TreeMap<>(); // Sorted by key (ASC)
TreeSet<Integer> set = new TreeSet<>();        // Sorted (ASC)
```

 For descending:

```java
TreeMap<String,Integer> map = new TreeMap<>(Collections.reverseOrder());
```

---

