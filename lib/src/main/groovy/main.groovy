#!/usr/bin/env groovy

Class clazz = new GroovyClassLoader().parseClass("${new File(getClass().protectionDomain.codeSource.location.path).parent}/util/Util.groovy" as File)
GroovyObject u = clazz.newInstance()
u.msg(1, 'b', [a: 'b', c: 'd'])


Class version = new GroovyClassLoader().parseClass("${new File(getClass().protectionDomain.codeSource.location.path).parent}/util/script.groovy" as File)

u = version.newInstance(0,1)
u.toString()