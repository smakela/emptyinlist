package com.foo

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Specification

@Integration
@Rollback
class FooSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test empty list as inList parameter with mysql"() {
        expect:"empty list is returned"
            [] == Foo.findAllByIdInList([])
    }
}
