package org.usco.agro.almacen_salida_item;

import java.sql.Timestamp;
import java.sql.Date;


public class Almacen_salida_item {
    private int id;
	private int almacen_salida_id;
	private int producto_id;
	private int producto_presentacion_id;
	private int cantidad;
	private double precio;
	private int estado;

	
	public Almacen_salida_item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Almacen_salida_item(int id, int almacen_salida_id, int producto_id, int producto_presentacion_id, int cantidad, double precio, int estado) {
		super();
		this.id = id;
		this.almacen_salida_id = almacen_salida_id;
		this.producto_id = producto_id;
		this.producto_presentacion_id = producto_presentacion_id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.estado = estado;

	}

	public Almacen_salida_item(int almacen_salida_id, int producto_id, int producto_presentacion_id, int cantidad, double precio, int estado) {
		super();
		this.almacen_salida_id = almacen_salida_id;
		this.producto_id = producto_id;
		this.producto_presentacion_id = producto_presentacion_id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.estado = estado;

	}
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getAlmacen_salida_id() {
		return almacen_salida_id;
	}

	public void setAlmacen_salida_id(int almacen_salida_id) {
		this.almacen_salida_id = almacen_salida_id;
	}
	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}
	public int getProducto_presentacion_id() {
		return producto_presentacion_id;
	}

	public void setProducto_presentacion_id(int producto_presentacion_id) {
		this.producto_presentacion_id = producto_presentacion_id;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

    
	@Override
	public String toString() {
		return "Almacen_salida_item [id=" + id + ", almacen_salida_id=" + almacen_salida_id + ", producto_id=" + producto_id + ", producto_presentacion_id=" + producto_presentacion_id + ", cantidad=" + cantidad + ", precio=" + precio + ", estado=" + estado + "]";
	}
	
}
