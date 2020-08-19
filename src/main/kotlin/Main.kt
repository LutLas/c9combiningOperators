import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.BiFunction
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.withLatestFrom
import io.reactivex.subjects.PublishSubject

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

    /*exampleOf("merge") {
        val subscriptions = CompositeDisposable()

        val left = PublishSubject.create<Int>()
        val right = PublishSubject.create<Int>()

        Observable.merge(left, right)
                .subscribeBy {
                    println(it)
                }
                .addTo(subscriptions)

        left.onNext(0)
        left.onNext(1)
        right.onNext(3)
        left.onNext(4)
        right.onNext(5)
        right.onNext(6)
    }*/

    /*exampleOf("mergeWith") {

        val subscriptions = CompositeDisposable()

        val germanCities = PublishSubject.create<String>()
        val spanishCities = PublishSubject.create<String>()

        germanCities.mergeWith(spanishCities)
                .subscribe {
                    println(it)
                }
                .addTo(subscriptions)

        germanCities.onNext("Frankfurt")
        germanCities.onNext("Berlin")
        spanishCities.onNext("Madrid")
        germanCities.onNext("Münich")
        spanishCities.onNext("Barcelona")
        spanishCities.onNext("Valencia")
    }*/

    /*exampleOf("combineLatest") {

        val subscriptions = CompositeDisposable()

        val left = PublishSubject.create<String>()
        val right = PublishSubject.create<String>()

        *//*Observables.combineLatest(left, right) { leftString, rightString ->
            "$leftString $rightString"
        }.subscribe {
            println(it)
        }.addTo(subscriptions)*//*

        *//*val observable = Observables
                .combineLatest(left, right) {
                    leftString: String, rightString: String ->
                    leftString to rightString
                }
                .filter { !it.first.isEmpty() }
                .subscribe {
                    println(it)
                }.addTo(subscriptions)*//*

        Observable.combineLatest<String, String, String>(left, right,
                BiFunction { leftString, rightString ->
                    "$leftString $rightString"
                }).subscribe {
            println(it)
        }.addTo(subscriptions)

        left.onNext("Hello")
        right.onNext("World")
        left.onNext("It’s nice to")
        right.onNext("be here!")
        left.onNext("Actually, it’s super great to")
    }*/

    /*exampleOf("zip") {

        val subscriptions = CompositeDisposable()

        val left = PublishSubject.create<String>()
        val right = PublishSubject.create<String>()

        Observables.zip(left, right) { weather, city ->
            "It’s $weather in $city"
        }.subscribe {
            println(it)
        }.addTo(subscriptions)

        left.onNext("sunny")
        right.onNext("Lisbon")
        left.onNext("cloudy")
        right.onNext("Copenhagen")
        left.onNext("cloudy")
        right.onNext("London")
        left.onNext("sunny")
        right.onNext("Madrid")
        right.onNext("Vienna")
        left.onNext("raining")
    }*/

    /*exampleOf("withLatestFrom") {
        val subscriptions = CompositeDisposable()

        // 1
        val button = PublishSubject.create<Unit>()
        val editText = PublishSubject.create<String>()

        // 2
        button.withLatestFrom(editText) { _: Unit, value: String ->
            value
        }.subscribe {
            println(it)
        }.addTo(subscriptions)

        // 3
        editText.onNext("Par")
        button.onNext(Unit)
        editText.onNext("Pari")
        editText.onNext("Paris")

        button.onNext(Unit)
    }*/

    /*exampleOf("sample") {
        val subscriptions = CompositeDisposable()

        // 1
        val button = PublishSubject.create<Unit>()
        val editText = PublishSubject.create<String>()

        // 2
        editText.sample(button)
                .subscribe {
            println(it)
        }.addTo(subscriptions)

        // 3
        editText.onNext("Par")
        editText.onNext("Pari")
        editText.onNext("Paris")
        button.onNext(Unit)
        button.onNext(Unit)
    }*/

    /*exampleOf("amb") {

        val subscriptions = CompositeDisposable()

        val left = PublishSubject.create<String>()
        val right = PublishSubject.create<String>()

        // 1
        left.ambWith(right)
                .subscribe {
                    println(it)
                }
                .addTo(subscriptions)

        // 2
        right.onNext("Copenhagen")
        left.onNext("London")
        left.onNext("Madrid")
        right.onNext("Vienna")
        left.onNext("Lisbon")
        right.onNext("Lusaka")
    }*/

    /*exampleOf("reduce") {

        val subscriptions = CompositeDisposable()

        val source = Observable.just(1, 3, 5, 7, 9)
        source
                .reduce(0) { a, b -> a + b }
                .subscribeBy(onSuccess = {
                    println(it)
                })
                .addTo(subscriptions)
    }*/

    /*exampleOf("scan") {

        val subscriptions = CompositeDisposable()

        val source = Observable.just(1, 3, 5, 7, 9)

        source
                .scan(0) { a, b -> a + b }
                .subscribe {
                    println(it)
                }
                .addTo(subscriptions)
    }*/
}