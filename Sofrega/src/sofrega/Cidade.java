/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofrega;

/**
 *
 * @author André Madeira
 */
public class Cidade {
    public String Nome;
    public int Disth;
    public int Distg;
    
    public Cidade(String nome,int disth, int distg){
  // nome cidade , disth(distancia em linha reta), distg(deistancia ente nos)
        Nome=nome;
        Disth=disth;
        Distg=distg;
    }
}
