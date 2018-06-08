import geb.spock.GebReportingSpec
import grails.testing.mixin.integration.Integration

@Integration
class TestLessSpec extends GebReportingSpec {

    void "test something"() {
        when:
        go '/'

        then:
        $('h1').css('color') == 'red'
    }
}
