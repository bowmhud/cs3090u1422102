# cs3090u1422102
Block project 2


    - What your program does.
    My program takes in a password from the user and gives it a score from 0-5, where 0 is very bad and 5 is secure. It will give the password points for each specification is passes. It will get 1 point for being >+ 8 characters, a second point for being >= 12 characters, one point for having a capital, a point for having a number, and one point for having a special character. The score is then told to the user along with a message about their password strength.
    
    - How to run your program and any necessary dependencies.
    My program can either be run in VS code buy clicking run, or it can be run from the terminal by using the command "java passwordChecker.java <password>". When run in VS code, it will prompt the user for a password which they can then type into the terminal and press enter. If run from the terminal, type your password as the first argument (in place of <password>). If running from the terminal, be careful of using &, $, ), etc because of the nature of the terminal. For example, if you use the password 12345678910$A by running in VS code it will give a 5, while in the terminal it will give a 2 because it uses $. If testing from the terminal, please use other special characters.
    
    - Clear warnings about its limitations (e.g., “This tool is for educational use only and should not be used for securing sensitive information” - this will vary depending on your program).
    This tool is for educational use only and should not be used for securing sensitive information. Do not use this for comercial use or trust it as a real password checker.
    
    - Ethical considerations and responsible use. In writing this, make sure to consider how your tool might be misused (e.g., Could someone modify it for malicious purposes? Does it give users a false sense of security? etc.).
    This tool could be misused in many ways. The security of this password checker is very light, and if someone were to believe that the "password strength" that it gave was 100% true, they might believe that a common password was strong which could put them at risk. This password checker could also be hacked, where someone could put in a script where it also sends the entered password to a database for the hacker to use, without telling the user.