package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    p379vh.AbstractC6714k1 createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r1);

    int getLoadPriority();

    java.lang.String hintOnError();
}
