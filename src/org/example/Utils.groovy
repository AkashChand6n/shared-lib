package org.example

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def greet(name) {
        steps.echo "Greetings from Utils, ${name}!"
    }
}
