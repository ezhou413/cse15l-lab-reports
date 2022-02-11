# Lab Report 3

## How To Further Streamline Your ssh Configuration

When we first set up ssh keys, our login process looked something like this:

```
$ ssh cs15lwi22awp@ieng6.ucsd.edu
Password: 
```
In between then and now, we set up ssh keys to streamline the login process a little bit, making it so you don't have to enter your password when logging in. This process was detailed in [lab report 1](lab-report-1-week-2.html). 

In this lab report, we will be talking about how to further streamline the ssh login process. 

---

All ssh related files are stored in the hidden directory ```~/.ssh```, and in that directory, there is a file called config that stores the settings of your ssh configuration. It should look something like this: 