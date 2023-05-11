# Classes Nativas
2023-05-11
tags: [-index Unity](-index%20Unity.md)

* [MonoBehaviour](MonoBehaviour.md)

* **Time** = Uma classe que fornece informações relacionadas ao tempo de execução do jogo ~ *Tópicos escritos pelo ChatGPT, assim como Time*.
	-   **Time.time**: retorna o tempo de jogo atual em segundos desde o início da execução do jogo.
	-   **Time.deltaTime**: retorna o tempo decorrido em segundos desde a última atualização do quadro (desde o último frame). Esse valor é útil para garantir que o comportamento do jogo seja consistente, independentemente da taxa de quadros em que o jogo está sendo executado.
	-   **Time.timeScale**: controla a escala de tempo do jogo. Se o valor for 1, o jogo será executado em tempo real. Se o valor for 0, o jogo será pausado. Valores maiores que 1 aceleram o tempo e valores menores que 1 diminuem o tempo.
* 