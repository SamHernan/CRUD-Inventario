//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.16 a las 12:34:25 PM CDT 
//


package uv.cafeteria.inventario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="producto" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "producto"
})
@XmlRootElement(name = "ReadArtResponse")
public class ReadArtResponse {

    @XmlElement(required = true)
    protected List<ReadArtResponse.Producto> producto;

    /**
     * Gets the value of the producto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadArtResponse.Producto }
     * 
     * 
     */
    public List<ReadArtResponse.Producto> getProducto() {
        if (producto == null) {
            producto = new ArrayList<ReadArtResponse.Producto>();
        }
        return this.producto;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clave",
        "nombre",
        "cantidad",
        "unidad",
        "precio"
    })
    public static class Producto {

        protected int clave;
        @XmlElement(required = true)
        protected String nombre;
        protected float cantidad;
        @XmlElement(required = true)
        protected String unidad;
        protected float precio;

        /**
         * Obtiene el valor de la propiedad clave.
         * 
         */
        public int getClave() {
            return clave;
        }

        /**
         * Define el valor de la propiedad clave.
         * 
         */
        public void setClave(int value) {
            this.clave = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidad.
         * 
         */
        public float getCantidad() {
            return cantidad;
        }

        /**
         * Define el valor de la propiedad cantidad.
         * 
         */
        public void setCantidad(float value) {
            this.cantidad = value;
        }

        /**
         * Obtiene el valor de la propiedad unidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidad() {
            return unidad;
        }

        /**
         * Define el valor de la propiedad unidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidad(String value) {
            this.unidad = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public float getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(float value) {
            this.precio = value;
        }

    }

}