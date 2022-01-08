package com.company;

public class Simple_Dot_Com
{
    private int m_num_of_hits = 0;
    private int[] m_location_cells;

    Simple_Dot_Com(int[] location_cells)
    {
        //m_num_of_hits = num_of_hits;
        m_location_cells = new int[Main.arr_size];

        for (int j = 0;j < Main.arr_size;j++)
        {
            m_location_cells[j] = location_cells[j];
        }
    }

    int GetNumOfHits()
    {
        return m_num_of_hits;
    }

    String CheckYourself(String user_guess)
    {
        int number = 0;
        String output = "noname";

            try {
                number = Integer.parseInt(user_guess);      //check if the string contains a valid integer
                                                            //if not then it throws an object
            } catch (NumberFormatException obj) {           //with type NumberFormatException
                System.exit(0);
            }

            for (int i = 0; i < Main.arr_size; i++)
            {
                if (m_location_cells[i] == number)
                {
                    m_num_of_hits++;
                    if (m_num_of_hits != 3) {

                        output = "Hit";
                        break;
                    }
                    else
                    {
                        output = "Kill";
                        break;
                    }
                }
                else
                {
                    output = "Miss";

                }

            }


        return output;
    }

}
