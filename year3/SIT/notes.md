http://toolkit.g6.cz
hhtps://wintelguy.com
https://samuraj-cz.com

routování - 3. vrstva - sítová - hledání cesty pro propojení sítí

router - přístup do internetu

LAN - local area network
IPv4 - 4 miliardy adres (2^32)
     - adresa musí být unikátní (jednoznačná)
     - 3 skupiny (rozsahy) privátních adres: 
						1) 10.0.0.0 /8
						2) 172.16.0.0 /12
				   	    3) 192.168.0.0 /16
OKTET - část IP adresy 8 bitů
Broadcast je doručen všem zažízením v místní síti. Posledí z daného rozsahu

Routovací protokoly
	statické - nadefinovaná cesta z bodu A do bodu B
		- při přerušení spojení cesta zmizí
		- využití pouze u malých sítí
	dynamické - nejčastější
		- reaguje na změny v topologii
		- pokud se cesta přeruší najde se nová
		- 2 kategorie: 
			1)Exterior gateway Protocol
				- BGP
				- path vector
				- propojuje autonomní systémy
				- velké sítě (O2, Vodafon,...)
			2) Interior gateway Protocol
				- uvnitř Autonomního systému
				- dělí se na: 
					1) Distance vector
						- hledá nejmenší počet hopů
						- RIP, RIP2, RIPNG
						- IGRP, EIGRP
					2) Link state
						- hledá nejlepší kvalitu (nejrychlejší) spoje
						- IS-IS
						- OSPF
	defaultní - používá se na přestup do internetu
		- samé nuly

RIP protokol
	- max 15 hopů
	- 1 = broadcast
	- 2 = multicast
multicast adresa - 224.0.0.9

Autonomní systém
	- rozsálhá síť pro jednu správu (mobilní operátoři), EGP

VLSM = Variable Length Subnet Masking
     = variabilní maska
     - nezbytné z důvodu nedostatku adres

Subneting
  - počítání použitelných IP adres
  - první a poslední adresa nelze použít pro hosta, broadcast...
  - použitelných adres je vždy o 2-3 méně
  - začínáme subnetem s největším počtem hostů
  - zvětšujeme prefix o 1 a půlíme počet možných adres
  - poslední reálně použitelný prefix je 30
  - pro propojení routrů vždy prefix 30

  	prefix - počet adres - použitelné adresy
	30     - 4           - 2
	29     - 8           - 6
    28     - 16          - 14
	27     - 32          - 30
	26     - 64          - 62
	25     - 128         - 126
	24     - 256         - 254
    --------------------------------------
	23     - 512         - 510
	...
	Python script pro tabulku
	
	for i in range(30, 10, -1):
   		n = 2 ** (32 - i)
    	print(f"{i:2}\t{n:8}\t{n-2:8}")

Port je 16ti bitové číslo
IPv4 je 32 bitové číslo
IPv6 je 64 bitové číslo

Cisco router:
	mody:
		Router> 		(uživatelský mod)
		Router# 		(privilegovaný mod)
		Router(config)# (globální konfigurační mod)
	příkazy:
		enable					dostat se do privilegovaného modu
		configure terminal		dostat se do globání konfigurace
		exit					hodí do nižšího modu
		?						help
	 příkazy privilegovaný:
		copy `odkud` `kam`			kopírování odkud kam (running-config startup-config)
		write						kopírování z running config do startup config
		show ip route				Zobrazí routovací tabulku
		show ip protocols			Zobrazí routovací protokol

	 příkazy globální:
		no ip domain lookup					Zruší překládání příkazu přes DNS server
		interface `port`		nastavení modulu (s0/0/0)
			ip address `ip` `maska`			přidání ip adresy v modulu
			no shutdown						zapnutí portu
		- Routování
			router `protokol`				Konfiguvání protokolu (rip)
			- rip
				network `adresa sítě`		Nastavení adresy sítě
