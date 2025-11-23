# 📦 Redistribuindo espaço entre `/home` e `/` no Arch com LVM (sem live USB)

Este guia resume o processo real usado para reduzir o tamanho da partição `/home` e aumentar o tamanho de `/` em um sistema Arch Linux usando LVM — sem precisar de live USB.

---

## 🛠️ Situação inicial

- `/` estava **lotado**, impedindo até mesmo instalação de pacotes.
- `/home` tinha muito espaço livre.
- Ambas estavam sob **LVM**.

---

## 📋 Verificações iniciais

```bash
lsblk -f
df -h /
vgs
lvs
````

---

## 📉 Reduzindo `/home` (lv\_home)

> ⚠️ IMPORTANTE: redimensionar arquivos exige cuidado!

1. **Verificar sistema de arquivos**:

```bash
sudo e2fsck -f /dev/volgroup0/lv_home
```

2. **Reduzir com `resize2fs`** para diminuir o sistema de arquivos:

```bash
sudo resize2fs /dev/volgroup0/lv_home 250G
```

3. **Reduzir o volume lógico**:

```bash
sudo lvreduce -L 250G /dev/volgroup0/lv_home
```

> Use `--resizefs` se quiser combinar os dois últimos passos:
>
> ```bash
> sudo lvreduce --resizefs -L 250G /dev/volgroup0/lv_home
> ```

---

## 📈 Expandindo `/` (lv\_root)

1. **Ver quanto espaço livre está disponível no Volume Group**:

```bash
vgs
```

2. **Expandir `/` com parte (ou todo) do espaço livre**:

```bash
# Opção segura (exemplo com 100G):
sudo lvextend -L +100G /dev/volgroup0/lv_root

# Ou usar todo o espaço:
sudo lvextend -l +100%FREE /dev/volgroup0/lv_root
```

3. **Redimensionar o sistema de arquivos ext4**:

```bash
sudo resize2fs /dev/volgroup0/lv_root
```

---

## ✅ Verificação final

```bash
df -h /
lvs
vgs
```

---

## 🧠 Dicas

* Instale o `ncdu` para explorar consumo de espaço:

```bash
sudo pacman -S ncdu
ncdu /
```

* Evite usar **100% do espaço do volume group**, mantenha sempre 5–10 GB livres para manobras futuras.
* Considere criar alertas de disco cheio usando `cron + df + mail` ou `systemd-timers`.

---

## 🐧 Créditos

Orientação do ChatGPT.

Veja pelo lado bom, não precisamos mais morrer decorando documentações e comandos... Saber todos os comandos específicos do Linux agora realmente te faz alguém especial? De fato te dá produtividade e velocidade, mas é algo que para um usuário vale a pena? Eu sou apenas um dev e um usuário...
