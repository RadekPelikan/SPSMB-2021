# NETWORKING (Cisco)

## EN

### Basic stuff

**Links**:
- http://toolkit.g6.cz
- https://wintelguy.com
- https://samuraj-cz.com

**Routing**
- 3rd layer OSI - network
- Finding path to connect networks

**Router** - internet access  
**LAN** - local area network  

**IPv4** 
- 4 bilion adresses (2^32)
- adress have to be unique
- 3 groups of (ranges) private adresses
	1. 10.0.0.0/8
	2. 172.16.0.0/12
	3. 192.168.0.0/16	
- Octet - Part of IP adress 8 bits (1 part of IPv4)
- Broadcast is delivered to all devices in local network. The last of the given range

**Routing protocols**
- Static 
	- Defined path from A to B
	- When the connection is lost, the path disappears
	- Use only for small networks
- Dynamic
	- The most common
	- Reacts to changes in topology
	- If the path is interrupted, a new one is found
	- 2 categories
		1. Exterior gateway Protocol (EGP)
			- BGP
			- Path vector
			- Connects autonomous systems
			- Big networks (O2, Vodafon, ...)
		2. Interior gateway protocol
			- Inside autonomous system
			- 2 parts
				1. Distance vector
					- RIP, RIP2, RIPNG,
					- IGRP, EIGRP
					- Finds smallest number of hops
				2. Link state
					- OSPF
					- IS-IS
					- Finds the best (fastest) path
- Default
	- Used to connect to the internet
	- All zeros

**Autonomous system**
- Extensive network for one administration (mobile providers), EGP

**VLSM**
- Variable Length Subnet Masking
- Necessary due to lack of addresses

### RIP

Max 15 hops

**Versions**
- 1 = broadcast
- 2 = multicast

**Multicast address** - 224.0.0.9

### OSPF

**Multicast address** - 224.0.0.5



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

Rozdělení switchu
- L2 switch - Linková vrstva 
- L3 switch - Síťová vrstva (Umí i routovat)
---
## VLAN
(https://www.samuraj-cz.com/clanek/vlan-virtual-local-area-network/)[Vlans]
__Configure ports__
- switchport
	- mode access (by default)
	- access vlan `number` [Which port to vlan]
__Configure trunk__
- switchport
	- mode trunk
	- trunk allowed vlan `number` (number could be range)
	- trunk native vlan `number` [Where frames without tags go]