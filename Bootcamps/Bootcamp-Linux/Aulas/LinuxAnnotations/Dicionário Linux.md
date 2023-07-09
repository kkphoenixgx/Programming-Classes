# Dicionário Linux
[Index Linux-Bootcamp](../../Index%20Linux-Bootcamp.md)

* INFO:
	* No linux, ~ como path significa que estamos na pasta de usuário;

## Comandos

**Date** → give the date  
**pdw** → mostra a pasta que você tá  
**cd** → muda o diretório  
**exa** → mostra os arquivos de uma forma mais organizada  
**ip a**  → ele mostra o ip, ele é melhor que o ifconfig, é mais versátil  
**duf** → mostra os discos (alternativa ao df)  
**ncdu** → mostra os arquivos de forma mais organizada (alternativa ao du)  
**fd find x**  → sendo x o que quer procurar  
	instalação: *(gerenciador de pacotes) insntall fd-find*
**bashtop** →
**batcat** → mostra o arquivo no terminal de uma forma melhor
**touch** x.extension → cria o arquivo

**dig** → dá infomrações sobre um site, igual ao nslookup só que com informações extras


* **tldr**
	instala o trdr, vai de cada distribuição *(gerenciador de pacores) install tldr*
	**tldr (comand)** → ele vai te dar um *manual mais bonitinho que o man ou o help*

-- "Deprecated" --
**ls** → mostra os arquivos
**df** → mostra os discos
**ns lookup (site)** → mostra informações sobre um site
**find (path -name * x * [sem espaço] sendo x o que quer procurar  )**  → procura coisas
	exemplo → find ./ -name * arch * [sem espaço entre * ]
**htop** → mostra informações do sistema
**cat** → mostra no terminal o que tá escrito no arquivo

### Selecionando

Assim como mostrado no find, podemos selecionar coisas usando esse formato de path com * e outros...

* **usando ' * '**:  podemos usar * para falar todos → ls someName* vai pegar todos os arquivos com someName, de qualquer extensão → ls a* todos que começam com a
* **Range de números [x-y] ou [x,y]** : ls arquivo[1-3]* vai mostrar os arquivos com o nome arquivo e com o número de 1 a 5. Enquanto ls arquivo[1,3]* vai mostrar o 1 e o 3