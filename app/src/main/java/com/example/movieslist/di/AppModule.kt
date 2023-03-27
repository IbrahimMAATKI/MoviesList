package com.example.movieslist.di


import android.app.Application
import android.content.Context
import coil.ImageLoader
import coil.memory.MemoryCache
import com.example.movieslist.R
import com.example.movieslist.util.DefaultDispatcherProvider
import com.example.movieslist.util.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providerDispatcherProvider(): DispatcherProvider {
        return DefaultDispatcherProvider()
    }

    @Provides
    @Singleton
    fun provideImageLoader(
        app: Application,
        @ApplicationContext mContext: Context
    ): ImageLoader {
        return ImageLoader.Builder(app)
            .error(R.drawable.error_image)
            .placeholder(R.drawable.white_background)
            .memoryCache {
                MemoryCache.Builder(mContext).maxSizePercent(0.25).build()
            }
            .crossfade(true)
            .build()
    }

}