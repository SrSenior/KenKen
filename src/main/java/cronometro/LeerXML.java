/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import TablaKenKen.JaulasKenKen;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jpveg
 */
public class LeerXML {
    
    public LeerXML(String xmlFilePath, List<JaulasKenKen> jaulasList) {

        try {
            File file = new File(xmlFilePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();

            NodeList partidaList = doc.getElementsByTagName("partida");

            for (int i = 0; i < partidaList.getLength(); i++) {
                Node partidaNode = partidaList.item(i);

                if (partidaNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element partidaElement = (Element) partidaNode;
                    NodeList jaulaList = partidaElement.getElementsByTagName("jaula");
                    List<JaulasKenKen> jaulas = new ArrayList<>();

                    for (int j = 0; j < jaulaList.getLength(); j++) {
                        Node jaulaNode = jaulaList.item(j);

                        if (jaulaNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element jaulaElement = (Element) jaulaNode;
                            String jaulaData = jaulaElement.getTextContent();
                            String[] jaulaDataArray = jaulaData.split(",");
                            int valor = Integer.parseInt(jaulaDataArray[0].trim());
                            String operacion = jaulaDataArray[1].trim();

                            List<Integer> coordenadas = new ArrayList<>();
                            for (int k = 2; k < jaulaDataArray.length; k++) {
                                String coordenada = jaulaDataArray[k].trim();
                                // Eliminar los paréntesis
                                coordenada = coordenada.replaceAll("\\(", "").replaceAll("\\)", "");
                                String[] coordenadaArray = coordenada.split(",");
                                int row = Integer.parseInt(coordenadaArray[0].trim()) - 1; // Restar 1 para ajustar a ArrayList
                                int col = Integer.parseInt(coordenadaArray[1].trim()) - 1; // Restar 1 para ajustar a ArrayList

                                int index = row * 6 + col; // Calcular el índice en ArrayList
                                coordenadas.add(index);
                            }

                            JaulasKenKen jaula = new JaulasKenKen(valor, operacion, coordenadas);
                            jaulas.add(jaula);
                        }
                    }
                    jaulasList.addAll(jaulas);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
