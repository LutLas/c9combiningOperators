import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy

fun main(args: Array<String>) {
    /*exampleOf("startWith") {

        val subscriptions = CompositeDisposable()
        // 1
        val missingNumbers = Observable.just(3, 4, 5)
        // 2
        val completeSet = missingNumbers.startWith(listOf(1, 2))

        completeSet
                .toList()
                .subscribeBy { number ->
                    println(number)
                }
                .addTo(subscriptions)
    }*/

    /*exampleOf("concat") {

        val subscriptions = CompositeDisposable()
        // 1
        val first = Observable.just(1, 2, 3)
        val second = Observable.just(4, 5, 6)
        // 2
        Observable.concat(first, second)
                .toList()
                .subscribeBy { number ->
                    println(number)
                }
                .addTo(subscriptions)
    }*/

    /*exampleOf("concatWith") {
        val subscriptions = CompositeDisposable()

        val germanCities = Observable.just("Berlin", "Münich", "Frankfurt")
        val spanishCities = Observable.just("Madrid", "Barcelona", "Valencia")

        spanishCities
                .concatWith(germanCities)
                .toList()
                .subscribeBy { city ->
                    println(city)
                }
                .addTo(subscriptions)
    }*/

    /*exampleOf("concatMap") {
        val subscriptions = CompositeDisposable()
        // 1
        val countries = Observable.just("Germany", "Spain", "Sweden")
        // 2
        val observable = countries

                .concatMap {
                    when (it) {
                        "Germany" -> Observable.just("Berlin", "Münich", "Frankfurt")
                        "Spain" -> Observable.just("Madrid", "Barcelona", "Valencia")
                        "Zambia" -> Observable.just("Central", "Lusaka", "Northern")
                        else -> Observable.empty<String>()
                    }
                }.toList()
        // 3
        observable
                .subscribeBy { city ->
                    println(city)
                }
                .addTo(subscriptions)
    }*/
}