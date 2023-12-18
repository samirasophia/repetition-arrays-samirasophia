# Array Utilities
Arrays sind schön und recht, jedoch fehlen einige nützliche Funktionen. In dieser Aufgabe wirst du ein eine Hilfsklasse für Arrays programmieren, welche einige Operationen mit Arrays vereinfacht.

Im Package `arrays` findest du bereits die Klasse `ArrayUtils` mit leeren Methoden. Deine Aufgabe ist es, diese Methoden zu Programmieren. Es existieren bereits Tests. Führe dieses regelmässig aus, um deine Lösungen zu testen.

## Aufgaben

### Summe aller Elemente
Die Methode `sum()` erhält als Parameter ein Array von Ganzen Zahlen (`int`). Programmiere die Methode so, dass sie die Summe aller Zahlen in dem erhaltenen Array zurückgibt.
<details>
    <summary>
        Lösung. Nur nachschauen, wenn du nicht weiter kommst oder fertig bist!
    </summary>

```java
public static int sum(int[] numbers) {
    int sum = 0;
    for (Integer n : numbers) {
        sum += n;
    }
    return sum;
}
```
</details>

### Grösstes Element
Die Methode `largest()` erhält als Parameter ein Array von Ganzen Zahlen (`int`). Programmiere die Methode so, dass sie die grösste aller Zahlen in dem erhaltenen Array zurückgibt.
<details>
    <summary>
        Lösung. Nur nachschauen, wenn du nicht weiter kommst oder fertig bist!
    </summary>

```java
public static int largest(int[] numbers) {
    int largest = numbers[0];
    for (Integer n : numbers) {
        if (largest < n) {
            largest = n;
        }
    }
    return largest;
}
```
</details>

### Durchschnittliche Grösse
Die Methode `average()` erhält als Parameter ein Array von Ganzen Zahlen (`int`). Programmiere die Methode so, dass sie den Durchschnitt aller Zahlen in dem erhaltenen Array zurückgibt.<br>
Tipp: Die Summe aller elemente hast du vorhin bereits berechnet.
<details>
    <summary>
        Lösung. Nur nachschauen, wenn du nicht weiter kommst oder fertig bist!
    </summary>

```java
public static double average(int[] numbers) {
    return (double) sum(numbers) / numbers.length;
}
```
</details>

### Array umdrehen
Die Methode `reverse()` erhält als Parameter ein Array von Ganzen Zahlen (`int`). Programmiere die Methode so, dass sie ein neues Array zurückgibt, welches die Elemente in umgekehrter Reihenfolge beinhaltet. Also `[2, 42, 1, 5] => [5, 1, 42, 2]`.
<details>
    <summary>
        Lösung. Nur nachschauen, wenn du nicht weiter kommst oder fertig bist!
    </summary>

```java
public static int[] reverse(int[] numbers) {
    int[] newNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        newNumbers[newNumbers.length - 1 - i] = numbers[i];
    }
    return newNumbers;
}
```
</details>

### Arrays zusammenrechnen
Die Methode `add()` erhält als Parameter zwei Arrays von Ganzen Zahlen(`int`). Programmiere die Methode so, dass sie von den Beiden Arrays jeweils die Elemente an derselben Position zusammenrechnet und in ein neues Array Speichert. Die Methode soll dann das neue Array zurückgeben. <br>
Folgend ein Beispiel Code zur Anwendung der `add()`-Methode.
```java
int[] arr1 = {15, 8, 3};
int[] arr2 = {-5, 6, 0};

int[] result = ArrayUtils.add(arr1, arr2);
System.out.println(Arrays.toString(result)); // [10, 14, 3]
```
Schreibe den Test zu dieser Methode in der Testklasse.
<details>
    <summary>
        Lösung. Nur nachschauen, wenn du nicht weiter kommst oder fertig bist!
    </summary>

```java
public static int[] add(int[] a, int[] b) {
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        result[i] = a[i] + b[i];
    }
    return result;
}
```
</details>