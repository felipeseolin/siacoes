# Siações

## Cloc

**Observação: Prints do terminal podem ser vistos na pasta /cloc.**

Execução do comando cloc na pasta model antes da aplicação da Lombok nas classes do projeto. 

```bash
C:\projetos-pessoais\siacoes\src\main\java\br\edu\utfpr\dv\siacoes\model>cloc .
      79 text files.
      79 unique files.
       1 file ignored.

github.com/AlDanial/cloc v 1.80  T=1.00 s (79.0 files/s, 7902.0 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            79            799              0           7103
-------------------------------------------------------------------------------
SUM:                            79            799              0           7103
-------------------------------------------------------------------------------
```

Execução do comando cloc na pasta model após aplicação da Lombok em 11 classes do projeto.
```bash
C:\projetos-pessoais\siacoes\src\main\java\br\edu\utfpr\dv\siacoes>cloc model
      79 text files.
      79 unique files.
       1 file ignored.

github.com/AlDanial/cloc v 1.80  T=0.50 s (158.0 files/s, 14992.0 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            79            775              0           6721
-------------------------------------------------------------------------------
SUM:                            79            775              0           6721
-------------------------------------------------------------------------------
```  

