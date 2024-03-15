# Kino veebirakendus
See projekt on valminud seoses CGI 2024 praktika proovitööga. <br>
Ülesandeks oli luua kinokülastajale filmi ning saalis istekohtade soovitamise veebirakendus.

Programmi käivitamine (Intellij's):
1. käivita kinoapplication, mis asub backend/src/main/java/org/example/kino/KinoApplication.java
2. Liigu terminalis kausta "frontend".
3. Kirjuta terminali "npm install"
4. Kirjuta terinali "npm run serve"
NB: Kindlasti tuleb käivitada enne kinoapplication.java kui teha npm run serve (portide pärast).

Minu kogemus:
Tegin seda projekti kokku umbes 16h. Minu jaoks oli kõige raskem projekti ülesseadmine, kuna Spring Boot ning h2 olid minu jaoks täiesti võõrad, selletõttu kulus nende õppimise peale kõige rohkem aega (üle poole ajast, mil seda projekti tegin). Paar päeva enne proovitöö lahendamist vaatasin YouTube’is erinevaid videod Spring Booti ja h2 andmebaasi kohta. Backendi seadistamisel oligi kõige rohkem abi YouTube videotest, kasutasin veidi ka tehisintellekti abi ja nõu. <br>
Kuna backendi tööle saamine võttis suurema osa minu ajast, siis ma ei jõudnud frontendile niipalju keskenduda kui oleksin soovinud. Vue jaoks vajaminevate alusfailide (index.js, main.js, app.vue) loomisel spikerdasin korrektset ülesehitust enda varasemalt loodud ülikooli projekti frontendi failidest. Frontendiga tegelemine oli minu jaoks kõige nauditavam ja mugavam. <br>
Lõpuks jõudsin teha kasutaja(watcher) andmebaasi tabeli, kuid ei jõudnud seda rakendada. Oleksin tahtnud juurde teha nö sisselogimise ekraani, kus saab valida, mis kasutajana soovid siseneda. Sellega oleks võimalik olnud ka ajaloo põhjal filmide soovitamine. Andmebaasi selle jaoks sain tööle, aga funktsionaalsuse tegemiseks jäi aega napiks.
