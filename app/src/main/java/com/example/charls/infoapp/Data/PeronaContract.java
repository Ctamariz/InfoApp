package com.example.charls.infoapp.Data;

import android.provider.BaseColumns;

/**
 * Created by charls on 05-03-17.
 */

public class PeronaContract {

    public static abstract class PersonaEntry implements BaseColumns {
        public static final String TABLE_NAME ="Persona";

        public static final String ID = "id";
        public static final String Nombre = "nombre";
        public static final String Apellido = "apellido";
        public static final String Celular = "celular";
        public static final String Especialidad = "especialidad";
        public static final String Foto = "foto";

    }
}
