/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author pc
 */
class Node

{

    protected int data;

    protected Node link;

 

    /*  Constructor  */

    public Node()

    {

        link = null;

        data = 0;

    }    

    /*  Constructor  */

    public Node(int d,Node n)

    {

        data = d;

        link = n;

    }    

    /*  Function to set link to next Node  */

    public void setLink(Node n)

    {

        link = n;

    }    

    /*  Function to set data to current Node  */

    public void setData(int d)

    {

        data = d;

    }    

    /*  Function to get link to next node  */

    public Node getLink()

    {

        return link;

    }    

    /*  Function to get data from current Node  */

    public int getData()

    {

        return data;

    }

}