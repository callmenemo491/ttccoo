package p406x4;

/* renamed from: x4.d */
/* loaded from: classes.dex */
public class HandlerC6930d extends android.os.Handler {

    /* renamed from: a */
    public final /* synthetic */ p406x4.C6931e f26975a;

    public HandlerC6930d(p406x4.C6931e r1, android.os.Looper r2) {
            r0 = this;
            r0.f26975a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r11) {
            r10 = this;
            x4.e r0 = r10.f26975a
            java.util.Objects.requireNonNull(r0)
            int r1 = r11.what
            r2 = 0
            if (r1 == 0) goto L49
            r3 = 1
            if (r1 == r3) goto L27
            r3 = 2
            if (r1 == r3) goto L21
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f26981d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            r0.compareAndSet(r2, r1)
            goto L64
        L21:
            v5.g r11 = r0.f26982e
            r11.m13343b()
            goto L64
        L27:
            java.lang.Object r11 = r11.obj
            x4.e$a r11 = (p406x4.C6931e.a) r11
            int r4 = r11.f26984a
            int r5 = r11.f26985b
            android.media.MediaCodec$CryptoInfo r6 = r11.f26987d
            long r7 = r11.f26988e
            int r9 = r11.f26989f
            java.lang.Object r1 = p406x4.C6931e.f26977h     // Catch: java.lang.RuntimeException -> L42
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L42
            android.media.MediaCodec r3 = r0.f26978a     // Catch: java.lang.Throwable -> L3f
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            goto L63
        L3f:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r3     // Catch: java.lang.RuntimeException -> L42
        L42:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f26981d
            r0.compareAndSet(r2, r1)
            goto L63
        L49:
            java.lang.Object r11 = r11.obj
            x4.e$a r11 = (p406x4.C6931e.a) r11
            int r4 = r11.f26984a
            int r5 = r11.f26985b
            int r6 = r11.f26986c
            long r7 = r11.f26988e
            int r9 = r11.f26989f
            android.media.MediaCodec r3 = r0.f26978a     // Catch: java.lang.RuntimeException -> L5d
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L5d
            goto L63
        L5d:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f26981d
            r0.compareAndSet(r2, r1)
        L63:
            r2 = r11
        L64:
            if (r2 == 0) goto L71
            java.util.ArrayDeque<x4.e$a> r11 = p406x4.C6931e.f26976g
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6e
            throw r0
        L71:
            return
    }
}
