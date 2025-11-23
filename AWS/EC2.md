2025-04-13
tags: [[💿 indexAWS]]

## Creating a EC2 role

> `role → create role → aws service - select EC2 → IAMReadOnlyAccess → select a name and create it`


## EC2 basic

account (top right) → **billing and cost management**...

**Giving access**: account (top right) → Account → IAM user and role access to Billing information → edit and give access.

Instance type:

![[Screenshot_20250511_184614_Udemy.jpg]]

EC2 → instances → launch instance → create name → select base image... amazon linux → select free tier → select instance type → create or select a key pair: 

* select name
* select format -> anything else then win7 or 8, select .pem, else, use .ppk
* select security group 
* allow HTTP trafic from internet
* inside advanced details, in user data, we can put commands to be executed in your first launch:
![[Screenshot_20250511_185943_Udemy.jpg]]

Launch instance and use it...

### EC2 Firewalls (Security groups)


![[Pasted image 20250601235517.png]]

![[Pasted image 20250601235807.png]]

![[Pasted image 20250602000206.png]]

![[Pasted image 20250602000512.png]]

To edit rules:
![[Pasted image 20250602000956.png]]

![[Pasted image 20250602001523.png]]

### SSH on linux

go to the directory of your `.pem` file

> `chmod 0400 <your .pem file>`

> `ssh -i <your .pem file> ec2-user@<public ip>`

> `ssh ec2-user@<public ip>`

And you will be inside your ec2
### EC2 instance connect

EC2  → Instance connect → select your instance → your user name (ec2-user) → connect and voalá...


