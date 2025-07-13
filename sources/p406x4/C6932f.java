package p406x4;

/* renamed from: x4.f */
/* loaded from: classes.dex */
public final class C6932f extends android.media.MediaCodec.Callback {

    /* renamed from: a */
    public final java.lang.Object f26990a;

    /* renamed from: b */
    public final android.os.HandlerThread f26991b;

    /* renamed from: c */
    public android.os.Handler f26992c;

    /* renamed from: d */
    public final p406x4.C6936j f26993d;

    /* renamed from: e */
    public final p406x4.C6936j f26994e;

    /* renamed from: f */
    public final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> f26995f;

    /* renamed from: g */
    public final java.util.ArrayDeque<android.media.MediaFormat> f26996g;

    /* renamed from: h */
    public android.media.MediaFormat f26997h;

    /* renamed from: i */
    public android.media.MediaFormat f26998i;

    /* renamed from: j */
    public android.media.MediaCodec.CodecException f26999j;

    /* renamed from: k */
    public long f27000k;

    /* renamed from: l */
    public boolean f27001l;

    /* renamed from: m */
    public java.lang.IllegalStateException f27002m;

    public C6932f(android.os.HandlerThread r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f26990a = r0
            r1.f26991b = r2
            x4.j r2 = new x4.j
            r2.<init>()
            r1.f26993d = r2
            x4.j r2 = new x4.j
            r2.<init>()
            r1.f26994e = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f26995f = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f26996g = r2
            return
    }

    /* renamed from: a */
    public void m14053a(android.media.MediaCodec r6) {
            r5 = this;
            java.lang.Object r0 = r5.f26990a
            monitor-enter(r0)
            long r1 = r5.f27000k     // Catch: java.lang.Throwable -> L18
            r3 = 1
            long r1 = r1 + r3
            r5.f27000k = r1     // Catch: java.lang.Throwable -> L18
            android.os.Handler r1 = r5.f26992c     // Catch: java.lang.Throwable -> L18
            int r2 = p371v5.C6552b0.f25624a     // Catch: java.lang.Throwable -> L18
            a4.c r2 = new a4.c     // Catch: java.lang.Throwable -> L18
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L18
            r1.post(r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r6
    }

    /* renamed from: b */
    public final void m14054b() {
            r3 = this;
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r3.f26996g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r3.f26996g
            java.lang.Object r0 = r0.getLast()
            android.media.MediaFormat r0 = (android.media.MediaFormat) r0
            r3.f26998i = r0
        L12:
            x4.j r0 = r3.f26993d
            r1 = 0
            r0.f27009a = r1
            r2 = -1
            r0.f27010b = r2
            r0.f27011c = r1
            x4.j r0 = r3.f26994e
            r0.f27009a = r1
            r0.f27010b = r2
            r0.f27011c = r1
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r3.f26995f
            r0.clear()
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r3.f26996g
            r0.clear()
            r0 = 0
            r3.f26999j = r0
            return
    }

    /* renamed from: c */
    public final boolean m14055c() {
            r5 = this;
            long r0 = r5.f27000k
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            boolean r0 = r5.f27001l
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* renamed from: d */
    public final void m14056d(java.lang.IllegalStateException r2) {
            r1 = this;
            java.lang.Object r0 = r1.f26990a
            monitor-enter(r0)
            r1.f27002m = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec r1, android.media.MediaCodec.CodecException r2) {
            r0 = this;
            java.lang.Object r1 = r0.f26990a
            monitor-enter(r1)
            r0.f26999j = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.f26990a
            monitor-enter(r2)
            x4.j r0 = r1.f26993d     // Catch: java.lang.Throwable -> La
            r0.m14060a(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec r4, int r5, android.media.MediaCodec.BufferInfo r6) {
            r3 = this;
            java.lang.Object r4 = r3.f26990a
            monitor-enter(r4)
            android.media.MediaFormat r0 = r3.f26998i     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L15
            x4.j r1 = r3.f26994e     // Catch: java.lang.Throwable -> L21
            r2 = -2
            r1.m14060a(r2)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayDeque<android.media.MediaFormat> r1 = r3.f26996g     // Catch: java.lang.Throwable -> L21
            r1.add(r0)     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r3.f26998i = r0     // Catch: java.lang.Throwable -> L21
        L15:
            x4.j r0 = r3.f26994e     // Catch: java.lang.Throwable -> L21
            r0.m14060a(r5)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r5 = r3.f26995f     // Catch: java.lang.Throwable -> L21
            r5.add(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec r3, android.media.MediaFormat r4) {
            r2 = this;
            java.lang.Object r3 = r2.f26990a
            monitor-enter(r3)
            x4.j r0 = r2.f26994e     // Catch: java.lang.Throwable -> L13
            r1 = -2
            r0.m14060a(r1)     // Catch: java.lang.Throwable -> L13
            java.util.ArrayDeque<android.media.MediaFormat> r0 = r2.f26996g     // Catch: java.lang.Throwable -> L13
            r0.add(r4)     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r2.f26998i = r4     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r4
    }
}
