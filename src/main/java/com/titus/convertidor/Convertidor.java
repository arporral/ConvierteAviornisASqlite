/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convertidor;

import com.titus.convierteaviornisasqlite.ant.Anillas;
import com.titus.convierteaviornisasqlite.ant.AnoContable;
import com.titus.convierteaviornisasqlite.ant.Bic;
import com.titus.convierteaviornisasqlite.ant.Criadores;
import com.titus.convierteaviornisasqlite.ant.CuotasCriadores;
import com.titus.convierteaviornisasqlite.ant.DatosFijos;
import com.titus.convierteaviornisasqlite.ant.DetalleFacturas;
import com.titus.convierteaviornisasqlite.ant.DetallePedidos;
import com.titus.convierteaviornisasqlite.ant.Fabricantes;
import com.titus.convierteaviornisasqlite.ant.Facturas;
import com.titus.convierteaviornisasqlite.ant.Grupos;
import com.titus.convierteaviornisasqlite.ant.NumerosAnillas;
import com.titus.convierteaviornisasqlite.ant.Paises;
import com.titus.convierteaviornisasqlite.ant.Pedidos;
import com.titus.convierteaviornisasqlite.ant.TiposAnillas;
import com.titus.convierteaviornisasqlite.ant.Usuarios;
import com.titus.convierteaviornisasqlite.nue.Anillas2;
import com.titus.convierteaviornisasqlite.nue.AnoContable2;
import com.titus.convierteaviornisasqlite.nue.Bic2;
import com.titus.convierteaviornisasqlite.nue.Criadores2;
import com.titus.convierteaviornisasqlite.nue.CuotasCriadores2;
import com.titus.convierteaviornisasqlite.nue.DatosFijos2;
import com.titus.convierteaviornisasqlite.nue.DetalleFacturas2;
import com.titus.convierteaviornisasqlite.nue.DetallePedidos2;
import com.titus.convierteaviornisasqlite.nue.Fabricantes2;
import com.titus.convierteaviornisasqlite.nue.Facturas2;
import com.titus.convierteaviornisasqlite.nue.Grupos2;
import com.titus.convierteaviornisasqlite.nue.NumerosAnillas2;
import com.titus.convierteaviornisasqlite.nue.Paises2;
import com.titus.convierteaviornisasqlite.nue.Pedidos2;
import com.titus.convierteaviornisasqlite.nue.TiposAnillas2;
import com.titus.convierteaviornisasqlite.nue.Usuarios2;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author arpor
 */
public class Convertidor {

    // Create EntityManagerFactory for a persistence unit called em1.
    EntityManagerFactory ema = Persistence.createEntityManagerFactory("aviornisPU");
    EntityManagerFactory emc = Persistence.createEntityManagerFactory("aviornisSqlitePU");

    List li;
    int num;
    int res;
    int batchSize = 100;

    public Convertidor(int j, int tamaño, int primerItem) {
        EntityManager em = ema.createEntityManager();

        // Get a transaction instance and start the transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {
            switch (j) {
                case 1 -> li = (List <Anillas>) em.createQuery("select o from Anillas as o").getResultList();
                case 2 -> li = (List <AnoContable>) em.createQuery("select o from AnoContable as o").getResultList();
                case 3 -> li = (List <Bic>) em.createQuery("select o from Bic as o").getResultList();
                case 4 -> li = (List <Criadores>) em.createQuery("select o from Criadores as o").getResultList();
                case 5 -> li = (List <CuotasCriadores>) em.createQuery("select o from CuotasCriadores as o").getResultList();
                case 6 -> li = (List <DatosFijos>) em.createQuery("select o from DatosFijos as o").getResultList();
                case 7 -> li = (List <DetalleFacturas>) em.createQuery("select o from DetalleFacturas as o").getResultList();
                case 8 -> li = (List <DetallePedidos>) em.createQuery("select o from DetallePedidos as o").getResultList();
                case 9 -> li = (List <Fabricantes>) em.createQuery("select o from Fabricantes as o").getResultList();
                case 10 -> li = (List <Facturas>) em.createQuery("select o from Facturas as o").getResultList();
                case 11 -> li = (List <Grupos>) em.createQuery("select o from Grupos as o").getResultList();
                case 12 -> li = (List <NumerosAnillas>) em.createQuery("select o from NumerosAnillas as o").getResultList();
                case 13 -> li = (List <Paises>) em.createQuery("select o from Paises as o").getResultList();
                case 14 -> li = (List <Pedidos>) em.createQuery("select o from Pedidos as o").getResultList();
                case 15 -> li = (List <TiposAnillas>) em.createQuery("select o from TiposAnillas as o").getResultList();
                case 16 -> li = (List <Usuarios>) em.createQuery("select o from Usuarios as o").getResultList();
            }
        } finally {
            tx.commit();
            em.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertidor cc;

        cc = new Convertidor(1, 0, 0);
        if (cc.insertAnillas()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " anillas de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de anillas ha finalizado con errores");
        }
        cc = new Convertidor(2, 0, 0);
        if (cc.insertAnoContable()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " años contables de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de años contables ha finalizado con errores");
        }
        cc = new Convertidor(3, 0, 0);
        if (cc.insertBic()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " bics de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de anillas ha finalizado con errores");
        }
        cc = new Convertidor(4, 0, 0);
        if (cc.insertCriadores()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " criadores de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de criadores ha finalizado con errores");
        }
        cc = new Convertidor(5, 0, 0);
        if (cc.insertCuotasCriadores()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " cuotas de criadores de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de cuotas de criadores ha finalizado con errores");
        }
        cc = new Convertidor(6, 0, 0);
        if (cc.insertDatosFijos()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " datos fijos de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de datos fijos ha finalizado con errores");
        }
        cc = new Convertidor(10, 0, 0);
        if (cc.insertFacturas()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " facturas de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de facturas ha finalizado con errores");
        }
        cc = new Convertidor(14, 0, 0);
        if (cc.insertPedidos()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " pedidos de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de pedidos ha finalizado con errores");
        }
        cc = new Convertidor(7, 0, 0);
        if (cc.insertDetalleFacturas()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " detalles de factura de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de detalles de factura ha finalizado con errores");
        }
        cc = new Convertidor(8, 0, 0);
        if (cc.insertDetallePedidos()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " detalles de pedido de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de detalles de pedido ha finalizado con errores");
        }
        cc = new Convertidor(9, 0, 0);
        if (cc.insertFabricantes()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " fabricantes de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de fabricantes ha finalizado con errores");
        }
         cc = new Convertidor(16, 0, 0);
        if (cc.insertUsuarios()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " usuarios de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de usuarios ha finalizado con errores");
        }
        cc = new Convertidor(11, 0, 0);
        if (cc.insertGrupos()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " grupos de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de grupos ha finalizado con errores");
        }
        cc = new Convertidor(12, 0, 0);
        if (cc.insertNumerosAnillas()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " números de anillas de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de números de anillas ha finalizado con errores");
        }
        cc = new Convertidor(13, 0, 0);
        if (cc.insertPaises()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " países de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de paises ha finalizado con errores");
        }
        cc = new Convertidor(15, 0, 0);
        if (cc.insertTiposAnillas()) {
            System.out.println("Proceso finalizado correctamente. Se han insertado " + cc.num + " tipos de anillas de Aviornis en Sqlite");
        } else {
            System.out.println("El proceso de tipos de anillas ha finalizado con errores");
        }       
    }

    public boolean insertAnillas() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Anillas2").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Anillas en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Anillas a = (Anillas) it.next();

            Anillas2 b = new Anillas2(a.getCodigoAnilla());

            b.setCantMinima(a.getCantMinima());
            b.setCodigoDiametro(a.getCodigoDiametro());
            b.setCodigoFabricante(a.getCodigoFabricante());
            b.setDiametro(a.getDiametro());
            b.setFechaBaja(a.getFechaBaja());
            b.setIndBaja(a.getIndBaja());
            b.setNumeroArticulo(a.getNumeroArticulo());
            b.setPeso(a.getPeso());
            b.setPrecio(a.getPrecio());
            b.setPrecioCompra(a.getPrecioCompra());
            b.setTipoAnilla(a.getTipoAnilla());
            b.setTipoImpresion(a.getTipoImpresion());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertAnoContable() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from AnoContable2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de AnoContable en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            AnoContable a = (AnoContable) it.next();

            AnoContable2 b = new AnoContable2(a.getAno());

            b.setAno(a.getAno());
            b.setIndActivo(a.getIndActivo());
            b.setUltimoPedido(a.getUltimoPedido());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertBic() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Bic2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Bic en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Bic a = (Bic) it.next();

            Bic2 b = new Bic2(a.getNumSec());

            b.setBic2(a.getBic());
            b.setDenominacion(a.getDenominacion());
            b.setNrbe(a.getNrbe());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertCriadores() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from Criadores2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Criadores en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Criadores ca = (Criadores) it.next();

            Criadores2 c = new Criadores2(ca.getNumeroCriador(), ca.getCodigoCriador());

            c.setNombre(ca.getNombre());
            c.setApel1(ca.getApel1());
            c.setApel2(ca.getApel2());
            c.setCifNif(ca.getCifNif());
            c.setOtros(ca.getOtros());
            c.setDireccion(ca.getDireccion());
            c.setCodigoPostal(ca.getCodigoPostal());
            c.setLocalidad(ca.getLocalidad());
            c.setProvincia(ca.getProvincia());
            c.setTelefono(ca.getTelefono());
            c.setTelefonoMovil(ca.getTelefonoMovil());
            c.setFax(ca.getFax());
            c.setEmail(ca.getEmail());
            c.setFechaAlta(ca.getFechaAlta());
            c.setCuenta(ca.getCuenta());
            c.setTarjeta(ca.getTarjeta());
            c.setExptarj(ca.getExptarj());
            c.setPago(ca.getPago());
            c.setFechaPago(ca.getFechaPago());
            c.setCarnet(ca.getCarnet());
            c.setObservaciones(ca.getObservaciones());
            c.setMarcaBaja(ca.getMarcaBaja());
            c.setFechaBaja(ca.getFechaBaja());
            c.setMotivoBaja(ca.getMotivoBaja());
            c.setProfesion(ca.getProfesion());
            c.setPais(ca.getPais());
            c.setCvv(ca.getCvv());
            c.setCodigoUsuario(ca.getCodigoUsuario());
            c.setIndVip(ca.getIndVip());
            c.setIban(ca.getIban());
            c.setBic(ca.getBic());
            c.setFeccadCarnet(ca.getFeccadCarnet());

            em.persist(c);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertCuotasCriadores() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from CuotasCriadores2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de CuotasCriadores en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            CuotasCriadores a = (CuotasCriadores) it.next();

            CuotasCriadores2 b = new CuotasCriadores2(a.getNumeroCuota(), a.getCodigoCriador());

            Query query = em.createNamedQuery("Criadores2.findByNumeroCriador");
            query.setParameter("numeroCriador", a.getNumeroCriador().getNumeroCriador());
            Criadores2 criador = (Criadores2) query.getSingleResult();
            b.setNumeroCriador(criador);

            b.setAno(a.getAno());
            b.setFechaDevolucion(a.getFechaDevolucion());
            b.setFechaPago(a.getFechaPago());
            b.setFechaQ19(a.getFechaQ19());
            b.setFormaPago(a.getFormaPago());
            b.setImporte(a.getImporte());
            b.setIndDevolucion(a.getIndDevolucion());
            b.setIndPagado(a.getIndPagado());
            b.setIndQ19(a.getIndQ19());
            b.setNumeroCuota(a.getNumeroCuota());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertDatosFijos() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from DatosFijos2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de DatosFijos en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            DatosFijos a = (DatosFijos) it.next();

            DatosFijos2 b = new DatosFijos2(a.getNumSec());

            b.setBic(a.getBic());
            b.setCcc(a.getCcc());
            b.setCif(a.getCif());
            b.setClave(a.getClave());
            b.setCodigoPostal(a.getCodigoPostal());
            b.setCuentaCorreoSaliente(a.getCuentaCorreoSaliente());
            b.setDiaCobroCuotas(a.getDiaCobroCuotas());
            b.setDiasCarenciaNuevasAltas(a.getDiasCarenciaNuevasAltas());
            b.setDireccion(a.getDireccion());
            b.setEmail(a.getEmail());
            b.setFax(a.getFax());
            b.setIban(a.getIban());
            b.setLocalidad(a.getLocalidad());
            b.setMesCobroCuotas(a.getMesCobroCuotas());
            b.setNombreEmpresa(a.getNombreEmpresa());
            b.setPais(a.getPais());
            b.setProvincia(a.getProvincia());
            b.setResponsable(a.getResponsable());
            b.setServidorCorreoSaliente(a.getServidorCorreoSaliente());
            b.setTelefono(a.getTelefono());
            b.setUsuario(a.getUsuario());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertDetalleFacturas() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from DetalleFacturas2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de DetalleFacturas en Sqlite");

        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            DetalleFacturas a = (DetalleFacturas) it.next();

            DetalleFacturas2 b = new DetalleFacturas2(a.getNumLineaFac());

            Query query = em.createNamedQuery("Facturas2.findByNumSec");
            query.setParameter("numSec", a.getNumSec().getNumSec());
            Facturas2 factura = (Facturas2) query.getSingleResult();
            b.setNumSec(factura);

            b.setCantidad(a.getCantidad());
            b.setConcepto(a.getConcepto());
            b.setImporte(a.getImporte());
            b.setNumLineaFac(a.getNumLineaFac());
            b.setNumeroPedido(a.getNumeroPedido());
            b.setTipoIva(a.getTipoIva());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertDetallePedidos() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from DetallePedidos2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de DetallePedidos en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            DetallePedidos a = (DetallePedidos) it.next();

            DetallePedidos2 b = new DetallePedidos2(a.getNumLinea());

            Query query = em.createNamedQuery("Anillas2.findByCodigoAnilla");
            query.setParameter("codigoAnilla", a.getCodigoAnilla().getCodigoAnilla());
            Anillas2 anilla = (Anillas2) query.getSingleResult();
            b.setCodigoAnilla(anilla);

            query = em.createNamedQuery("Pedidos2.findByNumSec");
            query.setParameter("numSec", a.getNumSec().getNumSec());
            Pedidos2 pedido = (Pedidos2) query.getSingleResult();
            b.setNumSec(pedido);

            b.setCantidad(a.getCantidad());
            b.setEspecie(a.getEspecie());
            b.setImporte(a.getImporte());
            b.setMarcaEspecial(a.getMarcaEspecial());
            b.setNumLinea(a.getNumLinea());
            b.setNumeroCertif(a.getNumeroCertif());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertFabricantes() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Fabricantes2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Fabricantes en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Fabricantes a = (Fabricantes) it.next();

            Fabricantes2 b = new Fabricantes2(a.getCodigoFabricante());

            b.setCodigoPostal(a.getCodigoPostal());
            b.setDireccion(a.getDireccion());
            b.setEmail(a.getEmail());
            b.setFax(a.getFax());
            b.setIdioma(a.getIdioma());
            b.setLocalidad(a.getLocalidad());
            b.setNombre(a.getNombre());
            b.setPais(a.getPais());
            b.setTelefono(a.getTelefono());
            b.setTipoDeEnvio(a.getTipoDeEnvio());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertFacturas() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Facturas2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Facturas en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Facturas a = (Facturas) it.next();

            Facturas2 b = new Facturas2(a.getNumSec());

            Query query = em.createNamedQuery("Criadores2.findByNumeroCriador");
            query.setParameter("numeroCriador", a.getNumeroCriador().getNumeroCriador());
            Criadores2 criador = (Criadores2) query.getSingleResult();
            b.setNumeroCriador(criador);

            b.setCodigoUsuario(a.getCodigoUsuario());
            b.setComentario(a.getComentario());
            b.setFechaDevolucion(a.getFechaDevolucion());
            b.setFechaEmision(a.getFechaEmision());
            b.setFechaPago(a.getFechaPago());
            b.setFechaQ19(a.getFechaQ19());
            b.setGastos(a.getGastos());
            b.setImporte(a.getImporte());
            b.setIndDevolucion(a.getIndDevolucion());
            b.setIndPagado(a.getIndPagado());
            b.setIndQ19(a.getIndQ19());
            b.setIva(a.getIva());
            b.setNumeroFactura(a.getNumeroFactura());
            b.setTipoCarta(a.getTipoCarta());
            b.setTipoPago(a.getTipoPago());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertGrupos() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from Grupos2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Grupos en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Grupos a = (Grupos) it.next();

            Grupos2 b = new Grupos2(a.getNumSec());

            Query query = em.createNamedQuery("Usuarios2.findByCodigoUsuario");
            query.setParameter("codigoUsuario", a.getCodigoUsuario().getCodigoUsuario());
            Usuarios2 usuario = (Usuarios2) query.getSingleResult();
            b.setCodigoUsuario(usuario);

            b.setPerfil(a.getPerfil());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertNumerosAnillas() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from NumerosAnillas2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de NumerosAnillas en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            NumerosAnillas a = (NumerosAnillas) it.next();

            NumerosAnillas2 b = new NumerosAnillas2(a.getNumSec());

            b.setAnno(a.getAnno());
            b.setCodigoAnilla(a.getCodigoAnilla());
            b.setCodigoDiametro(a.getCodigoDiametro());
            b.setCodigoTipoAnilla(a.getCodigoTipoAnilla());
            b.setEspecie(a.getEspecie());
            b.setFechaEnvio(a.getFechaEnvio());
            b.setFechaRecepcion(a.getFechaRecepcion());
            b.setMarcaEspecial(a.getMarcaEspecial());
            b.setNumeroAnilla(a.getNumeroAnilla());
            b.setNumeroCertif(a.getNumeroCertif());
            b.setNumeroCriador(a.getNumeroCriador());
            b.setNumeroPedido(a.getNumeroPedido());
            b.setTipoAnilla(a.getTipoAnilla());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertPaises() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Paises2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Paises en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Paises a = (Paises) it.next();

            Paises2 b = new Paises2(a.getNumSec());

            b.setCee(a.getCee());
            b.setContinente(a.getContinente());
            b.setImporteCuota(a.getImporteCuota());
            b.setPais(a.getPais());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertPedidos() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();

        int borradas = em.createQuery("delete from Pedidos2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Pedidos en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Pedidos a = (Pedidos) it.next();

            Pedidos2 b = new Pedidos2(a.getNumSec());

            Query query = em.createNamedQuery("Criadores2.findByNumeroCriador");
            query.setParameter("numeroCriador", a.getNumeroCriador().getNumeroCriador());
            Criadores2 criador = (Criadores2) query.getSingleResult();
            b.setNumeroCriador(criador);

            b.setCodigoUsuario(a.getCodigoUsuario());
            b.setComentario(a.getComentario());
            b.setFechaEnvio(a.getFechaEnvio());
            b.setFechaPagoAnticipado(a.getFechaPagoAnticipado());
            b.setFechaPedido(a.getFechaPedido());
            b.setFechaRecepcion(a.getFechaRecepcion());
            b.setGastos(a.getGastos());
            b.setIndFacturado(a.getIndFacturado());
            b.setIndPedido(a.getIndPedido());
            b.setIndRecibido(a.getIndRecibido());
            b.setNumeroPedido(a.getNumeroPedido());
            b.setTipoCarta(a.getTipoCarta());
            b.setTipoIva(a.getTipoIva());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertTiposAnillas() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from TiposAnillas2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de TiposAnillas en Sqlite");
        
        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            TiposAnillas a = (TiposAnillas) it.next();

            TiposAnillas2 b = new TiposAnillas2(a.getTipoAnilla());

            b.setCodigoTipoAnilla(a.getCodigoTipoAnilla());
            b.setNombre(a.getNombre());
            b.setOrdenacionColumnas(a.getOrdenacionColumnas());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }

    public boolean insertUsuarios() {
        EntityManager em = emc.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Iterator it = li.iterator();
        num = 0;
        tx.begin();
        
        int borradas = em.createQuery("delete from Usuarios2 ").executeUpdate();
        System.out.println("Se han borrado " + borradas + " registros de la tabla de Usuarios en Sqlite");

        while (it.hasNext()) {
            if (num > 0 && num % batchSize == 0) {
                tx.commit();
                tx.begin();
                em.clear();
            }
            
            Usuarios a = (Usuarios) it.next();

            Usuarios2 b = new Usuarios2(a.getCodigoUsuario());

            b.setClave(a.getClave());

            em.persist(b);
            num++;
        }
        tx.commit();
        em.close();
        return true;
    }
}
