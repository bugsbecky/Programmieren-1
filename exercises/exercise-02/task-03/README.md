## Aufgabe 02_3 — Summe mit Exponentialschreibweise

### a) Programm

Schreiben Sie ein Java-Programm, das die folgende Summe berechnet und ausgibt. Nutzen Sie die **Exponentialschreibweise** für Gleitkommazahlen (`double`):

Rechnung: 2,34 * 10⁶ + 3,56 * 10⁻6 + 5,67 * 10⁻12

**Java-Literale (Beispiel)**

| Term          | Schreibweise in Java |
|---------------|----------------------|
| 2,34 * 10^6   | `2.34e6`   |
| 3,45          | `3.45`     |
| 4,56 * 10^-6  | `4.56e-6`  |
| 5,67 * 10^-12 | `5.67e-12` |

Rechnen Sie in einem Ausdruck oder in Zwischenschritten; geben Sie das **Ergebnis** auf der Konsole aus.

Ergebnis Terminal: 2340003.4500045604
Ergebnis Taschenrechner: 2340003,4500045604

### b) Reflexion (schriftlich, z. B. im README der Aufgabe oder als Kommentar)

Liefert das Programm das Ergebnis, das nach den Regeln der **exakten Mathematik** zu erwarten wäre? **Begründen Sie mathematisch.**

Das Regebnis ist identisch mit dem vom Taschenrechner.

**Orientierung für die Begründung (ohne fertige Lösung)**

- In der Mathematik sind alle vier Summanden von unterschiedlicher Größenordnung; die exakte Summe enthält Beiträge aller Terme.  
- `double` arbeitet mit **begrenzter Genauigkeit** (IEEE-754, ca. 15–16 signifikante Dezimalstellen).  
- Der Term (2,34 * 10^6) dominiert die Summe; sehr kleine Terme (10^-6/10^-12) können beim Addieren zu einem so großen Zwischenwert **nicht mehr vollständig** in der Mantisse repräsentiert werden (**Auslöschung / Rundung**).  
- Vergleichen Sie: exakte rationale Rechnung bzw. grobe Größenordnung der Summe vs. tatsächliche Programmausgabe.