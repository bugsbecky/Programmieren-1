# Programmieren 1 | Übung 02 — Datentypen & Variablen

Diese Übung vertieft **primitive Datentypen**, **Variablendeklaration**, **Namenskonventionen** und **Literale** in Java (inkl. Gleitkomma-Exponentialschreibweise und Grenzen von `long`).

Empfohlene Ordnerstruktur (analog zu Übung 01):

| Ordner    | Aufgabe | Vorschlag Dateiname        |
|-----------|---------|----------------------------|
| `task-01` | 02_1    | z. B. `PersonalData.java`  |
| `task-02` | 02_2    | z. B. `LongLimits.java`    |
| `task-03` | 02_3    | z. B. `FloatingSum.java`   |

Kompilieren und ausführen (im jeweiligen Aufgabenordner):

```bash
javac Dateiname.java
java Dateiname
```

---

## Aufgabe 02_1 — Persönliche Daten ausgeben

Schreiben Sie ein Java-Programm, das für die folgenden Daten **geeignete Variablen** deklariert:

- Vorname  
- Nachname  
- Geburtsjahr  
- Geschlecht (z. B. `m`, `w` oder `d`)  
- Name des Studiengangs  
- Aktuelles Semester  
- Angabe, ob es sich um das **Erststudium** handelt oder nicht  
- Preis für das letzte Mensa-Essen in **EUR**

**Anforderungen**

- Passende **Datentypen** wählen (z. B. `String`, `int`, `char`/`String`, `boolean`, `double`).  
- **Namenskonventionen** für Variablen beachten (`camelCase`, aussagekräftige Namen).  
- Variablen mit **eigenen persönlichen Werten** initialisieren.  
- Alle Variablen auf der Konsole ausgeben; vor jeder Zeile ein **beschriftender Text**, damit erkennbar ist, welche Variable ausgegeben wird.

**Beispielausgabe**

```
Vorname: Donald
Nachname: Duck
Geburtsjahr: 1934
Geschlecht: m
Studiengang: Enteninformatik
Semester: 1
Erststudium: true
Mensa-Essen: 3.8
```

**Hinweise**

- `System.out.println("Label: " + variable);` verknüpft Text und Wert.  
- Für `boolean` erscheint in der Ausgabe `true` oder `false`.  
- Mensa-Preis als `double` (Dezimalpunkt, nicht Komma).

---

## Aufgabe 02_2 — Grenzen des Typs `long`

Schreiben Sie ein Java-Programm, das die **kleinste** und die **größte** ganze Zahl vom Datentyp `long` als **Literal** auf der Konsole ausgibt.

**Anforderungen**

- Die exakten Werte mit einem geeigneten Hilfsmittel ermitteln (z. B. JDK-Dokumentation, `Long.MIN_VALUE` / `Long.MAX_VALUE` in der interaktiven Shell, oder Referenz in den Vorlesungsunterlagen).  
- Die Zahlen im Programm als **`long`-Literale** verwenden (bei sehr großen positiven Werten: Suffix `L`).

**Typische Ausgabe (zur Kontrolle)**

- Minimum: `-9223372036854775808`  
- Maximum: `9223372036854775807`  

Optional können Sie dieselben Konstanten aus der Klasse `java.lang.Long` ausgeben und mit Ihren Literalen vergleichen.

---

## Aufgabe 02_3 — Summe mit Exponentialschreibweise

### a) Programm

Schreiben Sie ein Java-Programm, das die folgende Summe berechnet und ausgibt. Nutzen Sie die **Exponentialschreibweise** für Gleitkommazahlen (`double`):

\[
2{,}34 \cdot 10^{6} + 3{,}45 + 4{,}56 \cdot 10^{-6} + 5{,}67 \cdot 10^{-12}
\]

**Java-Literale (Beispiel)**

| Term        | Schreibweise in Java |
|-------------|----------------------|
| \(2{,}34 \cdot 10^{6}\)   | `2.34e6`   |
| \(3{,}45\)                | `3.45`     |
| \(4{,}56 \cdot 10^{-6}\)  | `4.56e-6`  |
| \(5{,}67 \cdot 10^{-12}\) | `5.67e-12` |

Rechnen Sie in einem Ausdruck oder in Zwischenschritten; geben Sie das **Ergebnis** auf der Konsole aus.

### b) Reflexion (schriftlich, z. B. im README der Aufgabe oder als Kommentar)

Liefert das Programm das Ergebnis, das nach den Regeln der **exakten Mathematik** zu erwarten wäre? **Begründen Sie mathematisch.**

**Orientierung für die Begründung (ohne fertige Lösung)**

- In der Mathematik sind alle vier Summanden von unterschiedlicher Größenordnung; die exakte Summe enthält Beiträge aller Terme.  
- `double` arbeitet mit **begrenzter Genauigkeit** (IEEE-754, ca. 15–16 signifikante Dezimalstellen).  
- Der Term \(2{,}34 \cdot 10^{6}\) dominiert die Summe; sehr kleine Terme (\(10^{-6}\), \(10^{-12}\)) können beim Addieren zu einem so großen Zwischenwert **nicht mehr vollständig** in der Mantisse repräsentiert werden (**Auslöschung / Rundung**).  
- Vergleichen Sie: exakte rationale Rechnung bzw. grobe Größenordnung der Summe vs. tatsächliche Programmausgabe.

---

## Kurzüberblick: relevante Datentypen (Übung 02)

| Datentyp   | Typische Verwendung in dieser Übung      |
|------------|------------------------------------------|
| `String`   | Namen, Studiengang, ggf. Geschlecht      |
| `int`      | Geburtsjahr, Semesterzahl                |
| `char`     | einzelnes Geschlechtszeichen             |
| `boolean`  | Erststudium ja/nein                      |
| `double`   | Mensa-Preis, Gleitkomma-Summe            |
| `long`     | sehr große ganze Zahlen (Aufgabe 02_2)   |

---

## Lernziele

Nach Bearbeitung der Übung sollten Sie

- primitive Typen passend zur Bedeutung der Daten wählen können,  
- Variablen deklarieren, initialisieren und formatiert ausgeben können,  
- `long`- und Gleitkomma-Literale (inkl. `e`-Notation) lesen und schreiben können,  
- Grenzen numerischer Typen und Rundung bei `double` einordnen können.
