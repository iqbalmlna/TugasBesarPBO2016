/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPelanggan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class MenuPelangganController implements ActionListener {
    MenuPelanggan menPelView;

    public MenuPelangganController() {
        menPelView = new MenuPelanggan();
        menPelView.setVisible(true);
        menPelView.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if(e == menPelView.getBtnPickUp()){
            System.out.println("Buka menu pickup");
            new Order_TransportasiController();
        }else if(e == menPelView.getBtnCourier()){
            System.out.println("Buka menu Kurir");
            new Order_CourierController();
            menPelView.dispose();
        }else if(e == menPelView.getBtnLogOut()){
            System.out.println("Buka halaman login");
            new Menu1Controller();
            menPelView.dispose();
        }
    }
    
}
