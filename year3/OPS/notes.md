# Linux (debian) commands

## EN

| Command | Description |
|---|---|
| shutdown -P now | Correct way to turn off machine |
| ifconfig | get IP address of machine |
| netstat -lpnt | get PORT |
| apropos | Finding similar commands |
| \| | Pipe simbol for redirecting command |
| *command* \| more | Print by pages |
| *command* \| less | Just better more |
| cat /etc/passwd | Print file with users on OS |
| passwd | Change password logged user |
| passwd *username* | Change password of user, only by root |
| jobs | Display stopped processes |
| fg *number* | Bring process to foreground |
| apt-get  | Packaging Tool |
| --- update | Fetch information for updating packages |
| --- upgrade | Updating backages |
| --- install | Install new package |

### apt-get packages

| Package | Description |
|---|---|
| net-tools | Networking stuff |
| ssh | Protocol SSH |
| man | Manual, very good, very recommended |

### Files

| Package | Description |
|---|---|
| pwd | Print working directory |
| cd | Change directory, relatively |
| ls | List storage, print contents of directory |
| ls -a | List storage, including hidden files |
| touch | Create a file |
| mkdir | Create a directory |
| mv | Move or rename file/directory |
| rm | Remove file/directory |

### Shortcuts

| Shortcut | Description |
|---|---|
| ^ | Ctrl (Control) |
| ^l | Clear console |
| ^d | Logout |
| ^r | Command history |
| **Process** |  |
| ^s | Stop process |
| ^q | Resume process |
| ^c | Cancel process |
| ^z | Stop process, but returns to the console |
| **Clipboard** |  |
| ^u | Copy from cursor to left |
| ^k | Copy from curosr to right |
| ^y | Paste from clipboard |

### New disk

dmesg | grep sd		Najít jak se jmenuje nový disk
fdisk /dev/`disk name`	Vytvoření particion pro disk
- n 	Nová particion
- p		Primary
- pak default
mount --rw /dev/`disk name` `/mnt` `where to mount` - mount disku 
| Command | Description |
|---|---|
| dmesg \| grep sd | Ctrl (Control) |



update-alternatives --config editor