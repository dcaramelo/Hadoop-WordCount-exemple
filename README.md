Hadoop-WordCount-exemple
========================

##### Création du dossier data dans HDFS :
```bash
hadoop fs -mkdir data
```
##### Vérificaction :
```bash
hadoop fs -ls
```
##### Copie du fichier :
```bash
hadoop fs -copyFromLocal Desktop/pg100.txt data
```
##### Lancement du MapReduce :
```bash
hadoop jar wc.jar WordCountDriver data result
```
##### Copie du fichier de resultat :
```bash
hadoop fs -copyToLocal result/part-r-00000
```
##### Suppression du dossier resultat dans le HDFS :
```bash
hadoop fs -rm -r -f -skipTrash result
```
