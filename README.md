# Disk-Backed-Map-Collection What it does it auto back up all the data when collection limit is exceeded 
#1. ADD 2.FIND 3.DELETE 
#ADD will store data into collection eg. 
if limit of collection is 10 elements then 
if user try to enter 11th element all the existing data of collection will backed up into record file 

#FIND basically what is does is you have to 
enter the key of record you saved first it will 
search into existing collection if it not found there 
then it will dig into file and return if record is found
