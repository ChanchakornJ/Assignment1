Chanchakorn Jullapech 672115007

#How to compile and run the program
Java Development Kit is required
The input file and the program must be on the same folder

-n to sort by student ID
-f to sort by first name
-l to sort by last name
-s to find student using first name(If you want to find name using -s, the file must be put before the name you want to find)

Example of input:
-f class_roaster67.csv
-s class_roaster67.csv Chanchakorn


#Example output
Input: -n class_roaster67.csv
Output: 
622115040 SUCHANUN  SIRIJANYA
662115007 CHONCHANUN  KHACHONPHURITHANAKUL
662115016 NATTHAPHUM  CHAIKHAN
.....

Input: -f class_roaster67.csv
Output:
672115049 ANAWAT  JANDEE
672115007 CHANCHAKORN  JULLAPECH
672115006 CHANLACHAT  PANYOYAI
.....

Input: -l class_roaster67.csv
Output:
672115044 VIDCHAYADA  ABHICHARTTIBUTRA
672115039 METAVEE  AEINJANG
672115041 RAPHEEPHAT  AEIPHINGCHAI
.....

Input: -s class_roaster67.csv Chanchakorn
Output:
found at index 9
