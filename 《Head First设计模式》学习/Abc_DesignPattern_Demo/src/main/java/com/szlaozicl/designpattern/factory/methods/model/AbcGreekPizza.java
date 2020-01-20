package com.szlaozicl.designpattern.factory.methods.model;

import com.szlaozicl.designpattern.factory.model.BasePizza;

/**
 * Abc国出售的 希腊风味披萨
 *
 * @author JustryDeng
 * @date 2020/1/19 21:59
 */
public class AbcGreekPizza extends BasePizza {

    @Override
    public String name() {
        return "Abc国出售的 希腊风味披萨";
    }
}
