package compose.project.demo.composedemo.di

import org.koin.dsl.module
import compose.project.demo.composedemo.di.modules.*

val sharedModule = module {
    includes(
        dataModule,
        domainModule,
        presentationModule,
        networkModule,
        platformModule()
    )
}