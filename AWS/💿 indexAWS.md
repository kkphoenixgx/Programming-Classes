# 💿 aws_index
2025-02-20
tags: [[AWS/index|index]]

IAM>user>security credentials> access key >CLI > set name > create access key

Para usarmos aws em qualquer setup, podemos definir um .env com as credenciais, que podem ser encontradas em [aws keys](https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html)


## CLI install on linux 10/04/2025

> `curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"`

> `unzip awscliv2.zip`

> `sudo ./aws/install`

## aws cli setup

> **aws configure** 

Enter your credentials, id and access key 
## Credentials setup - code

After create your user in IAM → Users →  create user and all steps, if it is a adm you check the firs type of permissions you can now setup your credentials in aws cli

check if it already exists

> `aws s3 ls`

If it do not exists, let continue the setup, you go to users →  acces key and create your key 

create your .env file with credentials, [aws documentation for .env](https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-envvars.html).

sample:
```.env
export AWS_ACCESS_KEY_ID=AKIAIOSFODNN7EXAMPLE
export AWS_SECRET_ACCESS_KEY=wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY
export AWS_DEFAULT_REGION=us-west-2
```

By the way, for Brazil, use  `sa-east-1`.

> `source .env`

now try to exec `aws s3 ls` to check if it is okay


