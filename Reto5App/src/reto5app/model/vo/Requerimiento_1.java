package reto5app.model.vo;

public class Requerimiento_1 {
    // Atributos
    private String fechaCompra;
    private Integer codCompra;
    private String nombreProveedor;
    private String pagado;

    public Requerimiento_1(){

    }

    public Requerimiento_1(String fechaCompra,Integer codCompra, String nombreProveedor, String pagado){
        this.setFechaCompra(fechaCompra);
        this.setCodCompra(codCompra);
        this.setNombreProveedor(nombreProveedor);
        this.setPagado(pagado);
    }

    
    public String getPagado() {
        return pagado;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Integer getCodCompra() {
        return codCompra;
    }
    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

}