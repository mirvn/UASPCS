package com.ahmaddudayef.UASPCS.utils.rx

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * Created by Ahmad Dudayef on 10/12/2018.
 */
class TestSchedulerProvider: SchedulerProvider {
    override fun mainThread(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun computation(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun trampoline(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun newThread(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }

}