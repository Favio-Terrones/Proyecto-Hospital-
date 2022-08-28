/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Paciente;
import modelo.SistemaBiologico;
import modelo.PersonaResp;
import modelo.Administrador;
import modelo.Medico;
import modelo.AdminsListaDoble;
import modelo.PacientesListaDoble;
import modelo.ExamenFisico;
import modelo.Antecedentes;
import modelo.HCapListaDoble;
import modelo.MotivoConsulta;
import modelo.Sistema;
import modelo.SistemasBiologicosListaDoble;
import modelo.HistoriaClinicaApertura;
import modelo.MedicosListaDoble;
import java.util.Date;
import modelo.EvolucionesListaDoble;

/**
 *
 * @author Favio
 */
public class Datos {

    public static String version = "    1.0   ";

    public static Paciente crearPacienteDefecto() {

        Paciente paciente;
        String codigohistoria = "202012345";
        String documento = "88888888";
        String tipodocumento = "DNI";
        String apellPat = "Perez";
        String apellMat = "Gomez";
        String nombres = "Martin Bart";
        String sexo = "masculino";
        String edad = "30";
        String nombrecuent = "Pepito";
        String contra = "123";
        paciente = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, nombrecuent, contra);

        //DATOS FALTANTES
        String fecNac = "12/13/1980";
        String grdInstruccion = "secundaria completa";
        String estCivil = "casado";
        String numCel = "954531222";
        String domicilio = "Los algarrobos Urb Panamericana";
        String grupEtnico = "mestizo";
        String religion = "catolico";
        String ocuptacion = "Ing Civil";
        String lugProcedencia = "Piura";
        String lugNacimiento = "Chiclayo";

        paciente.addDatosFaltantes(fecNac, grdInstruccion, estCivil,
                lugNacimiento, numCel, domicilio, grupEtnico, religion, ocuptacion, lugProcedencia);
        return paciente;
    }

    public static PacientesListaDoble crearPacientesPorDefecto() {

        System.out.println("----------PACIENTES DEL SISTEMA----------");
        Paciente paciente;
        PacientesListaDoble listapacientes = new PacientesListaDoble();
        String codigohistoria = "202012345";
        String documento = "88888888";
        String tipodocumento = "DNI";
        String apellPat = "Perez";
        String apellMat = "Gomez";
        String nombres = "Renzo Bart";
        String sexo = "masculino";
        String edad = "30";
        String cuentanombre = "renzito";
        String contra = "12345";
        paciente = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente);
        
        
        
        
        
        
        codigohistoria = "202012346";
        documento = "55555555";
        tipodocumento = "DNI";
        apellPat = "Dominico";
        apellMat = "Tafur";
        nombres = "Maria Alexandra";
        sexo = "femenino";
        edad = "21";
        cuentanombre = "ale";
        contra = "123";
        paciente = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente);

        
        
        
        codigohistoria = "202012350";
        documento = "44444444";
        tipodocumento = "DNI";
        apellPat = "Moscoso";
        apellMat = "Perez";
        nombres = "Ansherly Sofia";
        sexo = "femenino";
        edad = "21";
        cuentanombre = "AN";
        contra = "123";
        paciente = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente);

        codigohistoria = "202011113";
        documento = "32143214";
        tipodocumento = "DNI";
        apellPat = "Klen";
        apellMat = "Kenedy";
        nombres = "Kiara Katarina ";
        sexo = "femenino";
        edad = "30";
        cuentanombre = "p";
        contra = "p";
        paciente = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente);

        Paciente paciente1;
        codigohistoria = "202012360";
        documento = "74454514";
        tipodocumento = "DNI";
        apellPat = "Lopez";
        apellMat = "Galvez";
        nombres = "Juan";
        sexo = "masculino";
        edad = "29";
        cuentanombre = "jgalvez";
        contra = "123";

        paciente1 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente1);

        Paciente paciente2;
        codigohistoria = "202012361";
        documento = "74455059";
        tipodocumento = "DNI";
        apellPat = "Montañez";
        apellMat = "Vera";
        nombres = "Maria";
        sexo = "femenino";
        edad = "25";
        cuentanombre = "mvera";
        contra = "123";

        paciente2 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente2);

        Paciente paciente3;
        codigohistoria = "202012361";
        documento = "74456031";
        tipodocumento = "DNI";
        apellPat = "Sotelo";
        apellMat = "Munive";
        nombres = "Luis";
        sexo = "masculino";
        edad = "40";
        cuentanombre = "lmunive";
        contra = "123";

        paciente3 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente3);

        Paciente paciente4;
        codigohistoria = "202012362";
        documento = "74457041";
        tipodocumento = "DNI";
        apellPat = "Tavara";
        apellMat = "Ramirez";
        nombres = "Pedro";
        sexo = "masculino";
        edad = "35";
        cuentanombre = "ptavara";
        contra = "1234";

        paciente4 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente4);

        Paciente paciente5;
        codigohistoria = "202012363";
        documento = "74458141";
        tipodocumento = "DNI";
        apellPat = "Melendez";
        apellMat = "Lara";
        nombres = "Estefany";
        sexo = "femenino";
        edad = "34";
        cuentanombre = "emlendez";
        contra = "123";
        paciente5 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente5);

        Paciente paciente6;
        codigohistoria = "202012364";
        documento = "50454541";
        tipodocumento = "DNI";
        apellPat = "Huerta";
        apellMat = "Gomez";
        nombres = "Manuel";
        sexo = "masculino";
        edad = "31";
        cuentanombre = "mhuerta";
        contra = "123";
        paciente6 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente6);

        Paciente paciente7;
        codigohistoria = "202012365";
        documento = "72718154";
        tipodocumento = "DNI";
        apellPat = "Silva";
        apellMat = "Munive";
        nombres = "Enrique";
        sexo = "masculino";
        edad = "50";
        cuentanombre = "esilva";
        contra = "123";
        paciente7 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente7);

        Paciente paciente8;
        codigohistoria = "202012366";
        documento = "26453474";
        tipodocumento = "DNI";
        apellPat = "Elescano";
        apellMat = "Jara";
        nombres = "Victor";
        sexo = "masculino";
        edad = "25";
        cuentanombre = "velescano";
        contra = "123";
        paciente8 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente8);

        Paciente paciente10;
        codigohistoria = "202012368";
        documento = "36991423";
        tipodocumento = "DNI";
        apellPat = "Barzola";
        apellMat = "Gonzales";
        nombres = "Shirly";
        sexo = "femenino";
        edad = "20";
        cuentanombre = "sbarzola";
        contra = "123";

        paciente10 = new Paciente(codigohistoria, documento, tipodocumento, apellPat, apellMat, nombres, sexo, edad, cuentanombre, contra);
        listapacientes.agregarAlFinal(paciente10);

        listapacientes.mostrarListaInicioFin();
        return listapacientes;
    }

    public static Medico crearMedicoDefecto() {

        Medico medico;

        String codigomedico = "12342020";
        String nombres = "Carlos Martin";
        String apellidos = "Soto Benites";
        int aniosservicio = 10;
        String numdocument = "11111111";
        String nombrecuenta = "drhouse";
        String contracuenta = "123";
        String espec = "Neumologia";
        String numeroesp = "1";
        medico = new Medico(codigomedico, nombres, apellidos, aniosservicio, numdocument, nombrecuenta, contracuenta, espec, numeroesp);

        return medico;
    }

    public static MedicosListaDoble crearMedicosPorDefecto() {
        System.out.println("----------MEDICOS DEL SISTEMA----------");
        Medico medico;
        MedicosListaDoble listamedicos = new MedicosListaDoble();

        String codigomedico = "12342020";
        String nombres = "Carlos Martin";
        String apellidos = "Soto Benites";
        int aniosservicio = 10;
        String numdocument = "11111111";
        String cuentanombre = "drhouse";
        String cuentacontra = "123";
        String especialidad = "Cardiologia";
        String numeroesp = "1";
        medico = new Medico(codigomedico, nombres, apellidos, aniosservicio, numdocument, cuentanombre, cuentacontra, especialidad, numeroesp);
        listamedicos.agregarAlFinal(medico);
        codigomedico = "11112020";
        nombres = "Jairo Sebastian";
        apellidos = "Sarria Kim";
        aniosservicio = 10;
        numdocument = "22222222";
        cuentanombre = "THEkiller";
        cuentacontra = "123";
        especialidad = "Pediatria";
        numeroesp = "1";
        medico = new Medico(codigomedico, nombres, apellidos, aniosservicio, numdocument, cuentanombre, cuentacontra, especialidad, numeroesp);
        listamedicos.agregarAlFinal(medico);

        codigomedico = "11332020";
        nombres = "Pepe Pablo";
        apellidos = "Paitan Perez";
        aniosservicio = 10;
        numdocument = "43218765";
        cuentanombre = "m";
        cuentacontra = "m";
        especialidad = "Medico General";
        numeroesp = "1";
        medico = new Medico(codigomedico, nombres, apellidos, aniosservicio, numdocument, cuentanombre, cuentacontra, especialidad, numeroesp);
        listamedicos.agregarAlFinal(medico);

        Medico medico1;

        String codigomedico1 = "12342030";
        String nombres1 = "Miguel Angel";
        String apellidos1 = "Mujica Lopez";
        int aniosservicio1 = 15;
        String numdocument1 = "12345789";
        String nombrecuenta1 = "miguel";
        String cuentacontra1 = "123";
        String especialidad1 = "Oncologia";
        String numeroesp1 = "1";
        medico1 = new Medico(codigomedico1, nombres1, apellidos1, aniosservicio1,
                numdocument1, nombrecuenta1, cuentacontra1, especialidad1, numeroesp1);

        listamedicos.agregarAlFinal(medico1);

        Medico medico2;

        String codigomedico2 = "12344105";
        String nombres2 = "Elena Dayanne";
        String apellidos2 = "Barzola Huaman";
        int aniosservicio2 = 15;
        String numdocument2 = "12345789";
        String cuentanombre2 = "elena";
        String cuentacontra2 = "123";
        String especialidad2 = "Oncologia";
        String numeroesp2 = "2";
        medico2 = new Medico(codigomedico2, nombres2, apellidos2,
                aniosservicio2, numdocument2, cuentanombre2, cuentacontra2, especialidad2, numeroesp2);

        listamedicos.agregarAlFinal(medico2);

        Medico medico3;

        String codigomedico3 = "23568974";
        String nombres3 = "Ximena";
        String apellidos3 = "Zavala Lara";
        int aniosservicio3 = 10;
        String numdocument3 = "52364785";
        String cuentanombre3 = "ximena";
        String cuentacontra3 = "123";
        String especialidad3 = "Ginecologia";
        String numeroesp3 = "1";
        medico3 = new Medico(codigomedico3, nombres3, apellidos3,
                aniosservicio3, numdocument3, cuentanombre3, cuentacontra3, especialidad3, numeroesp3);

        listamedicos.agregarAlFinal(medico3);

        Medico medico4;

        String codigomedico4 = "20003144";
        String nombres4 = "Mariano Luis";
        String apellidos4 = "Valdivia Gonzales";
        int aniosservicio4 = 20;
        String numdocument4 = "72651234";
        String cuentanombre4 = "mariano";
        String cuentacontra4 = "123";
        String especialidad4 = "Ginecologia";
        String numeroesp4 = "2";
        medico4 = new Medico(codigomedico4, nombres4, apellidos4,
                aniosservicio4, numdocument4, cuentanombre4, cuentacontra4, especialidad4, numeroesp4);

        listamedicos.agregarAlFinal(medico4);

        Medico medico5;

        String codigomedico5 = "20003300";
        String nombres5 = "Patricio Saul";
        String apellidos5 = "Vera Quispe";
        int aniosservicio5 = 14;
        String numdocument5 = "73142132";
        String cuentanombre5 = "patricio";
        String cuentacontra5 = "123";
        String especialidad5 = "Medico General";
        String numeroesp5 = "2";
        medico5 = new Medico(codigomedico5, nombres5, apellidos5,
                aniosservicio5, numdocument5, cuentanombre5, cuentacontra5, especialidad5, numeroesp5);

        listamedicos.agregarAlFinal(medico5);

        listamedicos.mostrarListaInicioFin();
        return listamedicos;
    }

    public static Administrador crearAdministradorDefecto() {
        Administrador admin;

        String codigoadmin = "1234";
        String contra = "88";
        admin = new Administrador(codigoadmin, contra);

        return admin;
    }

    public static AdminsListaDoble crearAdministradoresPorDefecto() {
        System.out.println("----------ADMINS DEL SISTEMA----------");
        Administrador admin;
        AdminsListaDoble listaadmins = new AdminsListaDoble();

        String codigoadmin = "1234";
        String contra = "88";
        admin = new Administrador(codigoadmin, contra);
        listaadmins.agregarAlFinal(admin);

        codigoadmin = "1235";
        contra = "999";
        admin = new Administrador(codigoadmin, contra);
        listaadmins.agregarAlFinal(admin);

        codigoadmin = "1236";
        contra = "a";
        admin = new Administrador(codigoadmin, contra);
        listaadmins.agregarAlFinal(admin);

        listaadmins.mostrarListaInicioFin();

        System.out.println("--------------------------------------");
        return listaadmins;
    }

    public static HistoriaClinicaApertura crearHistoriaDefecto() {
        HistoriaClinicaApertura historia;
        String RPApellidoPat = "BenitesRP";
        String RPApellidoMat = "HuarangaRP";
        String RPNombres = "Jahir JoseRP";
        String RPSexo = "masculino";
        String RPTipoDocu = "DNI";
        String RPDocum = "8888 8888";
        String RPNumCelular = "999888777";
        String RPDirec = "DireccionRP";

        PersonaResp RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        MotivoConsulta motivocons = new MotivoConsulta("-Brazo  izquierdo con hinchazón \n"
                + "-Piel pálida \n"
                + "-Erupciones en la piel\n"
                + "-Tos seca ", "-Dolor de pecho\n"
                + "-Cansancio \n"
                + "-Pérdida del olfato", "1 mes y 100 días ", "Insidioso", "El paciente sugiere que cerca al 3 de octubre del 2022 se levantó con un malestar en …. . \n"
                + "Una semana después detalla que empezó a sentir dolores de cabeza ….. ");

        Antecedentes anteced = new Antecedentes("-Resfriado común\n"
                + "-Depresión ", "-Panadol\n"
                + "-Aspirina ", "-Fuma\n"
                + "-Toma", "-Madre con daltonismo");

        String evsistemas;

        evsistemas = "\nTegumentario" + "\nLlenado capilar menor a 2 segundos" + "\nRespiratorio" + "\nPaciente refiere dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal ";

        ExamenFisico examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
        EvolucionesListaDoble listaevo = new EvolucionesListaDoble();

        historia = new HistoriaClinicaApertura("666666", crearMedicoDefecto().getCodigomedico(), "10/10/2010", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico, "Paciente con dificultad de respirar, informa que el día 01/09/2021 volvió de un viaje de la República Popular China después, específicamente en Wuhan ", "Covid-19", "Antibióticos \n"
                + "Descanso prolongado\n"
                + "Interconsulta a neumología ", listaevo);

        return historia;
    }

    public static HCapListaDoble crearHCsPorDefecto() {
        HCapListaDoble listahistorias = new HCapListaDoble();
        HistoriaClinicaApertura historiatest = crearHistoriaDefecto();
        historiatest.setCodigohistoriaclinica(listahistorias.getCodigohistorias());

        listahistorias.agregarAlFinal(historiatest);

        HistoriaClinicaApertura historia1;

        String RPApellidoPat = "Melendez";
        String RPApellidoMat = "Walls";
        String RPNombres = "Mauricio Jose";
        String RPSexo = "masculino";
        String RPTipoDocu = "DNI";
        String RPDocum = "17456324";
        String RPNumCelular = "945694412";
        String RPDirec = "Av Manuel Mendiola Urbanizacion Los Jazmines";

        PersonaResp RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        MotivoConsulta motivocons = new MotivoConsulta("-Brazo  izquierdo con hinchazón \n"
                + "-Dificultad para respirar \n"
                + "-Dolor en el pecho\n"
                + "-Tos", "-Lagrimeo Constante\n"
                + "-Cansancio \n"
                + "-Pérdida del olfato", "1 mes y 100 días ", "Insidioso", "El paciente sugiere que cerca al 1 de Enero del 2021 se levantó con un malestar en …. . \n"
                + "Una semana después detalla que empezó a sentir dolores de cabeza ….. ");

        Antecedentes anteced = new Antecedentes("-Resfriado común\n"
                + "-Depresión ", "-Panadol\n"
                + "-Aspirina ", "-Fuma\n"
                + "-Toma", "-Madre con daltonismo");

        String evsistemas;

        evsistemas = "\nTegumentario" + "\nLlenado capilar menor a 2 segundos" + "\nRespiratorio" + "\nPaciente refiere dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal ";

        ExamenFisico examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
        EvolucionesListaDoble listaevo = new EvolucionesListaDoble();

        historia1 = new HistoriaClinicaApertura("111111", crearMedicoDefecto().getCodigomedico(), "10/10/2015", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico, "Paciente con dificultad de respirar, informa que el día 01/09/2021 volvió de un viaje de la República Popular China después, específicamente en Wuhan ", "Covid-19", "Antibióticos \n"
                + "Descanso prolongado\n"
                + "Interconsulta a neumología ", listaevo);

        historia1.setCodigohistoriaclinica(listahistorias.getCodigohistorias());

        listahistorias.agregarAlFinal(historia1);

        HistoriaClinicaApertura historia2;

        RPApellidoPat = "Barzola";
        RPApellidoMat = "Jimenez";
        RPNombres = "Lucia";
        RPSexo = "femenino";
        RPTipoDocu = "DNI";
        RPDocum = "72651234";
        RPNumCelular = "954321234";
        RPDirec = "Av Perú  Urbanización Los mirones";

        RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        motivocons = new MotivoConsulta("-Dolor en el abdomen\n"
                + "-Nauseas  \n"
                + "-Irritabilidad en lacteos\n"
                + "-Dolor de cabeza", "-Somnolencia\n"
                + "-Labios Resecos \n"
                + "-Pérdida del gusto", "1 mes  ", "Insidioso", "El paciente sugiere que cerca al 4 de Agosto del 2022 se levantó con un malestar en …. . \n"
                + "Una semana después detalla que empezó a sentir dolores de estomago….. ");

        anteced = new Antecedentes("-Ingerir comida en mal estado\n"
                + "-Depresión ", "-Panadol\n"
                + "-Aspirina ", "-Fuma\n"
                + "-Toma", "-Padre con gastritis");

        evsistemas = "\nTegumentario" + "\nLlenado capilar normal" + "\nRespiratorio" + "\nPaciente no presenta dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal ";

        examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
        listaevo = new EvolucionesListaDoble();
        
        historia2 = new HistoriaClinicaApertura("222222", crearMedicoDefecto().getCodigomedico(), "10/01/2022", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico,
                "Paciente con malestar estomacal informa que el dia 01/10/2022 ingerio comida en una carretilla al paso ", "Gastritis", "Antibióticos \n"
                + "Suero por 1 semana\n"
                + "Descanso por 4 días ", listaevo);
        historia2.setCodigohistoriaclinica(listahistorias.getCodigohistorias());
        listahistorias.agregarAlFinal(historia2);

        HistoriaClinicaApertura historia3;

        RPApellidoPat = "Lujan";
        RPApellidoMat = "Huerta";
        RPNombres = "Franco";
        RPSexo = "masculino";
        RPTipoDocu = "DNI";
        RPDocum = "71241231";
        RPNumCelular = "974123654";
        RPDirec = "Av Larco Condominio Los girasoles";

        RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        motivocons = new MotivoConsulta("-Piel enrojecida\n"
                + "-Ardor en la piel  \n"
                + "-Irritabilidad al sol\n"
                + "-Dolor de cabeza", "-Somnolencia\n"
                + "-Escalofrios \n"
                + "-Comezon", "1 mes  ", "Insidioso", "El paciente sugiere que cerca al 4 de Agosto del 2022 se levantó con un enrojecimiento en …. . \n"
                + "Una semana después detalla que empezó a sentir escalofrios y ardor en la piel….. ");

        anteced = new Antecedentes("-Ingerio Pescado\n"
                + "-Alergico ", "-Betametasona\n"
                + "-Aspirina ", "-Fuma\n"
                + "-Toma", "-Hermano presenta los mismos sintomas");

        evsistemas = "\nTegumentario" + "\nLlenado capilar bajo" + "\nRespiratorio" + "\nPaciente no presenta dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal ";

        examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
        listaevo = new EvolucionesListaDoble();

        historia3 = new HistoriaClinicaApertura("333333", crearMedicoDefecto().getCodigomedico(), "10/01/2022", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico, "Paciente con enrojecimiento en la piel indica que ingirio ceviche , y a raiz de eso presento al día siguiente la piel con sarpullido ", "Intoxicacion", "Antibióticos \n"
                + "Betametasona\n"
                + "No exposicion al sol", listaevo);
        historia3.setCodigohistoriaclinica(listahistorias.getCodigohistorias());
        listahistorias.agregarAlFinal(historia3);
        
        
      



 HistoriaClinicaApertura historia4;

         RPApellidoPat = "Salas";
         RPApellidoMat = "Lorca";
         RPNombres = "Federico";
         RPSexo = "masculino";
         RPTipoDocu = "DNI";
         RPDocum = "73212441";
         RPNumCelular = "954123321";
         RPDirec = "San Borja , Urbanización Cristo Unido";
        
        RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        motivocons = new MotivoConsulta("-Dificultad para miccionar\n"
                + "-Dolor en la zona baja del abdomen \n"
                + "-Acude al baño constantemente\n"
                + "-Dolor para miccionar", "-Escalofrios\n"
                + "-Dolor en la espalda baja\n"
                + "-Piernas adormecidas", "1 mes  ", "Insidioso", "El paciente indica que presenta dificultad para orinar , además menciona que acude frecuentemente al baño …. . \n"
                + "Una semana después detalla que empezó a sentir dolores intensos al miccionar  y dolor en la espalda baja….. ");

       anteced = new Antecedentes("-Prostata\n"
                + "-Constante sedentarismo ", "-Peso elevado\n"
                + "-Aspirina", "-Fuma\n"
                + "-Toma", "-Familia hereditaria de cancer");
       
        
        
   

        evsistemas = "\nTegumentario" + "\nLlenado capilar normal" + "\nRespiratorio" + "\nPaciente no presenta dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal , dificultad para miccionar ";

        examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
       listaevo=new EvolucionesListaDoble();
        
        historia4 = new HistoriaClinicaApertura("444444", crearMedicoDefecto().getCodigomedico(), "10/01/2022", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico, "Paciente con dificultad para miccionar a raiz del a secuelas de su cancer de prostata", "Prostata Leve", "Antibióticos \n"
                + "Betametasona\n"
                + "Ingesta de verduras, hacer ejercicios interdiarios", listaevo);

        
        historia4.setCodigohistoriaclinica(listahistorias.getCodigohistorias());        
        listahistorias.agregarAlFinal(historia4);
        
         HistoriaClinicaApertura historia5;

         RPApellidoPat = "Tantahuillca";
         RPApellidoMat = "Vega";
         RPNombres = "Alex";
         RPSexo = "masculino";
         RPTipoDocu = "DNI";
         RPDocum = "71234132";
         RPNumCelular = "954123321";
         RPDirec = "San Isidro , Urb Miroquesada";
        
        RP = new PersonaResp(RPApellidoPat, RPApellidoMat, RPNombres, RPSexo, RPTipoDocu, RPDocum, RPNumCelular, RPDirec);
        motivocons = new MotivoConsulta("-Dolor en el pecho\n"
                + "-Mareos constantes\n"
                + "-Olvida las cosas\n"
                + "-Dolor de cabeza", "-Escalofrios\n"
                + "-Migraña\n"
                + "-Somnolencia", "1 mes  ", "Insidioso", "El paciente indica que presenta dolores intermitentes en el pecho , además menciona que acude frecuentemente se siente más cansado de lo normal …. . \n"
                + "Una semana después detalla que empezó a sentir dolores intensos en el pecho al hacer fuerza….. ");

        anteced = new Antecedentes("-Pre-Infarto\n"
                + "-Colesterol Alto", "-Peso elevado\n"
                + "-Aspirina", "-Fuma\n"
                + "-Toma", "-Familia hereditaria de cancer");
       
        
        
    

        evsistemas = "\nTegumentario" + "\nLlenado capilar elevado" + "\nRespiratorio" + "\nPaciente no presenta dificultad para respirar" + "\nSanguíneo"
                + "\nCantidades de glóbulos blancos superior al normal" + "\nExcretor" + "\nCantidad de sales mayor al normal  ";

        examenfisico = new ExamenFisico("Aparente mal estado general ", evsistemas);
        listaevo=new EvolucionesListaDoble();
        
        historia5 = new HistoriaClinicaApertura("555555", crearMedicoDefecto().getCodigomedico(), "10/01/2022", crearPacienteDefecto(), RP, motivocons, anteced, examenfisico, "Paciente con dolores intermitentes en el pecho", "Cardiologia", "Antibióticos \n"
                + "Betametasona\n"
                + "Comer Vegetales, cero grasa", listaevo);

        historia5.setCodigohistoriaclinica(listahistorias.getCodigohistorias()); 
        
        listahistorias.agregarAlFinal(historia5);
        
        return listahistorias;
    }

    public static Sistema crearSistemaDefecto() {
        Sistema sistema;

        PacientesListaDoble listapacientes = crearPacientesPorDefecto();
        MedicosListaDoble listamedicossite = crearMedicosPorDefecto();
        AdminsListaDoble listaadmins = crearAdministradoresPorDefecto();
        HCapListaDoble listahistoriasist = crearHCsPorDefecto();

        sistema = new Sistema(listapacientes, listamedicossite, listaadmins, listahistoriasist);

        //En esa parte se le da una cita al medico con codigo 12342020, el dia 1 de este mes, al paciente con codigo 202012345 
        sistema.getListamedicos().asignarCitaAunMedico("12342020", "24", sistema.getListapacientes().ObtenerNodoConCodigo("202012345").elemento);
        System.out.println("Paciente con cita: \n" + sistema.getListapacientes().ObtenerNodoConCodigo("202012345").elemento + "\n");

        return sistema;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
