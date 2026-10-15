## Aufgabe 04_1 — Aktenordner: Preisberechnung

Schreiben Sie ein Programm, um den **Preis für Bestellungen von Aktenordnern** zu berechnen und auszugeben.

Das Programm liest die **Bestellmenge** als Eingabe ein. Der **Listenpreis** für einen Aktenordner liegt bei **9,99 EUR**.

Folgende **Rabatte** werden gewährt:

- **1 %** Rabatt ab einer Stückzahl von **50**
- **3 %** ab **100**
- **5 %** ab **200**

Auf den berechneten **Netto-Betrag** werden **19 % MwSt.** gerechnet.

Zusätzlich fallen **Frachtkosten** in Höhe von **99,99 EUR** an, **es sei denn**, der **Bestellwert** (inklusive Rabatt und MwSt.) liegt **über 1000 EUR**.

Das Ergebnis soll auf **zwei Stellen kaufmännisch gerundet** werden.

**Hinweis zum Testen**

Der Preis für eine Bestellmenge von **80** Aktenordnern liegt inklusive Rabatt, MwSt. und Frachtkosten rechnerisch bei **1041,52752 EUR** und auf zwei Stellen kaufmännisch gerundet bei **1041,53 EUR**.

**Anforderungen**

- Listenpreis, Rabattgrenzen, MwSt.-Satz, Frachtkosten und Freigrenze sinnvoll im Programm fassen (z. B. Konstanten).
- Die Berechnungsreihenfolge (Netto → Rabatt → MwSt. → Fracht) der Aufgabenstellung entsprechend umsetzen.
- Programm **testen** (u. a. mit der Bestellmenge 80).

**Hinweise**

- Eingabe und Ausgabe über die Konsole.
- Klassenname und Dateiname müssen zusammenpassen (wie in den bisherigen Übungen).
