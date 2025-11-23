# Java with Files
2025-03-05
tags: [[☕ indexJava]]

To create a file:

```java
File file = new File("<path>");
```

Scanner can also be used to read files...

```java
Scanner scan = null.

try{
	scan = new Scanner(file);
	while(scan.hasNextLine()){
		System.out.println(scan.nextLine());
	}
}catch(IOExeption error){
	System.out.println("Error: " + error.getMessage());
}
finally{
	 //O scan deve ser fechado depois de tudo, 
	if(scan != null) scan.close();
}
```

## File Reader x Buffered Reader

O buffered reader é um reader mais otimizado, ele usa buffer para a leitura, é mais rápido e possuí mais métodos

```java
String path  = "<path>";

FileReader fr = null;
BufferedReader br = null;

try{
	fr = new FileReader(path);
	//  BufferedReader recebe um FileReader como arg
	br = new BufferedReader(fr);
	
	String line = br.readLine();
	while(line != null){
		System.out.println(line);
		line = br.readLine();
	}
	
}catch( IOException error ){
	System.out.println("Error: " + error.getMessage());
}finally{
	try{
		if(br != null) br.close();
		if(fr != null) fr.close();
	}
	catch(IOException error){ error.printStackTrace(); }
}

```

## try with resources

Para melhorar o código acima, podemos usar um bloco try que recebe parâmetros, dessa forma, as variáveis já vão ser excluídas assim que o try acabar.

```java
String path  = "<path>"

try(BufferedReader br = new BufferedReader( new FileReader(path) )) {
	String line = br.readLine();
	while(line != null){
		System.out.println(line);
		line = br.readLine();
	}
	
}catch( IOException error ){
	System.out.println("Error: " + error.getMessage());
}
```


##  `FileWriter` e `BufferedWriter`

Assim como temos o `FileReader` e o `BufferedReader` para ler, temos esses para escrever e a diferença dos dois é a mesma, o `BufferedWriter` é mais rápido e tem mais métodos.
Contudo, temos que ter em mente que agora é sobre escrever arquivos, desse modo, temos o segundo parâmetro do construtor que é um booleano que diz se ele vai ser reescrito ou será acrescido. Desse modo temos essa relação:

| Instância                      | função               |
| ------------------------------ | -------------------- |
| `new FileWriter(<path>)`       | reescrever o arquivo |
| `new FileWriter(<path>, true)` | adicionar ao arquivo |

```java
Strig[] data = new String[] { "Salve", "Daqui do arquivo!!!" }

String path = "c\\temp\\out.txt" //tem que mudar se for linux

try( BufferedWriter bw = new BufferedWriter(new FileWriter(path)) ){
	for( String text : data ){
		bw.write(text);
		bw.wewLine();
	}
}
catch(IOExeption e){
	e.printStackTrace();
}
```


## Pastas com `File`

Vamos por exemplo listar as pastas de um diretório

```java
Scanner sc = new Scanner(System.in);
System.out.println("Digita aí o caminho das pastas \n");

String strPath = sc.nextLine();

File path = new File(strPath);

File[] folders = path.listFiles(File::isDirectory);

for(folder : folders){
  System.out.println(folder);
}

sc.close();
```

Agora um que lista só os arquivos

```java
Scanner sc = new Scanner(System.in);
System.out.println("Digita aí o caminho das pastas \n");

String strPath = sc.nextLine();

File path = new File(strPath);

File[] files = path.listFiles(File::isFile);

for(file : files){
  System.out.println(file);
}

sc.close();
```


Agora vamos criar um diretório: 

```java
Scanner sc = new Scanner(System.in);
System.out.println("Digita aí o caminho das pastas \n");

String strPath = sc.nextLine();

boolean isDirectoryCreated = new File(strPath + File.separator +"subdir").mkdir();

if(isDirectoryCreated) System.out.println("subdir created");
else System.out.println("failed to create directory");

sc.close();
```



### O FilePath

Temos vários métodos da classe File que podemos usar, dá uma olhada em três das mais importantes, a `getName`, a `getParent` e a `getPath`

```java
Scanner sc = new Scanner(System.in);
System.out.println("Digita aí o caminho das pastas \n");

String strPath = sc.nextLine();

File path = new File(strPath);

System.out.println("nome do arquivo: " + path.getName());
System.out.println("pai do arquivo: " + path.getParent());
System.out.println("caminho do arquivo: " + path.getPath());

sc.close();
```