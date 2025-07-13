package p406x4;

/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C6928b implements p406x4.InterfaceC6937k {

    /* renamed from: a */
    public final android.media.MediaCodec f26963a;

    /* renamed from: b */
    public final p406x4.C6932f f26964b;

    /* renamed from: c */
    public final p406x4.C6931e f26965c;

    /* renamed from: d */
    public final boolean f26966d;

    /* renamed from: e */
    public final boolean f26967e;

    /* renamed from: f */
    public boolean f26968f;

    /* renamed from: g */
    public int f26969g;

    /* renamed from: h */
    public android.view.Surface f26970h;

    /* renamed from: x4.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: x4.b$b */
    public static final class b implements p406x4.InterfaceC6937k.b {

        /* renamed from: a */
        public final p010a9.InterfaceC0044l<android.os.HandlerThread> f26971a;

        /* renamed from: b */
        public final p010a9.InterfaceC0044l<android.os.HandlerThread> f26972b;

        public b(int r2, boolean r3, boolean r4) {
                r1 = this;
                x4.c r3 = new x4.c
                r4 = 0
                r3.<init>(r2, r4)
                x4.c r4 = new x4.c
                r0 = 1
                r4.<init>(r2, r0)
                r1.<init>()
                r1.f26971a = r3
                r1.f26972b = r4
                return
        }

        @Override // p406x4.InterfaceC6937k.b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ p406x4.InterfaceC6937k mo14046a(p406x4.InterfaceC6937k.a r1) {
                r0 = this;
                x4.b r1 = r0.m14047b(r1)
                return r1
        }

        /* renamed from: b */
        public p406x4.C6928b m14047b(p406x4.InterfaceC6937k.a r12) {
                r11 = this;
                x4.m r0 = r12.f27014a
                java.lang.String r0 = r0.f27019a
                r1 = 0
                java.lang.String r2 = "createCodec:"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L54
                int r4 = r3.length()     // Catch: java.lang.Exception -> L54
                if (r4 == 0) goto L16
                java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Exception -> L54
                goto L1c
            L16:
                java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L54
                r3.<init>(r2)     // Catch: java.lang.Exception -> L54
                r2 = r3
            L1c:
                p371v5.C6549a.m13287a(r2)     // Catch: java.lang.Exception -> L54
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L54
                x4.b r10 = new x4.b     // Catch: java.lang.Exception -> L52
                a9.l<android.os.HandlerThread> r2 = r11.f26971a     // Catch: java.lang.Exception -> L52
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L52
                r5 = r2
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch: java.lang.Exception -> L52
                a9.l<android.os.HandlerThread> r2 = r11.f26972b     // Catch: java.lang.Exception -> L52
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L52
                r6 = r2
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch: java.lang.Exception -> L52
                r7 = 0
                r8 = 1
                r9 = 0
                r3 = r10
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L52
                p371v5.C6549a.m13293g()     // Catch: java.lang.Exception -> L4f
                android.media.MediaFormat r3 = r12.f27015b     // Catch: java.lang.Exception -> L4f
                android.view.Surface r4 = r12.f27017d     // Catch: java.lang.Exception -> L4f
                android.media.MediaCrypto r5 = r12.f27018e     // Catch: java.lang.Exception -> L4f
                r6 = 0
                r7 = 0
                r2 = r10
                p406x4.C6928b.m14029o(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L4f
                return r10
            L4f:
                r12 = move-exception
                r1 = r10
                goto L56
            L52:
                r12 = move-exception
                goto L56
            L54:
                r12 = move-exception
                r0 = r1
            L56:
                if (r1 != 0) goto L5e
                if (r0 == 0) goto L61
                r0.release()
                goto L61
            L5e:
                r1.release()
            L61:
                throw r12
        }
    }

    public C6928b(android.media.MediaCodec r1, android.os.HandlerThread r2, android.os.HandlerThread r3, boolean r4, boolean r5, p406x4.C6928b.a r6) {
            r0 = this;
            r0.<init>()
            r0.f26963a = r1
            x4.f r6 = new x4.f
            r6.<init>(r2)
            r0.f26964b = r6
            x4.e r2 = new x4.e
            r2.<init>(r1, r3)
            r0.f26965c = r2
            r0.f26966d = r4
            r0.f26967e = r5
            r1 = 0
            r0.f26969g = r1
            return
    }

    /* renamed from: o */
    public static void m14029o(p406x4.C6928b r5, android.media.MediaFormat r6, android.view.Surface r7, android.media.MediaCrypto r8, int r9, boolean r10) {
            x4.f r0 = r5.f26964b
            android.media.MediaCodec r1 = r5.f26963a
            android.os.Handler r2 = r0.f26992c
            r3 = 1
            if (r2 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            p371v5.C6549a.m13291e(r2)
            android.os.HandlerThread r2 = r0.f26991b
            r2.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.HandlerThread r4 = r0.f26991b
            android.os.Looper r4 = r4.getLooper()
            r2.<init>(r4)
            r1.setCallback(r0, r2)
            r0.f26992c = r2
            java.lang.String r0 = "configureCodec"
            p371v5.C6549a.m13287a(r0)
            android.media.MediaCodec r0 = r5.f26963a
            r0.configure(r6, r7, r8, r9)
            p371v5.C6549a.m13293g()
            if (r10 == 0) goto L3b
            android.media.MediaCodec r6 = r5.f26963a
            android.view.Surface r6 = r6.createInputSurface()
            r5.f26970h = r6
        L3b:
            x4.e r6 = r5.f26965c
            boolean r7 = r6.f26983f
            if (r7 != 0) goto L55
            android.os.HandlerThread r7 = r6.f26979b
            r7.start()
            x4.d r7 = new x4.d
            android.os.HandlerThread r8 = r6.f26979b
            android.os.Looper r8 = r8.getLooper()
            r7.<init>(r6, r8)
            r6.f26980c = r7
            r6.f26983f = r3
        L55:
            java.lang.String r6 = "startCodec"
            p371v5.C6549a.m13287a(r6)
            android.media.MediaCodec r6 = r5.f26963a
            r6.start()
            p371v5.C6549a.m13293g()
            r5.f26969g = r3
            return
    }

    /* renamed from: p */
    public static java.lang.String m14030p(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r2 = 1
            if (r1 != r2) goto Lb
            java.lang.String r1 = "Audio"
            goto L1b
        Lb:
            r2 = 2
            if (r1 != r2) goto L11
            java.lang.String r1 = "Video"
            goto L1b
        L11:
            java.lang.String r2 = "Unknown("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ")"
        L1b:
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: a */
    public int mo14031a(android.media.MediaCodec.BufferInfo r11) {
            r10 = this;
            x4.f r0 = r10.f26964b
            java.lang.Object r1 = r0.f26990a
            monitor-enter(r1)
            boolean r2 = r0.m14055c()     // Catch: java.lang.Throwable -> L58
            r3 = -1
            if (r2 == 0) goto Le
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            goto L51
        Le:
            java.lang.IllegalStateException r2 = r0.f27002m     // Catch: java.lang.Throwable -> L58
            r4 = 0
            if (r2 != 0) goto L55
            android.media.MediaCodec$CodecException r2 = r0.f26999j     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L52
            x4.j r2 = r0.f26994e     // Catch: java.lang.Throwable -> L58
            int r4 = r2.f27011c     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L23
            goto Lc
        L23:
            int r3 = r2.m14061b()     // Catch: java.lang.Throwable -> L58
            if (r3 < 0) goto L43
            android.media.MediaFormat r2 = r0.f26997h     // Catch: java.lang.Throwable -> L58
            p371v5.C6549a.m13292f(r2)     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f26995f     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L58
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L58
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L58
            int r6 = r0.size     // Catch: java.lang.Throwable -> L58
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L58
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L58
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L58
            goto Lc
        L43:
            r11 = -2
            if (r3 != r11) goto Lc
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.f26996g     // Catch: java.lang.Throwable -> L58
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L58
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L58
            r0.f26997h = r11     // Catch: java.lang.Throwable -> L58
            goto Lc
        L51:
            return r3
        L52:
            r0.f26999j = r4     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L58
        L55:
            r0.f27002m = r4     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L58
        L58:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r11
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: b */
    public boolean mo14032b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: c */
    public void mo14033c(int r2, boolean r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f26963a
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: d */
    public void mo14034d(int r2) {
            r1 = this;
            r1.m14045q()
            android.media.MediaCodec r0 = r1.f26963a
            r0.setVideoScalingMode(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: e */
    public android.media.MediaFormat mo14035e() {
            r2 = this;
            x4.f r0 = r2.f26964b
            java.lang.Object r1 = r0.f26990a
            monitor-enter(r1)
            android.media.MediaFormat r0 = r0.f26997h     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: f */
    public java.nio.ByteBuffer mo14036f(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f26963a
            java.nio.ByteBuffer r2 = r0.getInputBuffer(r2)
            return r2
    }

    @Override // p406x4.InterfaceC6937k
    public void flush() {
            r2 = this;
            x4.e r0 = r2.f26965c
            r0.m14052d()
            android.media.MediaCodec r0 = r2.f26963a
            r0.flush()
            boolean r0 = r2.f26967e
            if (r0 == 0) goto L1a
            x4.f r0 = r2.f26964b
            r1 = 0
            r0.m14053a(r1)
            android.media.MediaCodec r0 = r2.f26963a
            r0.start()
            goto L21
        L1a:
            x4.f r0 = r2.f26964b
            android.media.MediaCodec r1 = r2.f26963a
            r0.m14053a(r1)
        L21:
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: g */
    public void mo14037g(android.view.Surface r2) {
            r1 = this;
            r1.m14045q()
            android.media.MediaCodec r0 = r1.f26963a
            r0.setOutputSurface(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: h */
    public void mo14038h(int r4, int r5, int r6, long r7, int r9) {
            r3 = this;
            x4.e r0 = r3.f26965c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r1 = r0.f26981d
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            if (r1 != 0) goto L28
            x4.e$a r1 = p406x4.C6931e.m14050e()
            r1.f26984a = r4
            r1.f26985b = r5
            r1.f26986c = r6
            r1.f26988e = r7
            r1.f26989f = r9
            android.os.Handler r4 = r0.f26980c
            int r5 = p371v5.C6552b0.f25624a
            r5 = 0
            android.os.Message r4 = r4.obtainMessage(r5, r1)
            r4.sendToTarget()
            return
        L28:
            throw r1
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: i */
    public void mo14039i(android.os.Bundle r2) {
            r1 = this;
            r1.m14045q()
            android.media.MediaCodec r0 = r1.f26963a
            r0.setParameters(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: j */
    public void mo14040j(p406x4.InterfaceC6937k.c r3, android.os.Handler r4) {
            r2 = this;
            r2.m14045q()
            android.media.MediaCodec r0 = r2.f26963a
            x4.a r1 = new x4.a
            r1.<init>(r2, r3)
            r0.setOnFrameRenderedListener(r1, r4)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: k */
    public java.nio.ByteBuffer mo14041k(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f26963a
            java.nio.ByteBuffer r2 = r0.getOutputBuffer(r2)
            return r2
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: l */
    public void mo14042l(int r4, int r5, p142i4.C3069c r6, long r7, int r9) {
            r3 = this;
            x4.e r0 = r3.f26965c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r1 = r0.f26981d
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            if (r1 != 0) goto L71
            x4.e$a r1 = p406x4.C6931e.m14050e()
            r2 = 0
            r1.f26984a = r4
            r1.f26985b = r5
            r1.f26986c = r2
            r1.f26988e = r7
            r1.f26989f = r9
            android.media.MediaCodec$CryptoInfo r4 = r1.f26987d
            int r5 = r6.f12339f
            r4.numSubSamples = r5
            int[] r5 = r6.f12337d
            int[] r7 = r4.numBytesOfClearData
            int[] r5 = p406x4.C6931e.m14049c(r5, r7)
            r4.numBytesOfClearData = r5
            int[] r5 = r6.f12338e
            int[] r7 = r4.numBytesOfEncryptedData
            int[] r5 = p406x4.C6931e.m14049c(r5, r7)
            r4.numBytesOfEncryptedData = r5
            byte[] r5 = r6.f12335b
            byte[] r7 = r4.key
            byte[] r5 = p406x4.C6931e.m14048b(r5, r7)
            java.util.Objects.requireNonNull(r5)
            r4.key = r5
            byte[] r5 = r6.f12334a
            byte[] r7 = r4.iv
            byte[] r5 = p406x4.C6931e.m14048b(r5, r7)
            java.util.Objects.requireNonNull(r5)
            r4.iv = r5
            int r5 = r6.f12336c
            r4.mode = r5
            int r5 = p371v5.C6552b0.f25624a
            r7 = 24
            if (r5 < r7) goto L66
            android.media.MediaCodec$CryptoInfo$Pattern r5 = new android.media.MediaCodec$CryptoInfo$Pattern
            int r7 = r6.f12340g
            int r6 = r6.f12341h
            r5.<init>(r7, r6)
            r4.setPattern(r5)
        L66:
            android.os.Handler r4 = r0.f26980c
            r5 = 1
            android.os.Message r4 = r4.obtainMessage(r5, r1)
            r4.sendToTarget()
            return
        L71:
            throw r1
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: m */
    public void mo14043m(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f26963a
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: n */
    public int mo14044n() {
            r5 = this;
            x4.f r0 = r5.f26964b
            java.lang.Object r1 = r0.f26990a
            monitor-enter(r1)
            boolean r2 = r0.m14055c()     // Catch: java.lang.Throwable -> L2f
            r3 = -1
            if (r2 == 0) goto Le
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L28
        Le:
            java.lang.IllegalStateException r2 = r0.f27002m     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            if (r2 != 0) goto L2c
            android.media.MediaCodec$CodecException r2 = r0.f26999j     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L29
            x4.j r0 = r0.f26993d     // Catch: java.lang.Throwable -> L2f
            int r2 = r0.f27011c     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L23
            goto Lc
        L23:
            int r3 = r0.m14061b()     // Catch: java.lang.Throwable -> L2f
            goto Lc
        L28:
            return r3
        L29:
            r0.f26999j = r4     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2c:
            r0.f27002m = r4     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    /* renamed from: q */
    public final void m14045q() {
            r2 = this;
            boolean r0 = r2.f26966d
            if (r0 == 0) goto L18
            x4.e r0 = r2.f26965c     // Catch: java.lang.InterruptedException -> La
            r0.m14051a()     // Catch: java.lang.InterruptedException -> La
            goto L18
        La:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L18:
            return
    }

    @Override // p406x4.InterfaceC6937k
    public void release() {
            r4 = this;
            r0 = 1
            int r1 = r4.f26969g     // Catch: java.lang.Throwable -> L40
            if (r1 != r0) goto L2a
            x4.e r1 = r4.f26965c     // Catch: java.lang.Throwable -> L40
            boolean r2 = r1.f26983f     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L13
            r1.m14052d()     // Catch: java.lang.Throwable -> L40
            android.os.HandlerThread r2 = r1.f26979b     // Catch: java.lang.Throwable -> L40
            r2.quit()     // Catch: java.lang.Throwable -> L40
        L13:
            r2 = 0
            r1.f26983f = r2     // Catch: java.lang.Throwable -> L40
            x4.f r1 = r4.f26964b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r1.f26990a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L40
            r1.f27001l = r0     // Catch: java.lang.Throwable -> L27
            android.os.HandlerThread r3 = r1.f26991b     // Catch: java.lang.Throwable -> L27
            r3.quit()     // Catch: java.lang.Throwable -> L27
            r1.m14054b()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L40
        L2a:
            r1 = 2
            r4.f26969g = r1     // Catch: java.lang.Throwable -> L40
            android.view.Surface r1 = r4.f26970h
            if (r1 == 0) goto L34
            r1.release()
        L34:
            boolean r1 = r4.f26968f
            if (r1 != 0) goto L3f
            android.media.MediaCodec r1 = r4.f26963a
            r1.release()
            r4.f26968f = r0
        L3f:
            return
        L40:
            r1 = move-exception
            android.view.Surface r2 = r4.f26970h
            if (r2 == 0) goto L48
            r2.release()
        L48:
            boolean r2 = r4.f26968f
            if (r2 != 0) goto L53
            android.media.MediaCodec r2 = r4.f26963a
            r2.release()
            r4.f26968f = r0
        L53:
            throw r1
    }
}
