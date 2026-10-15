## Aufgabe 04_2 — Dreieck: Eigenschaften prüfen

Schreiben Sie ein Programm, das die **Seitenlängen eines Dreiecks** einliest (in **cm**, mit Nachkommastellen) und folgende **Eigenschaften** ausgibt:

- **Gültig:** Ein Dreieck ist gültig, wenn **keine** Summe zweier Seitenlängen **kleiner oder gleich** der dritten Seitenlänge ist.
- **Gleichseitig:** Ein Dreieck ist gleichseitig, wenn es gültig ist und wenn **alle drei** Seitenlängen gleich sind.
- **Gleichschenkelig:** Ein Dreieck ist gleichschenkelig, wenn es gültig ist und wenn **zwei** Seitenlängen gleich sind.
- **Rechtwinkelig:** Ein Dreieck ist rechtwinkelig, wenn es gültig ist und wenn die Gleichung **c² = a² + b²** erfüllt ist, wobei **c** die **längste** der drei Seiten ist.

Beachten Sie, dass ein Dreieck **mehrere Eigenschaften gleichzeitig** haben kann, z. B. kann ein Dreieck gleichzeitig rechtwinklig und gleichschenkelig sein. Gleichseitige Dreiecke sind auch immer gleichschenkelig.

**Hinweis zum Testen**

Ein Beispiel für ein **rechtwinkeliges** Dreieck ist ein Dreieck mit den Seitenlängen **3,0**, **4,0** und **5,0** cm.

**Anforderungen**

- Für jede Eigenschaft eine klare Ausgabe (z. B. ob sie zutrifft oder nicht — Format wie in Ihren bisherigen Übungen konsistent halten).
- Ungültige Dreiecke: Eigenschaften wie gleichseitig oder rechtwinkelig sollten **nicht** fälschlich als erfüllt gelten.
- Programm **testen** mit dem Beispiel 3 / 4 / 5 sowie weiteren Fällen (gleichseitig, ungültig, gleichschenkelig ohne rechtwinklig).

**Hinweise**

- Bei Gleitkommazahlen kann ein exakter Vergleich auf Gleichheit problematisch sein — überlegen Sie, wie Sie das bei der Rechtwinkligkeitsprüfung handhaben.
- Klassenname und Dateiname müssen zusammenpassen.
