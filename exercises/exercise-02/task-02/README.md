## Aufgabe 02_2 — Grenzen des Typs `long`

Schreiben Sie ein Java-Programm, das die **kleinste** und die **größte** ganze Zahl vom Datentyp `long` als **Literal** auf der Konsole ausgibt.

**Anforderungen**

- Die exakten Werte mit einem geeigneten Hilfsmittel ermitteln (z. B. JDK-Dokumentation, `Long.MIN_VALUE` / `Long.MAX_VALUE` in der interaktiven Shell, oder Referenz in den Vorlesungsunterlagen).  
- Die Zahlen im Programm als **`long`-Literale** verwenden (bei sehr großen positiven Werten: Suffix `L`).

**Typische Ausgabe (zur Kontrolle)**

- Minimum: `-9223372036854775808`  
- Maximum: `9223372036854775807`  

Optional können Sie dieselben Konstanten aus der Klasse `java.lang.Long` ausgeben und mit Ihren Literalen vergleichen.

## Kurzüberblick: relevante Datentypen (Übung 02)

| Datentyp   | Typische Verwendung in dieser Übung      |
|------------|------------------------------------------|
| `String`   | Namen, Studiengang, ggf. Geschlecht      |
| `int`      | Geburtsjahr, Semesterzahl                |
| `char`     | einzelnes Geschlechtszeichen             |
| `boolean`  | Erststudium ja/nein                      |
| `double`   | Mensa-Preis, Gleitkomma-Summe            |
| `long`     | sehr große ganze Zahlen (Aufgabe 02_2)   |