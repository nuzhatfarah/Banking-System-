//Main
package com.company;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Account accounts[] = new Account[100];
for(int i=0; i<5; i++)
{
accounts[i] = new Account(500+i);
}
System.out.println("0. Exit");
System.out.println("1. Show Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Transfer");
Scanner scanner = new Scanner(System.in);
int choice;
while (scanner.hasNext())
{
choice = scanner.nextInt();
if(choice==0)
{
System.out.println("Thank you for being co-operative with us");

break;
}
int accN,taka;
switch (choice)
{
case 1:
System.out.println("Enter account number: ");
accN = scanner.nextInt();
for(int i=0; i<5; i++)
{
if(accN==accounts[i].accountNumber)
{
System.out.println(accounts[i].showBalance());
break;
}
}
break;
case 2:
System.out.println("Enter account number: ");
accN = scanner.nextInt();
System.out.println("Enter deposit amount: ");
taka = scanner.nextInt();
for(int i=0; i<5; i++)
{
if(accN==accounts[i].accountNumber)

{
accounts[i].deposit(taka);
break;
}
}
break;
case 3:
System.out.println("Enter account number: ");
accN = scanner.nextInt();
System.out.println("Enter withdrawing amount: ");
taka = scanner.nextInt();
for(int i=0; i<5; i++)
{
if(accN==accounts[i].accountNumber)
{
accounts[i].withdraw(taka);
break;
}
}
break;
case 4:
System.out.println("Enter sender's account number: ");
accN = scanner.nextInt();
System.out.println("Enter receiver's account number: ");
int accT= scanner.nextInt();

System.out.println("Enter trasfering amount: ");
taka = scanner.nextInt();
for(int i=0; i<5; i++)
{
if(accT==accounts[i].accountNumber)
{
accounts[i].deposit(taka);
break;
}
else if(accN==accounts[i].accountNumber)
{
accounts[i].withdraw(taka);
}
}
}
System.out.println("0. Exit");
System.out.println("1. Show Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Transfer");
}
}
}
