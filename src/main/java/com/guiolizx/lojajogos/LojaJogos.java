/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.guiolizx.lojajogos;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.prefs.Preferences;

/**
 *
 * @author guiolizx
 */
public class LojaJogos {

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        Preferences prefs = Preferences.userRoot().node("LojaJogos");

        if (prefs.getBoolean("logged", false)) {
            int idUser = prefs.getInt("id_user", -1);

            new StoreWindow(idUser).setVisible(true);
        } else {
            LoginWindow main = new LoginWindow();
            main.setVisible(true);
        }

    }
}
