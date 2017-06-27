/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import paqueteclases.Articulo;
import paqueteclases.Pedido;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author DAW2
 */
public class AccesoBBDD {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static void subePedido(Pedido p){
        Session sesion = sessionFactory.openSession();
        Transaction tx = null;
        Integer id = null;
        try{
            tx = sesion.beginTransaction();
            id=(Integer)sesion.save(p);
            tx.commit();
            
        }
        catch (HibernateException e) {
if (tx!=null) tx.rollback();
e.printStackTrace();
}finally {
sesion.close();
}
       
        
    }

    public static ArrayList<Articulo> cargaArticulos(int id) {
        Session sesion = sessionFactory.openSession();
        List<Articulo> results=null;
        Transaction tx = null;
        String hql = "FROM articulo where id=:id ";
         try{
            tx = sesion.beginTransaction();
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);
        results = query.list();
        tx.commit();
            
        }
         catch (HibernateException e) {
e.printStackTrace();
}
        sesion.close();
        return (ArrayList)results;
    }
    
   public static Pedido buscaPedido(String codpedido){
        Pedido pedido=new Pedido();
        String hql = "FROM pedido where codpedido=:codpedido";
        Transaction tx = null;
        Session sesion = sessionFactory.openSession();
        List<Pedido> results=null;
        try{
            tx = sesion.beginTransaction();
        
        Query query = sesion.createQuery(hql);
        query.setParameter("codpedido", codpedido);
        results = query.list();
         tx.commit();
            
        }
        catch (HibernateException e) {
e.printStackTrace();
}
        if (results.size()!=0){
            
            for(int i=0;i<results.size();i++){
                pedido = (Pedido)results.get(i);
                
            }
            
            }
    return pedido;
        }

    public static ArrayList<Pedido> listaPedidos() {
        Session sesion = sessionFactory.openSession();
        List<Articulo> results=null;
        Transaction tx = null;
        String hql = "FROM pedido";
         try{
            tx = sesion.beginTransaction();
        Query query = sesion.createQuery(hql);
        results = query.list();
        tx.commit();
            
        }
         catch (HibernateException e) {
e.printStackTrace();
}
        sesion.close();
        return (ArrayList)results;
    }
}
