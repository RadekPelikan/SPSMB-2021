heslo: datum
shutdown -P now (Korektní vypnutí systému)
ifconfig        (Zjištění IP adresy)
netstat -lpnt   (Zjistění portu)
apropos         (Manuál slouží pro vyhledání souvislosti)ˇ

|               (Pro přesměrování do jíného příkazu)
`příkaz` | more (Pro vypisování po stránkách)

cat /etc/passwd     (Zjištění účtů na OS)
passwd              (Změnění hesla přihlášeného účtu)
passwd `uzivatel`   (Změnění heslo uzivatele, jen z pozice root)

apt-get
    update      (Natáhne informace pro aktualizaci balíčků)
    upgrade     (Aktualizuje bezpečnosti balíčků)

apt-get install
    net-tools   
    ssh         (Balíček pro připojení vzdáleně pomocí protokolu ssh)
    man         (Balíček pro manuál)

soubory
    pwd         (Cesta v souborovým systému)
    cd          (Změna adresáře, ve kterém se uživatel nachází)
    ls          (vypsání souborů/adresářů ve kterém se nachzázím)
    ls -a       (vypsání skrytých souborů/adresářů ve kterém se nachzázím)
    touch       (Vytvoření souboru/adresáře)
    mv          (Přejmenovat/přesunout soubor/adresář)
    rm          (Odstranit soubor/adresář)

Klávesové zkratky:
    ^           control (control)
    ^l          clear
    ^d          logout
    ^r          Historie příkazů
     Procesy
        ^s      Stopnutí procesu
        ^q      Spuštění procesu
        ^c      Ukončení procesu
        ^z      Stopnutí procesu, ale vrátí mě to zpátky do konzole

     Kopírování do schránky
        ^u      Od kurzoru do leva
        ^k      Od kurzoru do prava
        ^y      Vložení ze schránky


jobs            (Zobrazení procesů)
fg `číslo`      (Spuštění procesu)

