## Aufgabe 03_3 — Mobilfunktarif: Jahreskosten

Gegeben sei ein Mobilfunktarif mit folgenden Konditionen:

- **Monatliche Grundgebühr:** 9,95 EUR  
- **Datenvolumen:** 5 GB inklusive, danach **2,95 EUR** je **500 MB**  
- **Telefonie:** 100 Minuten inklusive, danach **9 Cent** je Minute  

Schreiben Sie ein Programm, das vom Benutzer das **monatliche Datenvolumen in GB** (ohne Nachkommastellen) und die **Anzahl der monatlichen Telefonminuten** (ohne Nachkommastellen) abfragt und hierzu die **jährlichen Kosten** in dem Mobilfunktarif hochrechnet.

Da es um eine überschlägige Rechnung geht, sollen die errechneten **Jahreskosten als Euro-Beträge ohne Nachkommastellen** ausgegeben werden.

**Testwerte (zur Kontrolle)**

| Datenvolumen | Telefonminuten | Jährliche Kosten |
|--------------|----------------|------------------|
| 5 GB         | 100 Minuten    | 119 EUR          |
| 5 GB         | 150 Minuten    | 173 EUR          |
| 5 GB         | 200 Minuten    | 227 EUR          |
| 7 GB         | 100 Minuten    | 261 EUR          |
| 7 GB         | 150 Minuten    | 315 EUR          |
| 7 GB         | 200 Minuten    | 369 EUR          |
| 10 GB        | 100 Minuten    | 473 EUR          |
| 10 GB        | 150 Minuten    | 527 EUR          |
| 10 GB        | 200 Minuten    | 581 EUR          |

Testen Sie Ihr Programm u. a. mit diesen Beispielwerten.

**Reflexion**

Vermutlich liefert Ihr Programm falsche Werte, wenn **weniger als 5 GB** oder **weniger als 100 Minuten** eingegeben werden. **Warum ist das so?** (Schriftlich beantworten, z. B. in diesem README unter einer eigenen Überschrift oder als Kommentar im Quelltext — **ohne** die Lösung hier vorab einzutragen.)

**Anforderungen**

- Tarifwerte (Grundgebühr, Inklusivvolumen, Preise, Inklusivminuten) sinnvoll als Konstanten oder klar benannte Werte im Programm fassen.
- Programm **testen** mit der Tabelle oben und eigenen Eingaben.

**Hinweise**

- Klassenname und Dateiname müssen zusammenpassen.
- Achten Sie darauf, Einheiten (GB, MB, EUR, Cent) bei der Berechnung konsistent zu verwenden.
