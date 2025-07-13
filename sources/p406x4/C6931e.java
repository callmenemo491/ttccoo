package p406x4;

/* renamed from: x4.e */
/* loaded from: classes.dex */
public class C6931e {

    /* renamed from: g */
    public static final java.util.ArrayDeque<p406x4.C6931e.a> f26976g = null;

    /* renamed from: h */
    public static final java.lang.Object f26977h = null;

    /* renamed from: a */
    public final android.media.MediaCodec f26978a;

    /* renamed from: b */
    public final android.os.HandlerThread f26979b;

    /* renamed from: c */
    public android.os.Handler f26980c;

    /* renamed from: d */
    public final java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> f26981d;

    /* renamed from: e */
    public final p371v5.C6557g f26982e;

    /* renamed from: f */
    public boolean f26983f;

    /* renamed from: x4.e$a */
    public static class a {

        /* renamed from: a */
        public int f26984a;

        /* renamed from: b */
        public int f26985b;

        /* renamed from: c */
        public int f26986c;

        /* renamed from: d */
        public final android.media.MediaCodec.CryptoInfo f26987d;

        /* renamed from: e */
        public long f26988e;

        /* renamed from: f */
        public int f26989f;

        public a() {
                r1 = this;
                r1.<init>()
                android.media.MediaCodec$CryptoInfo r0 = new android.media.MediaCodec$CryptoInfo
                r0.<init>()
                r1.f26987d = r0
                return
        }
    }

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            p406x4.C6931e.f26976g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p406x4.C6931e.f26977h = r0
            return
    }

    public C6931e(android.media.MediaCodec r3, android.os.HandlerThread r4) {
            r2 = this;
            v5.g r0 = new v5.g
            v5.c r1 = p371v5.InterfaceC6553c.f25635a
            r0.<init>(r1)
            r2.<init>()
            r2.f26978a = r3
            r2.f26979b = r4
            r2.f26982e = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.f26981d = r3
            return
    }

    /* renamed from: b */
    public static byte[] m14048b(byte[] r2, byte[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto L10
            int r0 = r3.length
            int r1 = r2.length
            if (r0 >= r1) goto La
            goto L10
        La:
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            int r3 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    /* renamed from: c */
    public static int[] m14049c(int[] r2, int[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto L10
            int r0 = r3.length
            int r1 = r2.length
            if (r0 >= r1) goto La
            goto L10
        La:
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            int r3 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    /* renamed from: e */
    public static p406x4.C6931e.a m14050e() {
            java.util.ArrayDeque<x4.e$a> r0 = p406x4.C6931e.f26976g
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L10
            x4.e$a r1 = new x4.e$a     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.lang.Throwable -> L18
            x4.e$a r1 = (p406x4.C6931e.a) r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    /* renamed from: a */
    public final void m14051a() {
            r2 = this;
            v5.g r0 = r2.f26982e
            r0.m13342a()
            android.os.Handler r0 = r2.f26980c
            java.util.Objects.requireNonNull(r0)
            r1 = 2
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            v5.g r0 = r2.f26982e
            monitor-enter(r0)
        L15:
            boolean r1 = r0.f25643b     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1d
            r0.wait()     // Catch: java.lang.Throwable -> L1f
            goto L15
        L1d:
            monitor-exit(r0)
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: d */
    public void m14052d() {
            r2 = this;
            boolean r0 = r2.f26983f
            if (r0 == 0) goto L1f
            android.os.Handler r0 = r2.f26980c     // Catch: java.lang.InterruptedException -> L11
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.InterruptedException -> L11
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.InterruptedException -> L11
            r2.m14051a()     // Catch: java.lang.InterruptedException -> L11
            goto L1f
        L11:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L1f:
            return
    }
}
