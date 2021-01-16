package com.ahmaddudayef.UASPCS.ui.nextmatch

import com.ahmaddudayef.UASPCS.data.DataManager
import com.ahmaddudayef.UASPCS.data.network.model.league.League
import com.ahmaddudayef.UASPCS.data.network.model.league.Leagues
import com.ahmaddudayef.UASPCS.data.network.model.schedule.Events
import com.ahmaddudayef.UASPCS.data.network.model.schedule.EventsItem
import com.ahmaddudayef.UASPCS.utils.rx.SchedulerProvider
import com.ahmaddudayef.UASPCS.utils.rx.TestSchedulerProvider
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.experimental.launch
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations


class NextPresenterTest {
    @Mock
    private lateinit var view: NextMvpView
    @Mock
    private lateinit var dataManager: DataManager

    private lateinit var compositeDisposable: CompositeDisposable

    private lateinit var presenter: NextPresenter<NextMvpView>

    private lateinit var scheduler: SchedulerProvider

    lateinit var match: Observable<Events>

    private lateinit var eventItem: Events

    lateinit var league: Single<Leagues>

    private lateinit var leagues: Leagues

    private val event = mutableListOf<EventsItem>()

    private val listLeagues = mutableListOf<League>()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        compositeDisposable = CompositeDisposable()
        scheduler = TestSchedulerProvider()
        eventItem = Events(event)
        leagues = Leagues(listLeagues)
        match = Observable.just(eventItem)
        league = Single.just(leagues)
        presenter = NextPresenter(dataManager, compositeDisposable, scheduler)
        `when`(dataManager.getNextSchedule("4328")).thenReturn(match)
        `when`(dataManager.getAllLeagues()).thenReturn(league)
        presenter.onAttach(view)
    }

    @Test
    fun getNextScheduleList() {
        presenter.getNextScheduleList("4328")
        launch { verify(view).showLoading() }
        launch { verify(view).updateList(eventItem.events!!) }
        launch { verify(view).hideLoading() }
    }

    @Test
    fun testGetAllLeagues() {
        presenter.getAllLeagues()
        launch { verify(view).showLoading() }
        launch { verify(view).updateLeagueid(leagues) }
        launch { verify(view).hideLoading() }
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        presenter.onDetach()
    }
}