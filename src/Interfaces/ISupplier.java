/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Supplier;
import java.util.List;

/**
 *
 * @author su
 */
public interface ISupplier {
    boolean insertSupplier(Supplier sp);
    boolean updateSupplier(Supplier sp);
    boolean deleteSupplier(String id);
    List selectSupplier(String id, String nama);
    String generateIDSupplier();
}
