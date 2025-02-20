# FFMPEG
2024-01-10
tags: [[-APIS EXTERNAS]]

## Instalando FFMPEG para Compressão e Codificação de Vídeos

baixa e coloca no projeto o [ffmpeg](https://www.gyan.dev/ffmpeg/builds/)

![[Pasted image 20231219185137.png]]

![[Pasted image 20231219185227.png]]


```node
const {spawn} = require("child_process")

function recize(vídeo, quality){
  const p = new Promise(
    (resolve, reject)=>{
      // vídeo info into spawn
      const ffmpeg = spawn('../ffmpeg/bin/ffmpeg', [
        '-i',
        `${parent}/${video}.mp4`,
        'codec:v',
        'libx264',
        'profile:v',
        'main',
        '-preset',
        'slow',
        '-b:v',
        '400k',
        '-maxrate',
        '400k',
        '-bufsize',
        '800k',
        '-sf',
        `scale=2:${quality}`,
        '-threads',
        '0',
        '-b:a',
        '128k',
         `${parent}/resultado/${video}-${quality}.mp4`
      ])
      
      ffmpeg.stderr.on("data", (data)=>{
        console.log(data)
      }
    ffmpeg.on("close", (code)=>{
    resolve()
})

    })

    return p
}

```
