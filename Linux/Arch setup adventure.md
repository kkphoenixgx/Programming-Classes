# Arch setup adventure
2025-02-18
tags: [[💻 indexLinux]]

If you are using a different keyboard, run `loadkeys br-<keyboard-type>`, example: `loadkeys br-abnt2`

First of all, check internet with `ip addr show`. It will show info about your internet connection, you probably are using wifi so look for it in next section: 

## Setting up wifi

To set it up you will need to check the interface name of the connection, to check it, you can run `ip addr show` And check the interface name in the number 4.

Now, you can run `iwctl` command, this will open a second command prompt that is specific to wifi.

Now, in the specific terminal, you can run `station <interface> get-netwoks` with the name of the interface that you searched. This will show you all your networks to connect.

Now, you can `exit` from this prompt.

Run `iwctl --passphrase '<your connection password>' station <interface> connect <wifi connection name>"`. Run it with *'*, simple quotes, to avoid string errors

## Enable SSHD

`systemcyl status sshd` to check if sshd is running, if it is not running, run `systemcyl start sshd` 

### enable password

`passwd`, digit password and confirm it

## archinstall method

Just use archinstall and go one by one to install, if you are using it, just see some video and stop reading it you bozo.

## For literates 
Haha 

### Partitions

`lsblk` to see storage volumes. Remember the name of the drive you want to install arch

`fdisk /dev/<drive name>` To modify this drive

Now, in the specific terminal opened, you can run `p` to see all partitions info

If you wave something or not is always a good practice erase everything before the instalation. Then **To erase partition**, you can run: `g`, Then confirm with `w`.

After that, you can enter again in the disk by running `fdisk /dev/<drive name>` and starting creating partitions. To make it, you will need to run `n`, then, for the first one, we will set vga, you will set the partition number, *probably default*, then *default sector* and last sector you will type `+1G`

For the second partition, you will repeat the same, *default second partition*, *default sector* and `+1G` 

If you are thinking about a swap, you can create it but you can also create it after without problems. If you create, remember of the numbers...

For the first one, we will use all the rest of the drive, so, *default to all :)*


#### Formating partitions

Create fat in first partition: 

`mkfs.fat -F32 /dev/<diskName>1` 

At this point, if something is running on the disk, the system will warn you that it cannot access the device because it is busy. To check for active processes using the disk, run: `fuser -v /dev/<diskName>` If any processes are listed, you can terminate them with: `fuser -k /dev/<diskName>`
Then, try running the command again.

Now, create ext in second: 

`mkfs.ext4 /dev/<diskName>2` 

Now, encrypt part 3 with: 
`cryptsetup luksFormat /dev/<diskName>3` 
Now, you will put the password that you will use in your computer and confirm it

Now, open it: `cryptsetup open --type luks /dev/<diskName> lvm` this lvm is a temporary name for this volume, then you put your password and confirm.

Now, create a phisical volume:  `pvcreate /dev/mapper/lvm`. Then, a volume group `vgcreate volgroup0 /dev/mapper/lvm` 

Then, create the first logical volume: 
`lvcreate -L 30GB volgroup0 -n lv_root` 
`lvcreate -L <size of the rest of your disk>GB volgroup0 -n lv_home` 

Then you can check those partitions by using `vgdisplay` and `lvdisplay`.

Run `modprobe dm_mod` and check groups with `vgscan`.

If everything is alright, use `vgchange -ay` to check and  now lets format it

`mkfs.ext4 /dev/volgroup0/lv_root` 

lets format home now

`mkfs.ext4 /dev/volgroup0/lv_home` 

Mount root partition

`mount /dev/volgroup0/lv_root /mnt`

Create a boot directory 

`mkdir/mnt/boot` 

Mount the second partition

`mount /dev/<diskName>2 /mnt/boot`

Create home: 
`mkdir /mnt/home`

Mount home:
`mount /dev/volgroup0/lv_home /mnt/home`

#### install arch packages

Type: 
`pacstrap -i /mnt base`

Enter, enter and lets configure a important part, generate the fstab file 

`genfstab -U -p /mnt >> /mnt/etc/fstab`

Now, you can check everyting by running `cat /mnt/etc/fstab`

It shoud have something like this: 

![[Screenshot_20250218_182948_YouTube.jpg]]

#### Setting up user

Now, lets dive into our mounted partition `arch-chroot /mnt`

Now set `passwd`.

Then, set up user: 
`useradd -m -g users -G wheel <username>`

User's password: 
`passwd <username>`

#### install packages

`pacman -S base-devel dosfstools grub efibootmgr gnome gnome-tweaks lvm2 mtools nano networkmanager openssh osprober sudo` 

Para habilitar o ssh: 
`systemctl enable sshd`

Now, you can install the kernel: 

`pacman -S linux linux-headers linux-lts linux-lts-headers`

The reason why we install two kernels is if the first one do not run properly...

Now, install the firmware...

`pacman -S linux-firmware`

#### Graphics driver


You are going to run `lspci` to check devices and install the driver for your graphics driver, good luck with gpt or wateaver...

In my case, I am using a Intel graphics driver... so...

`pacman -S mesa` 

And others...

Now, set up it: 
`nano /etc/mkinitcpio.conf`

Go to the last line before compression in hooks section and write btween block and filesystem `encrypt lvm2`

Now, initialize kernels: 

`mkinitcpio -p linux`
`mkinitcpio -p linux-lts`

After it:
`nano /etc/locale.gen`

Uncomment your location.
Run: `locale-gen`

#### setting up boot 

`nano /etc/default/grub`

Change grub_cmlike_linux_default. Between loglevel and quiet, add: `cryptdevice=/dev/<driverName>3:volgroup0`

Double check it!!!!

#### setting up ufi

`mkdir /boot/EFI`
`mount /dev/<diskName>1 /boot/EFI`

`grub-install --target=x86_64-efi --bootloader-id=grub_uefi --recheck`


`cp /usr/share/locale/en\@quot/LC_MESSAGES/grub.mo /boot/grub/locale/en.mo` 

`grub-mkconfig -o /boot/grub/grub.cfg`

`systemctl enable gdm`

`systemctl enable NetworkManager`


now: 

`exit`
`umount -a` 
`reboot`



