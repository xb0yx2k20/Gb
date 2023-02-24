from termcolor import colored
import res_handler as rh

def get_num():
    n = input()
    check_num(n)

def check_num(x):
    if x < '1' or x > '5':
        print(colored("Error, try again", "red"))
        get_num()
    else:
        rh.handle_num(int(x))