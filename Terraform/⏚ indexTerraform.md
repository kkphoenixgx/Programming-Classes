# Terraform ⏚
2025-02-20
tags: [[Terraform/index|index]] 

Terraform is used to manipulate infrastructures, create automation to infrastructures and abstraction, you can create a lot of others infrastructures with Terraform

![[TerraformDeclarativeInfra.png]]

## Setting up AWS credentials

> `terraform source .env`

`.env` should be the path for `.env` file containing credential values

![[credentialsEnvTerraform.png]]

## AWS VPC

![[VPC]]

if you are not Brazilian, just search what is VPC...  `¯\_( ͡❛ ▿ ͡❛)_/¯`

### Creating a AWS VPC with Terraform

* create a  `vpc.tf` file

```tf
terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
    }
  }
}

provider "aws" {
  region = "sa-east-1"
}

resource "aws_vpc" "demo_vpc" {
  cidr_block = "10.0.0.0/16"
}

resource "aws_subnet" "public_subnet" {
  vpc_id     = aws_vpc.demo_vpc.id
  cidr_block = "10.0.0.0/24"
}

resource "aws_subnet" "private_subnet" {
  vpc_id     = aws_vpc.demo_vpc.id
  cidr_block = "10.0.1.0/24"
}

resource "aws_internet_gateway" "igw" {
  vpc_id = aws_vpc.demo_vpc.id
}

resource "aws_route_table" "public_rtb" {
  vpc_id = aws_vpc.demo_vpc.id

  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = aws_internet_gateway.igw.id
  }
}

resource "aws_route_table_association" "public_subnet" {
  subnet_id      = aws_subnet.public_subnet.id
  route_table_id = aws_route_table.public_rtb.id
}
```




