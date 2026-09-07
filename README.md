# XyronTab

Premium Tab-Menü, Scoreboard, Team- & Rang-System für Paper 1.21.1

## Build in IntelliJ IDEA

1. Ordner `xyron-tab-plugin` in IntelliJ öffnen (`File → Open`)
2. Warten bis Maven die Paper-API automatisch runterlädt (Internet nötig)
3. Rechts am Rand auf den **Maven**-Tab klicken
4. `xyron-tab → Lifecycle → package` doppelklicken
5. Fertige Datei liegt in: `target/xyron-tab-1.0.0.jar`
6. Diese .jar in den `plugins/`-Ordner deines Paper-Servers legen, Server neu starten

## Befehle

- `/team create|invite|accept|leave|delete|rename|list` — Team-Verwaltung
- `/settings` — eigene Einstellungen
- `/settings op` — Admin-Panel

## Features

- Premium Tab-Liste mit Header/Footer
- Scoreboard mit Live-Daten
- Team-System
- Rang-System
- Admin-Panel
