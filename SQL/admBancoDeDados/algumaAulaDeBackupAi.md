# Alguma Aula De Backup Ai
2025-05-28
tags: [[💾 indexSql]]

Comando para fazer backup: 

* **Linux**: 
	* Do banco todo: `mysqldump -u <user> -p <database> > <fileName>.sql`
	* De uma tabela: `mysqldump -u <user> -p <db> <table> > <filePath>.sql `
	* Todos os bancos: `mysqldump -u <user> -p --all-databases > <fileName>.sql`

* **Windows**:  No Windows tem que estar na pasta do msql ou na pasta adm

	* Do banco todo: `mysqldump -u <user> -p <db> > <filePath>`
	* De uma tabela: `mysqldump -u <user> -p <db> <table> > <filePath>`
	* Todos os bancos:
	`mysqldump -u <user> -p --all-databases > <filePath>`
	
