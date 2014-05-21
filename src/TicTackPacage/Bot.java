package TicTackPacage;

import javax.naming.Reference;

public class Bot {

	char[] charBoard = new char[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public void BotInsertSymbol(int first, int second, int third, char[] array,
			char symbol) {

		if (array[first] == symbol && array[second] == symbol
				&& array[third] == '0') {
			array[third] = symbol;
		}
	}

	public static void winCheck()
	{
	  // Check for win method 
	  if(Bot   Bosqr1 == " O " && sqr2 == " O " && sqr3T == 0 && turn == 1)
	  {
	    document.tic.sqr3.value = " O "
	    sqr3T = 1;
	    turn = 0;
	  }
	  else if(sqr2 == " O " && sqr3 == " O " && sqr1T == 0 && turn == 1)
	  {
	    document.tic.sqr1.value = " O "
	    sqr1T = 1;
	    turn = 0;
	  }
	  else if(sqr4 == " O " && sqr5 == " O " && sqr6T == 0 && turn == 1)
	  {
	    document.tic.sqr6.value = " O "
	    sqr6T = 1;
	    turn = 0;
	  }
	  else if(sqr5 == " O " && sqr6 == " O " && sqr4T == 0 && turn == 1)
	  {
	    document.tic.sqr4.value = " O "
	    sqr4T = 1;
	    turn = 0;
	  }
	  else if(sqr7 == " O " && sqr8 == " O " && sqr9T == 0 && turn == 1)
	  {
	    document.tic.sqr9.value = " O "
	    sqr9T = 1;
	    turn = 0;
	  }
	  else if(sqr8 == " O " && sqr9 == " O " && sqr7T == 0 && turn == 1)
	  {
	    document.tic.sqr7.value = " O "
	    sqr7T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr5 == " O " && sqr9T == 0 && turn == 1)
	  {
	    document.tic.sqr9.value = " O "
	    sqr9T = 1;
	    turn = 0;
	  }
	  else if(sqr5 == " O " && sqr9 == " O " && sqr1T == 0 && turn == 1)
	  {
	    document.tic.sqr1.value = " O "
	    sqr1T = 1;
	    turn = 0;
	  }
	  else if(sqr3 == " O " && sqr5 == " O " && sqr7T == 0 && turn == 1)
	  {
	    document.tic.sqr7.value = " O "
	    sqr7T = 1;
	    turn = 0;
	  }
	  else if(sqr7 == " O " && sqr5 == " O " && sqr3T == 0 && turn == 1)
	  {
	    document.tic.sqr3.value = " O "
	    sqr3T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr3 == " O " && sqr2T == 0 && turn == 1)
	  {
	    document.tic.sqr2.value = " O "
	    sqr2T = 1;
	    turn = 0;
	  }
	  else if(sqr4 == " O " && sqr6 == " O " && sqr5T == 0 && turn == 1)
	  {
	    document.tic.sqr5.value = " O "
	    sqr5T = 1;
	    turn = 0;
	  }
	  else if(sqr7 == " O " && sqr9 == " O " && sqr8T == 0 && turn == 1)
	  {
	    document.tic.sqr8.value = " O "
	    sqr8T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr7 == " O " && sqr4T == 0 && turn == 1)
	  {
	    document.tic.sqr4.value = " O "
	    sqr4T = 1;
	    turn = 0;
	  }
	  else if(sqr2 == " O " && sqr8 == " O " && sqr5T == 0 && turn == 1)
	  {
	    document.tic.sqr5.value = " O "
	    sqr5T = 1;
	    turn = 0;
	  }
	  else if(sqr3 == " O " && sqr9 == " O " && sqr6T == 0 && turn == 1)
	  {
	    document.tic.sqr6.value = " O "
	    sqr6T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr5 == " O " && sqr9T == 0 && turn == 1)
	  {
	    document.tic.sqr9.value = " O "
	    sqr9T = 1;
	    turn = 0;
	  }
	  else if(sqr4 == " O " && sqr7 == " O " && sqr1T == 0 && turn == 1)
	  {
	    document.tic.sqr1.value = " O "
	    sqr1T = 1;
	    turn = 0;
	  }
	  else if(sqr5 == " O " && sqr8 == " O " && sqr2T == 0 && turn == 1)
	  {
	    document.tic.sqr2.value = " O "
	    sqr2T = 1;
	    turn = 0;
	  }
	  else if(sqr6 == " O " && sqr9 == " O " && sqr3T == 0 && turn == 1)
	  {
	    document.tic.sqr3.value = " O "
	    sqr3T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr4 == " O " && sqr7T == 0 && turn == 1)
	  {
	    document.tic.sqr7.value = " O "
	    sqr7T = 1;
	    turn = 0;
	  }
	  else if(sqr2 == " O " && sqr5 == " O " && sqr8T == 0 && turn == 1)
	  {
	    document.tic.sqr8.value = " O "
	    sqr8T = 1;
	    turn = 0;
	  }
	  else if(sqr3 == " O " && sqr6 == " O " && sqr9T == 0 && turn == 1)
	  {
	    document.tic.sqr9.value = " O "
	    sqr9T = 1;
	    turn = 0;
	  }
	  else if(sqr1 == " O " && sqr9 == " O " && sqr5T == 0 && turn == 1)
	  {
	    document.tic.sqr5.value = " O "
	    sqr5T = 1;
	    turn = 0;
	  }
	  else if(sqr3 == " O " && sqr7 == " O " && sqr5T == 0 && turn == 1)
	  {
	    document.tic.sqr5.value = " O "
	    sqr5T = 1;
	    turn = 0;
	  }
	  else
	  {
	    computer()
	  }
	  //check2()
	}

	private void computer()
{
  //check for win
  
  if(sqr1 == " X " && sqr2 == " X " && sqr3T == 0 && turn == 1)
  {
    document.tic.sqr3.value = " O "
    sqr3T = 1;
    turn = 0;
  }
  else if(sqr2 == " X " && sqr3 == " X " && sqr1T == 0 && turn == 1)
  {
    document.tic.sqr1.value = " O "
    sqr1T = 1;
    turn = 0;
  }
  else if(sqr4 == " X " && sqr5 == " X " && sqr6T == 0 && turn == 1)
  {
    document.tic.sqr6.value = " O "
    sqr6T = 1;
    turn = 0;
  }
  else if(sqr5 == " X " && sqr6 == " X " && sqr4T == 0 && turn == 1)
  {
    document.tic.sqr4.value = " O "
    sqr4T = 1;
    turn = 0;
  }
  else if(sqr7 == " X " && sqr8 == " X " && sqr9T == 0 && turn == 1)
  {
    document.tic.sqr9.value = " O "
    sqr9T = 1;
    turn = 0;
  }
  else if(sqr8 == " X " && sqr9 == " X " && sqr7T == 0 && turn == 1)
  {
    document.tic.sqr7.value = " O "
    sqr7T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr5 == " X " && sqr9T == 0 && turn == 1)
  {
    document.tic.sqr9.value = " O "
    sqr9T = 1;
    turn = 0;
  }
  else if(sqr5 == " X " && sqr9 == " X " && sqr1T == 0 && turn == 1)
  {
    document.tic.sqr1.value = " O "
    sqr1T = 1;
    turn = 0;
  }
  else if(sqr3 == " X " && sqr5 == " X " && sqr7T == 0 && turn == 1)
  {
    document.tic.sqr7.value = " O "
    sqr7T = 1;
    turn = 0;
  }
  else if(sqr7 == " X " && sqr5 == " X " && sqr3T == 0 && turn == 1)
  {
    document.tic.sqr3.value = " O "
    sqr3T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr3 == " X " && sqr2T == 0 && turn == 1)
  {
    document.tic.sqr2.value = " O "
    sqr2T = 1;
    turn = 0;
  }
  else if(sqr4 == " X " && sqr6 == " X " && sqr5T == 0 && turn == 1)
  {
    document.tic.sqr5.value = " O "
    sqr5T = 1;
    turn = 0;
  }
  else if(sqr7 == " X " && sqr9 == " X " && sqr8T == 0 && turn == 1)
  {
    document.tic.sqr8.value = " O "
    sqr8T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr7 == " X " && sqr4T == 0 && turn == 1)
  {
    document.tic.sqr4.value = " O "
    sqr4T = 1;
    turn = 0;
  }
  else if(sqr2 == " X " && sqr8 == " X " && sqr5T == 0 && turn == 1)
  {
    document.tic.sqr5.value = " O "
    sqr5T = 1;
    turn = 0;
  }
  else if(sqr3 == " X " && sqr9 == " X " && sqr6T == 0 && turn == 1)
  {
    document.tic.sqr6.value = " O "
    sqr6T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr5 == " X " && sqr9T == 0 && turn == 1)
  {
    document.tic.sqr9.value = " O "
    sqr9T = 1;
    turn = 0;
  }
  else if(sqr4 == " X " && sqr7 == " X " && sqr1T == 0 && turn == 1)
  {
    document.tic.sqr1.value = " O "
    sqr1T = 1;
    turn = 0;
  }
  else if(sqr5 == " X " && sqr8 == " X " && sqr2T == 0 && turn == 1)
  {
    document.tic.sqr2.value = " O "
    sqr2T = 1;
    turn = 0;
  }
  else if(sqr6 == " X " && sqr9 == " X " && sqr3T == 0 && turn == 1)
  {
    document.tic.sqr3.value = " O "
    sqr3T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr4 == " X " && sqr7T == 0 && turn == 1)
  {
    document.tic.sqr7.value = " O "
    sqr7T = 1;
    turn = 0;
  }
  else if(sqr2 == " X " && sqr5 == " X " && sqr8T == 0 && turn == 1)
  {
    document.tic.sqr8.value = " O "
    sqr8T = 1;
    turn = 0;
  }
  else if(sqr3 == " X " && sqr6 == " X " && sqr9T == 0 && turn == 1)
  {
    document.tic.sqr9.value = " O "
    sqr9T = 1;
    turn = 0;
  }
  else if(sqr1 == " X " && sqr9 == " X " && sqr5T == 0 && turn == 1)
  {
    document.tic.sqr5.value = " O "
    sqr5T = 1;
    turn = 0;
  }
  else if(sqr3 == " X " && sqr7 == " X " && sqr5T == 0 && turn == 1)
  {
    document.tic.sqr5.value = " O "
    sqr5T = 1;
    turn = 0;
  }
  else
  {
    AI()
  }
  // check for win
}

	function AI()
	  {
	    vari()
	    if(document.tic.sqr5.value == "     " && turn == 1)
	    {
	      document.tic.sqr5.value = " O "
	      turn = 0
	      sqr5T = 1
	    }
	    else if(document.tic.sqr1.value == "     " && turn == 1)
	    {
	      document.tic.sqr1.value = " O "
	      turn = 0
	      sqr1T = 1
	    }
	    else if(document.tic.sqr9.value == "     " && turn == 1)
	    {
	      document.tic.sqr9.value = " O "
	      turn = 0
	      sqr9T = 1
	    }
	    else if(document.tic.sqr6.value == "     " && turn == 1)
	    {
	      document.tic.sqr6.value = " O "
	      turn = 0
	      sqr6T = 1
	    }
	    else if(document.tic.sqr2.value == "     " && turn == 1)
	    {
	      document.tic.sqr2.value = " O "
	      turn = 0
	      sqr2T = 1
	    }
	    else if(document.tic.sqr8.value == "     " && turn == 1)
	    {
	      document.tic.sqr8.value = " O "
	      turn = 0
	      sqr8T = 1
	    }
	    else if(document.tic.sqr3.value == "     " && turn == 1)
	    {
	      document.tic.sqr3.value = " O "
	      turn = 0
	      sqr3T = 1
	    }
	    else if(document.tic.sqr7.value == "     " && turn == 1)
	    {
	      document.tic.sqr7.value = " O "
	      turn = 0
	      sqr7T = 1
	    }
	    else if(document.tic.sqr4.value == "     " && turn == 1)
	    {
	      document.tic.sqr4.value = " O "
	      turn = 0
	      sqr4T = 1
	    }
	    //Check for win
	  }
}
