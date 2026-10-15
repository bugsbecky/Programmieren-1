## Aufgabe 04_3 — Datum: Gültigkeit prüfen

Schreiben Sie ein Programm, das ein **Datum** in Form dreier Zahlen für **Tag** (1–31), **Monat** (1–12) und **Jahr** einliest.

Das Programm soll prüfen und ausgeben, ob es sich um ein **gültiges Datum** handelt.

Ein gültiges Datum liegt vor, wenn der **Monat** zwischen **1** und **12** liegt und der **Tag** zwischen **1** und dem **letzten Tag des Monats**. Der letzte Tag des Monats ist abhängig vom Monat:

- **31** für die Monate Januar, März, Mai, Juli, August, Oktober und Dezember
- **30** für die Monate April, Juni, September, November
- **28** für den Monat Februar bzw. **29** im Falle eines **Schaltjahres**

Ein Jahr ist ein **Schaltjahr**, wenn es **durch 4 teilbar** ist. Jahre, die **durch 100**, aber **nicht durch 400** teilbar sind, sind **keine** Schaltjahre.

**Anforderungen**

- Ungültige Monate (z. B. 0 oder 13) und ungültige Tage (z. B. 31. April, 29.02. in einem Nicht-Schaltjahr) korrekt erkennen.
- Schaltjahrregel vollständig umsetzen (inkl. Jahre wie 1900 und 2000 als Testideen).
- Programm **testen** mit gültigen und ungültigen Daten.

**Hinweise**

- Eingabe und Ausgabe über die Konsole.
- Klassenname und Dateiname müssen zusammenpassen.
