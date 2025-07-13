package p165j7;

/* renamed from: j7.c */
/* loaded from: classes.dex */
public final class C3450c {
    /* renamed from: a */
    public static <T> T m7911a(java.util.concurrent.Callable<T> r2) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.ThreadPolicy.LAX     // Catch: java.lang.Throwable -> L11
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L11
            android.os.StrictMode.setThreadPolicy(r0)
            return r2
        L11:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }
}
