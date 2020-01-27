/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep;

import edu.escuealing.arep.calculadora.Calculadora;
import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Nodo;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 *
 * @author Juan David
 */
public class SparkWebApp {

    // Atributos
    private static Calculadora calculadora;
    private static LinkedList linkedList;
    private Nodo nodo;

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        calculadora = new Calculadora();
        linkedList = new LinkedList();
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Calculadora media y desviacion estandar</h2>"
                + "<form action=\"/results\">"
                + "  Digite los numeros separados por comas.<br>"
                + "  <input type=\"text\" name='numeros'>"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Calular Media y Desviacion Estandar\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        linkedList.clear();
        double num;
        String ans;
        String[] values = req.queryParams("numeros").split(",");
        for (String i : values) {
            num = Double.parseDouble(i);
            Nodo nodo = new Nodo(num, 0, null, null);
            linkedList.add(nodo);
        }

        ans = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<br:>" + "La Media de la lista de datos es: " + calculadora.calcularMedia(linkedList) + "<br:>"
                + "<p>" + "La Desviacion Estandar de la lista de datos es: " + calculadora.calcularDesviacionEstandar(linkedList) + "<p>"
                + "<form>"
                + "<input type=\"button\" value=\"Go back!\" onclick=\"history.back()\">"
                + "</form>"
                + "</body>"
                + "</html>";
        
        return ans;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
